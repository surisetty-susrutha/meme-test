# MEME-GENERATOR

Simple Java web application for practicing:

GitHub -> Jenkins -> Maven -> WAR -> Tomcat

## Requirements

- Java 17
- Maven 3.9+
- Tomcat 10.1+
- Jenkins with Maven and Deploy to Container plugins

## Build locally

```bash
mvn clean install
```

The WAR will be created at:

```text
target/meme-generator.war
```

## Run on Tomcat

Copy the WAR into Tomcat's `webapps` directory:

```bash
cp target/meme-generator.war $CATALINA_HOME/webapps/
```

Then open:

```text
http://SERVER_IP:8080/meme-generator/
```

## Jenkins

Maven goal:

```text
clean install
```

WAR files to deploy:

```text
target/*.war
```

Context path:

```text
meme-generator
```
