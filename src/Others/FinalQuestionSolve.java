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
public class FinalQuestionSolve {

    public static void simplify() {
        int a = 8, b = 8, x, y = 4, z = 7;
//        if (a == b) {
//            x = y;
//        } else if (a > b) {
//            x = y;
//        } else {
//            x = z;
//        }
        if (a == b || a > b) {
            x = y;
        } else {
            x = z;
        }
        System.out.println(x);
    }

    public static void wToFor() {
        int count = 1, sum = 0;
        for (count = 1; count <= 30; count += 3) {
            sum += count;
//            System.out.println(count);
        }
        System.out.println(sum);
    }

    public static void checkNum(int num) throws Exception {
        if (num < 0) {
            throw new Exception("negitive number!");
        }
        System.out.println(num);
    }

    public static void main(String[] args) throws Exception {
        // simplify();
//        wToFor(); 
        checkNum(-10);
    }

}
