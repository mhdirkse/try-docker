FROM openjdk:8

COPY target/try-docker-0.1.0.jar /usr/bin/try-docker-0.1.0.jar

CMD ["java", "-jar", "/usr/bin/try-docker-0.1.0.jar"]
