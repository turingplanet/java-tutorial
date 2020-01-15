public class Calculator {

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public static void main(String[] args) {
        int result = Calculator.multiply(3, 9);
        System.out.println(result); // 27
    }
}
