/**
 * Level ex 9. Write a program that computes the area of a circular region (the shaded area
 * in the diagram), given the radii of the inner and the outer circles, ri and ro,
 * respectively
 * *
 * We compute the area of the circular region by subtracting the area of the
 * inner circle from the area of the outer circle. Define a Circle class that has
 * methods to compute the area and circumference. You set the circle’s radius
 * with the setRadius method or via a constructor
 *
 * @author Siam_PC
 */
package Chapter_4;

import java.util.Scanner;

public class L1Ex9AreaOfCircle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radious1, radious2, area1, area2, circularArea;
        Circle circle1, circle2;
        circle1 = new Circle();
        circle2 = new Circle();

        System.out.print("Radious of inner circle: ");
        radious1 = scanner.nextDouble();
        circle1.setRadious(radious1);
        area1 = circle1.getArea();

        System.out.print("Radious of outer circle: ");
        radious2 = scanner.nextDouble();
        circle2.setRadious(radious2);
        area2 = circle2.getArea();

        circularArea = area2 - area1;
        System.out.println("Area of circular region: " + circularArea);
    }
}
