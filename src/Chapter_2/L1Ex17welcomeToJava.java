package Chapter_2;
/**
 * Level 1
 * 17.Write a program that displays a frame window 800 pixels wide and 600 pixels high.  Input the user’s first and last name as two separate strings. Then display a
frame window with its title set to <last>, <first>, where <last> and <first> are
the input values. For example, if the input values are Johann and Strauss,
then the title would be Strauss, Johann.
*  @author Siam_PC
 */
import javax.swing.*;
public class L1Ex17welcomeToJava {
   public static void main(String arg []){
       JFrame window=new JFrame();
       window.setSize(800, 600);
       window.setTitle("Welcome to Java");
       window.setVisible(true);
   }   
}
