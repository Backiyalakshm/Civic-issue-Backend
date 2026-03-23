FROM maven:3.9.9-eclipse-temurin-17

WORKDIR /app

COPY Civic-issue-Backend ./Civic-issue-Backend

WORKDIR /app/Civic-issue-Backend

RUN mvn clean package -DskipTests

CMD ["java", "-jar", "target/civic-governance-1.0.0.jar"]
