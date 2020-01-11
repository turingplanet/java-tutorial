import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
            if(response.toLowerCase().charAt(0) == 'n') {
                break;
            }
        }
        System.out.println("Total sum = " + sum);
    }

    public static void score1() {
        int score = 70;
        int reward;
        if(score >= 60) {
            reward = score * 2;
        } else {
            reward = 0;
        }
        System.out.println("Reward: " + reward);
    }

    public static void score2() {

    }

    public static void score3() {
        int score = 50;
        int reward = score >= 60 ? score * 2 : 0;
        System.out.println(reward);
    }

    public static void conditionCheck1() {
        boolean gameOver = true;
        if (gameOver) {
            System.out.println("You are dead :(");
        } else {
            System.out.println("Do you want to continue?");
        }
    }

    enum Membership { NORMAL, SILVER, GOLD, DIAMOND };

    public static void conditionCheck2() {
        Membership memberType = Membership.GOLD;
        int mealPrice = 1000, payment = 0;
        if (memberType == Membership.GOLD || memberType == Membership.DIAMOND) {
            payment = mealPrice * 8 / 10;
        } else if (memberType == Membership.SILVER) {
            payment = mealPrice * 9 / 10;
        } else {
            payment = mealPrice;
        }
        System.out.printf("You should pay $%s for the meal.\n", payment);
    }

    public static void switchCondition() {
        char grade = 'A';
        switch(grade) {
            case 'A':
                System.out.println("Great job!");
                break;
            case 'B':
            case 'C':
                System.out.println("Good job.");
                break;
            case 'D':
            case 'F':
                System.out.println("You can do better.");
                break;
            default:
                System.out.println("Unknown grade.");
        }
    }

    public static void loop1() {
        int i = 0;
        while(i < 5) {
            System.out.println(i);
            i++;
        }
    }

    public static void loop2() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }

    public static void forLoop() {
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for(int i = 0; i <= 10; i = i+2) {
            System.out.println(i);
        }

        String[] cars = {"Ford", "BMW", "Porsche", "Ferrari"};
        for(String car: cars) {
            System.out.println(car);
        }
    }

    public static void forLoop2() {
        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i * 10 + j);
            }
        }

        int[][] numMatrix = { {1, 2, 3, 4}, {5, 6, 7}, {8, 9, 10, 11, 12}};
        for(int i = 0; i < numMatrix.length; i++) {
            for(int j = 0; j < numMatrix[i].length; j++) {
                System.out.print(numMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void breakContinue1() {
        int[] nums = new int[]{3, 7, 4, 2, 9, 13, 22};
        for(int x: nums) {
            if(x >= 10) {
                break;
            }
            System.out.print(x + " ");
        }
    }

    public static void breakContinue2() {
        for(int i = 0; i <= 10; i++) {
            if(i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void breakContinue3() {
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
