public class Calculator {
    int a = 10.0;
    public double add(double x, double y) {
        return x + y;
    }
    
    public double subtract(double x, double y) {
        return x - y;
    }
    
    public double multiply(double x, double y) {
        return x * y;
    }
    
    public double divide(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return x / y;
    }
}


public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double result = calc.multiply(4, 2);
        System.out.println(result);  // Output: 8.0
    }
}