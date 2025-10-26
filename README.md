# Spring Boot Starter

A minimal Spring Boot app with:

- Health-check endpoint: **`GET /ping` → `pong`**
- **H2 in-memory database** with the **H2 web console** enabled

---
## Prerequisites

- **Java 17+**
- **Maven 3.9+**

---
## Run the app

`mvn spring-boot:run`

You may perform a health check by performing: `curl -i http://localhost:8080/ping`

---

## Test the app

`mvn test`

---

## H2 console login

- **URL:** http://localhost:8080/h2-console
- **JDBC URL:** `jdbc:h2:mem:demo`
- **User:** `sa`
- **Password:** *(leave empty)*

---

