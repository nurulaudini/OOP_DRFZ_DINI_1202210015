public class restaurant implements Runnable { 

    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1 ;
    

    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(2300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public int getFoodNumber() {
        return foodNumber;
    }

    public void makeFood() {
        synchronized(restaurant.lock) { 
            if (this.waitingForPickup) {
                try {
                    System.out.println("Restaurant: Waiting for the Waiter to deliver the food");
                    restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            waitingForPickup = true;
            System.out.println("Restaurant: Making food Number " + foodNumber++);
            restaurant.lock.notifyAll();
            System.out.println("Restaurant: Telling the waiter to get the food");
        }
    }

    public static Object getLock() {
        return lock;
    }
}