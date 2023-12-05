package singletonPattern;
// I reference to the same User to have basis..
public class UserApp {
    public static void main(String[] args) {
        // Instantiate the app and queues
        Application app = Application.getInstance();
        Queues queues = Queues.getInstance();

        // Login a user
        app.loginUser("Juan");
        int queueNumberJuan = app.getNextQueueNumber();
        System.out.println("Juan's Queue Number: " + queueNumberJuan);

        // Login another user
        app.loginUser("Maria");
        int queueNumberMaria = app.getNextQueueNumber();
        System.out.println("\nMaria's Queue Number: " + queueNumberMaria);

        // Reset the queue number (for example, during reorganization)
        app.resetQueueNumber(25);

        // Logout present user
        app.logoutUser();
        System.out.println();

        // Login another user
        app.loginUser("Maria");
        int newQueueNumberMaria = app.getNextQueueNumber();
        System.out.println("Maria's New Queue Number: " + newQueueNumberMaria);
    }
}
