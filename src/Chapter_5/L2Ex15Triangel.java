/**
 * Level 2 ex 15. Define a class called Triangle that is capable of computing the perimeter and
 * area of a triangle, given its three sides a, b, and c, as shown below. Notice
 * that side b is the base of the triangle.
 *
 */
package Chapter_5;

import java.util.Scanner;

/**
 *
 * @author Siam_PC
 */
public class L2Ex15Triangel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter three sides of traingle: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        Circle circle = new Circle();
        System.out.println(circle.GetArea(a, b, c));
        System.out.println(circle.GetPerimeter(a, b, c));
    }
}

class Circle {

    private boolean IsValid(double a, double b, double c) {
        if (a + b < c || a + c < b || b + c < a) {
            return false;
        } else {
            return true;
        }
    }

    public String GetArea(double a, double b, double c) {
        String strArea = new String();
        double s, area;

        if (IsValid(a, b, c)) {
            s = (a + b + c) / 2;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            strArea = "Area of Triangle: " + area;
        } else {
            strArea = "INVALID_DIMENSION";
        }
        return strArea;
    }

    public String GetPerimeter(double a, double b, double c) {
        String strPerimeter = new String();
        double perimeter;

        if (IsValid(a, b, c)) {
            perimeter = a + b + c;
            strPerimeter = "Perimeter of Triangle: " + perimeter;
        } else {
            strPerimeter = "INVALID_DIMENSION";
        }
        return strPerimeter;
    }
}
