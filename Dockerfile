FROM eclipse-temurin:17-jdk AS build
WORKDIR /opt/demo

COPY . .
RUN ./gradlew build -x test

#####

FROM eclipse-temurin:17-jre

WORKDIR /opt/demo
EXPOSE 8080

COPY --from=build /opt/demo/build/libs/hw-*-SNAPSHOT.jar .
ENTRYPOINT java -jar hw-*.jar
