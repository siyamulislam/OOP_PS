package Chapter_4;

class Circle {

    final static double PI = 3.416;
    private double radious;

    public void setRadious(double rd) {
        radious = rd;
    }

    public double getArea() {
        double area = 0;
        area = PI * radious * radious;
        return area;
    }
}
