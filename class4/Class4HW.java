import java.util.Arrays;

public class Class4HW {

    public static void main(String[] args) {
        int[] list1 = {1, 5, 8, 9};
        int[] list2 = {2, 4, 8, 1};
        int[] sumArray = sumArray(list1, list2); // {3, 9, 16, 10}
        System.out.println(Arrays.toString(sumArray));
    }

    public static int[] sumArray(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array1[i] + array2[i];
        }
        return newArray;
    }
}
