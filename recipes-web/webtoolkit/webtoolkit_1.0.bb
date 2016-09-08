SUMMARY = "Web Toolkit C++ Framework"
DESCRIPTION = "Framework for creating web application development with C++"
HOMEPAGE = "https://www.webtoolkit.eu/"
LICENSE = "GPL"
# LIC_FILES_CHKSUM = "file://LICENCE;beginline=38;endline=50;md5=51babd597624b70752069953876aaa18"

inherit cmake


#SRCREV="${AUTOREV}"
SRCREV="95b2ad9333a2d28dc67e4b568373cf6e8770d51f"

SRC_URI = "git://github.com/emweb/wt.git;branch=master"

S = "${WORKDIR}/git"


PV = "1.0+git${SRCREV}"


DEPENDS = "boost"
RDEPENDS_${PN} = "boost"
