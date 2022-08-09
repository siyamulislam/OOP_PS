/*
 Write a program that prints the number of uppercase letters in an input
 string. Use the class method isUpperCase of the Character class, which
 returns true if the passed parameter of type char is an uppercase letter. You
 need to explore the Character class from the java.lang package on your own.
 Repeat the operation until an empty string is entered.
 */
package Chapter_9;

import java.util.Scanner;

/**
 *
 * @author Siam
 */
public class L2Ex13UperCaseCount {

    public static void main(String[] args) {
        String string;
        int counter;
        Scanner sc = new Scanner(System.in);

        while (true) {
            counter = 0;
            System.out.print("Input String: ");
            string = sc.nextLine();

            if (!(string.length() > 0)) {
                break;
            } else {
                for (int i = 0; i < string.length(); i++) {
                    if (Character.isUpperCase(string.charAt(i))) {
                        counter++;
                    }
                }
                System.out.println("Number of Uppercase letters: " + counter);
            }
        }
        sc.close();
    }
}
