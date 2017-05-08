FROM dockergarten/payara-micro
MAINTAINER Marcus Fihlon, fihlon.ch
COPY target/randomuser.war ${DEPLOYMENT_DIR}
ENV JAVA_MEMORY 64m
HEALTHCHECK --interval=5s --timeout=3s --retries=3 CMD curl --fail http://localhost:8080/api/healthcheck || exit 1
