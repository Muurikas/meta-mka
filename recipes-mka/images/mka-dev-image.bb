SUMMARY = "Basic image for testing & development purposes"

IMAGE_INSTALL += " \
	packagegroup-core-boot \
	packagegroup-base-extended \
	webtoolkit \
"

#		qtbase \
#

IMAGE_FEATURES += "splash"

LICENSE = "MIT"

inherit core-image
