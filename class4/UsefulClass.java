import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsefulClass {

    public static void main(String[] args) {
        arrays();
    }
    public static void arrays() {
        Integer[] array = {5, 7, 6, 3, 4, 2, 1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        List<Integer> arrayList = Arrays.asList(array);
        System.out.println("This is awesome");
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }

    public static void string() {
        String str = "  Hello World    ";
        str = str.trim();
        System.out.println(str);
        str = str.replace("World", "Enoch");
        System.out.println(str);
        str = str.substring(6, 11);
        System.out.println(str);
        char[] charArray = str.toCharArray();
        System.out.println(Arrays.toString(charArray));
    }

    public static void maths() {
        double num1 = 14, num2 = 9.345;
        double minNum = Math.min(num1, num2);
        System.out.println(minNum);
        minNum = Math.floor(minNum);
        System.out.println(minNum);
        minNum = Math.sqrt(minNum);
        System.out.println(minNum);
        minNum = Math.pow(minNum,3);
        System.out.println(minNum);
    }

}
