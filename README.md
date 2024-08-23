# Supplier Search API

## Overview

The Supplier Search API is a Spring Boot application that empowers users to search for manufacturers tailored to their specific requirements. This proof of concept (POC) API facilitates the retrieval of a list of manufacturers meeting criteria such as location, nature of business, and manufacturing processes.

## Table of Contents

- Features
- Technologies Used
- Setup
- API Endpoints
- Example Requests
- Running the Application
- Testing
- Contributing
- License

## Features

- Retrieve a list of manufacturers based on location, nature of business, and manufacturing processes.
- Supports pagination for handling large result sets effectively.
- Input validation and error handling mechanisms for robust API interactions.
- Unit tests for the API endpoint (optional, but recommended for ensuring code quality).

## Technologies Used

- Java 21: The programming language used.
- Spring Boot: For efficient application development.
- Spring Data JPA: For seamless database interactions.
- H2 Database: In-memory database ideal for development and testing.
- Maven: Build automation tool.

## Setup

### Prerequisites

- Java 21: Ensure Java 21 is installed on your system.
- Maven: Verify that you have Maven installed.

### Installation

1. Clone the repository:

   git clone https://github.com/username/supplier-search-api.git
   cd supplier-search-api

2. Build the project:

   mvn clean install

3. Run the application:

   mvn spring-boot:run

## API Endpoints

### /api/supplier/query [POST]

**Description:** Retrieve a list of manufacturers based on specific criteria like location, nature of business, and manufacturing processes.

**Request Parameters:**

- location (String): The city where the manufacturer is located.
- natureOfBusiness (Enum: SMALL_SCALE, MEDIUM_SCALE, LARGE_SCALE): The scale of the manufacturer's business.
- manufacturingProcess (Enum: MOULDING, PRINTING_3D, CASTING, COATING): The manufacturing processes the manufacturer supports.
- page (int, optional): The page number for pagination (defaults to 0).
- size (int, optional): The number of results per page (defaults to 10).

**Response:** A paginated list of manufacturers that match the provided criteria.

## Example Requests

### Example Query (POST)

POST http://localhost:8080/api/supplier/query
Content-Type: application/json

**Request Body:**

{
  "location": "Delhi",
  "natureOfBusiness": "SMALL_SCALE",
  "manufacturingProcess": "MOULDING",
  "page": 0,
  "size": 10
}

### Example Response

{
  "totalPages": 1,
  "totalElements": 1,
  "pageable": {
    "pageNumber": 0,
    "pageSize": 10
  },
  "content": [
    {
      "supplierId": 1,
      "companyName": "ABC Manufacturing",
      "website": "http://abcmanufacturing.com",
      "location": "Delhi",
      "natureOfBusiness": "SMALL_SCALE",
      "manufacturingProcesses": ["MOULDING"]
    }
  ]
}

## Running the Application

To run the application locally:

1. Ensure the project is built successfully.
2. Run the application using the command:

   mvn spring-boot:run

3. Access the application at http://localhost:8080.

## Testing

Utilize Postman or any preferred API testing tool to test the API functionality. Refer to the provided example JSON requests and responses for guidance.

## Contributing

We welcome contributions! Please fork the repository and submit a pull request for any enhancements or bug fixes you'd like to share.

## License

This project is licensed under the MIT License. For details, refer to the LICENSE file.
