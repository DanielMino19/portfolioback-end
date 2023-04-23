FROM amazoncorretto:19-alpine-jdk
MAINTAINER DCM
COPY target/democl-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
