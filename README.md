# jersey-guice-sample

## 概要

Tomcat9でのJerseyとGuiceが同居している場合の最小サンプルです。

guice-bridge等による

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

以下のURLに入るとHello Guice Servletと表示される。

http://localhost:8081/tomcat-sample/helloGuiceServlet

## その他

### JerseyとGuiceの混在について

上述のように、JerseyとGuiceは同居できる。

JerseyはHK2というDIフレームワークに依存しているため、GuiceとHK2という2種類のDIフレームワークが同居している状態となる

Jersey配下のオブジェクトにもGuiceを用いたDIを使うには[guice-bridge](https://javaee.github.io/hk2/guice-bridge.html)を使用する必要がある。

### 参考にする場合の注意

Tomcat9系で検証する必要があったため、Tomcat9のイメージをベースにしています。

pom.xmlの依存ライブラリもそれに合わせて古くなっています。

Tomcat10系から、Servlet等のパッケージ名がjakaltaに変わるので、参考にする場合はご注意ください。
