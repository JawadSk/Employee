# Employee-Address
## Frameworks and Language used:
* Spring
* Spring boot
* My-Sql
* Java

## Data Flow
## Controller
### Employee

* getEmployee
* getEmployeeById
* addEmployee
* updateEmployee
* deleteEmployee

### Address

* getALlAddress
* addAllAddress
* updateAddressData
* deleteAddress
## Service
### Employee

* getAllEmployeeData
* getEmployeeDataById
* addEmployeeData
* updateEmployeeData
* deleteEmployeeData
* 
### Address

* getAllAddressData
* addAllAddressData
* updateAddressData
* deleteAddressData
* 
## Repository

### Employee

* IEmployeeRepository

### Address

* IAddressRepository

* IEventRepository

## Model

### Employee

* employeeId
* firstName
* lastName
* 
## address

### Address

* addressId
* street
* city
* state
* zipcode
* 
## Project Summary
* This API is a Spring Boot project that is about managing Employees and Addresses. We can create, read, update, and delete Employees and Addresses. In this project request is sent from the client on HTTP in JSON format or from path variable and stored in object then response is sent back from the server by JSON format to the client.
