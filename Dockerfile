FROM java:8u181-jre-slim

ADD build/libs/goods-*.jar /work/app.jar
ADD run.sh /

ENTRYPOINT ["/run.sh"]