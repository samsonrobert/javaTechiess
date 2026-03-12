---
name: pagination
description: Pagination support
---

Use Spring Pageable.

Example:

Page<User> users = repository.findAll(pageable);

Return PageResponse DTO.