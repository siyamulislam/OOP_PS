/**
 * Level 2 ex 18. Write a method that returns the number of digits in an integer argument; 
 * for example, 23,498 has five digits. Using this method, write a program that repeatedly 
 * asks for input and displays the number of digits the input integer has. Stop the repetition 
 * when the input value is negative.
 */
package Chapter_6;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Siam_PC
 */
public class L2Ex18degitCount {

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        for(;;)
        {
            int n, noOfDigits = 0;
            System.out.print("Enter an Integer: ");
            n = scanner.nextInt();
            if(n < 0)
            {
                break;
            }
            noOfDigits = GetDigitOfAIntefer(n);
            System.out.println("No of Digits in the Integer: "+noOfDigits);
        }
    }
    
    private static int GetDigitOfAIntefer(int num)
    {
        int count = 0;
        while(num > 0)
        {
            num = num/10;
            count ++;
        }
        return count;
    }
}
