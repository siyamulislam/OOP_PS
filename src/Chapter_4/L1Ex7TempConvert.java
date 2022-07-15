/**
 * Level ex 7. Define a new class named Temperature. The class has two accessors—toFahrenheit and toCelsius—that return the temperature in the specified unit
 * and two mutators—setFahrenheit and setCelsius—that assign the temperature
 * in the specified unit. Maintain the temperature internally in degrees Fahrenheit.
 * Using this class, write a program that inputs temperature in degrees
 * Fahrenheit and outputs the temperature in equivalent degrees Celsius
 *
 * @author Siam_PC
 */
package Chapter_4;

import java.util.Scanner;

public class L1Ex7TempConvert {

    public static void main(String[] args) {
        Temperature temperature;
        temperature = new Temperature();
        Scanner scanner = new Scanner(System.in);
        double temp;
        System.out.print("Temperature in Fahrenheit:  ");
        temp = scanner.nextDouble();
        temperature.setFahrenheit(temp);
        System.out.println("Temperature in Celsius: " + temperature.fahrenheitToCelsius() + " degrees");
    }
}
