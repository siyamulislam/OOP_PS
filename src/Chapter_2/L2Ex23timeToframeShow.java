/**
 * Level 2 23. Display the current time in the title of a frame window using this format:
 * 12:45:43 PM. Refer to Table 2.1 for the necessary designator symbols.
 *
 * @author Siam_PC
 */
package Chapter_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;

public class L2Ex23timeToframeShow {

    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("h:m:s a");
        System.out.println(sdf1.format(today));

        JFrame window = new JFrame();
        window.setSize(480, 320);
        window.setTitle(sdf1.format(today)); //Show in Window
        window.setVisible(true);
    }
}
