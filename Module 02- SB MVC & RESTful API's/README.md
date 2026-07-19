# 🎯 Module 02: Spring Boot MVC & RESTful API's

## 🎯 Overview

This module covers Spring Boot MVC (Model-View-Controller) architecture and building RESTful APIs. You'll learn how to create web applications and APIs using Spring Boot, handle HTTP requests, and implement proper API design patterns.

## 📚 Learning Objectives

By the end of this module, you will:

- ✅ Understand MVC architecture and design pattern
- ✅ Master Spring Boot MVC components (Controllers, Views, Models)
- ✅ Build RESTful APIs following best practices
- ✅ Handle HTTP methods (GET, POST, PUT, DELETE)
- ✅ Implement Data Transfer Objects (DTOs)
- ✅ Work with Tomcat and Servlet architecture
- ✅ Implement error handling and validation
- ✅ Create production-ready APIs

## 📁 Module Structure

```
Module 02- SB MVC & RESTful API's/
├── README.md (This file)
│
├── 📁 2.1 - Introduction to SB & MVC Architecture
│       Tomcat and Dispatcher Servlet
│   ├── Learning materials
│   └── Code examples
│
├── 📁 2.2 - The Presentation Layer
│        DTO and Controller
│   ├── DTO implementation examples
│   └── Controller patterns
│
├── 📁 Module02 (Practical Code)
│   ├── src/
│   ├── pom.xml
│   └── Implementation examples
│
└── 📋 Supporting Resources
```

## 📖 Detailed Topics

### Topic 2.1: Introduction to Spring Boot & MVC Architecture

**Location:** `2.1 -Introduction to SB & MVC Architecture, Tomcat and Dispatcher Servlet/`

#### MVC Architecture Explained

```
Request → DispatcherServlet → Controller → Model → View → Response
```

**Components:**

1. **Model** - Data and business logic
2. **View** - Presentation layer (JSP, Thymeleaf, JSON)
3. **Controller** - Request handler and business logic coordinator

#### Key Concepts:

**Dispatcher Servlet:**
- Front controller for Spring MVC
- Routes all requests to appropriate handlers
- Manages request lifecycle

**Tomcat Server:**
- Embedded servlet container in Spring Boot
- Handles HTTP requests
- No need for external server deployment

**Request Processing Flow:**
```
Browser Request
    ↓
Tomcat (Port 8080)
    ↓
DispatcherServlet
    ↓
Controller (@RequestMapping)
    ↓
Service Layer (Business Logic)
    ↓
Repository Layer (Data Access)
    ↓
Response (JSON/HTML)
    ↓
Browser
```

#### Topics Covered:
- MVC pattern fundamentals
- Request-response cycle
- Dispatcher Servlet configuration
- Tomcat embedded server
- URL mapping and routing
- Request parameters handling

#### Learning Materials:
Check the subdirectory for:
- Architecture diagrams
- Code examples
- Configuration files
- Best practices

---

### Topic 2.2: Presentation Layer - DTO and Controller

**Location:** `2.2 The presntation layer DTO and Controller/`

#### Data Transfer Objects (DTO)

**What is DTO?**
DTOs are objects used to transfer data between different layers of an application.

**Why use DTOs?**
```
❌ BAD: Directly expose Entity
@Entity
public class User {
    private Long id;
    private String password;  // Security issue!
    private String email;
}

✅ GOOD: Use DTO
@Data
public class UserDTO {
    private Long id;
    private String email;
    // No password field
}
```

**DTO Best Practices:**
```java
// 1. Use Lombok for cleaner code
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    private String name;
    private Double price;
    private String description;
}

// 2. Separate Request and Response DTOs
@Data
public class UserCreateRequest {
    private String email;
    private String password;
}

@Data
public class UserResponse {
    private Long id;
    private String email;
}
```

#### Controllers

**Basic Controller Structure:**

```java
@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    // GET - Retrieve all users
    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        List<UserDTO> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }
    
    // GET - Retrieve by ID
    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
        UserDTO user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }
    
    // POST - Create user
    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserCreateRequest request) {
        UserDTO user = userService.createUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
    
    // PUT - Update user
    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(
            @PathVariable Long id,
            @RequestBody UserUpdateRequest request) {
        UserDTO user = userService.updateUser(id, request);
        return ResponseEntity.ok(user);
    }
    
    // DELETE - Delete user
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
```

#### HTTP Method Mapping:

| HTTP Method | Operation | Status Code |
|-------------|-----------|-------------|
| GET | Retrieve data | 200 OK |
| POST | Create new resource | 201 Created |
| PUT | Update entire resource | 200 OK |
| PATCH | Update partial resource | 200 OK |
| DELETE | Remove resource | 204 No Content |

#### Request Annotations:

```java
@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    // Path variable
    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProduct(@PathVariable Long id) { }
    
    // Request parameter
    @GetMapping("/search")
    public ResponseEntity<List<ProductDTO>> search(
            @RequestParam String keyword) { }
    
    // Request body
    @PostMapping
    public ResponseEntity<ProductDTO> create(
            @RequestBody ProductCreateRequest request) { }
    
    // Request header
    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAll(
            @RequestHeader("Authorization") String token) { }
}
```

