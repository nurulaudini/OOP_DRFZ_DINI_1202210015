import java.util.Scanner;

public class MainApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        restaurant menu = new restaurant();
        int orderQyt, customerID;
        try { 
            System.out.println("Enter Customer ID: ");
            customerID = input.nextInt();

            System.out.println("Enter how much food to made: ");
            orderQyt = input.nextInt();

            Thread t1 = new Thread(menu);
            Waiters waiters = new Waiters(orderQyt, customerID);
            Thread t2 = new Thread(waiters);

            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Input must be Integer!");
        }

    }
}