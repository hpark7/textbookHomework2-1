import java.text.DecimalFormat;

/**
 * @class: SpeedLight
 * @author: Nia Jackson
 * @course: ITEC 2140
 * This program will calculate the perimeter of a circle given
 * that the radius is 9.5
 */
public class Circle {
    public static void main(String[] args){
        double radius = 9.5;//Identifies the given radius of the circle
        double area = radius * radius * Math.PI;//Establishes the formula for area of a circle
        double perimeter = 2 * radius * Math.PI;//Establishes the formula for perimeter of a circle
DecimalFormat df = new DecimalFormat(".0");//Creates a new object identifying the desired
                                                  //precision of the decimal place

        System.out.println("The area of the circle is " + df.format(area));//Prints the area of the circle with
                                                                           //the DecimalFormat function
        System.out.println("The perimeter of the circle is " + df.format(perimeter));//Prints the perimeter of the circle
                                                                                     // with the DecimalFormat function
    }
}
