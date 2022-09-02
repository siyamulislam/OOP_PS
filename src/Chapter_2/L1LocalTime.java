/**
 * Level 1 20. Write a program to display today’s date in this format: Friday September 02, 2022.
 * Use the console window for output.
 *
 * @author Siam_PC
 */
package Chapter_2;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class L1LocalTime {

    public static void main(String[] args) {
        
        LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("yyyy/MMMM/dd : hh:mm:ss");
        System.out.println(dtf.format(ldt));
        
        Date date = new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("hh:mm:ss:ms");
        System.out.println(sdf.format(date));
    }
}
