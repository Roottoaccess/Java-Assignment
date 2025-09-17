import java.util.Scanner;
public class operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2; System.out.println("Sum: "+sum);

        int bit_and = num1 & num2; System.out.println("Bitwise and: "+bit_and);

        int bit_or = num1 | num2; System.out.println("Bitwise or: "+bit_or);

        int bit_xor = num1 ^ num2; System.out.println("Bitwise xor: "+bit_xor);

        int left_shift = num1 << 2; System.out.println("Left shift: "+left_shift);

        int right_shift = num1 >> 3; System.out.println("Right shift: "+right_shift);

        // Logical and operation:
        if(num1 > 10 && num2 < 20){
            System.out.println("Logical And satisfied !");
        } else {
            System.out.println("Logical And not satisfied !");
        }

        // Logical or operation:
        if(num1 % 2 == 0 || num2 % 2 != 0){
            System.out.println("Logical Or satisfied !");
        } else {
            System.out.println("Logical Or not satisfied !");
        }
    }
}