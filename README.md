# RestAPI
This is a  Spring Boot web application that demonstrates CRUD (Create, Read, Update, Delete) operations using  an H2 in-memory database. The application has endpoints for adding, viewing, updating, and deleting "Collection" records, with data displayed on JSP pages. The project includes a REST API and a simple form to submit and view data.<br>
**Project Structure**
**Controller (Controllller):** Manages requests and maps them to specific endpoints for the application.
Entity (Collection): Represents the data model with fields for id, name, and points.
<br>
**Repository (collectrepo):** Uses Spring Data JPA’s CrudRepository to perform database operations on Collection entities.<br>
**Web Pages:**<br>
**Collect.jsp:** A form to insert new records with id, name, and points fields.<br>
**Print.jsp:** Displays the entered data after form submission.<br>
Endpoints
**/Collect:** Displays a form to input data.<br>
**POST /Collect:** Saves the data submitted from the form and returns the "Print" page displaying the submitted information.<br>
**/Collections:** Displays all records as a JSON list.<br>
**POST /Collections:** Creates a new record from a JSON request.<br>
**PUT /Collections:** Updates an existing record based on the provided data.<br>
**DELETE /Collections/{id}:** Deletes the record with the specified ID.<br>
**/Collections/{id}:** Retrieves the record with the specified ID as a JSON response.<br>
**Setup and Configuration**<br>
The application runs on port 8096 and uses an H2 in-memory database. Configurations are in application.properties:<br>

spring.datasource.url: Sets up H2 database connection.<br>
spring.mvc.view.prefix and spring.mvc.view.suffix: Configures JSP file paths.<br>
spring.h2.console.enabled=true: Enables access to the H2 database console.<br>
Running the Application<br>
Clone this repository.<br>
Access the form at** http://localhost:8096/Collect.**<br>
**Technologies Used**<br>
Spring Boot: Backend framework.<br>
Spring MVC: For handling web requests.<br>
Spring Data JPA: To manage database operations.<br>
H2 Database: An in-memory database for development/testing.<br>
JSP: For rendering web pages.<br>
**Postman Usage**<br>
Postman was used for testing the RESTful API methods (/Collections, /Collections/{id}). Through Postman, various HTTP methods (GET, POST, PUT, DELETE) were sent to the endpoints, with JSON data in the request body where applicable, making it easy to verify CRUD operations.<br>
**Screenshots and Examples**<br>
Collect Form: Basic form to input id, name, and points.<br>
Print Page: Displays submitted data after form submission<br>
