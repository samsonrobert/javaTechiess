---
name: service-layer
description: Business logic patterns
---

Services:

- Annotate with @Service
- Use constructor injection

Example:

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }
}