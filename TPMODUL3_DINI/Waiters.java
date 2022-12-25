public class Waiters implements Runnable {

    private final int orderQyt;
    private final int customerID;
    static int foodPrice = 37000;

    public Waiters(int orderQyt, int customerID) {
        this.orderQyt = orderQyt;
        this.customerID = customerID;
    }

    @Override
    public void run() {
        while (true) {
            getFood();
            try { 
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void orderInfo(){
        System.out.println("============================================================");
        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Number of Food: " + this.orderQyt);
        System.out.println("Total Price: " + this.orderQyt + foodPrice);
        System.out.println("============================================================");
    }

    public void getFood(){ 
        synchronized(restaurant.getLock()){

            System.out.println("Waiters: Food is ready to deliver");
            restaurant restaurant = new restaurant();
            restaurant.setWaitingForPickup(false);

            if (restaurant.getFoodNumber() == this.orderQyt + 1) {
                orderInfo();
                System.exit(0);
            }
            restaurant.getLock().notifyAll();
            System.out.println("Waiters: Tell the restaurant to make another food\n");
        }
    }
}