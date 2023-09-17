FROM openjdk:17-ea-11-jdk-slim
VOLUME /tmp
COPY build/libs/discovery-svc-1.0.jar DiscoverySvc.jar
ENTRYPOINT ["java", "-jar", "DiscoverySvc.jar"]