/*import java.util.*;

public class MemorizeMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number of numbers shown to the team
        System.out.println("Enter the aare size ");
        int N = scanner.nextInt();
        
        // Input the numbers shown to the team
        System.out.println("Please enter the numbers separated by space:");
        int[] numbers = new int[N];
        try {
            for (int i = 0; i < N; i++) {
                numbers[i] = scanner.nextInt(); +
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers only.");
            scanner.close();
            return;
        }
        
        // Input number of queries
        System.out.println("Please enter the total number of queries:");
        int Q;
        try {
            Q = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer for the total number of queries.");
            scanner.close();
            return;
        }
        
        // Process queries
        for (int i = 0; i < Q; i++) {
            System.out.println("Please enter the number for query " + (i + 1) + ":");
            int query;
            try {
                query = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer for the query.");
                scanner.close();
                return;
            }
            int count = countOccurrences(numbers, query);
            if (count == 0) {
                System.out.println("NOT PRESENT");
            } else {
                System.out.println("Number of occurrences of " + query + ": " + count);
            }
        }
        
        scanner.close();
    }
    
    // Function to count occurrences of a number in an array
    private static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}*/

 