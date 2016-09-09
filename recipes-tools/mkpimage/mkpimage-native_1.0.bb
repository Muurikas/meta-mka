SUMMARY = "mkpimage for signing u-boot images as Altera bootloader."
DESCRIPTION = "mkpimage for signing u-boot images as Altera bootloader."
HOMEPAGE = "https://github.com/maximeh/mkpimage/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=495c7193849c054119b27d35029e6449"

EXTRA_OEMAKE = "GOPATH=${B}"

SRCREV="d64752876a6185853400498d3a43a5e18681cab7"

SRC_URI = "git://github.com/maximeh/mkpimage.git;branch=master"

SRC_URI += "file://fix-docopt-dependency-url.patch"

S = "${WORKDIR}/git"

PV = "1.0+git${SRCREV}"


do_install () {
	install -d ${D}/bin
	install -m 755 ${S}/bin/mkpimage ${D}/bin
}

inherit native

DEPENDS = "golang golang-docopt-native"
RDEPENDS_${PN} = ""
