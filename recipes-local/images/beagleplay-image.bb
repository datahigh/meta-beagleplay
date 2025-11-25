require recipes-core/images/core-image-minimal.bb

ENABLE_RUST = "1"
IMAGE_INSTALL:append = " helloworld read-urandom-rust gpio-int-rust i2c-eeprom-read-rust show-mac-address-rust simpleserver-rust"
