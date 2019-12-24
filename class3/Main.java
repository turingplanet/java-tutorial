import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        conditionCheck();
        breakContinue();
    }

    public static void conditionCheck() {
        String name = "HELLO";
        if (name.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Not empty");
        }
    }

    static void breakContinue() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true) {
            System.out.print("Please enter a number: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                sum += num;
                System.out.println("sum = " + sum);
                continue;
            }
            scanner.nextLine();
            System.out.print("Do you want to continue?(Y/N): ");
            String response = scanner.nextLine();
            if (response.toLowerCase().charAt(0) == 'n') {
                break;
            }
        }
        System.out.println("Total sum = " + sum);
    }
}
