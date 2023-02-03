/**
 * @class: SpeedLight
 * @author: Nia Jackson
 * @course: ITEC 2140
 * This program will calculate the speed of light given the meters per second that sound travels
 * and how many seconds (5) it took the observer to hear the thunder.
 */


public class SpeedLight {
    public static void main(String[] args){

        double seconds = 5; // Identifies the time (seconds) variable
        double distance = 340; //Identifies the distance variable (speed of light in meters) variable
        double result = seconds * distance; //Multiplies the speed of light in meters by seconds

        System.out.println("The distance the lighting struck was " + result + " Meters away");//Prints the product

    }
}
