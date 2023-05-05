import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertManyResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.BsonValue;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.mongodb.client.model.Filters.gte;
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


}
