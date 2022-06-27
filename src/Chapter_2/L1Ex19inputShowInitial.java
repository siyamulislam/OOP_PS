/**
 * Level 1 19. Input the user’s first, middle, and last name as three separate strings and display
 * the name in the order of the first name, the middle initial, and the last name. Include the
 * period after the middle initial. If the input strings are Wolfgang, Amadeus, and Mozart, for
 * example, then the output would be Wolfgang A. Mozart. Use the console window for output.
 *
 * @author Siam_PC
 */
package Chapter_2;

import java.util.Scanner;

public class L1Ex19inputShowInitial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName, middleName, lastName;

        System.out.println("Enter your First Name"); // Input First Name
        firstName = sc.next();
        System.out.println("Enter your Middle Name"); // Input Middle Name
        middleName = sc.next();
        System.out.println("Enter your Last Name"); // Input Last Name
        lastName = sc.next();

        System.out.println(firstName + " " + middleName.substring(0, 1) + "." + " " + lastName);
    }
}
