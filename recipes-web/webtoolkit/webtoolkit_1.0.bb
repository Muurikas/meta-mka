SUMMARY = "Web Toolkit C++ Framework"
DESCRIPTION = "Framework for creating web application development with C++"
HOMEPAGE = "https://www.webtoolkit.eu/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6565235fddf41c29afe574c96e32358c"

inherit cmake


#SRCREV="${AUTOREV}"
SRCREV="95b2ad9333a2d28dc67e4b568373cf6e8770d51f"

SRC_URI = "git://github.com/emweb/wt.git;branch=master"

S = "${WORKDIR}/git"


PV = "1.0+git${SRCREV}"

FILES_${PN} += "${datadir}/Wt"

DEPENDS = "boost"
RDEPENDS_${PN} = "boost libcrypto libssl"
