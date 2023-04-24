FROM amazoncorretto:8-alpine-jdk
MAINTAINER dms
copy  target/democl-0.0.1-SNAPSHOT.jar dms-app.jar
ENTRYPOINT ["java", "-jar", "/dms-app.jar"]

