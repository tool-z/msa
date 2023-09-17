FROM openjdk:17-ea-11-jdk-slim
VOLUME /tmp
COPY build/libs/gateway-svc-1.0.jar GatewaySvc.jar
ENTRYPOINT ["java", "-jar", "GatewaySvc.jar"]