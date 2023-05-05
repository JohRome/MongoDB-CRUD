import com.mongodb.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoConnector {
    private final String connectionString = "mongodb://localhost:27017";
    MongoClient client;
    public boolean connectToLocalMongoDB() {
        boolean isConnected;
        try {
            client = MongoClients.create(connectionString);
            isConnected = true;
        } catch (MongoClientException e) {
            System.out.println(e.getMessage());
            isConnected = false;
        }
        return isConnected;
    }
//    public void addCollectionToDatabase() {
//        MongoDatabase db = client.getDatabase("JohansDatabase");
//        db.createCollection("Employees");
//        db.createCollection("Customers");
//    }
}
