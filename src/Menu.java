import java.util.Scanner;

public class Menu {
    public static void showMenu() {
        System.out.println("1. Create Menu");
        System.out.println("2. Read Menu");
        System.out.println("3. Update Menu");
        System.out.println("4. Delete Menu");
    }
    public static void showCreateMenu() {
        System.out.println("1. Add a new Costumer to your Mongo Database");
        System.out.println("2. Add a new Employee to your Mongo Database");
    }
    public static void showReadMenu() {

    }
    public static void showUpdateMenu() {

    }
    public static void showDeleteMenu() {

    }
    public static int getUserChoise() {
        Scanner input = new Scanner(System.in);
        int choise = 0;

        try{
            System.out.print("Enter an option: ");
            choise = input.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return choise;
    }
}
