# 📖 Module 01: Introduction to Spring & Spring Boot

## 🎯 Overview

This module provides a comprehensive introduction to the Spring Framework and Spring Boot. It covers the fundamental concepts that form the foundation for all Spring-based applications.

## 📚 Learning Objectives

By the end of this module, you will understand:

- ✅ What is Spring Framework and its advantages
- ✅ Core concepts: IoC, DI, and Container
- ✅ Bean definition and management
- ✅ Dependency Injection patterns
- ✅ Spring Boot and Auto-Configuration
- ✅ Maven for build management
- ✅ How Spring Boot works internally

## 📋 Course Content

### 1. Introduction to Spring Framework
**File:** `01_introduction_to_spring_framework.pdf`

**Topics Covered:**
- Spring Framework overview
- History and evolution of Spring
- Spring ecosystem
- Advantages of Spring
- Spring vs traditional Java development
- Use cases and applications

**Key Takeaways:**
- Spring simplifies enterprise Java development
- Follows POJO (Plain Old Java Objects) principle
- Provides a complete framework for building applications

---

### 2. Beans in Spring Framework
**File:** `03_beans_in_spring_framework.pdf`

**Topics Covered:**
- What are beans?
- Bean lifecycle
- Bean scopes (Singleton, Prototype, etc.)
- Bean definition and configuration
- @Bean annotation
- Bean instantiation methods

**Key Takeaways:**
```java
// Example: Creating a bean
@Configuration
public class AppConfig {
    @Bean
    public UserService userService() {
        return new UserService();  // This is a bean
    }
}
```

---

### 3. Dependency Injection
**File:** `04_dependency_injection.pdf`

**Topics Covered:**
- What is Dependency Injection (DI)?
- Types of DI: Constructor, Setter, Field
- @Autowired annotation
- @Qualifier for bean selection
- DI advantages
- Loose coupling and flexibility

**Key Concepts:**
```java
// Constructor Injection
@Service
public class UserService {
    private UserRepository userRepository;
    
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}

// Setter Injection
@Service
public class ProductService {
    private ProductRepository productRepository;
    
    @Autowired
    public void setRepository(ProductRepository repo) {
        this.productRepository = repo;
    }
}

// Field Injection
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
}
```

---

### 4. Auto Configuration
**File:** `06_Auto_Configuration.pdf`

**Topics Covered:**
- Spring Boot Auto-Configuration
- @SpringBootApplication annotation
- Convention over Configuration
- Conditional configuration
- @EnableAutoConfiguration
- Excluding specific auto-configurations

**Key Concepts:**
```java
// Spring Boot automatically configures based on dependencies
@SpringBootApplication  // This enables auto-configuration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

---

### 5. Internal Working of Spring Boot
**File:** `06_internal_working_of_spring_boot.png` + `06_Auto_Configuration.pdf`

**Architecture Overview:**
- Spring Boot Starters
- Auto-Configuration mechanism
- Embedded Tomcat server
- Application property loading
- Bootstrap process

**Diagram Explanation:** See the PNG file for visual architecture

---

### 6. Maven - Build Management
**File:** `07_Maven.pdf`

**Topics Covered:**
- Maven basics and project structure
- POM.xml (Project Object Model)
- Dependency management
- Build lifecycle
- Plugins and goals
- Repository management

**Maven Basics:**
```xml
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>my-app</artifactId>
    <version>1.0</version>
    
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <version>2.7.0</version>
        </dependency>
    </dependencies>
</project>
```

---

### 7. Comprehensive Week Notes
**File:** `Introduction_To_Spring_Boot_Full_Week_Notes.pdf`

**Complete Coverage:**
- Week-long complete study material
- Consolidated learning from all topics
- Examples and best practices
- Frequently asked questions
- Quick reference guide

---

## 📁 Directory Structure

```
Module 01  Introduction To Spring & Spring Boot/
├── README.md (This file)
│
├── 📄 PDF Resources:
│   ├── 01_introduction_to_spring_framework.pdf
│   ├── 03_beans_in_spring_framework.pdf
│   ├── 04_dependency_injection.pdf
│   ├── 06_Auto_Configuration.pdf
│   ├── 07_Maven.pdf
│   └── Introduction_To_Spring_Boot_Full_Week_Notes.pdf
│
├── 🖼️ Visual Resources:
│   └── 06_internal_working_of_spring_boot.png
│
└── 📁 Code Examples:
    └── module1Introduction/ (Implementation examples)
