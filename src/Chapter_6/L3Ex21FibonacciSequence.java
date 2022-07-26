/**
 * Level 2 ex 18. Write a program that accepts N, N>=1, from the user and displays the first N numbers
 * in the Fibonacci sequence. Use appropriate formatting to display he output cleanly.
 */
package Chapter_6;

import java.util.Scanner;

/**
 *
 * @author Siam_PC
 */
public class L3Ex21FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, a = 1, b = 1;
        System.out.print("Enter the range: ");
        n = scanner.nextInt();

        System.out.println("F1 = " + a);
        System.out.println("F2 = " + b);

        for (int i = 3; i <= n; i++) {
            int f = a + b;
            System.out.println("F" + i + " = F" + (i - 1) + " + F" + (i - 2) + " = " + b + " + " + a + " = " + f);
            a = b;
            b = f;
        }
    }
}
