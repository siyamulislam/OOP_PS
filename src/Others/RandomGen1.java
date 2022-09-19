/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Siam
 */
public class RandomGen1 {
    public static void main(String[] args) {
        Random random=new Random();
        int number0 =random.nextInt(5-2+1)+2;
        System.out.println(number0);
        double max=1.8,min=1.3;
        double randomNumber = (Math.random()*(max-min+1)+ min);
        System.out.println(randomNumber);
        double random2=1.2 + (Math.random() * (1.6 - 1.2)) ;
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(df.format(random2));

    }
          
}
