FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD my-spring-boot-sample-1.0.0-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]