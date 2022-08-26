FROM openjdk:8
ADD target/procrsspensionapp.jar procrsspensionapp.jar
ENTRYPOINT ["java", "-jar","procrsspensionapp.jar"]
EXPOSE 9084