# RestAPI
This is a  Spring Boot web application that demonstrates CRUD (Create, Read, Update, Delete) operations using  an H2 in-memory database. The application has endpoints for adding, viewing, updating, and deleting "Collection" records, with data displayed on JSP pages. The project includes a REST API and a simple form to submit and view data.<br>
Project Structure
**Controller (Controllller):** Manages requests and maps them to specific endpoints for the application.
Entity (Collection): Represents the data model with fields for id, name, and points.
**Repository (collectrepo):** Uses Spring Data JPA’s CrudRepository to perform database operations on Collection entities.
Web Pages:
**Collect.jsp:** A form to insert new records with id, name, and points fields.
**Print.jsp:** Displays the entered data after form submission.
Endpoints
**/Collect:** Displays a form to input data.
**POST /Collect:** Saves the data submitted from the form and returns the "Print" page displaying the submitted information.
**/Collections:** Displays all records as a JSON list.
**POST /Collections:** Creates a new record from a JSON request.
**PUT /Collections:** Updates an existing record based on the provided data.
**DELETE /Collections/{id}:** Deletes the record with the specified ID.
**/Collections/{id}:** Retrieves the record with the specified ID as a JSON response.
**Setup and Configuration**
The application runs on port 8096 and uses an H2 in-memory database. Configurations are in application.properties:

spring.datasource.url: Sets up H2 database connection.
spring.mvc.view.prefix and spring.mvc.view.suffix: Configures JSP file paths.
spring.h2.console.enabled=true: Enables access to the H2 database console.
Running the Application
Clone this repository.
Access the form at** http://localhost:8096/Collect.**
**Technologies Used**
Spring Boot: Backend framework.
Spring MVC: For handling web requests.
Spring Data JPA: To manage database operations.
H2 Database: An in-memory database for development/testing.
JSP: For rendering web pages.
**Postman Usage**
Postman was used for testing the RESTful API methods (/Collections, /Collections/{id}). Through Postman, various HTTP methods (GET, POST, PUT, DELETE) were sent to the endpoints, with JSON data in the request body where applicable, making it easy to verify CRUD operations.
**Screenshots and Examples**
Collect Form: Basic form to input id, name, and points.
Print Page: Displays submitted data after form submission
