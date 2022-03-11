FROM openjdk:11
LABEL maintainer="java.net"
Add target/abkott-adminbackend-spring-0.0.1-SNAPSHOT.jar abkott-adminbackend-spring.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","abkott-adminbackend-spring.jar"]
