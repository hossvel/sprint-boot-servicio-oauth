FROM openjdk:19-jdk-alpine
VOLUME /tmp
ADD ./target/sprint-boot-servicio-oauth-0.0.1-SNAPSHOT.jar  servicio-oauth.jar
EXPOSE 9100
ENTRYPOINT ["java", "-jar","/servicio-oauth.jar"]