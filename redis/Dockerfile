FROM java:8
RUN mkdir /app
WORKDIR /app
EXPOSE 8080
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
COPY target/redis-0.0.1-SNAPSHOT.jar /app
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Duser.timezone=GMT+08", "-jar","-Xmx2048m", "/app/redis-0.0.1-SNAPSHOT.jar"]