public class Friend {
    /**
     * Instance Variables
     */
    private String name;

    /**
     * Static Variables
     */
    private static int friendCount;

    public static String section = "BSIT 1B";

    /**
     * Constructor
     */
    Friend(String inputName){
        friendCount++;
        this.name = inputName;
    }

    /**
     * Getter for friendCount
     * Example of static method 
     * - use-case for getting value of private static variables
     */
    public static int getFriendCount(){
        return friendCount;
    }

}
