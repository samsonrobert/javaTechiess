---
name: java-clean-code
description: Clean code guidelines for Java 21 projects
---

# Java Clean Code Guidelines (Java 21)

Follow modern Java 21 best practices to produce readable, maintainable, and production-quality code.

---

# General Principles

- Write small, focused classes and methods.
- Use meaningful and descriptive names.
- Prefer immutability where possible.
- Avoid deep nesting and complex conditionals.
- Keep methods under ~20 lines when practical.
- Use early returns to reduce nested blocks.

Bad:

if (user != null) {
    if (user.isActive()) {
        process(user);
    }
}

Good:

if (user == null || !user.isActive()) {
    return;
}

process(user);

---

# Naming Conventions

Classes:

- Use PascalCase
- Example: UserService, OrderController

Methods and variables:

- Use camelCase
- Example: createUser, totalAmount

Constants:

- Use UPPER_SNAKE_CASE
- Example: MAX_RETRY_COUNT

Booleans:

- Prefix with is/has/can
- Example: isActive, hasPermission

---

# Use Modern Java 21 Features

Prefer modern language features when appropriate.

Use:

- var for local variables when type is obvious
- switch expressions
- records for DTOs
- Optional for nullable returns
- text blocks for long strings
- pattern matching

Example record DTO:

public record UserResponse(
    Long id,
    String name,
    String email
) {}

---

# Immutability

Prefer immutable objects.

Use:

- final fields
- records for data transfer objects
- unmodifiable collections

Example:

public record ProductDTO(
    Long id,
    String name,
    BigDecimal price
) {}

---

# Collections

Use the correct collection type.

List → ordered data  
Set → unique values  
Map → key-value lookups

Prefer:

List.of(...)
Set.of(...)
Map.of(...)

Avoid unnecessary mutable collections.

---

# Optional Usage

Return Optional for possibly missing values.

Good:

Optional<User> findByEmail(String email);

Avoid:

return null;

Never use Optional as a field.

---

# Exception Handling

Use exceptions for exceptional situations.

Create meaningful custom exceptions.

Example:

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }

}

Avoid catching generic Exception unless necessary.

---

# Logging

Use SLF4J logging.

Never use:

System.out.println

Example:

private static final Logger log =
LoggerFactory.getLogger(UserService.class);

log.info("Creating user {}", email);
log.error("User creation failed", ex);

---

# Method Design

Methods should:

- do one thing
- have clear names
- have minimal parameters

Avoid methods with more than 3–4 parameters.

Use parameter objects when needed.

---

# Null Safety

Avoid null whenever possible.

Use:

Optional
Objects.requireNonNull()

Example:

Objects.requireNonNull(userId, "userId must not be null");

---

# Stream API

Use streams for readable transformations.

Example:

List<String> emails =
users.stream()
.map(User::getEmail)
.toList();

Avoid overly complex streams.

---

# Switch Expressions (Java 21)

Prefer switch expressions over long if chains.

Example:

String status = switch(orderState) {
case CREATED -> "New";
case PAID -> "Paid";
case SHIPPED -> "Shipped";
};

---

# Pattern Matching

Use pattern matching for instanceof.

Example:

if (obj instanceof User user) {
process(user);
}

---

# Documentation

Document:

- public APIs
- complex logic
- business rules

Use Javadoc when necessary.

---

# Code Smells to Avoid

Avoid:

- God classes
- Long methods
- Duplicate logic
- Deep nesting
- Primitive obsession

Refactor when needed.

---

# Testing Friendliness

Write code that is easy to test.

Rules:

- avoid static state
- use constructor injection
- separate logic from framework code