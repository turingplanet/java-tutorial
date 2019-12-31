import java.util.Scanner;

public class HW {

    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Please enter num1: ");
            int num1 = scanner.nextInt();
            System.out.print("Please enter num2: ");
            int num2 = scanner.nextInt();
            if(num1 > num2) {
                break;
            }
            for (int i = num1; i <= num2; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
