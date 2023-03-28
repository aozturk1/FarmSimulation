public class Main {
    
    public static void main(String[] args) {

        System.out.println("Farming Simulator 2024");

    }
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Argument must be non-negative");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}