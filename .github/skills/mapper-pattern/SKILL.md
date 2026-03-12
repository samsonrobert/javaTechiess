---
name: mapper-pattern
description: Mapping entities and DTOs
---

Use mapper classes.

Example:

@Mapper(componentModel = "spring")
public interface UserMapper {
    
    User toEntity(UserRequest request);
    
    UserResponse toResponse(User user);
}
