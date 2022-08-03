/*
 *Level 1 Ex 7: Modify the getInput method of the InputHandler class from Section 8.7 so
that the method will throw an exception when a blank string (a sequence of
one or more blank spaces) is entered for the name, room, or password.
Define a new exception class EmptyInputException.
 */
package Chapter_8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Siam
 */
public class L1Ex7EntranceMonitor {

    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
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
