# 🚀 CodingShuttle - Java Spring Boot End-to-End Learning

Welcome to **CodingShuttle**, a comprehensive learning repository for mastering **Java Spring Boot** from fundamentals to advanced concepts. This repository contains structured modules, practical examples, and projects covering the entire Spring Boot ecosystem.

## 📚 Repository Overview

This repository is organized into multiple learning modules, each focusing on specific aspects of Spring Boot development:

```
CodingShuttle/
├── 📖 Module 01: Introduction to Spring & Spring Boot
├── 🎯 Module 02: Spring Boot MVC & RESTful API's
├── 🔧 SpringCore/
├── 🗄️ SpringJDBC/
├── 📁 src/
└── 📋 Documentation Files
```

---

## 🎓 Learning Modules

### 📖 Module 01: Introduction to Spring & Spring Boot
**Location:** `Module 01  Introduction To Spring & Spring Boot/`

This module covers the foundational concepts of Spring Framework and Spring Boot:

- ✅ Spring Framework Introduction
- ✅ Beans in Spring Framework
- ✅ Dependency Injection (DI)
- ✅ Auto Configuration
- ✅ Maven & Build Management
- ✅ Internal Working of Spring Boot

**Key Resources:**
- 📄 `01_introduction_to_spring_framework.pdf`
- 📄 `03_beans_in_spring_framework.pdf`
- 📄 `04_dependency_injection.pdf`
- 📄 `06_Auto_Configuration.pdf`
- 📄 `07_Maven.pdf`
- 📄 `Introduction_To_Spring_Boot_Full_Week_Notes.pdf`

**Getting Started:** Start with the comprehensive week notes, then dive into specific topics.

**[📚 Read Module 01 Guide →](Module%2001%20%20Introduction%20To%20Spring%20%26%20Spring%20Boot/README.md)**

---

### 🎯 Module 02: Spring Boot MVC & RESTful API's
**Location:** `Module 02- SB MVC & RESTful API's/`

This module focuses on building web applications and APIs using Spring Boot:

**Sub-Topics:**
1. **2.1 - Introduction to SB & MVC Architecture**
   - Spring Boot with MVC Architecture
   - Tomcat Server Integration
   - Dispatcher Servlet

2. **2.2 - Presentation Layer: DTO and Controller**
   - Data Transfer Objects (DTO)
   - Controller Implementations
   - HTTP Request Handling

**Practical Code:** Located in `Module02/` subdirectory

