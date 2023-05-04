public class Main {
    public static void main(String[] args) {

        MongoConnector mongo = new MongoConnector();
        mongo.connectToLocalMongoDB();
        mongo.addCollectionToDatabase();






    }
}

