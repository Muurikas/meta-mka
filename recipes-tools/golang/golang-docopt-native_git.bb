SUMMARY = "Golang docopt"
HOMEPAGE = "http://github.com/docopt/docopt-go"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${GO_SRCROOT}/LICENSE;md5=9e0b9464ea81fa6e62aa709980ddda2e"
GO_SRCROOT = "github.com/docopt/docopt-go"
SRC_URI = "git://${GO_SRCROOT}"
SRCREV = "784ddc588536785e7299f7272f39101f7faccc3f"
PV="1.0+git${SRCPV}"

DEPENDS = "golang"

inherit golang native

PTEST_ENABLED = "0"
