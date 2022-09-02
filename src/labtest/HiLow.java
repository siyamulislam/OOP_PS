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
        System.out.println("Enter a number(1-100):");
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        int random =(int) Math.floor(Math.random());
            System.out.println(random);
            
           
        while (number!=random) {
            if (number<random){
                System.out.println("Low"); 
                break;
            } 
            else if (number>random){
                System.out.println("High");
                 break;
            } 

        }
    }
    public static void readNum(){
        
    }

}
