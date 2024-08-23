# Supplier Search API

## Overview

The Supplier Search API is a Spring Boot application that allows users to search for manufacturers based on their customized requirements. This proof of concept (POC) API enables users to retrieve a list of manufacturers that meet specific criteria such as location, nature of business, and manufacturing processes. The application also supports CRUD (Create, Read, Update, Delete) operations on the supplier data.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup](#setup)
- [API Endpoints](#api-endpoints)
- [Example Requests](#example-requests)
- [Example Responses](#example-responses)
- [Running the Application](#running-the-application)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

## Features

- **Retrieve** a list of manufacturers based on location, nature of business, and manufacturing processes.
- **Supports pagination** for large result sets.
- **CRUD operations** for managing supplier data.
- **Input validation and error handling.**

## Technologies Used

- **Java 21**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (in-memory)
- **Maven**

## Setup

### Prerequisites

- **Java 21**: Ensure that Java 21 is installed on your machine.
- **Maven**: Make sure you have Maven installed.

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/username/supplier-search-api.git
    cd supplier-search-api
    ```

2. Build the project:

    ```bash
    mvn clean install
    ```

3. Run the application:

    ```bash
    mv spring-boot:run
    ```

## API Endpoints

### Create a Supplier

- **Endpoint**: `/api/supplier`
- **Method**: `POST`
- **Description**: Create a new supplier.
- **Request Body**:
    ```json
    {
        "companyName": "ABC Manufacturing",
        "website": "http://abcmanufacturing.com",
        "location": "Delhi",
        "natureOfBusiness": "SMALL_SCALE",
        "manufacturingProcesses": ["MOULDING"]
    }
    ```
- **Response**: The created supplier with its ID.

### Read Suppliers

#### Retrieve a list of suppliers

- **Endpoint**: `/api/supplier/query`
- **Method**: `POST`
- **Description**: Retrieve a list of manufacturers based on location, nature of business, and manufacturing processes.
- **Request Parameters**:
  - `location` (String): The city where the manufacturer is located.
  - `natureOfBusiness` (Enum: SMALL_SCALE, MEDIUM_SCALE, LARGE_SCALE): The nature of the business.
  - `manufacturingProcess` (Enum: MOULDING, PRINTING_3D, CASTING, COATING): The manufacturing process capability.
  - `page` (int, optional): The page number for pagination (default: 0).
  - `size` (int, optional): The number of results per page (default: 10).
- **Response**: A paginated list of manufacturers that match the given criteria.

#### Update a Supplier

- **Endpoint**: `/api/supplier/{id}`
- **Method**: `PUT`
- **Description**: Update an existing supplier by ID.
- **Request Body**:
    ```json
    {
        "companyName": "Updated Manufacturing",
        "website": "http://updatedmanufacturing.com",
        "location": "Delhi",
        "natureOfBusiness": "MEDIUM_SCALE",
        "manufacturingProcesses": ["CASTING", "COATING"]
    }
    ```
- **Response**: The updated supplier details.

#### Delete a Supplier

- **Endpoint**: `/api/supplier/{id}`
- **Method**: `DELETE`
- **Description**: Delete a supplier by ID.
- **Response**: Status indicating the deletion result.

## Example Requests

### Example Create Request

```bash
POST http://localhost:8080/api/supplier
Content-Type: application/json
{
    "companyName": "ABC Manufacturing",
    "website": "http://abcmanufacturing.com",
    "location": "Delhi",
    "natureOfBusiness": "SMALL_SCALE",
    "manufacturingProcesses": ["MOULDING"]
}
