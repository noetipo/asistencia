FROM openjdk:17-jdk-alpine as build-monolito
COPY . /code
WORKDIR /code
RUN ./mvnw package  -DskipTests

FROM openjdk:17-jdk-alpine as deploy-monolito
RUN mkdir -p /opt/app
COPY --from=build-monolito /code/target/*.jar /opt/app/
ENTRYPOINT ["java", "-jar", "/opt/app/asistencia-0.0.1-SNAPSHOT.jar"]

