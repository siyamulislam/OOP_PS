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
public class L1Ex9PowerOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int power;
        System.out.print("Enter Power of 10 ^ ");
        power=sc.nextInt();
        
        switch(power){
            case 6: System.out.println("Million");
            break;
            case 9: System.out.println("Billion");
            break;
            case 12: System.out.println("Trillion");
            break;
            case 15: System.out.println("Quadrillion");
            break;
            case 18: System.out.println("Quintillion");
            break;
            case 21: System.out.println("Sextillion");
            break;
            case 30: System.out.println("Nonillion");
            break;
            case 100: System.out.println("Googol");
            break;
            default:System.out.println("Out of List");
        }
        
    }
}
