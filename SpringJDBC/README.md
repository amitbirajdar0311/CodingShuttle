# 🗄️ SpringJDBC Project

## Overview

**SpringJDBC** is a dedicated Maven project demonstrating Spring's JDBC integration for database operations. This project focuses on data access patterns, database connectivity, and SQL execution using Spring's abstraction layer.

## 📚 What You'll Learn

This project covers:

- ✅ **Spring JDBC Template** - Simplified database operations
- ✅ **DAO Pattern** - Data Access Object implementation
- ✅ **Connection Management** - Database connection pooling
- ✅ **Query Execution** - SELECT, INSERT, UPDATE, DELETE operations
- ✅ **ResultSet Mapping** - Converting database results to Java objects
- ✅ **Exception Handling** - Spring's DataAccessException
- ✅ **Configuration** - Database properties and DataSource setup
- ✅ **Transaction Management** - @Transactional annotations

## 📁 Project Structure

```
SpringJDBC/
├── pom.xml                    # Maven configuration
├── README.md                  # This file
├── .gitignore                 # Git ignore rules
├── .idea/                     # IDE configuration
└── src/
    ├── main/
    │   ├── java/              # Java source code
    │   │   └── com/
    │   │       └── example/
    │   │           └── jdbc/
    │   │               ├── config/        # Database configuration
    │   │               ├── dao/           # Data Access Objects
    │   │               ├── entity/        # Entity/Domain classes
    │   │               ├── service/       # Business logic layer
    │   │               └── App.java       # Main application
    │   │
    │   └── resources/         # Configuration resources
    │       ├── application.properties     # DB connection details
    │       ├── application-dev.properties
    │       └── schema.sql                 # Database schema
    │
    └── test/
        ├── java/              # Unit and integration tests
        └── resources/         # Test resources & test data
```

## 🚀 Getting Started

### Prerequisites
- Java 11 or higher
- Maven 3.6 or higher
- Database (MySQL, PostgreSQL, H2, etc.)
- IDE (IntelliJ IDEA recommended)

### Installation

1. **Navigate to the project directory:**
   ```bash
   cd SpringJDBC
   ```

2. **Configure database connection:**
   Edit `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/codingshuttle
   spring.datasource.username=root
   spring.datasource.password=password
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   ```

3. **Install dependencies:**
   ```bash
   mvn clean install
   ```

4. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

## 📦 Maven Dependencies

Key dependencies for database operations:

```xml
<!-- Spring Boot JDBC Starter -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-jdbc</artifactId>
</dependency>

<!-- MySQL Driver -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.33</version>
</dependency>

<!-- Connection Pooling -->
<dependency>
    <groupId>com.zaxxer</groupId>
    <artifactId>HikariCP</artifactId>
</dependency>

<!-- Spring Boot Test -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
</dependency>
```

See `pom.xml` for complete dependency list.

## 💡 Core Concepts Explained

### 1. JdbcTemplate
Spring's JdbcTemplate simplifies JDBC operations:
```java
@Repository
public class UserRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public User findById(Long id) {
        String sql = "SELECT * FROM users WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new UserRowMapper(), id);
    }
}
```

### 2. RowMapper
Maps ResultSet to Java objects:
```java
public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getLong("id"));
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));
        return user;
    }
}
```

### 3. DAO Pattern
Encapsulates data access logic:
```java
@Repository
public class UserDAO {
    
    public void insert(User user) { }
    public User findById(Long id) { }
    public List<User> findAll() { }
    public void update(User user) { }
    public void delete(Long id) { }
}
```

### 4. DataSource Configuration
Configure database connection:
```java
@Configuration
public class DataSourceConfig {
    
    @Bean
    public DataSource dataSource() {
        return new HikariDataSource(hikariConfig());
    }
}
```

### 5. Transaction Management
Manage database transactions:
```java
@Service
public class UserService {
    
    @Transactional
    public void createUser(User user) {
        // Operations here are transactional
    }
}
```

## 🔑 Key Files & Classes

