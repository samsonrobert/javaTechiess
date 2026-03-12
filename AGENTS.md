# AGENTS.md

## Overview
This project is a Java 21 Spring Boot backend. AI agents should follow the layered architecture and strict conventions documented in `.github/skills/` and `.github/copilot/instructions.md`.

## Architecture
- Layered: Controller → Service → Repository → Database → Entity
- Controllers are thin: validation, mapping, delegation only
- Services contain business logic
- Repositories use Spring Data JPA interfaces
- Use constructor injection for dependencies

## Package Structure
- `src/javatechies/org/corejava/`, `src/javatechies/org/stream/`, etc. (domain logic)
- `.github/skills/` (project conventions)

## DTOs & Mapping
- Never expose JPA entities in APIs
- Use DTOs for requests/responses
- Use mapper classes for entity-DTO conversion

## REST API
- Use `@RestController`, `@RequestMapping("/api")`
- Return `ResponseEntity`
- Plural resource names, standard HTTP verbs

## Exception Handling
- Use `@ControllerAdvice` for global error handling
- Return structured error responses
- Avoid try/catch in controllers

## Logging
- Use SLF4J, never `System.out.println`
- Log important events, errors, operations

## Validation
- Use Jakarta Validation (`@Valid`, `@NotBlank`, etc.)
- Validate requests in controllers

## Testing
- Unit: JUnit 5 + Mockito, test services in isolation
- Integration: `@SpringBootTest`, `@AutoConfigureMockMvc`, use MockMvc for REST

## Docker
- Multi-stage builds (see `Dockerfile`)
- Build with Maven, run with `java -jar app.jar`

## Security
- Use Spring Security, protect endpoints, never expose passwords

## Pagination
- Use Spring `Pageable`, return PageResponse DTOs

## OpenAPI
- Use OpenAPI annotations for API docs

## Java 21 Clean Code
- Use records for DTOs, modern features (switch expressions, pattern matching)
- Prefer immutability, avoid nulls (use Optional)
- Small, focused classes/methods, meaningful names

## Example Patterns
- `UserResponseDTO map(UserEntity entity)` (mapper)
- `Optional<User> findByEmail(String email)` (repository)
- `@Service public class UserService { ... }` (service)

## Key Files
- `.github/skills/skills-index.md` (skills list)
- `.github/copilot/instructions.md` (AI agent instructions)
- `Dockerfile` (build/run workflow)
- `src/javatechies/org/` (domain logic)

## How to be Productive
- Always load `.github/skills/skills-index.md` and follow all skills
- Reference `.github/copilot/instructions.md` for agent-specific rules
- Use the layered structure and DTO mapping patterns
- Follow Java 21 clean code and Spring Boot conventions

