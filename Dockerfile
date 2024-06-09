# Usar a imagem oficial do OpenJDK 21 como imagem base
FROM openjdk:21-jdk

# Definir argumentos para passar detalhes do jar durante o build
ARG JAR_FILE=target/*.jar

# Copiar o jar do projeto construído para o diretório raiz do container
COPY target/api_web_currcukum-0.0.1-SNAPSHOT.jar app.jar

# Expor a porta em que a aplicação estará ouvindo
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "/app.jar", --debug"]

