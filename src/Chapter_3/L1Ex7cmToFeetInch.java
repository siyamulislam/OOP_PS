/**
 * Level 1 7. Write a program to convert centimeters (input) to feet and inches (output).
 * 1 in = 2.54 cm.
 *
 * @author Siam_PC
 */
package Chapter_3;

import java.util.Scanner;

public class L1Ex7cmToFeetInch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double cm, feet, inch;
        System.out.print("input in cm: ");
        cm = sc.nextDouble();
        inch = cm / 2.54;
        if (inch > 12) {
            feet = inch / 12;
            inch = inch % 12;
            System.out.println(feet.intValue() + " feet and " + inch.intValue() + " inches");
        } else {
            System.out.println(inch.intValue() + " inches");
        }
    }
}
