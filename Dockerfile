FROM 39.105.161.220:8086/base/centos7_jdk8:v1.0

MAINTAINER 1729768919@qq.com

VOLUME /logs/

COPY *.jar /cicdtest.jar

ADD /target/cicdtest.jar /cicdtest/

CMD ".........server.port=6060"
EXPOSE 6060

ENTRYPOINT ["java","-jar","/cicdtest/cicdtest.jar"]