SUMMARY = "Image to test USB functionality"

IMAGE_INSTALL += " \
	packagegroup-core-boot \
	packagegroup-base-extended \
	util-linux-fdisk \
	util-linux-sfdisk \
	dropbear \
	kernel-modules \
"


IMAGE_FEATURES += "splash"

LICENSE = "MIT"

inherit core-image
#require core-image-base
