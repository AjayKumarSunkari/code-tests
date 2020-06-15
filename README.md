
This is Spring Boot Microservices project connecting to in-memory H2 Database with JPA.

Start the application by running Main class AppApplication.java


Testing the application (using Chrome plugin POSTMAN)

Create or Add Person record
	Step 1: Choose HTTP POST method in POSTMAN
	Step 2: Copy the url http://localhost:8080/ into url field
	Step 3: Add below JSON data in Request Body
		 {
       			 "id": 1,
		        "firstName": "Mahesh",
	        	"lastName": "Sunkari"
		 }
  	Step 4: Hit Send button.

Retrieve or Get Persons record
	Step 1: Choose HTTP GET method in POSTMAN
	Step 2: Copy the url http://localhost:8080/ into url field
	Step 3: Hit Send button.

Update Person record
	Step 1: Choose HTTP PUT method in POSTMAN
	Step 2: Copy the url http://localhost:8080/1 into url field
	Step 3: Add below JSON data in Request Body
		 {
       			 "id": 1,
		        "firstName": "Mahesh Babu",
	        	"lastName": "Ghattamaneni"
		 }
	Step 4: Hit Send button.

Delete Person record
	Step 1: Choose HTTP DELETE method in POSTMAN
	Step 2: Copy the url http://localhost:8080/1 into url field
	Step 3: Hit Send button.
