FROM openjdk:11.0.3-jre-stretch

COPY target/weather*.jar app.jar

CMD java -jar app.jar