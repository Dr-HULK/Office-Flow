# Entity Layer

## Purpose
Entity classes represent database tables.

Java Object ↔ Database Table

---

# Employee Entity

Employee entity contains:
- id
- name
- email

Each field becomes a database column.

---

# Important Annotations

## @Entity
Marks class as JPA entity.

---

## @Id
Marks primary key.

---

## @GeneratedValue
Allows database to auto-generate IDs.

---

# Important Learning

JPA/Hibernate automatically maps:
- Java classes
- database tables

This is called ORM (Object Relational Mapping).

---

# Important Notes

- JPA requires no-args constructor.
- Package names should be lowercase.
- IDs are usually controlled by database.
- Email uniqueness can be enforced using:

@Column(unique = true)

---

# Flow

Employee Object
→
Hibernate/JPA
→
SQL Generated
→
employees Table