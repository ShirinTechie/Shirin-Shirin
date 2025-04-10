import java.util.*;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input in bracketed format
        System.out.println("Enter numbers in format [1,2,3,...]:");
        String inputLine = scanner.nextLine();

        // Clean and split input
        inputLine = inputLine.replace("[", "").replace("]", "").replace(" ", "");
        String[] tokens = inputLine.split(",");

        // Convert to integer array
        int[] numbers = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            numbers[i] = Integer.parseInt(tokens[i]);
        }

        // Initialize result map
        Map<Integer, Integer> result = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        // Count divisibles
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }

        // Print full map in required format
        System.out.println(result);

        scanner.close();
    }
}
