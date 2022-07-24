/**
 * Level 2 ex 11. Employees at MyJava Lo-Fat Burgers earn the basic hourly wage of $7.25.
 * They will receive time-and-a-half of their basic rate for overtime hours.
 * In addition, they will receive a commission on the sales they generate
 * while tending the counter. The commission is based on the following
 * formula:
 * Sales Volume Commission
 * $1.00 to $99.99 5% of total sales
 * $100.00 to $299.99 10% of total sales
 *  $300.00 15% of total sales
 * Write a program that inputs the number of hours worked and the total sales
 * and computes the wage.
 *
 */
package Chapter_5;

import java.util.Scanner;

/**
 *
 * @author Siam_PC
 */
public class L2Ex13EmployeesWage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double hourlyWage = 7.25;
        int hours;
        double sales, commission = 0, totalWage;
        System.out.print("Enter the Working Hours:");
        hours = sc.nextInt();
        System.out.print("Enter the Sales: $ ");
        sales = sc.nextDouble();

        if (sales >= 1.00 && sales <= 99.99) {
            commission = sales * 0.05;
        } else if (sales >= 100.00 && sales <= 299.99) {
            commission = sales * 0.10;
        } else if (sales >= 300.00) {
            commission = sales * 0.15;
        }
        totalWage = hours * hourlyWage + commission;
        System.out.println("Total Wage " + totalWage + " $");
    }
}
