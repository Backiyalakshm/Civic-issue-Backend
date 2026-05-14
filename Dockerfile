FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/civic-governance-1.0.0.jar"]
