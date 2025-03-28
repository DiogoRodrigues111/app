FROM openjdk:17

COPY . src/main/resources/templates/index

#RUN mvn -f /pom.xml clean install -DskipTests

WORKDIR /app

COPY target/app-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]