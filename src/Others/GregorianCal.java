/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author SiamPC
 */
public class GregorianCal {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
      int year=  cal.get(Calendar.SECOND);
        System.out.println(year); 
            System.out.println(cal.get(Calendar.MILLISECOND));
    } 
}
