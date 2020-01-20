public class Class4 {

    public static void main(String[] args) {
        Class4 class4 = new Class4();
        int num = sum(1, 1);
        System.out.println(num);
    }

    public static void myMethod() {
        System.out.println("Hello World!");
    }

    public static void printOppositeNum(int num) {
        System.out.println(0 - num);
    }

    public static void printName(String firstName, String lastName) {
        System.out.println("Full name: " + firstName + " " + lastName);
    }

    public static int plus5(int num) {
        return num + 5;
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public int sum2(int num1, int num2) {
        return num1 + num2;
    }
}
