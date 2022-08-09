/*
 Write a program that reads a sentence and prints out the sentence with all
 uppercase letters changed to lowercase and all lowercase letters changed to
 uppercase. Repeat the operation until an empty string is entered.
 */
package Chapter_9;

import java.util.Scanner;

/**
 *
 * @author Siam
 */
public class L2Ex19UperLowerSwap {

    public static void main(String[] args) {
        String string;
        StringBuffer sb;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Input String: ");
            string = sc.nextLine();
            sb = new StringBuffer(string);

            if (string.length() == 0) {
                break;
            } else {
                for (int i = 0; i < string.length(); i++) {
                    if (Character.isUpperCase(string.charAt(i))) {
                        sb.setCharAt(i, Character.toLowerCase(string.charAt(i)));
                    } else {
                        sb.setCharAt(i, Character.toUpperCase(string.charAt(i)));
                    }
                }
                System.out.println(sb);
            }
        }
        sc.close();
    }
}
