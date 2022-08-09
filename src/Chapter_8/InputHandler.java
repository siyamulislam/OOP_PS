/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_8;

import java.util.*;

/**
 *
 * @author Siam
 */
class InputHandler {

    private static final String BLANK = "";
    private String name;
    private String room;
    private String pwd;
    private Scanner scanner;

    public InputHandler() {
        name = BLANK;
        room = BLANK;
        pwd = BLANK;
        scanner = new Scanner(System.in);
    }

    public void getInput() {
        System.out.print("Enter Name:");
        name = scanner.next();
        System.out.print("Enter Room No.:");
        room = scanner.next();
        System.out.print("Enter Password:");
        pwd = scanner.next();
    }

    public String getName() {
        return name;
    }

    public String getRoom() {
        return room;
    }

    public String getPassword() {
        return pwd;
    }
}
