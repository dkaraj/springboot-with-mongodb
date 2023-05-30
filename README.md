
# Spring Boot with MongoDB

This project is a Spring Boot application integrated with MongoDB as the database. It provides RESTful APIs to manage users and retrieve user information by ID. Swagger is also integrated into the project for easy API documentation and testing.

## Requirements

- Java JDK 11 or higher 
- MongoDB installed and running
- Internet connection (for Swagger documentation) xP

## Getting Started

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/dkaraj/springboot-with-mongodb/
   ```

2. Navigate to the project directory:

   ```bash
   cd springboot-with-mongodb
   ```

3. Build the project using Maven:

   ```bash
   ./mvnw clean package
   ```

4. Run the application:

   ```bash
   ./mvnw spring-boot:run
   ```

   The application will start on `http://localhost:8080`.

## API Documentation (Swagger)

The project includes Swagger for API documentation and testing. You can access the Swagger UI by opening the following URL in your browser:

```
http://localhost:8080/presentation/api/swagger-ui/index.html#/
```

The Swagger UI provides an interactive interface to explore and test the available APIs. It contains detailed information about each endpoint, including request and response schemas.

## Endpoints

### Get all users

- Method: GET
- URL: `/presentation/api/users`

Returns a list of all users stored in the database.

### Get user by ID

- Method: GET
- URL: `/presentation/api/users/{id}`

Retrieves a specific user by their ID. Replace `{id}` with the actual ID of the user.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
