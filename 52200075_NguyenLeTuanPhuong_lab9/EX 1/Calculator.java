class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException() {
        super();
    }

    public NumberOutOfRangeException(String s) {
        super(s);
    }
}

public class Calculator {
    public static double divide(int a, int b) throws ArithmeticException {
        double s = 0.0;
        if(b == 0) {
            ArithmeticException obj = new ArithmeticException("divide by zero");
            throw obj;
        }
        else {
            s = (double)a / b;
        }
        return s;
    }

    public static int multiply(int a, int b) throws NumberOutOfRangeException {
        int s = 0;
        if(a > 1000 || b > 1000 || a < -1000 || b < -1000) {
            throw new NumberOutOfRangeException("Number is outside the computation");
        }
        else {
            s = a * b;
        }
        return s;
    }

    public static void main(String[] args) throws NumberOutOfRangeException {
        int a = 10;
        int b = 0;
        try {
            System.out.println(divide(a, b));
            System.out.println(divide(a, 0));
        } catch (ArithmeticException err) {
            System.out.println(err);
        }
        System.out.println(divide(a, 10));
        try {
            System.out.println(multiply(1001, 2));
        } catch (NumberOutOfRangeException err) {
            System.out.println(err);
        }
        System.out.println(multiply(1000, 2));
    }
}