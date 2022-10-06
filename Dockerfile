FROM openjdk:8-alpine
COPY target/spring-batch-to-db-0.0.1-SNAPSHOT.jar spring-batch-to-db.jar
ENTRYPOINT ["java","-jar","spring-batch-to-db.jar"]