import java.util.Scanner;
public class matrics_addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter the row: ");
        int row = sc.nextInt();
        System.out.print("Enter the column: ");
        int col = sc.nextInt();

        // Creating the array of 2 Dimention.....
        int arr1[][] = new int[row][col];
        // Taking the input of the array from the users....
        System.out.println("Enter the elements one by one of 1st matrix......");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The first array.......");
        // Displaying the array.........
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        int arr2[][] = new int[row][col];
        // Taking the input from the user to the second array....
        System.out.println("Enter the elements one by one of 2nd matrix......");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("The second array.......");
        // Displaying the array.........
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        // Addign the 2 -> 2-D Matrix.....
        int add_matrix[][] = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                add_matrix[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        // Displaying the additional result......
        System.out.println("After adding the two matrix......");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(add_matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}