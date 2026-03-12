---
name: rest-api-design
description: REST API best practices
---

# REST API Design

Rules:

- Use @RestController
- Use @RequestMapping("/api")
- Return ResponseEntity
- Use plural resource names

HTTP conventions:

GET     /resources
GET     /resources/{id}
POST    /resources
PUT     /resources/{id}
DELETE  /resources/{id}

Return ResponseEntity.

Examples:

GET     /users
GET     /users/{id}
POST    /users
PUT     /users/{id}
DELETE  /users/{id}

Response codes:

200 OK
201 Created
204 No Content
400 Bad Request
404 Not Found
500 Internal Server Error