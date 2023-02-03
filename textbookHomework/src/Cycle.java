/**
 * @class: SpeedLight
 * @author: Nia Jackson
 * @course: ITEC 2140
 * This program will calculate how many tricycles a shop has given that there are 10 bikes that need two
 * wheels total (meaning that 20 of the total 47 wheels have been used already).
 */
public class Cycle {
    public static void main(String[] args) {

        int trikeWheels = 3; //Identifies the number of wheels a Trike has
        int wheelsLeft = 27; //The number of wheels left over in the shop when bikes have been accounted for
        int trikes = (wheelsLeft / trikeWheels); //Divides the number of wheels left-over by the number of wheels that
                                                 //a trike needs
        int result = wheelsLeft / trikeWheels;
        System.out.println("The number of tricycles that the bike shop has is " + result);





    }
}
