# Architecture Flow

# Current Request Flow

Client
→
Controller
→
Service
→
Repository
→
Hibernate/JPA
→
MySQL Database

---

# Layer Responsibilities

## Controller
Handles HTTP requests/responses.

## Service
Contains business logic.

## Repository
Handles database communication.

## Entity
Represents database tables.

---

# Spring Boot Startup Flow

@SpringBootApplication
→
Component Scan
→
Beans Created
→
Dependencies Injected
→
Application Ready

---

# Dependency Injection Flow

EmployeeController
HAS-A
EmployeeService

EmployeeService
HAS-A
EmployeeRepository

---

# Current Project Status

Entity Layer          ✅
Repository Layer      ✅
Service Layer         ✅
Controller Layer      ⏳
REST APIs             ⏳
DTO Layer             ⏳
Validation            ⏳