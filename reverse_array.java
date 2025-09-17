import java.util.Scanner;
public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int lmt = sc.nextInt();

        int arr[] = new int[lmt];
        System.out.println("Enter the elements one by one......");
        for(int i = 0; i < lmt; i++){
            arr[i] = sc.nextInt();
        }

        // Displaying the elements......
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println("\nReversed array...."); // Reverse logic.....
        int length = lmt;
        for(int i = length; i > 0; i--){
            System.out.print(i+" "); // displaying the result.....
        }
    }
}
