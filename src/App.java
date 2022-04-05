public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome Back!");
        /**
         * Creating Objects from Bicycle Cass
         */
        Bicycle b1 = new Bicycle("White");
        Bicycle b2 = new Bicycle("Black");
        Bicycle b3 = new Bicycle("Orange");

        System.out.println("The Color of b1 bike is " + b1.getColor() );
        System.out.println("-----------------------------------------");

        /**
         * Access/Get the Total Number of Bikes
         * In a static way
         */
        System.out.println("The total Number of Bikes is " + Bicycle.bikeCount);

        /**
         * Create friend objects from Friend Class
         */
        Friend f1 = new Friend("Adones");
        Friend f2 = new Friend("Spongebob");
        Friend f3 = new Friend("Patrick");
        /**
         * Calling static variables/methods
         */
        System.out.println("-----------------------------------------");

        System.out.println("I have friends from " + Friend.section);
        System.out.println("The number of friends I have = " + Friend.getFriendCount());

    }
}
