# Deposit at C-Store
Testing depositing at C-Store with unit test (JUnit 5). Software Verification and Validation's assignment.

By Nutthanich Narphromar (6110545490)

*Last updated: 29/11/20*
## Requirements
| Tool | Version |
|------|---------|
| [Java](https://www.java.com/en/) | 8 |
| [Maven](https://maven.apache.org/index.html) | 3.6 or higher |
| [JUnit 5](https://junit.org/junit5/) | 5.7.0 or higher |

* Java and Maven need to be installed to the local machine manually.
* JUnit 5 will be imported by Maven as it is specified in the `pom.xml` provided in this repository.

## Installation
1. Check if your local machine has Java 8 installed using `java -version` command
   ```
   > java -version
   java version "1.8.0_231"
   Java(TM) SE Runtime Environment (build 1.8.0_231-b11)
   Java HotSpot(TM) 64-Bit Server VM (build 25.231-b11, mixed mode)
   ```
   * If you haven't had Java 8 installed yet, please download from this [link](https://www.java.com/en/download/).
   
2. Check if your local machine has Maven version 3.6 or above installed using `mvn --version` command
   ```
   > mvn --version
   Apache Maven 3.6.3 (...)
   Maven home: C:\Program Files\apache-maven-3.6.3\bin\..
   Java version: 1.8.0_231, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk1.8.0_231\jre
   ...
   ```
   * If you haven't had Maven installed yet, please download it from this [link](https://maven.apache.org/download.cgi) and follow this [installation guide](https://maven.apache.org/install.html).
   
2. Clone this repository to your local machine using `git clone` command
   ```
   > git clone https://github.com/NutthanichN/c-store-deposit.git
   ```

## How to run tests
1. Go to `c-store-deposit` directory (root directory of the project)
   ```
   > cd c-store-deposit
   ```

2. Use `mvn test` command to run all unit tests
   ```
   > mvn test
   ```
