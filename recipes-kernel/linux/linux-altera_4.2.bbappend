KERNEL_DEVICETREE_cyclone5 += "socfpga_cyclone5_polar.dtb"
SRC_URI += "file://add_polar_devicetree.patch"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
