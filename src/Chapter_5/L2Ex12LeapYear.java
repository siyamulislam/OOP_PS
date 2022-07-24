/**
 * Level ex 9. One million is 106 and 1 billion is 109. Write a program that reads 
 * a power of 10 (6, 9, 12, etc.) and displays how big the number is (Million, Billion, etc.). 
 * Display an appropriate message for the input value that has no corresponding word. 
 * The table below shows the correspondence between the power of 10 and the word for that number.
 *
 */
package Chapter_5;

import java.util.Scanner;

/**
 *
 * @author Siam_PC
 */
public class L2Ex12LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter a Year:");
        year=sc.nextInt();
        
       if(year%4==0 && year%100!=0 || year%400==0){
           System.out.println(year+" is Leap Year!");
       }
       else{
           System.out.println(year+" is not Leap Year!");
       }
        
    }
}
