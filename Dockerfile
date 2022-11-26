FROM tomcat:9-jdk11

RUN apt-get -y update
RUN apt-get -y upgrade

RUN apt-get install -y less

RUN apt-get install -y maven