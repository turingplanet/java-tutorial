public class Class4 {

    public static void main(String[] args) {
//        myMethod();

//        printOppositeNum(-5);
//        printName("Wang", "Xiao");

//        System.out.println(plus5(5));
//        int num = 7;
//        if(isEven(num)) {
//            num = sum(num, 1);
//        } else {
//            num = sum(num, -1);
//        }
//        System.out.println(num);
        System.out.println(sum(1.1, 2.4));
        Class4 class4 = new Class4();
        System.out.println(class4.sum2(1, 2));
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
