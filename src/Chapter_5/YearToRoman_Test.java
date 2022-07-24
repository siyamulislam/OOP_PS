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
public class YearToRoman_Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] roman = new char[20];
        int yr, i, j = 0;;
        System.out.print("Enter Year : ");
        yr = scan.nextInt();
        scan.close();
        if (yr / 1000 >= 0) {
            for (i = 0; i < (yr / 1000); i++) {
                roman[j] = 'm';
                j++;
            }
            yr = yr - (i + 1) * 1000;
        }
        if (yr / 500 >= 0) {
            for (i = 0; i < (yr / 500); i++) {
                roman[j] = 'd';
                j++;
            }
            yr = yr - (i + 1) * 500;
        }
        if (yr / 100 >= 0) {
            for (i = 0; i < (yr / 100); i++) {
                roman[j] = 'c';
                j++;
            }
            yr = yr - (i + 1) * 100;
        }
        if (yr / 50 >= 0) {
            for (i = 0; i < (yr / 50); i++) {
                roman[j] = 'l';
                j++;
            }
            yr = yr - (i + 1) * 50;
        }
        if (yr / 10 >= 0) {
            for (i = 0; i < (yr / 10); i++) {
                roman[j] = 'x';
                j++;
            }
            yr = yr - (i + 1) * 10;
        }
        if (yr / 5 >= 0) {
            for (i = 0; i < (yr / 5); i++) {
                roman[j] = 'v';
                j++;
            }
            yr = yr - (i + 1) * 5;
        }
        if (yr / 1 >= 0) {
            for (i = 0; i < (yr / 1); i++) {
                roman[j] = 'i';
                j++;
            }
        }

        System.out.print("Year in Roman: ");
        for (i = 0; i <= j; i++) {
            System.out.printf("%c", roman[i]);
        }
        System.out.println();
    }
}
