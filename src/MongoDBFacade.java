import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.Scanner;

public class MongoDBFacade {
    private CustomerModel customer;
    private EmployeeModel employee;
    private MongoConnector mongo;
    private MongoDatabase database;

    public MongoDBFacade() {
        this.mongo = new MongoConnector();
        mongo.connectToLocalMongoDB();
        this.database = mongo.client.getDatabase("johanDB");
//        database.createCollection("Employees");
//        database.createCollection("Customers");
    }




    public CustomerModel createCustomer() {
        Scanner input = new Scanner(System.in);
        var customer = new CustomerModel();
        System.out.println("Enter customer number: ");
        customer.setCustomerNumber(input.nextLine());

        System.out.println("Enter customer name: ");
        customer.setName(input.nextLine());

        System.out.println("Enter customer age: ");
        customer.setYear(input.nextInt());
        input.nextLine();

        System.out.println("Enter customer address: ");
        customer.setAddress(input.nextLine());

        return customer;

    }
    public EmployeeModel createEmployee() {
        Scanner input = new Scanner(System.in);
        var employee = new EmployeeModel();
        System.out.println("Enter employee number: ");
        employee.setEmployeeNumber(input.nextLine());

        System.out.println("Enter employee name: ");
        employee.setName(input.nextLine());

        System.out.println("Enter employee age: ");
        employee.setYear(input.nextInt());
        input.nextLine();

        System.out.println("Enter employee address: ");
        employee.setAddress(input.nextLine());

        return employee;
    }

    public void addCustomerToDatabase() {
        customer = createCustomer();
        MongoCollection<Document> collection = database.getCollection("Customers");
        collection.insertOne(customer.toBSONDocument(customer));
    }
    public void addEmployeeToDatabase() {
        employee = createEmployee();
        MongoCollection<Document> collection = database.getCollection("Employees");
        collection.insertOne(employee.toBSONDocument(employee));
    }

    public void readAllCustomers() {
        MongoCollection<Document> customersCollection = database.getCollection("Customers");
        customersCollection.find().forEach(document -> System.out.println(document.toJson()));
    }
    public void readAllEmployees() {
        MongoCollection<Document> employeeCollection = database.getCollection("Employees");
        employeeCollection.find().forEach(document -> System.out.println(document.toJson()));
    }
    public void readAll() {
        MongoCollection<Document> customersCollection = database.getCollection("Customers");
        MongoCollection<Document> employeeCollection = database.getCollection("Employees");

        customersCollection.find().forEach(document -> System.out.println(document.toJson()));
        employeeCollection.find().forEach(document -> System.out.println(document.toJson()));
    }

    public void updateCustomer() { // hjälp från chatgpt
        readAllCustomers();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter customer number to update: ");
        String customerNumber = input.nextLine();

        System.out.println("Enter new customer number: ");
        String newCustomerNumber = input.nextLine();

        System.out.println("Enter new customer name: ");
        String newCustomerName = input.nextLine();

        System.out.println("Enter new customer age: ");
        int newCustomerAge = input.nextInt();
        input.nextLine();

        System.out.println("Enter new customer address: ");
        String newCustomerAddress = input.nextLine();

        MongoCollection<Document> customersCollection = database.getCollection("Customers");
        Bson filter = Filters.eq("customerNumber", customerNumber);
        Bson update = new Document("$set", new Document("customerNumber", newCustomerNumber)
                .append("name", newCustomerName)
                .append("year", newCustomerAge)
                .append("address", newCustomerAddress));
        customersCollection.updateOne(filter, update);
    }
    public void updateEmployee() { // hjälp från chatgpt
        readAllEmployees();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee number to update: ");
        String employeeNumber = input.nextLine();

        System.out.println("Enter new employee number: ");
        String newEmployeeNumber = input.nextLine();

        System.out.println("Enter new employee name: ");
        String newEmployeeName = input.nextLine();

        System.out.println("Enter new employee age: ");
        int newEmployeeAge = input.nextInt();
        input.nextLine();

        System.out.println("Enter new employee address: ");
        String newEmployeeAddress = input.nextLine();

        MongoCollection<Document> employeeCollection = database.getCollection("Employees");
        Bson filter = Filters.eq("employeeNumber", employeeNumber);
        Bson update = new Document("$set", new Document("employeeNumber", newEmployeeNumber)
                .append("name", newEmployeeName)
                .append("year", newEmployeeAge)
                .append("address", newEmployeeAddress));
        employeeCollection.updateOne(filter, update);
    }
    public void deleteCustomer() {
        readAllCustomers();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter customer name to delete: ");
        String customerName = input.nextLine();
        Bson query = Filters.eq("name", customerName);
        DeleteResult result = database.getCollection("Customers").deleteOne(query);
    }
    public void deleteEmployee() {
        readAllEmployees();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee name to delete: ");
        String employeeName = input.nextLine();
        Bson query = Filters.eq("name", employeeName);
        DeleteResult result = database.getCollection("Employees").deleteOne(query);
    }
}
