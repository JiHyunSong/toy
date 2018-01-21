# README #

첫 환경 빌드를 위한 (React + some API code by java or scala + docker for All in One) 프로젝트를 공부하는 공간.


# 환경
----

scala : 2.12.2

play : 2.6.11


# run api
---

sbt run

```

http://0.0.0.0:9000/

```


# directory 구조

```
├── README.md
├── app
│   ├── Module.scala
│   ├── controllers
│   │   ├── AsyncController.scala 
│   │   ├── CountController.scala
│   │   └── HomeController.scala
│   ├── filters
│   │   └── ExampleFilter.scala 
│   ├── services
│   │   ├── ApplicationTimer.scala
│   │   └── Counter.scala
│   └── views
│       ├── index.scala.html
│       ├── main.scala.html
│       └── welcome.scala.html
├── build.sbt
├── conf
│   ├── application.conf
│   ├── logback.xml
│   └── routes             # API 당 실제 사용될 Controller match
├── logs
│   └── application.log
├── project
│   ├── build.properties
│   ├── plugins.sbt
│   ├── project
│   └── target
├── public
│   ├── images
│   │   ├── external.png
│   │   ├── favicon.png
│   │   └── header-pattern.png
│   ├── javascripts
│   │   └── hello.js
│   └── stylesheets
│       └── main.css
└── worksheet
```