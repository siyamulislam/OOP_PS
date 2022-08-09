///*
// *Level 1 Ex 7: Modify the getInput method of the InputHandler class from Section 8.7 so
// that the method will throw an exception when a blank string (a sequence of
// one or more blank spaces) is entered for the name, room, or password.
// Define a new exception class EmptyInputException.
// */
//package Chapter_8;
// import java.util.*;
//import java.io.*;
//
///**
// *
// * @author Siam
// */
//public class L1Ex7EntranceMonitor {
//
//    public static void main(String[] args) {
//    private Dorm manager;
//    private Door door;
//    private InputHandler input;
//    private Scanner scanner;
//
//    public L1Ex7EntranceMonitor() {
//        manager = new Dorm();
//        scanner = new Scanner(System.in);
//        input = new InputHandler();
//
//        door = new Door();
//    }
//
//     
//
//    public void start() {
//        openFile();
//        String roster = manager.getResidentList(); //TEMP
//        System.out.println(roster); //TEMP
//        processInputData();
//    }
//
//    private void openFile() {
//        String filename;
//        while (true) {
//            System.out.println("File to open ('x' to cancel):");
//            filename = scanner.next();
//            if (filename.equals("x")) {//input routine is canceled
//                System.out.println("Program is canceled.");
//                System.exit(0);
//            }
//            try {
//                manager.openFile(filename);
//                return;
//            } catch (FileNotFoundException e) {
//                System.out.println("No such file");
//            } catch (IOException e) {
//                System.out.println("Error in reading file");
//            }
//        }
//    }
//
//    private void processInputData() {
//        String name, room, pwd;
//        while (true) {
//            input.getInput();
//            name = input.getName();
//            room = input.getRoom();
//            pwd = input.getPassword();
//
//            validate(name, room, pwd);
//        }
//    }
//
//    private void validate(String name, String room, String password) {
//        Resident res = manager.getResident(name);
//        if (res == null) {
//            System.out.println("Invalid Entry");
//        } else if (res.getName().equals(name)
//                && res.getRoom().equals(room)
//                && res.getPassword().equals(password)) {
//            door.open();
//        } else {
//            System.out.println("Invalid Entry");
//        }
//
//    }
//}
