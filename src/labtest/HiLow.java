 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtest;

import java.util.Scanner;

/**
 *
 * @author Lab-2
 */
public class HiLow {

    public static void main(String[] args) {
        System.out.print("Enter a number(1-100): ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int random = (int) Math.floor(1 + (Math.random() * (100 - 1)));
        int count=6;

        while (number != random && count!=0) {
            count--;
            if (number < random) {
                System.out.println("Tries left "+count);
                System.out.print("Low! Please Choice greater than "+number+ " :");
                  number = sc.nextInt();
                continue;
            } else if (number > random) {
                 System.out.println("Tries left "+count);
                 System.out.print("High! Please Choice lower than "+number+ " :");
                  number = sc.nextInt();
                continue;
            } 
        }
         if(number==random){ 
                 System.out.println("Matched! Congratulation u win the game");
        }
         else if (count == 0){
             System.out.println("NO Tries Left! Try Again");
         }
    }
}
