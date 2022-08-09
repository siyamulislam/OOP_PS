/*
 Write a program that determines if an input sentence is a palindrome, for
 example, A man, a plan, a canal, Panama! You ignore the punctuation
 marks, blanks, and case of the letters. Repeat the operation until an empty
 string is entered.
 */
package Chapter_9;

import java.util.Scanner;

/**
 *
 * @author Siam
 */
public class L3Ex24SentencePalindrome {

    public static void main(String[] args) {
        String string;
        StringBuffer sb;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Input String: ");
            string = sc.nextLine();

            if (string.length() == 0) {
                break;
            } else {
                string = string.toLowerCase();
                string = string.replaceAll("[^a-z]", "");
                sb = new StringBuffer(string);

                if (string.equals(sb.reverse().toString())) {
                    System.out.println("Palindrome.");
                } else {
                    System.out.println("Not Palindrome.");
                }
            }
        }
        sc.close();
    }
}
