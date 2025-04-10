import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number (a): ");
        int a = scanner.nextInt();

        // Calculate how many odd numbers to print
        int count = (a % 2 == 0) ? a - 1 : a;

        // Print first 'count' odd numbers
        int num = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(num);
            if (i < count - 1) {
                System.out.print(", ");
            }
            num += 2;
        }

        scanner.close();
    }
}
