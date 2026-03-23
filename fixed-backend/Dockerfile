FROM maven:3.9.9-eclipse-temurin-17

WORKDIR /app

# Copy everything from the current folder (your project) to /app
COPY . .

RUN mvn clean package -DskipTests

CMD ["java", "-jar", "target/civic-governance-1.0.0.jar"]
