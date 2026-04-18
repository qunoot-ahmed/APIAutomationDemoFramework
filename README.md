# APIAutomationDemoFramework

A scalable and maintainable API automation framework built using Java, Rest Assured, and TestNG. The framework follows best practices such as Service Layer Architecture, environment-based configuration, and clear separation of concerns.

---

## Tech Stack

* Java
* Rest Assured
* TestNG
* Maven
* JSON (Request/Response Models)

---

## Project Structure

```
src/test/java/com/api
│
├── base
│   ├── BaseService.java
│   ├── AuthService.java
│   └── BusinessService.java
│
├── config
│   └── ConfigManager.java
│
├── constants
│   └── ResponseMessages.java
│
├── listeners
│   └── TestListener.java
│
├── request
│   ├── LoginRequest.java
│   └── SignUpRequest.java
│
├── response
│   ├── LoginResponse.java
│   └── SignUpResponse.java
│
├── routes
│   └── AuthRoutes.java
│
└── tests
    ├── LoginAPI.java
    ├── AccountCreationTest.java
    └── ForgotPasswordTest.java
```

---

## Framework Design

### Service Layer Architecture

All API interactions are handled via service classes such as AuthService and BusinessService. This keeps test classes clean and focused on validation.

### Base Service

Provides centralized configuration for base URL, headers, and request specifications.

### Configuration Management

ConfigManager handles environment-based configurations, allowing easy switching between environments such as QA, Dev, and Prod.

### Request and Response Models

POJO classes are used for request payloads and response deserialization, improving readability and type safety.

### Routes Management

API endpoints are maintained in a centralized class (AuthRoutes) to avoid hardcoding URLs.

### Test Layer

Test classes contain only assertions and test logic. All API interaction logic is abstracted into service classes.

---

## How to Run Tests

Using Maven:

```
mvn clean test
```

## Configuration

Update environment values inside:

```
ConfigManager.java
```

Example:

```java
baseUrl = "https://api.example.com";
```

## Key Features

* Clean and scalable architecture
* Reusable API service layer
* Environment-based configuration
* POJO-based request and response handling
* Easy to extend for new APIs

---

## Future Enhancements

* CI/CD integration (GitHub Actions or Jenkins)
* Reporting (Allure or Extent Reports)
* Data-driven testing
* Parallel execution

---

## Author

Qunoot Ahmed

## Purpose

This framework demonstrates real-world API automation design, clean coding practices, and maintainable architecture suitable for professional environments and interviews.
