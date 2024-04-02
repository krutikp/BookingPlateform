FROM openjdk:8
EXPOSE 8080
ADD target/booking-plateform.jar booking-plateform.jar
ENTRYPOINT ["java","-jar","booking-plateform.jar"]