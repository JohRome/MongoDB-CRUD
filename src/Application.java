public class Application {
    private MongoDBFacade mongoDBFacade;
    private int choice;

    public Application() {
        mongoDBFacade = new MongoDBFacade();
    }

    public void startProgram() {
        boolean isDone = false;
        while (!isDone) {
            Menu.showMenu();
            choice = Menu.getUserChoise();
            switch (choice) {
                case 1 -> createLogic();
                case 5 -> isDone = true;
            }
        }
    }
    public void createLogic() {
        boolean isDone = false;
        while (!isDone) {
            Menu.showCreateMenu();
            choice = Menu.getUserChoise();

            switch (choice) {
                case 1 -> mongoDBFacade.addCustomerToDatabase();
                case 2 -> mongoDBFacade.addEmployeeToDatabase();
                case 3 ->  isDone = true;
            }
        }
    }
}
