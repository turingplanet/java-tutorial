package class2;

public class Main {

    public static void main(String[] args) {
//        mathFun();
//        isString();
        double num = 9.9;
        int intNum = (int)num;
        System.out.println(intNum);
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
