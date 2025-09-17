import java.util.Scanner;

public class RemoveDuplicates {
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

        // Logic to remove duplicates
        int temp[] = new int[lmt];
        int newLength = 0;

        for (int i = 0; i < lmt; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < newLength; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[newLength] = arr[i];
                newLength++;
            }
        }

        // Print array without duplicates
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
