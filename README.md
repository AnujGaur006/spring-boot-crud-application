# Employee Management System
The Employee Management System is a web application built using Spring Boot that allows users to manage employee data. It provides CRUD (Create, Read, Update, Delete) operations via RESTful APIs, along with a user interface built using Thymeleaf templates.

![image](https://github.com/AnujGaur006/spring-boot-crud-application/assets/134039018/e0a46aa1-13ca-4201-a946-eae90fe9ba10)


## Features
+ Create, Read, Update, and Delete employee records.
+ RESTful APIs for accessing employee data.
+ User-friendly interface using Thymeleaf templates.
+ Database persistence using Hibernate and Spring Data JPA.

## Technologies Used
+ Spring Boot
+ Spring MVC
+ Hibernate
+ Thymeleaf
+ Spring Data JPA
+ MySQL (or any other supported database)
  

Before running the application, make sure you have the following prerequisites installed:

* Java Development Kit (JDK) 11 or higher
* MySQL (or any other supported database) installed and running
* Maven (for building and running the application)

# Getting Started
+ Clone the repository:

bash
* Copy code
* git clone https://github.com/AnujGaur006/spring-boot-crud-application.git
  
+ Update the database configuration:

Open the application.properties file located in the src/main/resources directory.
Update the database connection details such as URL, username, and password according to your database setup.
Build the application:

bash
* cd employee-management-system
* mvn clean package
* java -jar target/employee-management-system.jar

+ Access the application:

+ Open a web browser and navigate to http://localhost:8080/employees/list (or the configured port) to access the Employee Management System.

# Usage
Use the user interface to manage employee data or access the RESTful APIs for programmatic access.

# API Documentation
The Employee Management System provides the following RESTful APIs:

+ GET /employees/list: Get a list of all employees.
+ POST /employees/save: Create a new employee.
+ PUT /employees/showFormForUpdate: Update details of a specific employee.
+ DELETE /employees/delete: Delete a specific employee.
