## MongoDBFacade methods();
+ public MongoDBFacade() -> instansiate a new object of MongoConnector and tries to connect to your localhost. If you don't already have a database and collection, the constructor will create them for you.
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
