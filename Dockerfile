FROM adoptopenjdk/openjdk11
EXPOSE 9090
ARG JAR_FILE=target/heroku-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} application.jar
ENTRYPOINT ["java","-jar","/application.jar"]

#COPY heroku-0.0.1-SNAPSHOT.jar heroku.jar
