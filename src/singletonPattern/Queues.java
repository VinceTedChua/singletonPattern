package singletonPattern;

public class Queues {
    //The Queues are responsible for private instantiation and the number starting at 1
    private static Queues instance;
    private int numInteger;

    // Private constructor to prevent instantiation outside the class
    private Queues() {
        numInteger = 1; //starts at 1
    }

    // Get queues instance
    public static Queues getInstance() {
        if (instance == null)
            instance = new Queues();
        return instance;
    }

    // Get the current queue number
    public synchronized int getCurrentQueueNumber() {
            return numInteger;
        }


    // Reset the queue number to a specific value
    public synchronized void resetQueueNumber(int newQueueNumber) {
            numInteger = newQueueNumber;
            System.out.println("Queue number reset to: " + newQueueNumber);
        }


    // Generate the next queue number
    public int getSucceedingQueueNumber() {
            return numInteger++; //will increment after the post number is called..
        }
    }

