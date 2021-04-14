plugins {
	id("org.springframework.boot") version "2.4.4"
	id ("io.spring.dependency-management") version "1.0.11.RELEASE"
	java
	jacoco
	`kotlin-dsl`
	id("org.sonarqube") version "3.1.1"
}

group = "com.reproducer"
version = "0.0.1-SNAPSHOT"

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.junit.jupiter:junit-jupiter-api")
}
