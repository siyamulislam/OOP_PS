/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SiamPC
 */
public class FileCheck {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File dc = new File("C:\\Users\\SiamPC\\Desktop\\ok\\st.txt");
//         String filenname[]= dc.list();
//        System.out.println(filenname);
//        for(String f: filenname){
//            System.out.println(f);
//        }

        File inFile = new File("C:\\Users\\SiamPC\\Desktop\\ok\\st.txt");

//        FileOutputStream outFileStream = new FileOutputStream(inFile);
//        PrintWriter outStream = new PrintWriter(outFileStream);
//        outStream.println(987654321);
//        outStream.println("Hello, world.");
//        outStream.println(true);
//        outStream.close();

        FileReader fileReader = new FileReader(inFile);
        BufferedReader bufReader = new BufferedReader(fileReader);
        String str;

        str = bufReader.readLine();
//        int i = Integer.parseInt(str);
        System.out.println(str);
	//similar process for other data types
        bufReader.close();

    }
}
