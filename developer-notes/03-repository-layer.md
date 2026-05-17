# Repository Layer

## Purpose
Handles database communication.

Repository layer should only focus on persistence logic.

---

# EmployeeRepository

EmployeeRepository extends JpaRepository.

Example:

JpaRepository<Employee, Long>

---

# Why JpaRepository?

Spring Data JPA provides:
- save()
- findAll()
- findById()
- deleteById()

without writing SQL manually.

---

# Important Understanding

Repository is an interface.

Spring Boot automatically creates implementation at runtime.

Developer writes:
- abstraction

Spring creates:
- implementation

---

# Internal Flow

Spring Boot Starts
→
Finds Repository Interface
→
Creates Proxy Implementation
→
Registers Bean in IOC Container

---

# Key Learning

Basic CRUD operations do not require manual SQL queries because Hibernate generates SQL internally.