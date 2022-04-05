public class Bicycle {
    /**
     * Instance Variables
     */
    private String color;

    /**
     * Static Variables
     * Syntax:
     * access-modifier static keyword data-type variable_name
     * eg.
     * public static int number;
     */
    public static int bikeCount = 0;

    /**
     * Constructor
     * 
     */
    Bicycle(String inputColor){
        bikeCount++;
        // bikeCount+=2;
        this.color = inputColor;

    }


    public String getColor() {
        return color;
    }
}
