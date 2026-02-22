# Use an official OpenJDK 25 image as the base
FROM eclipse-temurin:25-jdk
EXPOSE 8080
ADD target/docker-jenkins-integration.jar docker-jenkins-integration.jar
ENTRYPOINT ["java","-jar","/docker-jenkins-integration.jar"]
