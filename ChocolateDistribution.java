import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistribution {
    public static int findMinDifference(int[] arr, int n, int m) {
        if (m == 0 || n == 0) {
            return 0;
        }
        
        Arrays.sort(arr);
        
        if (n < m) {
            return -1;
        }
        
        int minDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }
        
        return minDiff;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of elements in array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter number of students (m): ");
        int m = scanner.nextInt();
        
        int result = findMinDifference(arr, n, m);
        System.out.println("Minimum difference: " + result);
        
        scanner.close();
    }
}
