/**
 * Level 2 22. Write a program that displays a frame window W pixels wide and H pixels high. Use 
 * the Scanner to enter the values for W and H. The title of the frame is also entered by the user.
 *
 * @author Siam_PC
 */
package Chapter_2;

import java.util.Scanner;
import javax.swing.JFrame;

public class Ex22inputToframeSize {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer frameWidth, frameHeight;

        System.out.println("Enter frame Width"); // Input frame Width
        frameWidth =Integer.parseInt(sc.next()) ;
        System.out.println("Enter frame Height"); // Input frameHeight
        frameHeight = Integer.parseInt(sc.next()) ;
        System.out.println(frameHeight+""+frameWidth);
       JFrame window=new JFrame();
       window.setSize(frameWidth, frameHeight);
       window.setTitle( "Width: "+frameWidth.toString()+" X Height: "+frameHeight.toString()); //Show in Window
       window.setVisible(true);
    }
}
