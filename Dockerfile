FROM openjdk:11-jre-slim

WORKDIR /app

COPY . .

EXPOSE 8080

CMD ["./gradlew", "run"]