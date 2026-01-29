# Capital Allocation Engine 🚀

This project is a Spring Boot application designed to manage capital allocation, user originations, and financial pools. It provides a RESTful API to handle user registration, pool creation, and the tracking of financial contributions.

## 🛠 Features

* **User Management**: Create and manage users with associated banking details.
* **Pool Management**: Create financial pools and handle user memberships within those pools.
* **Allocation Engine**: Service for adding contributions, calculating monthly payouts, and tracking allocated assets.
* **Persistence**: PostgreSQL integration using Spring Data JPA for reliable data storage.
* **Containerization**: Ready-to-use Docker Compose configuration for local database setup.

## 💻 Tech Stack

* **Java**: Version 25.
* **Framework**: Spring Boot 4.0.2.
* **Build Tool**: Maven with Maven Wrapper.
* **Database**: PostgreSQL.
* **ORM**: Hibernate / Spring Data JPA.
* **Utilities**: Lombok for boilerplate reduction.

## 🚀 Getting Started

### Prerequisites

* JDK 25
* Docker and Docker Compose

### Local Development

1.  **Start the Database** 🗄️:
    Use the provided `docker-compose.yml` to spin up a PostgreSQL instance:
    ```bash
    docker-compose up -d
    ```
    The database will be available at `localhost:5432` with the credentials defined in `application.properties`.

2.  **Build and Run** 🏗️:
    Use the Maven Wrapper to build and run the application:
    ```bash
    ./mvnw spring-boot:run
    ```

3.  **API Testing** 🧪:
    You can use the provided IntelliJ HTTP client file to test user creation:
    `src/test/http/Origination.http`

## 📡 API Endpoints

### Origination Controller
* `POST /origination/create-user`: Registers a new user and their bank details.
* `POST /origination/create-pool`: Initializes a new investment pool.
* `POST /origination/join-pool`: Adds a user to an existing pool.

### Allocation Controller
* `POST /allocation-engine/contribution`: Records a new contribution.
* `GET /allocation-engine/pool-payout`: Retrieves payout information for a pool.
* `GET /allocation-engine/allocated-assest`: Lists all allocated assets.
* `GET /allocation-engine/`: Calculates the monthly payout.

## ⚙️ Configuration

The application configuration is managed via `src/main/resources/application.properties`. Key settings include:

* **Database URL**: `jdbc:postgresql://localhost:5432/capital_allocation_db`
* **Hibernate DDL**: Set to `update` for automatic schema management
* **Logging**: SQL queries are set to show in the console for debugging purposes

[![My Skills](https://skillicons.dev/icons?i=java,spring,git,docker&perline=6)](https://skillicons.dev)
