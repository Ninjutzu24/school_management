🔴 ### School Management System

🏫 **About the Project**

```text
School Management System is a full-stack web application designed to manage
the core academic structure of a school.

The application provides a centralized system for managing students, teachers,
subjects, classes and grades, while also handling the relationships between them.

Rather than treating each entity as an isolated CRUD record, the project models
realistic academic relationships. A teacher can teach multiple subjects, the same
teacher-subject combination can be associated with multiple classes, students
belong to classes, and grades are stored within the appropriate academic context.
```

The project was originally developed as a **high school certification project**
under the name **Application X**.

🏆 **Competition Recognition**

```text
The project was presented at:

InfoEducație 2024 — County Stage
Educational Software Section

🏆 2nd Prize — Educational Software
```

✨ **Implemented Features**

👨‍🎓 **Student Management**

```text
- Add and manage students
- View all students in the system
- Assign students to classes
- View detailed information for individual students
- View the grades associated with a student
```

👨‍🏫 **Teacher Management**

```text
- Add and manage teachers
- View all teachers
- Assign one or multiple subjects to a teacher
- Support teachers teaching multiple subjects
- Associate teaching assignments with classes
```

📚 **Subject Management**

```text
- Add and manage school subjects
- View all available subjects
- Associate subjects with teachers
```

🏫 **Class Management**

```text
- Create and manage multiple classes
- View students assigned to a class
- View teachers and teaching assignments associated with a class
- Support multiple teacher-subject assignments across classes
```

📝 **Grade Management**

```text
- Add and manage student grades
- View all grades
- Associate grades with the appropriate student and teaching context
- Support students receiving grades from different teachers and subjects
```

🛠️ **Programming Languages and Technologies Used**

💻 **Backend**

```text
- Java 17
- Spring Boot 3.2.5
- Spring MVC
- Spring Data JPA
- Hibernate / JPA
- Lombok
```

Java is the main backend programming language.

Spring Boot provides the application framework, while Spring MVC handles
the web layer and Spring Data JPA simplifies database access.

🎨 **Frontend**

```text
- HTML
- CSS
- Thymeleaf
- Bootstrap
```

Thymeleaf is used as the server-side template engine. Controllers provide
data to the templates, which are rendered dynamically in the browser.

🗃️ **Database**

```text
- H2 Embedded Database
- SQL
```

The application uses an in-memory H2 database, so no separate database
server is required to run the project locally.

📦 **Build and Dependency Management**

```text
- Apache Maven
```

Maven manages dependencies and builds the project through the `pom.xml`
configuration.

🏗️ **Application Architecture**

The project follows a **layered architecture** based on the following flow:

```text
Browser / User
       ↓
HTML + Thymeleaf + Bootstrap
       ↓
Controller Layer
       ↓
Service Layer
       ↓
Repository Layer
       ↓
Spring Data JPA / Hibernate
       ↓
H2 Database
```

This structure separates responsibilities and keeps the application organized.

🎮 **Controller Layer**

Controllers handle HTTP requests, navigation, form submissions and
communication between the frontend and backend.

The project contains:

```text
- ClazzController.java
- GradeController.java
- IndexController.java
- StudentController.java
- SubjectController.java
- TeacherController.java
```

**Controller responsibilities include:**

```text
- Handling GET and POST requests
- Mapping application routes
- Receiving form data
- Calling the appropriate services
- Preparing data for Thymeleaf templates
- Returning the appropriate views
```

⚙️ **Service Layer**

Services contain the application's business logic and act as an intermediate
layer between Controllers and Repositories.

The main services include:

```text
- ClazzService.java
- GradeService.java
- StudentService.java
- SubjectService.java
- TeacherService.java
```

The Service layer helps separate request handling from database access and
provides a dedicated place for business rules and future validation.

🗃️ **Repository Layer**

Repositories communicate with the database through Spring Data JPA.

The project contains repositories for both the main entities and
relationship entities:

```text
- ClazzRepository.java
- GradeRepository.java
- StudentRepository.java
- SubjectRepository.java
- TeacherRepository.java
- TeacherSubjectRepository.java
- TeacherSubjectClassRepository.java
```

Repositories are responsible for persistence operations such as saving,
retrieving and managing application data.

🧠 **Model Layer**

The Model layer defines the entities and relationships used by the application:

```text
- Clazz.java
- Grade.java
- Student.java
- Subject.java
- Teacher.java
- TeacherSubject.java
- TeacherSubjectClass.java
```

The dedicated relationship entities **TeacherSubject** and
**TeacherSubjectClass** are an important part of the design because they allow
the application to represent more complex academic scenarios.

