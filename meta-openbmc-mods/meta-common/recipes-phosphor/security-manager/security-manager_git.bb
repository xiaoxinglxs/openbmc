SUMMARY = "Security Manager daemon to detect the security violation- ASD/ user management"
DESCRIPTION = "Daemon check for Remote debug enable and user account violation"

PV = "1.0+git${SRCPV}"

S = "${WORKDIR}/git/security-manager"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${INTELBASE}/COPYING.apache-2.0;md5=34400b68072d710fecd0a2940a0d1658"
inherit cmake systemd

SRC_URI = "git://github.com/Intel-BMC/provingground.git;protocol=ssh"
SRCREV = "eddf621897090ba346b1aaa81a4b8be12076ab60"

SYSTEMD_SERVICE_${PN} += "xyz.openbmc_project.SecurityManager.service"

DEPENDS += " \
    systemd \
    sdbusplus \
    libgpiod \
    sdbusplus-native \
    phosphor-logging \
    boost \
    "
