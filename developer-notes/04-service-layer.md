# Service Layer

## Purpose
Contains business logic and application rules.

Service layer should not directly handle HTTP requests or database-specific logic.

---

# Responsibilities

Examples:
- validations
- calculations
- orchestration
- business rules

---

# Important Understanding

Correct:

Service HAS-A Repository

Wrong:

Service extends Repository

Prefer:
- composition
  over
- inheritance

---

# Dependency Injection

Repository is injected into service using constructor injection.

Example Flow:

Spring Container
→
Creates Repository Bean
→
Creates Service Bean
→
Injects Repository into Service

---

# Why Constructor Injection?

Preferred because:
- safer
- immutable dependency
- easier testing
- recommended by Spring

---

# saveEmployee() Flow

employeeService.saveEmployee(employee)
→
employeeRepository.save(employee)
→
Hibernate
→
SQL Generated
→
MySQL Insert

---

# Key Learning

Service layer acts as the business layer between:
- Controller
- Repository