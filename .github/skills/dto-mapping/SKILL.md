---
name: dto-mapping
description: DTO mapping best practices
---

# DTO Usage

Rules:
- Never expose JPA entities in APIs
- Use DTO classes for request and response
- Use mapper classes

Create:

UserRequestDTO
UserResponseDTO

Controllers return response DTOs.

Example:

UserEntity
UserRequestDTO
UserResponseDTO
UserMapper

Mapper pattern:

UserResponseDTO map(UserEntity entity)