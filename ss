warning: LF will be replaced by CRLF in pom.xml.
The file will have its original line endings in your working directory
[1mdiff --git a/pom.xml b/pom.xml[m
[1mindex 9aa183d..8287af5 100644[m
[1m--- a/pom.xml[m
[1m+++ b/pom.xml[m
[36m@@ -1,12 +1,13 @@[m
 <?xml version="1.0" encoding="UTF-8"?>[m
[31m-<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"[m
[32m+[m[32m<project xmlns="http://maven.apache.org/POM/4.0.0"[m
[32m+[m	[32mxmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"[m
 	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">[m
 	<modelVersion>4.0.0</modelVersion>[m
 	<parent>[m
 		<groupId>org.springframework.boot</groupId>[m
 		<artifactId>spring-boot-starter-parent</artifactId>[m
 		<version>2.7.0</version>[m
[31m-		<relativePath/> <!-- lookup parent from repository -->[m
[32m+[m		[32m<relativePath /> <!-- lookup parent from repository -->[m
 	</parent>[m
 	<groupId>br.com.dev.wakandaacademy</groupId>[m
 	<artifactId>produdoro</artifactId>[m
[36m@@ -17,11 +18,16 @@[m
 		<java.version>11</java.version>[m
 		<spring-cloud.version>2021.0.3</spring-cloud.version>[m
 	</properties>[m
[32m+[m[41m	[m
[32m+[m	[32m<!-- Dependencies -->[m
[32m+[m[41m	[m
 	<dependencies>[m
[32m+[m
 		<dependency>[m
 			<groupId>org.springframework.boot</groupId>[m
 			<artifactId>spring-boot-starter-data-mongodb</artifactId>[m
 		</dependency>[m
[32m+[m
 		<dependency>[m
 			<groupId>org.springframework.boot</groupId>[m
 			<artifactId>spring-boot-starter-web</artifactId>[m
[36m@@ -30,18 +36,19 @@[m
 			<groupId>org.springframework.cloud</groupId>[m
 			<artifactId>spring-cloud-starter-openfeign</artifactId>[m
 		</dependency>[m
[31m-[m
[31m-		<dependency>[m
[31m-			<groupId>org.springframework.boot</groupId>[m
[31m-			<artifactId>spring-boot-devtools</artifactId>[m
[31m-			<scope>runtime</scope>[m
[31m-			<optional>true</optional>[m
[31m-		</dependency>[m
[32m+[m[41m		[m
 		<dependency>[m
 			<groupId>org.projectlombok</groupId>[m
 			<artifactId>lombok</artifactId>[m
 			<optional>true</optional>[m
 		</dependency>[m
[32m+[m	[32m<!-- Dependency Validation -->[m
[32m+[m		[32m<dependency>[m
[32m+[m			[32m<groupId>javax.validation</groupId>[m
[32m+[m			[32m<artifactId>validation-api</artifactId>[m
[32m+[m			[32m<version>2.0.1.Final</version><!--$NO-MVN-MAN-VER$-->[m
[32m+[m		[32m</dependency>[m
[32m+[m[41m		[m
 		<dependency>[m
 			<groupId>org.springframework.boot</groupId>[m
 			<artifactId>spring-boot-starter-test</artifactId>[m
[1mdiff --git a/src/main/resources/application.yml b/src/main/resources/application.yml[m
[1mindex 8b13789..6446ff1 100644[m
[1m--- a/src/main/resources/application.yml[m
[1m+++ b/src/main/resources/application.yml[m
[36m@@ -1 +1,10 @@[m
[32m+[m[32mserver:[m
[32m+[m[32m  servlet:[m
[32m+[m[32m    context-path: /produdoro/api[m[41m [m
 [m
[32m+[m[32mspring:[m
[32m+[m[32m  data:[m
[32m+[m[32m    mongodb:[m
[32m+[m[32m      authentication-database: admin[m
[32m+[m[32m      uri: ${MONGO_DB_URI:mongodb+srv://AndersonM:pjB7DKzd6YB22TU@cluster0.squbxys.mongodb.net/myFirstDatabase?retryWrites=true&w=majority}[m
[32m+[m[32m      auto-index-creation: true[m
\ No newline at end of file[m
