# **About Assignment**

## Name :- stock
## Framework :- Spring
## Language :- Java

# Data Flow

### Application Properties

spring.datasource.driverClassName=org.h2.Driver  
spring.datasource.username=sa  
spring.datasource.password=  
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect  
spring.h2.console.enabled=true  

#To see queries that are being fired in the console we need to use below statements  
spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true



### Controller Package

This Package Handles the HTTP Request from the client. It contains the One class

* StockController


These models have mainly CRUD Operation Request

1.@GetMapping: The @GetMapping annotation is used to map HTTP GET requests to a specific method in the controller class. It is used to retrieve or fetch data from the server. It can be applied to a class or a specific method. In the example, @GetMapping is used on the getAllStockTypes method to map a GET request to the /api/type/{stockType} endpoint, which retrieves a list of all StockTypes.

2.@PostMapping :  
i.The @PostMapping annotation is used to map HTTP POST requests to a specific method in the controller class.  
ii.It is used to submit or create new data on the server.   
iii.It can be applied to a class or a specific method.



### Service Package
This is a Java Spring Boot service class that contains methods for performing CRUD (Create, Read, Update, Delete) operations on job objects. It is annotated with @Service, which is a Spring stereotype annotation indicating that this class is a service. This package also consist of one class.

* StockService

### Repository Package
This package consist of interface. Which defines a set of methods that can be used to interact with the underlying database. The interface extends the JpaRepository interface and specifies the Job entity and the data type of its primary key Integer. The interface contains several custom finder methods that use the naming convention of Spring Data JPA to automatically generate the queries. In summary, this code implements a simple REST ful API for managing Job objects with endpoints for performing CRUD operations.

* IStockRepository

### Model package

Model package Consist of one Class.

* Stock

All below annotations are applied on above class:  
1.@AllArgsContructer: It is used to automatically generate a constructor with parameters for all fields in a class.  
2.@NoArgsContructor: It is used to automatically generate a no-argument constructor for a class.  
3.@Entity: Indicates that this class is a JPA entity and should be mapped to a database table.    
4.@Table: Specifies the name of the database table to which this entity is mapped.   
5.@Id: Indicates that the id field is the primary key of the entity.    
6.@GeneratedValue: Specifies the strategy for generating values for the primary key. In this case, it uses GenerationType.AUTO.  


