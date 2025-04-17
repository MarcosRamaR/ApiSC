# CRUD in JAVA

## Project Description
A Java application built with Spring Boot that exposes APIREST for CRUD operations, using Hibernate and PostgreSQL database. The API can be tested using Postman.

## Functionalities


- `Full CRUD operations`: Create, Read, Update, Delete.
- `Data persistence`: Using Hibernate JPA.



## Used Technologies
  
  * Java</br>
  * Spring Boot </br>
  * Hibernate </br>
  * Maven </br>
  * Postgresql </br>
  * Docker </br>
  * DBeaver </br>
  * Postman </br>
  
## API Endpoints

### Base URL: `http://localhost:8080/recipes`

### Recipe Operations

| Method | Endpoint              | Description                          | Example Request Body |
|--------|-----------------------|--------------------------------------|----------------------|
| `GET`  | `/recipes`            | Get all recipes                      | -                    |
| `GET`  | `/recipes/{id}`       | Get recipe by ID                     | -                    |
| `POST` | `/recipes`            | Create new recipe                    | [See below](#-sample-requests) |
| `PUT`  | `/recipes/{id}`       | Update entire recipe                 | [See below](#-sample-requests) |
| `DELETE` | `/recipes/{id}`     | Delete recipe                       | -                    |

###  Sample Requests

**Create Recipe** (`POST /recipes`)
```json:
{
  "name": "Desired name",
  "ingredients": "ingredient 1", "ingredient 2", "ingredient 3",
  "steps": "Step 1","Step 2","Step 3"
}
```
## Developers

 <div align= "center">Marcos Rama </div>
<div align= "center">Email: marcosrama094@gmail.com</div>

## License

<div align="center">
This project is not licensed.
</div>
