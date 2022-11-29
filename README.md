# jersey-sample

## 概要

Tomcat9でのJerseyの最小サンプルです。

## 使い方

ホスト側で

```
docker-compose up -d
docker exec -it jersey-sample-app-1 bash
```

コンテナ側で

```
mvn package
cp target/tomcat-sample.war /usr/local/tomcat/webapps
```

ブラウザで以下のURLに入るとHello JAX-RSと表示される。

http://localhost:8081/tomcat-sample/api/hello


以下のURLは、404画面が表示される（JerseyConfig.javaでリソースのパッケージを制限しているため）

http://localhost:8081/tomcat-sample/api/hello2

## その他

Tomcat9系で検証する必要があったため、Tomcat9のイメージをベースにしています。

pom.xmlの依存ライブラリもそれに合わせて古くなっています。

Tomcat10系から、Servlet等のパッケージ名がjakaltaに変わるので、参考にする場合はご注意ください。