#### Response Status Codes:

```java
// 200 OK
return ResponseEntity.ok(data);

// 201 Created
return ResponseEntity.status(HttpStatus.CREATED).body(data);

// 204 No Content
return ResponseEntity.noContent().build();

// 400 Bad Request
return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

// 404 Not Found
return ResponseEntity.notFound().build();

// 500 Server Error
return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
```

---

## 🛠️ REST API Best Practices

### 1. Resource Naming
```
✅ GET  /api/users           - Get all users
✅ POST /api/users           - Create user
✅ GET  /api/users/{id}      - Get specific user
✅ PUT  /api/users/{id}      - Update user
✅ DELETE /api/users/{id}    - Delete user

❌ GET /api/getUsers         - Don't use verbs
❌ POST /api/createUser      - Use HTTP methods instead
```

### 2. Versioning
```java
@RestController
@RequestMapping("/api/v1/users")  // Version in URL
public class UserControllerV1 { }

@RestController
@RequestMapping("/api/v2/users")  // New version
public class UserControllerV2 { }
```

### 3. Pagination
```java
@GetMapping
public ResponseEntity<Page<UserDTO>> getAllUsers(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "10") int size) {
    Page<UserDTO> users = userService.getAllUsers(page, size);
    return ResponseEntity.ok(users);
}
```

### 4. Error Handling
```java
@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFound(
            ResourceNotFoundException ex) {
        ErrorResponse error = new ErrorResponse("404", ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
```

### 5. Validation
```java
@PostMapping
public ResponseEntity<UserDTO> createUser(
        @Valid @RequestBody UserCreateRequest request) {
    // Validation happens automatically
    return ResponseEntity.status(HttpStatus.CREATED)
            .body(userService.createUser(request));
}

@Data
public class UserCreateRequest {
    @NotBlank(message = "Email is required")
    @Email
    private String email;
    
    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;
}
```

## 🔧 Configuration

### application.properties
```properties
# Server Configuration
server.port=8080
server.servlet.context-path=/api

# Tomcat Configuration
server.tomcat.threads.max=200
server.tomcat.threads.min-spare=10

# Jackson Configuration (JSON)
spring.jackson.serialization.indent-output=true
spring.jackson.default-property-inclusion=non_null

# Logging
logging.level.root=INFO
logging.level.com.example=DEBUG
```

## 📚 Practical Implementation

### Step-by-Step: Building a User API

**1. Create Entity:**
```java
@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
}
```

**2. Create DTOs:**
```java
@Data
public class UserDTO {
    private Long id;
    private String email;
}

@Data
public class UserCreateRequest {
    private String email;
    private String password;
}
```

**3. Create Repository:**
```java
@Repository
public interface UserRepository extends JpaRepository<User, Long> { }
```

**4. Create Service:**
```java
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    public UserDTO createUser(UserCreateRequest request) {
        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        User saved = userRepository.save(user);
        return convertToDTO(saved);
    }
    
    private UserDTO convertToDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setEmail(user.getEmail());
        return dto;
    }
}
```

**5. Create Controller:**
```java
@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @PostMapping
    public ResponseEntity<UserDTO> createUser(
            @RequestBody UserCreateRequest request) {
        UserDTO user = userService.createUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
```

## 🎯 Exercises

### Exercise 1: Create Product API
- [ ] Create Product entity
- [ ] Create ProductDTO
- [ ] Implement CRUD operations
- [ ] Test all endpoints

### Exercise 2: Add Validation
- [ ] Add @Valid annotations
- [ ] Implement custom validators
- [ ] Handle validation errors

### Exercise 3: Error Handling
- [ ] Create custom exceptions
- [ ] Implement @RestControllerAdvice
- [ ] Return proper error responses

### Exercise 4: API Versioning
- [ ] Create V1 and V2 controllers
- [ ] Implement different logic
- [ ] Test both versions

## 📚 Resources

- [Spring MVC Documentation](https://spring.io/guides/gs/serving-web-content/)
- [Spring REST Documentation](https://spring.io/guides/gs/rest-service/)
- [RESTful API Design Best Practices](https://restfulapi.net/)

## 🤝 Troubleshooting

| Issue | Solution |
|-------|----------|
| Port 8080 already in use | Change port in application.properties |
| Controller not found | Add @RestController annotation |
| JSON deserialization error | Check DTO field names and types |
| 404 Not Found | Verify @RequestMapping path |

## ✅ Completion Checklist

- [ ] Understand MVC architecture
- [ ] Learn Dispatcher Servlet
- [ ] Master DTO pattern
- [ ] Implement basic REST API
- [ ] Handle HTTP methods
- [ ] Add error handling
- [ ] Implement validation
- [ ] Test all endpoints

## 🎓 Next Steps

1. Complete all exercises in this module
2. Build a complete REST API project
3. Add database integration (Module with SpringJDBC)
4. Deploy to production

---

**🚀 You're building real APIs! Continue practicing! 🎉**

---

**Module Status:** ✅ Complete  
**Last Updated:** July 2026  
**Difficulty:** Intermediate  
**Estimated Duration:** 1-2 weeks