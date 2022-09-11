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
public class TypeCheck {

    public static void main(String[] args) {
        Typetester t = new Typetester();

        t.printType(12);
    }
}

class Typetester {

    void printType(byte x) {
        System.out.println(x + " is an byte");
    }

    void printType(int x) {
        System.out.println(x + " is an int");
    }

    void printType(float x) {
        System.out.println(x + " is an float");
    }

    void printType(double x) {
        System.out.println(x + " is an double");
    }

    void printType(char x) {
        System.out.println(x + " is an char");
    }
}
