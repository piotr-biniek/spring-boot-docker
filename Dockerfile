# Start with a base image containing Java runtime
FROM openjdk:8-jre-slim

# Add Maintainer Info
LABEL maintainer=" piotr_biniek@wp.pl"

# Make port 8018 available to the world outside this container
EXPOSE 8018

# The application's jar file
ARG JAR_FILE=my-app.jar
ARG PATH_JAR_FILE='./build/libs/'


# Add the application's jar to the container
ADD ${PATH_JAR_FILE}${JAR_FILE} my-app.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/my-app.jar"]