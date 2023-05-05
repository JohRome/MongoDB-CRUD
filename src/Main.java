public class Main {
    public static void main(String[] args) {

//        var facade = new MongoDBFacade();
//        facade.addCustomerToDatabase();

        var app = new Application();
        app.startProgram();




//        MongoDatabase database = mongo.client.getDatabase("johanDB");
//        database.createCollection("Employees");
//        database.createCollection("Customers");
//        MongoCollection<Document> collection = database.getCollection("Customers");
//        MongoCollection<Document> collection1 = database.getCollection("Employees");
//
//
//        var customer = new CustomerModel();
//        customer.setCustomerNumber("1234");
//        customer.setName("Hullis");
//        customer.setYear(1999);
//        customer.setAddress("Batmanvägen 1");
//        //var employee = new EmployeeModel("Eiemi", 30, "Österberga", "1999");
//
//        collection.insertOne(customer.toBSONDocument(customer));
//        collection1.insertOne(employee.toBSONDocument(employee));
//
//        Document doc1 = new Document("name", customer.getName())
//                .append("year", customer.getYear())
//                .append("address", customer.getAddress())
//                .append("customerNumber", customer.getCustomerNumber());
//
//        collection.insertOne(doc1);








//
//        /** CRUD-syntax jag behöver för att lägga upp allt nödvändigt till databasen min */
//
//        /**CREATE*/
        // Skapar en Mongo Databas
//        MongoDatabase database = mongo.client.getDatabase("johanDB");
//
//        // Skapar en Collection i våran databas
//        MongoCollection<Document> collection = database.getCollection("employees");
//
//        // Skapar ett Document med önskade fields
//        Document inspection = new Document("_id", new ObjectId())
//                .append("employee_id", "13")
//                .append("name", "Johan")
//                .append("age", 30)
//                .append("last_name", "AlOsachi");
//
//        Document name = new Document("_id", new ObjectId())
//                .append("employee_id", "37")
//                .append("name","Eiemi")
//                .append("age", 30)
//                .append("last_name", "Romeo");
//
//        //S kickar upp ett Documentet till önskat Collection
//        InsertOneResult result = collection.insertOne(inspection);
//        BsonValue id = result.getInsertedId();
//        System.out.println(id);
//
//        // Skickar upp många Documents i taget
//        List<Document> docs = Arrays.asList(inspection, name);
//        InsertManyResult res = collection.insertMany(docs);
//
//
//        /**READ*/
//        // Varje read ska specifiera ett filter så att man inte kan komma åt alla
//        // Annars kan minnet och skit överbelasta
//
//        collection.find(
//                Filters.and(gte("johanDB", "test"),
//                        Filters.eq("name", "Johan")))
//                .forEach(doc -> System.out.println(doc.toJson()));
//
//        /**UPDATE*/
//        // Väljer vilket filter vi vill söka på och på vem
//        Bson query = Filters.eq("name", "Eiemi");
//        // Uppdaterar önskat field till ett nytt värde
//        Bson update = Updates.set("last_name", "Sjöberg");
//        // Skickar uppdateringarna till collection
//        UpdateResult updateResult = collection.updateOne(query,update);
//
//
//        /**DELETE*/
//        // Filtrerar sökningen på name : Eiemi
//        Bson query = Filters.eq("name", "Eiemi");
//        // Och tar bort 1 Eiemi från collection
//        DeleteResult deleteResult = collection.deleteOne(query);
//        // Tar bort alla som matchar den filtrerade sökningen
//        DeleteResult deleteResultMany = collection.deleteMany(query);







































    }
}

