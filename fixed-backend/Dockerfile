FROM eclipse-temurin:17-jdk

# Install Maven
RUN apt-get update && apt-get install -y maven

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

CMD ["java", "-jar", "target/civic-governance-1.0.0.jar"]
