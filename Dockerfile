FROM eclipse-temurin:17

LABEL mentainer="Gavin.Hashemi@GForceSoftware.ca"

WORKDIR /app

COPY target/springbootdocker-0.0.1-SNAPSHOT.jar /app/springbootdocker.jar

ENTRYPOINT ["java" , "-jar" , "springbootdocker.jar"]