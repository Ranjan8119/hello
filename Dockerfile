#FROM openjdk:8-jre-slim
#FROM adoptopenjdk/openjdk11:alpine-jre

#ENV MAVEN_HOME /usr/share/maven

#COPY target/*.jar .
#RUN ["mvn", "clean", "install"]
#EXPOSE 8080
#CMD ["java", "-jar", "service.jar"]
#------------------------------------------ls'

#FROM adoptopenjdk/openjdk11:alpine-jre
#RUN apk add curl
#VOLUME /tmp
#EXPOSE 8080
#ADD target/hello-node aws-deploy-service.jar hello-node-aws-deploy-service.jar
#ENTRYPOINT ["java","-jar","/hello-node-aws-deploy-service.jar"]

#--------------------------------







# For Java 8, try this
FROM openjdk:8-jdk-alpine

# For Java 11, try this
#FROM adoptopenjdk/openjdk11:alpine-jre

# Refer to Maven build -> finalName
ARG JAR_FILE=target/spring-boot-2-hello-world-1.0.2-SNAPSHOT.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} spring-boot-2-hello-world-1.0.2-SNAPSHOT.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","spring-boot-2-hello-world-1.0.2-SNAPSHOT.jar"]










