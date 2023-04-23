FROM amazoncorretto:8-alpine-jdk
MAINTAINER DCM
copy  target/democl-0.0.1-SNAPSHOT.jar dcm-app.jar
ENTRYPOINT ["java", "-jar", "/dcm-app.jar"]

