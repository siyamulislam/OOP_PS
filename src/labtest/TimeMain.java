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
public class TimeMain {

    public static void main(String[] args) {
        DisplayTime dt = new DisplayTime();
        dt.ShowTime();

        Calendar rightNow = Calendar.getInstance();
        int hour = rightNow.get(Calendar.HOUR);
        
    }
}

