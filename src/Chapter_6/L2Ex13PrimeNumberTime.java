/**
 * Level 2 ex 13. There are 25 primes between 2 and 100, and there are 1229 primes between
 * 2 and 10,000. Write a program that inputs a positive integer N  2 and displays the number of
 * primes between 2 and N (inclusive). Use the timing technique explained in Section 6.9 to
 * show the amount of time it took to compute the result.
 */
package Chapter_6;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Siam_PC
 */
public class L2Ex13PrimeNumberTime {

    public static void main(String[] args) {
        long num, totalPrime = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Positive Number: ");
        num = sc.nextLong();

        Date startTime = new Date();
        totalPrime = GetPrimeNumber(num);
        Date endTime = new Date();
        long executionTime = endTime.getTime() - startTime.getTime();

        System.out.println("Total Prime Numbers: " + totalPrime);
        System.out.println("Execution Time: " + executionTime + " ms");
    }

    private static int GetPrimeNumber(long n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (CheckIfPrime(i)) {
                count++;
            }
        }
        return count;
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
