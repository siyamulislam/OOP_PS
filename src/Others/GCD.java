/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others;

/**
 *
 * @author SiamPC
 */
public class GCD {

    public static int GCD(int m, int n) {
        int r = n % m;
        while (r != 0) {
            n = m;
            m = r;
            r = n % m;
        }

        return m;
    }

    public static void main(String[] args) {
        int gcd = GCD(40, 23);
        System.out.println(gcd);
    }

}
