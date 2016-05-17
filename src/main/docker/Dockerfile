FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD employeemicros-1.0.0-SNAPSHOT.jar app.jar
EXPOSE 8080
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://determined_kirch/micros", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]