
---

# Library Management System - Spring Boot

![Java](https://img.shields.io/badge/Java-17-brightgreen.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.0-brightgreen.svg)

## Description
A simple library management system built using Java and Spring Boot. It allows users to manage books, providing APIs for creating, updating, retrieving, and deleting records.

## Features
- Manage books (create, update, retrieve, delete)

## Technologies Used
- **Java**: Version 17
- **Spring Boot**: Version 2.7.0
- **H2 Database**: Embedded database used for data storage
- **Postman**: API testing tool

## Project Structure
```bash
LibraryManagement-Springboot
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───example
│   │   │           └───LibraryManagementApplication
│   │   │               ├───Control    # Controllers for handling HTTP requests
│   │   │               ├───Model      # Models representing the entities
│   │   │               ├───Repository # Repository interfaces for database operations
│   │   │               ├───Service    # Service layer for business logic
│   └───resources
│       └───application.properties # Configuration for the H2 database
├───test
└───pom.xml # Maven configuration
```

## Database Structure

### Books Table
| Column     | Data Type      | Description                      |
|------------|----------------|----------------------------------|
| `book_id`  | VARCHAR(255)    | Primary key, unique book ID      |
| `name`     | VARCHAR(255)    | Book title                      |
| `author`   | VARCHAR(255)    | Author of the book               |

## How to Use the API
- **Base URL**: `/api/v1/`

### Book Management
- `GET /books/{bookId}`: Retrieve a book by its ID
- `POST /books`: Create a new book
- `PUT /books/{bookId}`: Update an existing book
- `DELETE /books/{bookId}`: Delete a book by its ID

## Getting Started

### Prerequisites
- Java 17
- Maven

### Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/xreedev/LibraryManagement-Springboot.git
   cd LibraryManagement-Springboot
   ```
2. Run the application:
   ```bash
   mvn spring-boot:run
   ```

---
