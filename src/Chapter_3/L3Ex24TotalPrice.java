/**
 * Level2 ex 24. Write a program that accepts the unit weight of a bag of coffee in pounds and
 * the number of bags sold and displays the total price of the sale, computed as
 * totalPrice = unitWeight * numberOfUnits * 5.99;
 * totalPriceWithTax = totalPrice + totalPrice * 0.0725;
 * where 5.99 is the cost per pound and 0.0725 is the sales tax. Display the
 * result in the following manner:
 * Number of bags sold: 32
 * Weight per bag: 5 lb
 * Price per pound: $5.99
 * Sales tax: 7.25%
 *
 * Total price: $ 1027.884
 * Draw the program diagram.
 *
 * @author Siam_PC
 */
package Chapter_3;

import java.util.Scanner;

public class L3Ex24TotalPrice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unitWeight, numberOfUnits, totalPrice, totalPriceWithTax;
        final double costPerPound = 5.99;
        final double Tax = 0.0725;

        System.out.print("Number of bags sold: ");
        numberOfUnits = sc.nextDouble();
        System.out.print("Weight per bag: ");
        unitWeight = sc.nextDouble();

        totalPrice = unitWeight * numberOfUnits * costPerPound;
        totalPriceWithTax = totalPrice + totalPrice * Tax;

        System.out.println("Price per pound: $" + costPerPound);
        System.out.println("Sales tax: " + Tax * 100 + "%");
        System.out.println();
        System.out.println("Total price: $ " + totalPriceWithTax);
    }
}
