FROM openjdk:11
COPY out/artifacts/demo2_jar/demo2.jar /tmp
WORKDIR /app
EXPOSE 9090
ENTRYPOINT ["java","-jar","demo2.jar"]