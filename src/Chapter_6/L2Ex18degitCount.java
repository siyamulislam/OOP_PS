/**
 * Level 1 ex 06. A prime number is an integer greater than 1 and divisible by only itself and 1.
 * The first seven prime numbers are 2, 3, 5, 7, 11, 13, and 17.Write a method that returns true
 * if its parameter is a prime number. Using this method, write a program that repeatedly asks the
 * user for input and displays  Prime if the input is a prime number and Not Prime, otherwise.
 * Stop the repetition when the input is a negative number.
 *
 */
package Chapter_6;

import java.util.Scanner;

/**
 *
 * @author Siam_PC
 */
public class L1Ex7PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            int number;
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            if (CheckIfPrime(number)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }

    private static boolean CheckIfPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
        }
        return isPrime;
    }
}
