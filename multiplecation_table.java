import java.util.Scanner;
public class multiplecation_table {
    // Defining a static class for implementing the logic....
    static void multiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to display (multiplecation-table): ");
        int num = sc.nextInt(); // Taking the number as input....

        System.out.print("Enter the limit: "); // Limit -> till which number you want the output...
        int lmt = sc.nextInt();
        int result = 0;
        if(num > 0){ // checking if the number is negetive or not....
            for(int i = 1; i <= lmt; i++){ // Logic behing the program....
                result = i * num;
                System.out.println(num+" X "+i+" = "+result); // Displaying the result....
            }
        } else { // Handling the negative number problem....
            System.out.println("Only positive numbers are allowed to print.....");
        }
    }
    public static void main(String[] args) {
        multiplecation_table.multiplication(); // Its a static class calling it with the Class name itself
    }
}