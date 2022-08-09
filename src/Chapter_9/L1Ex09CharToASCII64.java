/*
 Write a program that reads in a character and displays the character’s ASCII.
 Accept the input as a string data and check the first character. Display an
 error message if more than one character is entered. Repeat the operation
 until the symbol @ (ASCII 64) is entered
 */
package Chapter_9;

import java.util.Scanner;

/**
 *
 * @author Siam
 */
public class L1Ex09CharToASCII64 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String character;
        int ASCII;

        while (true) {
            System.out.println("Enter a Character: ");
            character = sc.next();
            if (character.length() > 1) {
                System.out.println("Error! Multiple Char Not Alloweed!");
            } else {
                ASCII = character.charAt(0);
                if (ASCII == 64) {
                    break;
                } else {
                    System.out.println(ASCII);
                }
            }
        }
    }
}
