FROM java:8
EXPOSE 8080
ADD /build/libs/gradle-springboot-1.0.jar gradle-springboot-1.0.jar
ENTRYPOINT ["java","-jar","gradle-springboot-1.0.jar"]