FROM openjdk:8
EXPOSE 8080
ADD target/galigithubworkflow.jar galigithubworkflow.jar
ENTRYPOINT ["java","-jar","/galigithubworkflow.jar"]