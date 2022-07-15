/**
 * Level2 ex 17. When you say you are 18 years old, you are really saying that the Earth has
 * circled the Sun 18 times. Since other planets take fewer or more days than
 * Earth to travel around the Sun, your age would be different on other planets.
 * You can compute how old you are on other planets by the formula
 * y =(x*365)/d
 * where x is the age on Earth, y is the age on planet Y, and d is the number of
 * Earth days the planet Y takes to travel around the Sun. Write an application
 * that inputs the user’s Earth age and print outs his or her age on Mercury,
 * Venus, Jupiter, and Saturn. The values for d are listed in the table.
 * d  Approximate Number of Earth
 * Days for This Planet to Travel
 * Planet around the Sun
 * Mercury 88
 * Venus 225
 * Jupiter 4,380
 * Saturn 10,767
 *
 * @author Siam_PC
 */
package Chapter_3;

import java.util.Scanner;

public class L2Ex17AgeInPlants {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double earthAge, mercuryAge, venusAge, jupiterAge, saturnAge;

        System.out.print("Age on Earth: ");
        earthAge = sc.nextDouble();

        mercuryAge = (earthAge * 365) / 88;
        venusAge = (earthAge * 365) / 225;
        jupiterAge = (earthAge * 365) / 4380;
        saturnAge = (earthAge * 365) / 10767;

        System.out.println("Age on Mercury: " + mercuryAge);
        System.out.println("Age on Venus: " + venusAge);
        System.out.println("Age on Jupiter: " + jupiterAge);
        System.out.println("Age on Saturn: " + saturnAge);

    }
}
