# Employee Management System

A **Spring Boot** and **Java-based web application** for managing employees efficiently.  
This project demonstrates **CRUD (Create, Read, Update, Delete)** operations with a clean MVC structure, backed by a relational database.

---

## 📌 Features
- Add new employees with details
- View all employees in a list
- Update employee information
- Delete employees from the database
- Simple and responsive UI
- Backend powered by **Spring Boot** and **Spring MVC**
- Database integration with **MySQL / PostgreSQL**
- HTML-based frontend

---

## 🛠️ Tech Stack
- **Backend:** Java, Spring Boot, Spring MVC, Spring JDBC / Hibernate
- **Frontend:** HTML, CSS, JSP
- **Database:** MySQL / PostgreSQL
- **Build Tool:** Maven
- **IDE:** IntelliJ IDEA / Eclipse

#home page
<img width="1917" height="652" alt="image" src="https://github.com/user-attachments/assets/a8be2a0f-6e5c-4292-9469-29c1c60237b6" />

#add employee page 
<img width="1915" height="922" alt="image" src="https://github.com/user-attachments/assets/f118d4ba-ce8f-4116-9954-c95ae23eebd5" />

#edit employee
<img width="1918" height="967" alt="image" src="https://github.com/user-attachments/assets/bea2f6d1-7804-4428-9e9d-94351d968e01" />



---

## 📂 Project Structure

Employee-Management-System/
│── src/
│ ├── main/
│ │ ├── java/ # Java source code
│ │ │ └── com.ashish.EmployeeManagementSystem
│ │ │ ├── controller # Handles HTTP requests
│ │ │ ├── entity # Employee entity class
│ │ │ ├── repo # Repository layer (DB access)
│ │ │ └── service # Business logic layer
│ │ ├── resources/ # application.properties, templates
│── pom.xml # Maven configuration
│── mvnw, mvnw.cmd # Maven wrapper


---

## 🚀 Getting Started

### 1️⃣ Prerequisites
Make sure you have installed:
- **Java 21**
- **Maven**
- **PostgreSQL**
- **Git**
  
#configure database
spring.datasource.url=jdbc:PostgreSql://localhost:3306/employee_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
---

#configure database
spring.datasource.url=jdbc:PostgreSql://localhost:3306/employee_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

### 2️⃣ Clone the Repository
```bash
git clone https://github.com/AJ1408/Employee-Management-System.git
cd Employee-Management-System


###Run the application..
mvn spring-boot:run

Access the App 
http://localhost:8080



