---
name: integration-testing
description: Integration testing guidelines
---

# Integration Testing

Use:

@SpringBootTest
@AutoConfigureMockMvc
@Testcontainers for DB integration (optional)


# Example:

@SpringBootTest
@AutoConfigureMockMvc

Use MockMvc to test REST endpoints.