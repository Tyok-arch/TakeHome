# 🚀 QA Automation Framework

A QA Automation Framework for **Web UI** and **API Testing** built using Selenium WebDriver, RestAssured, Cucumber, and JUnit 5.

---

## 🛠️ Tech Stack

<p align="left">

<img src="https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>

<img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white"/>

<img src="https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white"/>

<img src="https://img.shields.io/badge/Cucumber-23D96C?style=for-the-badge&logo=cucumber&logoColor=white"/>

<img src="https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white"/>

<img src="https://img.shields.io/badge/RestAssured-009688?style=for-the-badge"/>

<img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github"/>

<img src="https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white"/>

<img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellijidea"/>

</p>

---

# 📌 Features

## Web UI Automation

- Selenium WebDriver
- Page Object Model (POM)
- Cucumber BDD
- JUnit 5
- HTML Report

## API Automation

- REST Assured
- CRUD API Testing
- JSON Payload
- Request & Response Validation
- Cucumber BDD

## Manual API Testing

- Postman Collection
- Positive Testing
- Negative Testing

---

# 📂 Project Structure

```text
src
├── main
│   └── java
│       ├── config
│       ├── driver
│       ├── locators
│       ├── pages
│       └── utils
│
├── test
│   ├── java
│   │   ├── api
│   │   ├── hooks
│   │   ├── runners
│   │   └── stepdefinitions
│   │
│   └── resources
│       ├── features
│       │   ├── api
│       │   └── web
│       ├── payload
│       └── config.properties
```

---

# 📊 Test Result

| Module | Total | Passed | Failed |
|---------|------:|-------:|-------:|
| Web Automation | 10 | ✅ 10 | ❌ 0 |
| API Automation | 5 | ✅ 5 | ❌ 0 |

---

# ▶️ Running The Project

### Run Web Automation

```bash
mvn test -Dtest=TestRunner
```

### Run API Automation

```bash
mvn test -Dtest=ApiTestRunner
```

---

# 📷 Manual API Testing

Manual API Testing was performed using **Postman** before implementing API Automation using **RestAssured**.

---

# 👨‍💻 Author

**SULISTIYONO**

QA Automation Framework Project
