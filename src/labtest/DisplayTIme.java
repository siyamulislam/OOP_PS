/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lab-2
 */
public class DisplayTIme {
 public void ShowTime(){
       Date today = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss");
        System.out.println(sdf1.format(today));
   }
}
