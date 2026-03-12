---
name: junit-testing
description: Unit testing guidelines
---

# Unit Testing

Use:

- JUnit 5  + Mockito
- Test services in isolation
- @Mock for dependencies
- @InjectMocks for the class under test
- @ExtendWith(MockitoExtension.class)

# Rules:

- Test service logic
- Mock repositories
- Follow AAA pattern


# Example:

Arrange
Act
Assert