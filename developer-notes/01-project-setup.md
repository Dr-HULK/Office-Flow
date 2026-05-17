# Project Setup

## Goal
Build an Employee Management System to learn enterprise backend development using Spring Boot.

---

# Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Lombok

---

# Dependencies Used

## Spring Web
Used for:
- REST APIs
- HTTP requests/responses
- Controllers

---

## Spring Data JPA
Used for:
- database operations
- ORM
- CRUD methods

Provides:
- save()
- findAll()
- findById()
- deleteById()

---

## MySQL Driver
Connects Spring Boot application to MySQL database.

---

## Validation
Used for request validation.

Example:
- email validation
- non-empty fields
- positive salary

---

# Database Setup

Database:
shiva

Spring Boot connected successfully with MySQL using:

spring.datasource.url=jdbc:mysql://localhost:3306/shiva

---

# Current Architecture Plan

Client
→ Controller
→ Service
→ Repository
→ Database

---

# Key Learning

Spring Boot auto-configures many components automatically using dependencies and application.properties.