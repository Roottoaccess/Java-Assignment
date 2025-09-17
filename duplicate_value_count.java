import java.util.Scanner;

public class duplicate_value_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int lmt = sc.nextInt();

        // Initializing the array
        int arr[] = new int[lmt];
        System.out.println("Enter the values one by one: ");
        for (int i = 0; i < lmt; i++) {
            arr[i] = sc.nextInt(); // Taking input from user
        }

        // Display original array
        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        int count = 0;
        boolean visited[] = new boolean[lmt]; // track visited elements

        // Count duplicates
        for (int i = 0; i < lmt; i++) {
            if (visited[i]) continue; // already counted

            int freq = 1;
            for (int j = i + 1; j < lmt; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                    visited[j] = true;
                }
            }

            if (freq > 1) {
                System.out.println("Value " + arr[i] + " occurs " + freq + " times");
                count++;
            }
        }

        System.out.println("Total number of duplicate values: " + count);
    }
}
