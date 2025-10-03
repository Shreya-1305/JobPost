
# JobPortal REST API

A Spring Boot-based RESTful API for managing job postings, enabling full CRUD operations, keyword-based search, and seamless integration with frontend clients. The project is designed to be modular, scalable, and secure, providing a robust backend for job portal applications.

## Frontend UI

The frontend for this project is built separately and can be accessed here: [JobPortal Frontend UI](https://github.com/Shreya-1305/JobPost-UI)

## Features

- **CRUD Operations:** Create, Read, Update, and Delete job postings.
- **Keyword Search:** Search job posts dynamically across job titles and descriptions.
- **Modular Architecture:** Service and controller layers are designed for maintainability and scalability.
- **Cross-Origin Support:** Enables smooth integration with frontend applications.
- **Security (In Progress):** Implementing authentication and role-based access control to secure the API.

## Tech Stack

- **Backend:** Spring Boot, Spring Data JPA, RESTful APIs
- **Database:** H2 / PostgreSQL (configurable)
- **Frontend:** React, Node.js, Express.js, Tailwind CSS, Redux, HTML, CSS, Bootstrap (frontend UI link above)

## Endpoints

| Method | Endpoint                  | Description                     |
|--------|---------------------------|---------------------------------|
| GET    | `/jobPosts`               | Get all job postings             |
| GET    | `/jobPost/{postId}`       | Get a specific job posting      |
| GET    | `/jobPosts/keyword/{keyword}` | Search jobs by keyword         |
| POST   | `/jobPost`                | Add a new job posting           |
| PUT    | `/jobPost`                | Update an existing job posting  |
| DELETE | `/jobPost/{postId}`       | Delete a job posting            |
| GET    | `/load`                   | Load initial/sample data        |

## Setup Instructions

1. **Clone the repository**  
   ```bash
   git clone <backend-repo-link>
   cd JobPortal-REST-API
   ```

2. **Configure Database**  
   - Update `application.properties` to configure your preferred database (H2/PostgreSQL).

3. **Build & Run**  
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Test Endpoints**  
   - Use Postman or any API testing tool to interact with the API.

## Future Enhancements

- Implement full authentication and role-based access control.
- Integrate Swagger/OpenAPI for better API documentation.
- Add pagination and sorting for job listings.

## Author

**Shreya Painter** – [GitHub](https://github.com/Shreya-1305)
