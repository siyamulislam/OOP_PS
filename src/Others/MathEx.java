/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others;

/**
 *
 * @author Siam
 */
public class MathEx {

    public static void main(String[] args) {
        int x = 20;
        System.out.println(Math.exp(x)); //exp()
        System.out.println(Math.round(12.5)); //round()
        System.out.println(Math.floor(12.9)); //floor()
        System.out.println(Math.ceil(12.1)); //ceil()
        System.out.println(Math.pow(12, 5)); //ceil()
        System.out.println(Math.sin(90)); //ceil()
        System.out.println(Math.cos(90)); //ceil()
        System.out.println(Math.sqrt(12.1)); //ceil()
        System.out.println(Math.log(12.1)); //ceil()
        int a=2,b=53,c=46;
        double Y= Math.sqrt( (b*b -4*a*c)/ (2* a) );
        System.out.println(Y);
    }

}
