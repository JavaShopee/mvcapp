FROM tomcat:8.0
COPY /target/SampleMvcApp.war /usr/local/tomcat/webapps/  
EXPOSE 89
CMD ["catalina.sh", "run"]
