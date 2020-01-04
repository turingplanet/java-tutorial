public class Class2Main {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println(Math.max(num1, num2));
        System.out.println(Math.min(num1, num2));

    }

    public static void casting() {
        double num = 9.9;
        int intNum = (int)num;
        System.out.println(intNum);
    }

    public static void bitOperation() {
        int num1 = 1; // 001
        int num2 = 4; // 100
        System.out.println(num1 | num2);
    }

    public static void isString() {
        Main a = new Main();
        boolean isString = a instanceof Main;
        System.out.println(isString);
    }

    public static void stringFun() {
        String message = "Hello World";
        System.out.println(message.length());
        System.out.println(message.toUpperCase());
        System.out.println(message.indexOf("World"));
    }

    public static void mathFun() {
        System.out.println(Math.max(2, 20));
        System.out.println(Math.abs(-25));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.random());
    }
}
