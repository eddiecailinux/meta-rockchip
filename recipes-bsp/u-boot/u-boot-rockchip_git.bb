# Copyright (C) 2017 Fuzhou Rockchip Electronics Co., Ltd
# Copyright (C) 2017 Trevor Woerner <twoerner@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "Rockchip next-dev U-Boot"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"
COMPATIBLE_MACHINE = "(firefly-rk3288)"

SRC_URI = "git://github.com/rockchip-linux/u-boot.git;branch=release;"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

do_deploy_prepend () {
	# copy to default search path
	cp ${B}/spl/${SPL_BINARY} ${B}/
}
