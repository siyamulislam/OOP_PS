/**
 * Level2 ex 12. Write a program that replies either Leap Year or Not a Leap Year, given a
year. It is a leap year if the year is divisible by 4 but not by 100 (for
example, 1796 is a leap year because it is divisible by 4 but not by 100). A
year that is divisible by both 4 and 100 is a leap year if it is also divisible by
400 (for example, 2000 is a leap year, but 1800 is not).
 *
 */
package Chapter_5;

import java.util.Scanner;

/**
 *
 * @author Siam_PC
 */
public class L2Ex12LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter a Year:");
        year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is Leap Year!");
        } else {
            System.out.println(year + " is not Leap Year!");
        }
    }
}
