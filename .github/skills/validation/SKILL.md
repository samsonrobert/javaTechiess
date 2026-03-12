---
name: request-validation
description: Validate incoming requests
---

# Validation

Use Jakarta Validation.

Example:

public class UserRequest {

    @NotBlank
    private String name;

    @NotNull
    private String id;

    @Email
    private String email;

    @Size(min = 8)
    private String password;
}

Validate requests:

@Valid @RequestBody

Controller:

@PostMapping
public ResponseEntity<?> create(
@Valid @RequestBody UserRequest request)