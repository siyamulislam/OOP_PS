/*
 Write a program that reads a sentence and prints out the sentence in reverse
 order using the reverse method of the StringBuffer class. For example, the
 method will display
 ?uoy era woH
 for the input
 How are you?
 */
package Chapter_9;

import java.util.Scanner;

/**
 *
 * @author Siam
 */
public class L1Ex10RevString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb;
        String sentence;

        while (true) {
            System.out.print("Enter a sentence:");
            sentence = sc.nextLine();
            sb=new StringBuffer(sentence);
            if (sentence.length() > 1) {
                for (int i=sb.length()-1;i>=0;i--){
                    System.out.print(sb.charAt(i));
                }
                System.out.println("");
               //insted of for loop by one line  :) 
              //  System.out.println(sb.reverse());
            }
             else break;
        }
    }
}
