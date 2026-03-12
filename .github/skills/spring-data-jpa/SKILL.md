---
name: spring-data-jpa
description: Spring Data JPA repository patterns
---

# Repository Guidelines

- Use Spring Data JPA interfaces
- Extend JpaRepository<Entity, ID>
- Use @Entity with @Id and @GeneratedValue
- Use method naming conventions for queries
- Prefer LocalDate / Instant over Date

# Example:

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

# Rules:

- Use Optional for single results
- Use pagination for large queries