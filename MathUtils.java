public class MathUtils {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double divide(int a, int b) {
        if (b == 0) {
            return -1.0; // Handle division by zero
        }
        return (double) a / b;
    }
    
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();
        System.out.println("Addition: " + mathUtils.add(5, 3));
        System.out.println("Subtraction: " + mathUtils.subtract(5, 3));
        System.out.println("Multiplication: " + mathUtils.multiply(5, 3));
        System.out.println("Division: " + mathUtils.divide(6, 3));
    }
}
