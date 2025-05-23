# BDD Cucumber Java Project

This project demonstrates Behavior Driven Development (BDD) using Cucumber with Java and Maven. It supports parallel execution and generates detailed reports.

## Table of Contents

- [Overview](#overview)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Setup & Installation](#setup--installation)
- [Running Tests](#running-tests)
- [Parallel Execution](#parallel-execution)
- [Reporting](#reporting)
- [References](#references)

---

## Overview

This repository provides an example setup of BDD testing using Cucumber with JUnit in Java, managed by Maven. It includes configuration for parallel test execution and rich reporting using the `maven-cucumber-reporting` plugin.

## Tech Stack

- **Java 11**
- **Maven**
- **Cucumber (BDD)**
- **JUnit**
- **maven-cucumber-reporting** (for HTML reports)
- **Maven Surefire Plugin** (for parallel execution)

## Project Structure

```
bddCucumber_java/
├── pom.xml
├── src/
│   ├── main/java/...
│   └── test/
│       ├── java/
│       │   └── runner/
│       │       └── TestRunner.java
│       └── resources/
│           └── features/
│               └── *.feature
└── ...
```

- **pom.xml**: Maven configuration (dependencies, plugins, reporting, parallel execution)
- **TestRunner.java**: JUnit runner for Cucumber tests
- **features/**: Gherkin feature files

## Setup & Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/deepak4175/bddCucumber_java.git
   cd bddCucumber_java
   ```

2. **Build the project:**
   ```bash
   mvn clean install
   ```

## Running Tests

To execute the tests, run:
```bash
mvn test
```

## Parallel Execution

Parallel test execution is configured using the Maven Surefire Plugin:

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>3.5.3</version>
    <configuration>
        <threadCount>2</threadCount>
        <forkCount>1</forkCount>
        <reuseForks>true</reuseForks>
        <includes>
            <include>**/*TestRunner.class</include>
        </includes>
        <parallel>methods</parallel>
    </configuration>
</plugin>
```

- **threadCount**: Number of threads to use for parallel execution
- **parallel**: Set to `methods` to run test methods in parallel

## Reporting

Automated HTML reports are generated after execution using the `maven-cucumber-reporting` plugin. By default, reports will be available in the `target/` directory.

```xml
<plugin>
    <groupId>net.masterthought</groupId>
    <artifactId>maven-cucumber-reporting</artifactId>
    <version>5.8.5</version>
    <executions>
        <execution>
            <id>execution</id>
            <phase>verify</phase>
            <goals>
                <goal>generate</goal>
            </goals>
            <configuration>
                <projectName>bddPractice</projectName>
                <outputDirectory>${project.build.directory}</outputDirectory>
                <inputDirectory>${project.build.directory}</inputDirectory>
                <jsonFiles>
                    <param>**/*.json</param>
                </jsonFiles>
            </configuration>
        </execution>
    </executions>
</plugin>
```

- Open `target/cucumber-html-reports/overview-features.html` to view the summary.

## References

- [Cucumber-Java](https://cucumber.io/docs/installation/java/)
- [Maven Surefire Plugin](https://maven.apache.org/surefire/maven-surefire-plugin/)
- [maven-cucumber-reporting](https://github.com/damianszczepanik/cucumber-reporting)
