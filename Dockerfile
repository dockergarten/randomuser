FROM airhacks/payara
MAINTAINER Marcus Fihlon, fihlon.ch
COPY target/randomuser.war ${DEPLOYMENT_DIR}
