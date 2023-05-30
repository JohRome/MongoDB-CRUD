## Dependencies needed in order to run this program:
+ org.mongodb:bson:4.9.1 - download from Maven - https://mvnrepository.com/artifact/org.mongodb/bson/4.9.1
+ org.mongodb:mongodb-driver-sync:4.9.1 - download from Maven - https://mvnrepository.com/artifact/org.mongodb/mongodb-driver-sync/4.9.1

## How to install the dependencies in IntelliJ
+ Open this project in IntelliJ and go to File -> Project Structure
+ Under "Project Settings" click on "Libraries"
+ Click on the "+"-sign and chose "From Maven..."
+ Copy-paste each dependency given above, choose the correct version and click "ok"
+ Go to the Main.java klass and either click on the green arrow or press Shift+F10 to run the program
## MongoDBFacade methods();
+ public MongoDBFacade() -> instantiate a new object of MongoConnector and tries to connect to your localhost. If you don't already have a database and collection, the constructor will create them for you.
+ public CustomerModel createCustomer() -> creating a new customer object with user inputs
+ public EmployeeModel createEmployee() -> creating a new employee objcet with user inputs
+ public void addCustomerToDatabase() -> adding a created customer to the database
+ public void addEmployeeToDatabase() -> adding a created employee to the database
+ public boolean readAllCustomers() -> if there are customers: then read all customers from the database or tell there are none
+ public boolean readAllEmployees() -> if there are emmployees: then read all employees from the database or tell there are none
+ public boolean readAll() -> if there are either custommers or employees: read all customers and employees from the database or tell there are none
+ public void updateCustomer() -> updating a customer in the database and set new values with user inputs
+ public void updateEmployee() -> updating an employee in the database and set new values with user inputs
+ public void deleteCustomer() -> deleting a customer from the database 
+ public void deleteEmployee() -> deleting an employee from the database
