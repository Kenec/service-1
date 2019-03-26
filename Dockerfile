FROM java:8
EXPOSE 9090
ADD /target/opstest.jar opstest.jar
RUN  --rm -v $(pwd)/mybashscript.sh:/mybashscript.sh ubuntu bash /mybashscript.sh
ENTRYPOINT [ "java", "-jar", "opstest.jar", "./change.sh" ]