/**
 * @class: SpeedLight
 * @author: Nia Jackson
 * @course: ITEC 2140
 * This program will calculate how many bags you need to fit 18 chocolates
 * in bags that can hold 3 chocolates each
 */

public class Chocolate {
    public static void main(String[] args) {
        double bars = 18; //The variable for number of chocolate bars
        double bags = 3; //The variable for the number of bags
        double result = bars / bags; //Calculates the number of bags divided by the number of chocolates

        System.out.println("The number of bags that you will need is " + result); //Prints the result
    }
}

