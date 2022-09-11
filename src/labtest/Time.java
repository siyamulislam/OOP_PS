/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtest;

/**
 *
 * @author Lab-2
 */
public class Time {
    int hours,minutes,seconds;
     
    public Time(){
        hours=00;
        minutes=00;
        seconds=00;
        
    }
    public Time(int hours,int minutes,int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;     
    }
    public String getTime(){
         String time=String.valueOf(hours)+":"+String.valueOf(minutes)+":"+String.valueOf(seconds);
        return time;
    }
    
    
    
    
}
