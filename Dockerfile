FROM openjdk:17
ARG FILE_JAR=target/*.jar
LABEL authors="thainq"

ADD ${FILE_JAR} hairshop-service.jar

ENTRYPOINT ["java", "-jar", "hairshop-service.jar"]
EXPOSE 80