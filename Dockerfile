FROM amazoncorretto:11-alpine-jdk
MAINTAINER DCM
COPY target/democl-0.0.1-SNAPSHOT.jar dcm-app.jar
ENTRYPOINT ["java", "-jar", "/dcm-app.jar"]
