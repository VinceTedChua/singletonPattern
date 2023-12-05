package singletonPattern;

public class Application {
    private static Application instance;
    private String user;
    private boolean isUserLoggedIn;

   //This private instantiation prevents public instantiation
    // Much like this: Public Application = new Application
    private Application() {
    }

    // Get application instance
    public static Application getInstance() { //Check if the instance is empty
        if (instance == null)
            instance = new Application();
        return instance;
    }
    //Checks if the user is Logged In and then it is notified
    public synchronized boolean isUserLoggedIn() {
        return isUserLoggedIn;
    }

    // Log in a user
    public synchronized void loginUser(String user) {
        if (!isUserLoggedIn) {
            isUserLoggedIn = true;
            this.user = user;
            System.out.println(user + " is logged in!");
        } else
            System.out.println("Another user already logged in!");
    }

    // Log out a user
    public synchronized void logoutUser() {
        isUserLoggedIn = false;
        System.out.println(user + " is logged out!");
    }

    // Grabs the succeeding queues
    public int getNextQueueNumber() {
        return Queues.getInstance().getSucceedingQueueNumber();
    }

    // Reset the queue number to a specific value
    public void resetQueueNumber(int newQueueNumber) {
        Queues.getInstance().resetQueueNumber(newQueueNumber);
    }
}
