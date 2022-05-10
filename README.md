# Requirements 
    jdk 11, maven 

# Setup
    mvn clean install

# Usage

## Start Eureka Server
- mvn -pl eureka spring-boot:run -Dspring-boot.run.arguments=--EUREKA_SERVER_ADDRESS=http://localhost:8761/eureka

## Start Spring Cloud Gateway

- mvn -pl gateway spring-boot:run -Dspring-boot.run.arguments=--EUREKA_SERVER_ADDRESS=http://localhost:8761/eureka

## Start multiple instances of service 

### Instance 1 on port 9001

- mvn -pl service spring-boot:run -Dspring-boot.run.arguments=--EUREKA_SERVER_ADDRESS=http://localhost:8761/eureka -Dspring-boot.run.jvmArguments=-Dserver.port=9001

### Instance 2 on port 9002

- mvn -pl service spring-boot:run -Dspring-boot.run.arguments=--EUREKA_SERVER_ADDRESS=http://localhost:8761/eureka -Dspring-boot.run.jvmArguments=-Dserver.port=9002

# Test
-send request to localhost:9090/service/test
