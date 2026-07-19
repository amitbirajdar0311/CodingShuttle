# 🔧 SpringCore Project

## Overview

**SpringCore** is a dedicated Maven project demonstrating the core concepts of Spring Framework. This project focuses on understanding the fundamental building blocks of Spring, including IoC (Inversion of Control), Dependency Injection, and Bean management.

## 📚 What You'll Learn

This project covers:

- ✅ **Spring Container** - Understanding how Spring manages objects
- ✅ **Beans** - Creating and configuring Spring beans
- ✅ **Dependency Injection** - Injecting dependencies using Spring
- ✅ **Application Context** - Working with Spring's ApplicationContext
- ✅ **Configuration** - XML and Java-based bean configuration
- ✅ **Bean Lifecycle** - Understanding bean creation and destruction
- ✅ **Annotations** - Using Spring annotations like @Bean, @Component, @Autowired

## 📁 Project Structure

```
SpringCore/
├── pom.xml                    # Maven configuration
├── README.md                  # This file
├── .gitignore                 # Git ignore rules
├── .idea/                     # IDE configuration
└── src/
    ├── main/
    │   ├── java/              # Java source code
    │   │   └── com/
    │   │       └── example/
    │   │           └── spring/
    │   │               ├── beans/           # Bean examples
    │   │               ├── config/          # Configuration files
    │   │               ├── services/        # Service implementations
    │   │               └── App.java         # Main application
    │   │
    │   └── resources/         # Configuration resources
    │       ├── application.properties
    │       └── application-context.xml
    │
    └── test/
        ├── java/              # Unit tests
        └── resources/         # Test resources
```

## 🚀 Getting Started

### Prerequisites
- Java 11 or higher
- Maven 3.6 or higher
- IDE (IntelliJ IDEA recommended)

### Installation

1. **Navigate to the project directory:**
   ```bash
   cd SpringCore
   ```

2. **Install dependencies:**
   ```bash
   mvn clean install
   ```

3. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

## 📦 Maven Dependencies

Key dependencies used in this project:

```xml
<!-- Spring Boot Starter Web -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<!-- Spring Boot Starter Test -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
</dependency>
```

See `pom.xml` for complete dependency list.

## 💡 Core Concepts Explained

### 1. Spring Container
The Spring Container is responsible for:
- Creating instances of beans
- Injecting dependencies
- Managing bean lifecycle
- Providing ApplicationContext

### 2. Beans
Beans are objects managed by Spring Container:
```java
@Component
public class MyService {
    // This class is automatically managed by Spring
}
```

### 3. Dependency Injection
Spring injects dependencies automatically:
```java
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;  // Injected by Spring
}
```

### 4. Configuration
Define beans using Java configuration:
```java
@Configuration
public class AppConfig {
    
    @Bean
    public UserService userService() {
        return new UserService();
    }
}
```

## 🔑 Key Files & Classes

### App.java
Main entry point for the Spring Boot application.

### Configuration Classes
- `AppConfig.java` - Java-based configuration
- `application-context.xml` - XML-based configuration

### Service Classes
- `UserService.java` - Example service class
- `ProductService.java` - Another example service

### Repository Classes
- `UserRepository.java` - Data access objects

## 🧪 Running Tests

Execute unit tests using Maven:

```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=UserServiceTest

# Run with coverage
mvn test jacoco:report
```

## 🛠️ Maven Commands

```bash
# Clean build
mvn clean

# Compile
mvn compile

# Package
mvn package

# Install
mvn install

# Run Spring Boot app
mvn spring-boot:run

# Generate site documentation
mvn site
```

## 📖 Learning Resources

Refer to the parent repository's **Module 01** for:
- 📄 Spring Framework Introduction
- 📄 Beans in Spring Framework
- 📄 Dependency Injection concepts
- 📄 Auto Configuration details

## 🎯 Practice Exercises

Try these exercises to reinforce your learning:

1. **Create a Bean**
   - Create a new `Calculator` class
   - Annotate it with `@Component`
   - Autowire it in another service

2. **Dependency Injection**
   - Create a `Logger` interface
   - Implement it in `ConsoleLogger`
   - Inject it into a service

3. **Configuration**
   - Create a `@Configuration` class
   - Define multiple `@Bean` methods
   - Test that they're correctly instantiated

4. **Bean Lifecycle**
   - Implement `InitializingBean` interface
   - Add `@PostConstruct` and `@PreDestroy` methods
   - Observe the lifecycle

## 🚨 Common Issues & Solutions

### Issue: Class not found during autowiring
**Solution:** Ensure class is annotated with `@Component`, `@Service`, or `@Configuration`

### Issue: NoSuchBeanDefinitionException
**Solution:** Verify the bean is defined and component scanning includes the package

### Issue: Circular dependency
**Solution:** Refactor your code to remove circular references

## 📚 Additional Resources

- [Spring Framework Documentation](https://spring.io/projects/spring-framework)
- [Spring Boot Reference Guide](https://spring.io/projects/spring-boot)
- [Baeldung Spring Core Tutorials](https://www.baeldung.com/spring)

## 🤝 Troubleshooting

If you encounter issues:

1. Check Maven is properly installed: `mvn -v`
2. Verify Java version: `java -version`
3. Clear Maven cache: `mvn clean`
4. Rebuild: `mvn install`

## 📝 Notes

- This project is designed for learning purposes
- Experiment freely and modify the code
- Check the console output to understand Spring's behavior
- Use breakpoints to debug and trace execution

## 🎓 Next Steps

After mastering SpringCore:
1. Move to **Module 02** - Learn about Spring MVC
2. Explore **SpringJDBC** - Work with databases
3. Build your own REST APIs
4. Deploy to production

---

**Happy Learning! Start exploring Spring Framework fundamentals! 🚀**

Last Updated: July 2026