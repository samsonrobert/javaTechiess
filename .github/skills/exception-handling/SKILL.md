---
name: exception-handling
description: Consistent global error handling
---

# Exception Handling

- Use @ControllerAdvice for global exceptions
- Use @ExceptionHandler to map exceptions to HTTP responses
- Return structured error responses.

{
    "timestamp": "...",
    "message": "...",
    "details": "..."
}


# Handle:

- ResourceNotFoundException
- ValidationException

# Example:

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleNotFound() {
        return ResponseEntity.notFound().build();
    }
}

# Rules:

- Avoid try/catch in controllers
- Use custom exceptions