
FROM gcr.io/distroless/java21-debian13:nonroot
#FROM eclipse-temurin:21-jre-alpine



COPY ./target/jaeger-client-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8081

ENTRYPOINT [ "java", "-jar", "demo.jar" ]

# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar demo.jar
