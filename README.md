# QA-Automation-Java-BDD

Hybrid BDD test automation framework using **Java**, **Selenium**, **TestNG**, **JUnit**, and **Cucumber (Gherkin)**.

## 🔧 Tech Stack

- Java 11+
- Selenium WebDriver
- TestNG
- JUnit 4
- Cucumber BDD (Gherkin)
- Maven
- WebDriverManager (for driver binaries)

## 📁 Project Structure



src/
├── main/
│ ├── java/ → Page Object classes
│ └── resources/features/ → Gherkin feature files
└── test/
└── java/ → Step definitions and test runner




## 🚀 Getting Started

1. Clone the repo  
2. Run the following command:

```bash
mvn clean test

This will run the Cucumber feature(s) using TestNG.


Scenario: Successful login with valid credentials
  Given user is on the login page
  When user enters valid username and password
  And clicks login button
  Then user should be redirected to the homepage



📄 Reports
After the test run, a report will be generated at:

target/cucumber-report.html