```

## 🚀 Learning Path

### Week 1: Foundation
**Day 1-2:** Spring Framework Introduction
- Read: `01_introduction_to_spring_framework.pdf`
- Understand Spring ecosystem
- Review Spring advantages

**Day 3-4:** Beans Concept
- Read: `03_beans_in_spring_framework.pdf`
- Learn bean lifecycle
- Practice bean definition

**Day 5-6:** Dependency Injection
- Read: `04_dependency_injection.pdf`
- Understand DI patterns
- Practice different injection methods

**Day 7:** Maven & Tools
- Read: `07_Maven.pdf`
- Setup your development environment
- Create first Maven project

### Week 1: Advanced Topics
**Day 8-9:** Spring Boot Auto-Configuration
- Read: `06_Auto_Configuration.pdf`
- Study architecture diagram
- Understand auto-configuration

**Day 10:** Complete Week Notes Review
- Read: `Introduction_To_Spring_Boot_Full_Week_Notes.pdf`
- Consolidate all learning
- Practice exercises

## 💡 Key Concepts Quick Reference

### Spring Framework
| Concept | Description |
|---------|-------------|
| **IoC** | Inversion of Control - Framework manages object lifecycle |
| **DI** | Dependency Injection - Automatic dependency provision |
| **Bean** | Object managed by Spring container |
| **Container** | ApplicationContext - Manages beans |

### Spring Boot
| Feature | Purpose |
|---------|----------|
| **Auto-Config** | Automatic bean creation based on dependencies |
| **Embedded Tomcat** | No need for external server |
| **Starters** | Pre-configured dependency packages |
| **@SpringBootApplication** | Enables all auto-configuration |

### Maven
| Command | Purpose |
|---------|----------|
| `mvn clean` | Remove build directory |
| `mvn compile` | Compile source code |
| `mvn test` | Run unit tests |
| `mvn package` | Create JAR/WAR file |
| `mvn install` | Install to local repository |

## 🎯 Practice Exercises

### Exercise 1: Create Your First Spring Bean
```java
@Configuration
public class AppConfig {
    @Bean
    public GreetingService greetingService() {
        return new GreetingService();
    }
}
```

### Exercise 2: Implement Dependency Injection
```java
@Service
public class NotificationService {
    private EmailSender emailSender;
    
    @Autowired
    public NotificationService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }
}
```

### Exercise 3: Create Spring Boot Application
```java
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
```

### Exercise 4: Build with Maven
```bash
# Create project
mvn archetype:generate -DgroupId=com.example -DartifactId=myapp

# Build
mvn clean install

# Run
mvn spring-boot:run
```

## 🔧 Setup & Environment

### Prerequisites
- Java JDK 11 or higher
- Maven 3.6 or higher
- IDE (IntelliJ IDEA, Eclipse, VS Code)
- Git for version control

### Installation Steps
1. **Install Java:**
   ```bash
   java -version  # Verify installation
   ```

2. **Install Maven:**
   ```bash
   mvn -version   # Verify installation
   ```

3. **Setup IDE:**
   - Download IntelliJ IDEA or Eclipse
   - Install Spring Boot extension/plugin
   - Configure JDK path

4. **Clone Repository:**
   ```bash
   git clone https://github.com/amitbirajdar0311/CodingShuttle.git
   cd CodingShuttle
   ```

## 📚 Recommended Reading Order

1. **Start Here:** `Introduction_To_Spring_Boot_Full_Week_Notes.pdf`
   - Get overview of all topics
   - Understand connections between concepts

2. **Then Read:** Individual PDFs in order
   - `01_introduction_to_spring_framework.pdf`
   - `03_beans_in_spring_framework.pdf`
   - `04_dependency_injection.pdf`
   - `07_Maven.pdf`
   - `06_Auto_Configuration.pdf`

3. **Study:** Visual diagrams
   - `06_internal_working_of_spring_boot.png`

4. **Practice:** Code examples
   - Run examples in `module1Introduction/`
   - Modify and experiment

## ❓ Frequently Asked Questions

### Q: What's the difference between Spring and Spring Boot?
**A:** Spring is a framework, Spring Boot is a convention-based framework that simplifies Spring setup through auto-configuration.

### Q: Do I need to understand XML configuration?
**A:** Modern Spring Boot uses Java configuration, but understanding XML helps with legacy projects.

### Q: What's the best injection method?
**A:** Constructor injection is recommended for mandatory dependencies and testability.

### Q: Can I use Spring without Maven?
**A:** Yes, but Maven simplifies dependency management significantly.

## 📖 Additional Resources

- [Spring Official Website](https://spring.io/)
- [Spring Framework Documentation](https://spring.io/projects/spring-framework)
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Maven Official Guide](https://maven.apache.org/guides/)
- [Baeldung Spring Tutorials](https://www.baeldung.com/spring-tutorial)

## 🤝 Getting Help

- Review the PDF files again
- Check parent repository README
- Look at code examples in `module1Introduction/`
- Join Spring community forums
- Read official Spring documentation

## ✅ Module Completion Checklist

- [ ] Read all PDF files
- [ ] Study the architecture diagram
- [ ] Create a Spring Bean
- [ ] Practice Dependency Injection
- [ ] Build with Maven
- [ ] Run Spring Boot application
- [ ] Complete all exercises
- [ ] Understand Spring Boot auto-configuration
- [ ] Set up IDE properly
- [ ] Ready for Module 02

## 🎓 Next Steps

After completing this module:
1. Move to **Module 02** - Spring Boot MVC & RESTful APIs
2. Explore **SpringCore** project for hands-on practice
3. Build your first REST API
4. Deploy to production

---

**🚀 You're now ready to become a Spring Expert! Continue to Module 02! 🎉**

---

**Module Status:** ✅ Complete  
**Last Updated:** July 2026  
**Difficulty:** Beginner  
**Estimated Duration:** 1 week