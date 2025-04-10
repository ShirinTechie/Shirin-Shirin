import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // For user input

        System.out.print("Enter number of odd terms (a): ");
        int a = scanner.nextInt();

        int count = 0;
        int num = 1; // Starting from first odd number

        while (count < a) {
            System.out.print(num + " ");
            num += 2;  // Next odd number
            count++;
        }
    }
}
