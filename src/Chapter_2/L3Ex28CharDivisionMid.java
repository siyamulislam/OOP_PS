/*
 Write a program that accepts a word and prints out the middle character.
The length of the input word is odd. For example, if the input is magnificent,
which has 11 characters, you output the sixth character f. You use the
division operator /. This operator returns only the quotient. For example, the
expression 10/4 would result in 2 (not 2.5).
 * @author Siam_PC
 */
package Chapter_2;

import java.util.Scanner;

/**
 *
 * @author Siam_PC
 */
public class L3Ex28CharDivisionMid {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String word;

        System.out.println("Enter Text"); // Input
        word = sc.nextLine();
        
        Integer mid=word.length()/2;
        
        if(word.length()%2==1)mid=mid+1; 
   
        System.out.println(word.charAt(mid-1));
    }
}
