/**
 * Level 1 20. Write a program to display today’s date in this format: 10 December 2008.
 * Use the console window for output.
 *
 * @author Siam_PC
 */
package Chapter_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class L1Ex20DateFormat {

    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd MMMM YYYY");
        System.out.println(sdf1.format(today));
    }
}
