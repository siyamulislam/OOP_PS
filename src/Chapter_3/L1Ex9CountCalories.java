/**
 * Level 9. Write a program that accepts a person’s weight and displays the number of
calories the person needs in one day. A person needs 19 calories per pound
of body weight, so the formula expressed in Java is
calories = bodyWeight * 19;
 *
 * @author Siam_PC
 */
package Chapter_3;

import java.util.Scanner;

public class L1Ex9CountCalories {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double bw,cal;
        System.out.print("input body Weight: ");
        bw = sc.nextDouble();
        cal =  bw * 18;
        System.out.println(" calories:"+cal);
    }
}
