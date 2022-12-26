# _ClipboardAssessment_
This is a java selenium framework which is using testng, maven, selenium, java to achieve the task.

### _Project Features_

- Option to auto manage drives using WebDriverManager.
- Read data from Properties file.

### _Project Components_
Below are the component details of the framework:

- #### Browser interaction using
  `selenium`

- #### Test Data
  Supports to read and maintain data from config file.
    -  Properties File

-   #### Test Scripts
    TestNG is used as a test framework in order to generate test script taking into account the `Page Object Model` design pattern.

-   #### Build Tool
    Using `maven`, project dependencies are managed. Test can be run using `testng.xml`.

-   #### Utilities
    Holds common methods to re-use in order to achieve maximum re-usability.

-   #### Test Runner
    -   Tests can be executed by using:
        - testng.xml

### Setup and Execution:
1. Make sure [maven](https://maven.apache.org/install.html) is installed on your machine and MAVEN_HOME variable is set.
2. Java is installed on your machine and JAVA_HOME variable is set. 
3. Google Chrome is installed on your machine.
4. Execute project by following command in terminal/command line: mvn test -PMain
5. Or open the project in IDE(IntelliJ idea) and run testng.xml file.
