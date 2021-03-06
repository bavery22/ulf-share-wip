SUMMARY = "the blessed package to manage your versions by scm tags"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838c366f69b72c5df05c96dff79b35f2"

SRC_URI[md5sum] = "b6916c78ed6253d6602444fad4279c5b"
SRC_URI[sha256sum] = "daf12d05aa2155a46aa357453757ffdc47d87f839e62114f042bceac6a619e2f"

PYPI_PACKAGE = "setuptools_scm"

RDEPENDS_${PN}_class-target = "python-py python-setuptools python-argparse python-debugger python-json"
RDEPENDS_${PN}_class-native = "python-setuptools-native"

BBCLASSEXTEND = "native"

inherit pypi setuptools
