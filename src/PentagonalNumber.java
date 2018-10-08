import java.util.Scanner;

public class PentagonalNumber {
    public static int getPentagonalNumber(int n) {
        int pentagonal = 0;
        pentagonal = (n * (3 * n - 1)) / 2;
        return pentagonal;
    }

    public static void main(String[] args) {
        int n;
        int number;
        boolean check = true;
        int selection;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Welcome!");
            System.out.println("1.Display N pentagonal numbers first in the pentagonal");
            System.out.println("2.Show the Nth pentagonal");
            System.out.println("0.Exit");
            System.out.println("Please choose one: ");
            selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Ranges of pentagonal: ");
                    n = scanner.nextInt();
                    System.out.println(n + " the first number in the Pentagonal is: ");
                    for (int i = 1; i <= n; i++) {
                        System.out.print(getPentagonalNumber(i) + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter number Nth: ");
                    number = scanner.nextInt();
                    System.out.println("Number " + number + "th" + " in the Pentagonal is: " + getPentagonalNumber(number));
                    break;
                case 0:
                    System.exit(0);

                default:
                    System.out.println("Invalid input");
                    check = false;
            }
        }
        while (!check);
    }
}
