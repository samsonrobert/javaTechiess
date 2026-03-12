---
name: logging
description: Logging best practices
---

# Logging

Use SLF4J with Logback.

Rules:

- Never use System.out.println
- Log important events

Example:

private static final Logger log =
LoggerFactory.getLogger(UserService.class);

log.info("Creating user {}", email);
log.error("User creation failed", ex);

Log:

- API calls
- Errors
- Important operations