FROM eclipse-temurin:25
WORKDIR /app

COPY target/*.jar /app/app.jar

ENTRYPOINT ["java", "-jar","app.jar"]