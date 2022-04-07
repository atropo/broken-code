# TBG app demo

Simple test app using the [Javalin](https://javalin.io/) framework.


## Requisites

1. Java version 8 or above
2. [Maven](https://maven.apache.org/) installed


## Compile

Compile the application with 

```
$ mvn clean compile package 
```





## Running

Two ways to start the app:

```
$ java -jar target/javalin-maven-1.0-SNAPSHOT.jar
```

```
$ java -cp target/javalin-maven-1.0-SNAPSHOT.jar it.tbg.app.App
```

## Notes

Port is currently hard-coded in as 3000.
