# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine as builder

WORKDIR usr/app

ADD /target/DockerApp-0.0.1-SNAPSHOT.jar DockerApp-0.0.1-SNAPSHOT.jar


ENTRYPOINT ["java", "-jar", "DockerApp-0.0.1-SNAPSHOT.jar"]

