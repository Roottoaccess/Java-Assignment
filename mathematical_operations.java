import java.util.Scanner;
public class mathematical_operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.print("Enter your choice (a to c): ");
        char choice = sc.next().charAt(0);

        switch(choice){
            case 'a' -> {
                if (num > 0){
                    System.out.println("Positive number !");
                } else if (num < 0){
                    System.out.println("Negative number !!");
                } else {
                    System.out.println("The number is exactly 0 !!");
                }
            }
            case 'b' -> {
                if(num % 2 == 0){
                    System.out.println("Even number !!");
                } else {
                    System.out.println("Odd number !!");
                }
            }
            case 'c' -> {
                boolean isPrime = true;
                if(num <= 1){
                    isPrime = false;
                } else{
                    for(int i = 2; i < num; i++){
                        if(num % 2 == 0){
                            isPrime = false;
                            break;
                        }
                    }
                }
                if(isPrime){
                    System.out.println(num +" is a prime number !!");
                } else {
                    System.out.println(num +" is not a prime number !!");
                }
            }
            default -> {
                System.out.println("Enter the correct coice !!");
            }
        }
        System.out.print("Enter 3-digit number: ");
                int new_num = sc.nextInt();
                int sum = 0;int rem = 0;int rev = 0;
                while(new_num > 0){
                    rem = new_num % 10;
                    sum += rem;
                    rev = (rev * 10) + rem;
                    new_num = new_num / 10;
                }
                System.out.println("Sum of this three digit is: "+sum);
                System.out.println("The reverse of the number: "+rev);
    }
}
