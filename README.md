# Quarkus issue-28443 tester/reproducer Project 

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

This project is a reproducer/tester for fixing [Quarkus issue #28443](https://github.com/quarkusio/quarkus/issues/28443)

## Testing the changes

You can run your application in dev mode that enables live coding using:

```shell script
./gradlew quarkusDev -Dquarkus.args="param1=1 param2=2"

> Task :quarkusDev
Listening for transport dt_socket at address: 5005
Press [h] for more options>NG [4s]
Tests pausedv
Press [r] to resume testing, [h] for more options>
Press [r] to resume testing, [o] Toggle test output, [h] for more options>
args: 2
[param1=1, param2=2]

```

Using the CLI

```shell script
quarkus dev -Dquarkus.args="param1=1 param2=2"

BUILD SUCCESSFUL in 4s
7 actionable tasks: 1 executed, 6 up-to-date
Listening for transport dt_socket at address: 5005

args: 2
[param1=1, param2=2]

```

...and...


```shell script
quarkus dev -- param1=1 param2=2
quarkus dev -- "param1=1 , param2=2"

BUILD SUCCESSFUL in 5s
7 actionable tasks: 6 executed, 1 up-to-date
Listening for transport dt_socket at address: 5005

args: 1
[param1=1 , param2=2]

```
## Cheat sheet

Build quarkus `devtools/gradle/gradle-application-plugin` module by executing the following statement. 

```shell script
./mvnw install -T0.5C -f devtools/gradle/gradle-application-plugin/
```