### UserEntity.java
Domain class representing a user:
```java
public class User {
    private Long id;
    private String name;
    private String email;
    // getters and setters
}
```

### UserRepository.java
Data access layer for User entity:
- `findById(Long id)`
- `findAll()`
- `insert(User user)`
- `update(User user)`
- `delete(Long id)`

### UserService.java
Business logic layer:
- Calls repository methods
- Implements business rules
- Handles transactions

### DataSourceConfig.java
Configuration class for database connection

## 🧪 Running Tests

Execute tests using Maven:

```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=UserRepositoryTest

# Run integration tests
mvn verify

# Generate coverage report
mvn test jacoco:report
```

## 🛠️ Maven Commands

```bash
# Clean build
mvn clean

# Compile
mvn compile

# Run application
mvn spring-boot:run

# Package as JAR
mvn package

# Run tests
mvn test

# Generate documentation
mvn site
```

## 📖 Database Setup

### Create Database
```sql
CREATE DATABASE codingshuttle;
USE codingshuttle;

CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

### Sample Insert
```sql
INSERT INTO users (name, email) VALUES 
('John Doe', 'john@example.com'),
('Jane Smith', 'jane@example.com');
```

## 📚 Common JDBC Operations

### SELECT Query
```java
String sql = "SELECT * FROM users";
List<User> users = jdbcTemplate.query(sql, new UserRowMapper());
```

### INSERT Query
```java
String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
jdbcTemplate.update(sql, user.getName(), user.getEmail());
```

### UPDATE Query
```java
String sql = "UPDATE users SET name = ? WHERE id = ?";
jdbcTemplate.update(sql, newName, userId);
```

### DELETE Query
```java
String sql = "DELETE FROM users WHERE id = ?";
jdbcTemplate.update(sql, userId);
```

## 🎯 Practice Exercises

1. **Create DAO Methods**
   - Implement findById, findAll methods
   - Add insert, update, delete operations

2. **ResultSet Mapping**
   - Create custom RowMapper
   - Test mapping with sample data

3. **Transaction Management**
   - Implement @Transactional methods
   - Test rollback scenarios

4. **Error Handling**
   - Catch DataAccessException
   - Implement proper error handling

## 🚨 Common Issues & Solutions

### Issue: Connection refused
**Solution:** Ensure database is running and connection details are correct

### Issue: Table not found
**Solution:** Execute schema.sql to create tables

### Issue: No datasource configured
**Solution:** Add database properties to application.properties

### Issue: Connection timeout
**Solution:** Increase timeout or check database performance

## 📊 Application.properties Configuration

```properties
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/codingshuttle
spring.datasource.username=root
spring.datasource.password=password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Connection Pool
spring.datasource.hikari.maximum-pool-size=10
spring.datasource.hikari.minimum-idle=5

# JPA/JDBC Properties
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

# Logging
logging.level.root=INFO
logging.level.com.example=DEBUG
```

## 🔗 Spring JDBC Reference

- [Spring JDBC Documentation](https://spring.io/projects/spring-data-jdbc)
- [JdbcTemplate API](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/jdbc/core/JdbcTemplate.html)
- [Data Access Guide](https://spring.io/guides/gs/relational-data-access/)

## 📚 Learning Resources

Refer to the parent repository for:
- Database design best practices
- SQL optimization tips
- Transaction management strategies

## 🤝 Troubleshooting

If issues occur:

1. Check database connectivity: `mysql -u root -p`
2. Verify tables exist: `SHOW TABLES;`
3. Check Spring logs for errors
4. Verify driver in pom.xml
5. Check application.properties for typos

## 📝 Notes

- Use parameterized queries to prevent SQL injection
- Always implement proper exception handling
- Use @Transactional for data consistency
- Test DAO methods thoroughly
- Keep SQL queries in properties files for easier maintenance

## 🎓 Next Steps

After mastering SpringJDBC:
1. Learn Spring Data JPA for ORM
2. Explore advanced query patterns
3. Implement caching strategies
4. Build real-world applications

---

**Happy Learning! Master database operations with Spring JDBC! 🚀**

Last Updated: July 2026