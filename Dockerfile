# Use a imagem oficial do OpenJDK como base
FROM openjdk:21-jdk-bullseye

# Defina o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie o JAR da aplicação para o contêiner
COPY target/your-spring-boot-app.jar app.jar

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
