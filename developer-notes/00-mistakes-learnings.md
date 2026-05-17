# Mistakes & Learnings

---

## Mistake 1
Service extended Repository.

Wrong:
EmployeeService extends EmployeeRepository

Why wrong:
Service is not a type of Repository.

Correct Understanding:
Service should USE Repository through Dependency Injection.

Correct Design:
Service HAS-A Repository.

Key Learning:
Prefer composition over inheritance.

---

## Mistake 2
Returned employee object directly without saving.

Wrong:
return employee;

Why wrong:
Object was never persisted into database.

Correct:
return employeeRepository.save(employee);

Key Learning:
Repository layer performs persistence operations.

---

## Mistake 3
Used incorrect database URL.

Wrong:
jdbc:mysql://localhost:3306/employeedb

Actual database:
shiva

Correct:
jdbc:mysql://localhost:3306/shiva

Key Learning:
Spring Boot datasource URL must match actual MySQL schema.