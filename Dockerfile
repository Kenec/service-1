FROM java:8
EXPOSE 9090
ADD /target/opstest.jar opstest.jar
ENTRYPOINT [ "java", "-jar", "opstest.jar"]