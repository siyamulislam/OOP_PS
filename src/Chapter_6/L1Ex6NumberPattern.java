/**
 * Level 1 ex 06. Write a program to print out the numbers 10 through 49 in the following
 * manner:
 * 10 11 12 13 14 15 16 17 18 19
 * 20 21 22 23 24 25 26 27 28 29
 * 30 31 32 33 34 35 36 37 38 39
 * 40 41 42 43 44 45 46 47 48 49
 *
 */
package Chapter_6;

/**
 *
 * @author Siam_PC
 */
public class L1Ex6NumberPattern {

    public static void main(String[] args) {
        for (int i = 10, j = 0; i <= 49; i++, j++) {
            if (j == 10) {
                System.out.println();
                j = 0;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
