/**
 * Level 3 ex 17. At the end of movie credits you see the year movies are produced in Roman
 * numerals, for example, MCMXCVII for 1997. To help the production staff
 * determine the correct Roman numeral for the production year, write a
 * program that reads a year and displays the year in Roman numerals.
 * Roman Numeral Number
 * I 1
 * V 5
 * X 10
 * L 50
 * C 100
 * D 500
 * M 1000
 * Remember that certain numbers are expressed by using a “subtraction,” for
 * example, IV for 4, CD for 400, and so forth.
 *
 */
package Chapter_5;

import java.util.Scanner;

/**
 *
 * @author Siam_PC
 */
public class L3Ex17YearToRoman {

    enum Romans {
        M(1000), CM(900), D(500), CD(400), C(100), XC(90), L(50), Xl(40), X(10), IX(9), V(5), IV(4), I(1);

        private int romanValue;

        private Romans(int valSet) {
            this.romanValue = valSet;
        }

        public int value() {
            return this.romanValue;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Romans[] array = Romans.values();
        int year;
        System.out.print("Enter Year : ");
        year = scan.nextInt();
        scan.close();
        System.out.print("Year in Roman: ");
        for (Romans ri : array) {
            int count = year / ri.value();
            year = year % ri.value();
            while (count > 0) {
                System.out.print(ri);
                count--;
            }
        }
        System.out.println();
    }
}
