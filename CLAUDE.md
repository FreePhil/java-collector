# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Spring Boot application (version 3.5.0) using Java 21, built with Maven. The project is configured for GraalVM native image compilation and supports both standard JVM and native executable deployment.

## Commands

### Build and Run
- `./mvnw spring-boot:run` - Run the application
- `./mvnw clean package` - Build the JAR
- `./mvnw test` - Run all tests
- `./mvnw test -Dtest=ClassName#methodName` - Run specific test

### Native Image Support
- `./mvnw spring-boot:build-image -Pnative` - Build native Docker image
- `./mvnw native:compile -Pnative` - Compile to native executable
- `./mvnw test -PnativeTest` - Run tests in native image

## Architecture

The application follows standard Spring Boot conventions:
- Main application class: `CollectorApplication.java` at `src/main/java/com/henge/collector/`
- Configuration: `application.properties` with minimal Spring configuration
- Package structure: `com.henge.collector`
- Tests: Standard Spring Boot test setup with `@SpringBootTest`

The project is currently a minimal Spring Boot starter application without additional dependencies beyond the core Spring Boot starter and test dependencies.