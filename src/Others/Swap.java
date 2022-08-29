package Others;

/**
 *
 * @author Siam
 */
public class Swap {

    public static int getItself(int itself, int dummy) {
        return itself;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = getItself(b, b = a);
        b = getItself(a, a = b);
        System.out.println(a +" "+ b);
    }
}
