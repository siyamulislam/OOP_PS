/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others;

import java.util.Random;

/**
 *
 * @author Siam
 */
public class RandomGen {
    public static void main(String[] args) {
        Random random=new Random();
        int number0 =random.nextInt(3);
//        int number1 =random.nextInt((4-2+1)+2); //not working
         int number1 =(int)Math.floor(1+(Math.random()*(100-1)));
        System.out.println(number1);
        System.out.println( 5 + (Math.random() * (10 - 5)) );
    }
          
}
