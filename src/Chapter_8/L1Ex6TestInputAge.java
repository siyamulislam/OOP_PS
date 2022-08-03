/*
 * When you run Ch8TestAgelnputVer4 and enter a negative number, you
 will get an error message: “Sorry, you do not qualify to enter the junior
 competition.” However, when a negative number is entered, it is more
 appropriate to say “Illegal value: negative age is invalid.” Modify the
 TestInputVer4 class so that an appropriate error message is displayed for
 a negative input value.
 */
package Chapter_8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Siam
 */
public class L1Ex6TestInputAge {

    public static void main(String[] args) {
       int age;
       Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.print("Enter Your Age:");
            try {
                age = scanner.nextInt();
                if (age < 0) {
                    throw new Exception("Illegal value: negative age is invalid");
                }
                 System.out.println("Congrats, you are qualify to enter the junior competition");
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Input is invalid.\n"
                        + "Please enter digits only");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
