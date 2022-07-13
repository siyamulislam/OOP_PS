/**
 * Level 8. Write a program that inputs temperature in degrees Celsius and prints out the
 * temperature in degrees Fahrenheit. The formula to convert degrees Celsius
 * to equivalent degrees Fahrenheit is
 * Fahrenheit  1.8  Celsius  32
 *
 * @author Siam_PC
 */
package Chapter_3;

import java.util.Scanner;

public class L1Ex8CtoF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double C, F;
        System.out.print("input in Celsius: ");
        C = sc.nextDouble();
        F = 1.8 * C + 32;
        System.out.println(" Fahrenheit:"+F);
    }
}
