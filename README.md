# Employee Management System

This is an Employee Management System developed using Angular, Spring Boot, and MySQL.

## Features

- Create, read, update, and delete employee records
- View employee details  and contact information
- Search for employees by name id


## Technologies Used

- Angular: A front-end JavaScript framework for building user interfaces
- Spring Boot: A Java framework for building robust and scalable web applications
- MySQL: A relational database management system

## Prerequisites

Before running the application, make sure you have the following installed:

- Node.js: Download and install Node.js from the official website - `https://nodejs.org`
- Angular CLI: Install the Angular Command Line Interface globally by running the following command:

  ``` java
    npm install -g @angular/cli 



- Java Development Kit (JDK): Download and install the JDK from the official Oracle website - https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
- MySQL: Install MySQL Server and MySQL Workbench from the official website - https://dev.mysql.com/downloads/installer/

## Getting Started

1. Clone this repository to your local machine:

``` git
git clone https://github.com/Rohit9252/Employee-Management-System.git
```

2. Set up the MySQL database:
- Open MySQL Workbench and connect to your MySQL Server.
- Create a new schema/database named `employee_management_system`.
- Run the SQL scripts in the `database` folder to create the necessary tables.

3. Set up the backend (Spring Boot):
- Navigate to the `backend` directory:
  ```
  cd employee-management-system/backend
  ```
- Open `src/main/resources/application.properties` and update the database connection properties.
- Build and run the Spring Boot application:
  ```
  ./mvnw spring-boot:run
  ```
  # Swagger Link
  ```
  http://localhost:8080/swagger-ui/index.html#/employee-controller
  ```

4. Set up the frontend (Angular):
- Navigate to the `frontend` directory:
  ```
  cd employee-management-system/frontend
  ```
- Install the required dependencies:
  ```
  npm install
  ```
- Start the Angular development server:
  ```
  ng serve
  ```

5. Access the application:
- Open a web browser and go to `http://localhost:4200` to access the Employee Management System.

 # Demo Video
  ```
https://drive.google.com/file/d/1GFf6L_f9yslPDNPuaG1kDK28WLkDA0cm/view?usp=sharing
```

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, please create a GitHub issue or submit a pull request.

## Thank You


