/**
 * Level  27. Write a program that accepts a string input and outputs the number of characters in
 * the string and the first and last character in separate lines. For example,
 * if the input is I like Java then the output would be
 * 11
 * I
 * a
 * @author Siam_PC
 */
package Chapter_2;

import java.util.Scanner;
import javax.swing.JFrame;

public class L3Ex27inputToCountChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;

        System.out.println("Enter Text"); // Input
        text = sc.nextLine();
   
        System.out.println(text.length());
//        System.out.println(text.substring(0,1));
//System.out.println(text.substring(text.length()-1));
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(text.length()-1));
        
       
    }
}