For example:

```text
Teacher
├── Mathematics
│   ├── Class 9A
│   └── Class 9B
│
└── Computer Science
    └── Class 10A
```

🔗 **Entity Relationships**

The application models the relationships between the main school entities.

👨‍🎓 **Student → Class**

A student belongs to a class, while a class can contain multiple students.

```text
Class
├── Student 1
├── Student 2
└── Student 3
```

📝 **Student → Grade**

A student can receive multiple grades.

```text
Student
├── Grade
├── Grade
└── Grade
```

👨‍🏫 **Teacher → Subject**

A teacher can teach multiple subjects.

This relationship is represented through:

```text
TeacherSubject
```

🏫 **Teacher + Subject → Class**

A teacher-subject assignment can be connected to one or more classes.

This relationship is represented through:

```text
TeacherSubjectClass
```

This design makes it possible to distinguish between:

```text
- The teacher
- The subject being taught
- The class where that teaching assignment applies
```

💻 **Requirements to Run the Project**

Before running the project, make sure you have:

```text
- Git
- Java Development Kit (JDK) 17
- An IDE such as IntelliJ IDEA Community Edition
  or another Java IDE
```

Maven is optional if you use the included **Maven Wrapper**.

No external database installation is required because the project uses H2.

🔎 **Verify Java**

```bash
java -version
```

The project is configured for **Java 17**.

🔎 **Verify Git**

```bash
git --version
```

📥 **Installation**

**1. Clone the repository**

```bash
git clone https://github.com/Ninjutzu24/school_management.git
```

**2. Open the project folder**

```bash
cd school_management
```

**3. Open the project in IntelliJ IDEA**

```text
- Open IntelliJ IDEA
- Click Open
- Select the school_management folder
- Make sure IntelliJ recognizes pom.xml as the Maven project configuration
- Select JDK 17 as the Project SDK
- Wait for Maven to download and load all dependencies
```

▶️ **How to Run the Project**

🖥️ **Option 1 — IntelliJ IDEA**

Open:

```text
SchoolManagementApplication.java
```

Then run the main method or use the Spring Boot run configuration.

💻 **Option 2 — Maven Wrapper on Windows**

```bash
mvnw.cmd spring-boot:run
```

🐧 **Option 3 — Maven Wrapper on Linux / macOS**

```bash
./mvnw spring-boot:run
```

⚙️ **Option 4 — Globally Installed Maven**

```bash
mvn spring-boot:run
```

🌐 **Accessing the Application**

After the Spring Boot application starts successfully, open:

```text
http://localhost:8080
```

The application will use the default Spring Boot port unless the configuration
has been changed.

🧭 **Typical Application Workflow**

A typical workflow can be:

```text
1. Create a class
        ↓
2. Add teachers
        ↓
3. Add subjects
        ↓
4. Assign subjects to teachers
        ↓
5. Associate teacher-subject assignments with classes
        ↓
6. Add students
        ↓
7. Assign students to classes
        ↓
8. Add grades
```

**Example:**

```text
Class 9A
    ↓
Teacher: John Smith
    ↓
Subject: Mathematics
    ↓
Assign Mathematics to John Smith
    ↓
Associate John Smith + Mathematics with Class 9A
    ↓
Add a student to Class 9A
    ↓
Add a grade in the appropriate academic context
```

🧪 **Testing**

The project includes a test source structure under:

```text
src/test/
```

Tests can be run through IntelliJ IDEA or Maven:

```bash
mvn test
```

🎯 **What This Project Demonstrates**

```text
- Object-Oriented Programming in Java
- Spring Boot application development
- Spring MVC
- Layered application architecture
- Controller–Service–Repository separation
- Relational database design
- Spring Data JPA
- Hibernate / ORM concepts
- Entity relationships
- Server-side rendering with Thymeleaf
- HTML and CSS frontend development
- Bootstrap
- Maven dependency management
- Form handling
- Dynamic web pages
```

🔮 **Possible Future Improvements**

```text
- Authentication and authorization
- Role-based access for administrators, teachers and students
- Search and filtering
- Grade statistics and reports
- Pagination
- Improved validation and error handling
- REST API endpoints
- PostgreSQL or MySQL support
- Docker deployment
- Expanded automated test coverage
```

👨‍💻 **Author**

```text
Andrei Roman

Originally developed as a high school certification project
under the name Application X.

🏆 2nd Prize — InfoEducație 2024
County Stage — Educational Software
```

📄 **License**

```text
This project is intended for educational and portfolio purposes.
```
