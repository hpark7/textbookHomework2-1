/**
 * @class: SpeedLight
 * @author: NIa Jackson
 * @course: ITEC 2140
 * This program will calclates the number of male students given that there are
 * 389 total students with 175 female students.
 */
public class MaleStudent {
    public static void main(String[] args) {
        double students = 389; //Identifies the variable for the total number of students in the school
        double females = 175;//Identifies the total number of female number of students in the school
        double result = students - females;//Solves fot the number of male students.

        System.out.println("The number of male students in the school is " + result);
    }
}
