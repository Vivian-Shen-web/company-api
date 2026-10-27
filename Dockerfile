FROM eclipse-temurin:8-jre

WORKDIR /app

ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

RUN mkdir -p /app/logs

# 支持两种部署方式：
# 1. 服务器部署：jar 已重命名为 app.jar 放在同目录
# 2. 本地构建：jar 在 target/ 目录
COPY app.jar app.jar

EXPOSE 8010 8020

CMD ["java", "-Xms256m", "-Xmx512m", "-jar", "app.jar"]
