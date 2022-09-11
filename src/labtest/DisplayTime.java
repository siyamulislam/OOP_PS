/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtest;
import java.util.Calendar;

/**
 *
 * @author Lab-2
 */
public class DisplayTime {
 public void ShowTime(){
      Calendar rightNow = Calendar.getInstance();
        int hour = rightNow.get(Calendar.HOUR);
        int minute = rightNow.get(Calendar.MINUTE);
        int second = rightNow.get(Calendar.SECOND);
        
        Time tm =new Time(hour,minute,second);
        System.out.println(tm.getTime()); 
   }
}
