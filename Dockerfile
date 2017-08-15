FROM dockergarten/payara-micro
MAINTAINER Marcus Fihlon, fihlon.ch
COPY target/randomuser.war ${DEPLOYMENT_DIR}
ENV JAVA_MEMORY 64m
HEALTHCHECK --interval=5s --timeout=3s --retries=3 CMD curl -X GET --header "Accept: application/json" --fail "http://localhost:8080/api/users" || exit 1
