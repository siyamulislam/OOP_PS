/**
 * Level ex 12. Write a program that displays the recommended weight (kg), given the
 * user’s age and height (cm). The formula for calculating the recommended
 * weight is
 * recommendedWeight = (height - 100 + age / 10) * 0.90
 * Define a service class named Height and include an appropriate method for
 * getting a recommended weight of a designated height
 *
 * @author Siam_PC
 */
package Chapter_4;

import java.util.Scanner;

public class L2Ex12BMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age, height, recommendedWeiight;
        Height heightObject = new Height();

        System.out.print("User's age: ");
        age = scanner.nextDouble();

        System.out.print("User's height (cm): ");
        height = scanner.nextDouble();
        recommendedWeiight = heightObject.getRecommendedWeight(age, height);

        System.out.println("Recommended Weight: " + recommendedWeiight);
    }
}
