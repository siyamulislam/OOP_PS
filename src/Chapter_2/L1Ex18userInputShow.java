package Chapter_2;

/**
 * Level 1 18. Input the user’s first and last name as two separate strings. Then display a frame
 * window with its title set to <last>, <first>, where <last> and <first> are the input values. For
 * example, if the input values are Johann and Strauss, then the title would be Strauss, Johann.
 *
 * @author Siam_PC
 */

import java.util.Scanner;
import javax.swing.*;

public class L1Ex18userInputShow {

    public static void main(String arg[]) {
        String firstName, lastName;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your First Name"); // Input First Name
        firstName = scanner.next();
        System.out.println("Enter your Last Name"); // Input Last Name
        lastName = scanner.next();

        JFrame window = new JFrame();
        window.setSize(800, 600);
        window.setTitle(firstName + ", " + lastName); //Show in Window
        window.setVisible(true);
    }
}
