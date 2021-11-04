FROM openjdk:11-jdk
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} budgetapp.jar
ENTRYPOINT ["java","-jar","/budgetapp.jar"]