# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://git@github.com/datahigh/show-mac-address-rust.git;protocol=ssh;branch=master"

# Modify these as desired
PV = "1.0+git"
SRCREV = "9a988f6e499c3c137ffc5bdb1bb07af91b01ecef"

S = "${WORKDIR}/git"

# NOTE: no Makefile found, unable to determine what needs to be done

inherit cargo cargo-update-recipe-crates
require ${BPN}-crates.inc
