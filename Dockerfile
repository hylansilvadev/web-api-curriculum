FROM maven:3.9.7-sapmachine-21

WORKDIR /app
COPY . .

RUN mvn clean install


CMD mvn spring-boot:run

EXPOSE 8080