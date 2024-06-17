FROM maven:3.9.7-sapmachine-21

WORKDIR /app
COPY . .

EXPOSE 8080

RUN mvn install


CMD mvn spring-boot:run
