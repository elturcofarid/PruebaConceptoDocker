FROM openjdk:14.0-jdk-slim
EXPOSE 9093
ADD ./target/spring-boot-eureka-0.0.1-SNAPSHOT.jar  servicio-documentacion.jar 
ENTRYPOINT ["java", "-jar", "/ servicio-documentacion.jar"]