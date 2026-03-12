---
name: docker-build
description: Docker image build and best practices
---

# Docker

Use multi-stage Docker builds.

Run Spring Boot with:

java -jar app.jar


Example Dockerfile:

FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn package

FROM eclipse-temurin:17
COPY --from=build /app/target/app.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]