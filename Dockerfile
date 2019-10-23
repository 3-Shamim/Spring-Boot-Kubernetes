#FROM openjdk:13-jdk-alpine
#
#VOLUME /tmp
#
#ARG DEPENDENCY=/target/dependency
#
## Copy project dependencies from the build stage
#COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
#COPY ${DEPENDENCY}/META-INF /app/META-INF
#COPY ${DEPENDENCY}/BOOT-INF/classes /app
#
#ENTRYPOINT ["java","-cp","app:app/lib/*","com.learningstuff.springbootmysqlwithdockerandkubernetes"]

FROM openjdk:8-jdk-alpine

VOLUME /tmp

EXPOSE 8080

ADD target/student-service.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]