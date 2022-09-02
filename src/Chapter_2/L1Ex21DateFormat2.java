/**
 * Level 1 20. Write a program to display today’s date in this format: Friday September 02, 2022.
 * Use the console window for output.
 *
 * @author Siam_PC
 */
package Chapter_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class L1Ex21DateFormat2 {

    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE MMMM dd, YYYY");
        System.out.println(sdf1.format(today));
    }
}
