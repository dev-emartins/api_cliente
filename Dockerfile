FROM eclipse-temurin:21-jdk-alpine AS build

WORKDIR /app_cliente

COPY gradlew settings.gradle ./
COPY gradle ./gradle
COPY build.gradle ./

RUN ./gradlew dependencies --no-daemon

COPY src ./src

RUN ./gradlew clean build --no-daemon

# Runtime
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app_cliente

COPY --from=build /app_cliente/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]