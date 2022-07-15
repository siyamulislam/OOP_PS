
package Chapter_4;

public class Temperature {

    private double Fahrenheit, Celcius;

    public void setCelcius(double celsius) {
        Celcius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        Fahrenheit = fahrenheit;
    }

    public double toCelsius() {
        return Celcius;
    }

    public double toFahrenheit() {
        return Fahrenheit;
    }

    public double fahrenheitToCelsius() {
        Celcius = (Fahrenheit - 32) * 5 / 9;
        return Celcius;
    }
}
