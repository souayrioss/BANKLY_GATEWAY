FROM openjdk:17-jdk-alpine
WORKDIR gateway/
COPY target/BanklyGateway0.0.1-SNAPSHOT.war gateway/
ENTRYPOINT ["java", "-jar","gateway/BanklyGateway0.0.1-SNAPSHOT.war"]