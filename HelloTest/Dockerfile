FROM openjdk:8
ARG VERSION=0.0.2
ADD build/libs/HelloTest-$VERSION.jar HelloTest.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "HelloTest.jar"]