**[📚 Read Module 02 Guide →](Module%2002-%20SB%20MVC%20%26%20RESTful%20API's/README.md)**

---

## 🔧 Project Structures

### 1. SpringCore
**Location:** `SpringCore/`

A standalone Maven project demonstrating core Spring concepts:
- Spring Container & Beans
- Dependency Injection patterns
- Spring Configuration
- Bean Lifecycle

**How to Run:**
```bash
cd SpringCore
mvn clean install
mvn spring-boot:run
```

**[📖 Read SpringCore Guide →](SpringCore/README.md)**

---

### 2. SpringJDBC
**Location:** `SpringJDBC/`

A Maven project demonstrating Spring JDBC integration:
- Database connectivity
- JDBC Template usage
- Data Access Object (DAO) pattern
- SQL Operations

**How to Run:**
```bash
cd SpringJDBC
mvn clean install
mvn spring-boot:run
```

**[📖 Read SpringJDBC Guide →](SpringJDBC/README.md)**

---

### 3. Main Project
**Location:** `src/`

The primary Spring Boot application structure following standard Maven conventions:
- `src/main/` - Main application code
  - `java/` - Java source files
  - `resources/` - Configuration files

---

## 🛠️ Prerequisites

Before getting started, ensure you have:

- ✅ **Java 11+** installed ([Download](https://www.oracle.com/java/technologies/downloads/))
- ✅ **Maven 3.6+** installed ([Download](https://maven.apache.org/download.cgi))
- ✅ **IDE** (IntelliJ IDEA, Eclipse, or VS Code with Java extensions)
- ✅ **Git** for version control

---

## 🚀 Quick Start

### Step 1: Clone the Repository
```bash
git clone https://github.com/amitbirajdar0311/CodingShuttle.git
cd CodingShuttle
```

### Step 2: Explore a Module
```bash
cd SpringCore
```

### Step 3: Build and Run
```bash
mvn clean install
mvn spring-boot:run
```

---

## 📁 Directory Structure

```
CodingShuttle/
│
├── 📖 Module 01  Introduction To Spring & Spring Boot/
│   ├── 📄 01_introduction_to_spring_framework.pdf
│   ├── 📄 03_beans_in_spring_framework.pdf
│   ├── 📄 04_dependency_injection.pdf
│   ├── 📄 06_Auto_Configuration.pdf
│   ├── 📄 07_Maven.pdf
│   ├── 📄 Introduction_To_Spring_Boot_Full_Week_Notes.pdf
│   ├── 🖼️ 06_internal_working_of_spring_boot.png
│   ├── 📁 module1Introduction/
│   └── 📖 README.md
│
├── 🎯 Module 02- SB MVC & RESTful API's/
│   ├── 📁 2.1 -Introduction to SB & MVC Architecture, Tomcat and Dispatcher Servlet/
│   ├── 📁 2.2 The presentation layer DTO and Controller/
│   ├── 📁 Module02/
│   └── 📖 README.md
│
├── 🔧 SpringCore/
│   ├── 📄 pom.xml
│   ├── 📁 src/
│   └── 📖 README.md
│
├── 🗄️ SpringJDBC/
│   ├── 📄 pom.xml
│   ├── 📁 src/
│   └── 📖 README.md
│
├── 📁 src/
│   └── 📁 main/
│
├── 📄 pom.xml (Root Maven Configuration)
├── 📄 README.md (This file)
└── 📄 .gitignore
```

---

## 📚 Learning Path

### Beginner Level
1. Start with **Module 01** - Understand Spring fundamentals
2. Read introduction PDFs
3. Explore **SpringCore** project

### Intermediate Level
4. Move to **Module 02** - Learn MVC architecture
5. Study DTO and Controller patterns
6. Explore **SpringJDBC** project

### Advanced Level
7. Build your own RESTful APIs
8. Implement database operations
9. Create production-ready applications

---

## 🔑 Key Concepts Covered

### Spring Framework
- IoC (Inversion of Control)
- Dependency Injection
- Bean Management
- Application Context

### Spring Boot
- Auto-Configuration
- Embedded Tomcat Server
- Starter Dependencies
- Application Properties

### Web Development
- MVC Architecture
- Controllers & Routing
- RESTful API Design
- DTO Pattern

### Data Access
- Spring JDBC
- DAO Pattern
- Database Operations
- Query Execution

---

## 💡 Tips for Learning

1. **Read the PDFs first** - Understand concepts theoretically
2. **Examine code examples** - See practical implementations
3. **Run projects locally** - Experience how it works
4. **Modify code** - Experiment and break things intentionally
5. **Build mini-projects** - Apply learning to real scenarios

---

## 🛠️ Build & Run Commands

### Maven Commands
```bash
# Build project
mvn clean install

# Run Spring Boot application
mvn spring-boot:run

# Run tests
mvn test

# Package as JAR
mvn package

# Skip tests during build
mvn clean install -DskipTests
```

---

## 📖 Additional Resources

- [Spring Boot Official Documentation](https://spring.io/projects/spring-boot)
- [Spring Framework Reference](https://spring.io/projects/spring-framework)
- [Maven Documentation](https://maven.apache.org/guides/)
- [RESTful API Best Practices](https://restfulapi.net/)

---

## 🤝 Contributing

Found an issue or want to improve this repository? Feel free to:
1. Fork the repository
2. Create a feature branch
3. Submit a pull request

---

## 📞 Support & Questions

If you have questions or need clarification:
- 📧 Check the issues section
- 💬 Create a GitHub Discussion
- 📚 Refer to the documentation in each module

---

## 📝 License

This repository is open for educational purposes. Feel free to use, modify, and share!

---

## 🎯 Learning Goals

By the end of this course, you will:
✅ Understand Spring & Spring Boot architecture  
✅ Build RESTful APIs  
✅ Implement MVC pattern  
✅ Work with databases using Spring JDBC  
✅ Deploy Spring Boot applications  
✅ Follow industry best practices  

---

**Happy Learning! 🚀 Start your Spring Boot journey with CodingShuttle!**

---

**Last Updated:** July 2026  
**Repository Owner:** [amitbirajdar0311](https://github.com/amitbirajdar0311)