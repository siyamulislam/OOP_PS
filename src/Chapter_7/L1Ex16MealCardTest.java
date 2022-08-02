/**
 * Level 1 ex 16. Write a program that tests the meal card class defined in
 * Exercise 15. Define this test program outside the myutil package. Create one
 * or two meal card objects in the test program and verify that all methods
 * defined in the meal card class operate correctly.
 *
 *
 *
 *
 */
package Chapter_7;

import java.util.Scanner;
import myutil.MealCard;

/**
 *
 * @author Siam_PC
 */
public class L1Ex16MealCardTest {

    public static void main(String[] args) {
        MealCard mealCard = new MealCard();

        System.out.println("Initial Balance: " + mealCard.getBalance());
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Bought amount:");
        int cost = sc.nextInt();
        mealCard.deductBalance(cost);
        System.out.println("Cutrrent Balance: " + mealCard.getBalance());

        System.out.print("Enter The purchase Point amount:");
        int buyAmt = sc.nextInt();
        mealCard.purchasePoints(buyAmt);
        System.out.println("Current Balance: " + mealCard.getBalance());
    }
}
