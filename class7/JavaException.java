import java.io.FileWriter;
public class JavaException {
    public static void main(String[] args) {
        checkAge(17);
    }
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied: You must be at least 18 years old.");
        } else {
            System.out.println("Access granted: You are old enough!");
        }
    }
    public static void badCode() throws ArithmeticException, IndexOutOfBoundsException{
        System.out.println(0 / 1);
        int[] array = new int[]{1, 2};
        System.out.println(array[3]);
    }

}
