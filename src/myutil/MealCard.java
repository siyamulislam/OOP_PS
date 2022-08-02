/*
 * Design a class that keeps track of a student’s food purchases at the campus
cafeteria. A meal card is assigned to an individual student. When a meal card
is first issued, the balance is set to the number of points. If the student does
not specify the number of points, then the initial balance is set to 100 points.
Points assigned to each food item are a whole number. A student can purchase
additional points at any time during a semester. Every time food items are
bought, points are deducted from the balance. If the balance becomes
negative, the purchase of food items is not allowed. There is obviously more
than one way to implement the MealCard class. Any design that supports the
key functionalities is acceptable. Put this class in the myutil package.

 */
package myutil;

/**
 *
 * @author Siam
 */
public class MealCard {

    private int balance = 100;

    public MealCard() {

    }

    public MealCard(int initialBalance) {

        this.balance = initialBalance;
    }

    public int deductBalance(int cost) {

        if (cost <= balance) {

            balance -= cost;
        } else {

            System.out.println("Insufficient Balance.");
        }
        return balance;
    }

    public int purchasePoints(int amt) {

        return balance += amt;
    }

    public int getBalance() {
        return balance;
    }
}
