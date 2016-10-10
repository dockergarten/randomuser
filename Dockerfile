FROM airhacks/payara
MAINTAINER Marcus Fihlon, fihlon.ch
COPY target/randomuser.war ${DEPLOYMENT_DIR}
HEALTHCHECK CMD curl --fail http://localhost:8080/api/monitoring/ping/+ || exit 1
