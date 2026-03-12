---
name: architecture
description: Standard Spring Boot layered architecture
---

# Architecture

Use layered architecture:

Controller → Service → Repository → Database → Entity


# Package Structure:

com.ams.project
├── controller
├── service
├── repository
├── model
├── dto
├── mapper
├── config
└── exception


# Rules:

- Controllers handle HTTP requests and return DTOs only
- Controllers must be thin: validation, mapping, and delegation only
- Services contain business logic
- Repositories access database
- Repositories use Spring Data JPA interfaces
- Do not put business logic in controllers
- Never access repositories directly from controllers

# Dependency Injection:

- Use constructor injection
- Avoid field injection

# Coding Style:

- Use Java 21+ features when appropriate
- Use Lombok (@Data, @Builder, @RequiredArgsConstructor, @AllArgsConstructor)
- Prefer records for simple DTOs

# Example

Controller → Service → Repository → Database


# Example Tasks Copilot Should Excel At

- Generate a new REST endpoint following conventions
- Create DTO + Mapper + Entity + Repository for a new domain object
- Write unit tests for a service class
- Suggest refactoring to improve layering or readability
- Generate a global exception handler.