# Day 1 - Project Initialization

## Project
Employee Management System using Spring Boot

---

# Why I Selected These Dependencies

## Spring Web
Used for building REST APIs and handling HTTP requests/responses.

This dependency helps in creating:
- Controllers
- API endpoints
- Request mappings
- REST services

Example:
- Create Employee API
- Get Employee API

---

## Spring Data JPA
Used for interacting with the database.

Instead of writing SQL queries manually for every operation,
Spring Data JPA provides built-in methods for:
- save()
- findById()
- findAll()
- delete()

This simplifies database operations significantly.

---

## MySQL Driver
Used to connect the Spring Boot application with MySQL database.

Without this dependency, the application cannot communicate with MySQL.

---

## Lombok
Used to reduce boilerplate code in Java.

Normally Java requires:
- getters
- setters
- constructors
- builder methods

Lombok automatically generates them using annotations.

This keeps code cleaner and shorter.

---

## Validation
Used to validate incoming request data.

Example validations:
- name should not be empty
- email should be valid
- salary should be positive

This helps prevent invalid data from entering the database.

---

# Current Architecture Plan

The project will follow Layered Architecture.

Flow:

Client
→ controller
→ service
→ repository
→ Database

---

## controller Layer
Responsible for:
- receiving HTTP requests
- returning HTTP responses

The controller should not contain business logic.

---

## service Layer
Responsible for:
- business logic
- validations
- application rules

This acts as the main processing layer.

Planned structure:
- service Interface
- service Implementation

---

## repository Layer
Responsible for:
- database communication
- CRUD operations

Will use Spring Data JPA repositories.

---

## entity Layer
Represents database tables as Java classes.

Example:
Employee class → employees table

---

## dto Layer (Planned)
Will be used later for request/response handling instead of exposing entities directly.

Purpose:
- cleaner API design
- flexibility
- security

---

# What I Learned Today

## Spring Boot Request Flow

Basic backend request flow:

Client
→ controller
→ service
→ repository
→ Database

This is the standard flow followed in layered backend applications.

---

## Difference Between Layers

### controller
Handles HTTP communication.

### service
Contains business logic.

### repository
Interacts with database.

### entity
Represents database tables.

---

## JPA Understanding

Spring Data JPA reduces manual SQL writing.

repository methods like:
- save()
- findAll()
- delete()

are automatically provided by Spring.

---

## Lombok Understanding

Lombok reduces repetitive Java code by generating:
- getters
- setters
- constructors

through annotations.

---

# Current Goal

Initial focus:
- Build Employee CRUD APIs
- Understand complete request flow
- Learn layered architecture properly

Advanced topics like:
- Security
- JWT
- Docker
- Microservices

will be added later gradually.

## @Entity
Did the below things

- Entity classes represent database tables.
- Fields inside entity become database columns.
- @Id marks primary key.
- @GeneratedValue allows DB to auto-generate IDs.
- No-args constructor is required by JPA/Hibernate.
- Email uniqueness can be enforced using @Column(unique = true).
- Package names in Java should always be lowercase.
- ID setters are usually avoided because database controls ID generation.

