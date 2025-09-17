import java.util.Scanner;

class BankingSystem {
    int balance = 0;
    public void activities(int deposit, int withdraw) {
        if (withdraw <= deposit) {
            balance = deposit - withdraw;
            System.out.println("Transaction successful (without balance check)!");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Transaction failed! Withdraw amount is greater than deposit.");
        }
    }

    public void activities(int deposit, int withdraw, boolean checkBalance) {
        if (withdraw <= deposit) {
            balance = deposit - withdraw;
            System.out.println("Transaction successful (with balance check)!");
            System.out.println("Correct balance is: " + balance);
        } else {
            System.out.println("Transaction not successful!");
        }
    }

    public void activities() {
        System.out.println("Balance (from parent class): " + balance);
    }
}

// Derived class
class Display extends BankingSystem {
    @Override
    public void activities() {
        System.out.println("The current balance (from child class) is: " + balance);
    }
}

// Main class
public class obj_clss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the deposit amount: ");
        int deposit = sc.nextInt();

        System.out.print("Enter the withdraw amount: ");
        int withdraw = sc.nextInt();

        BankingSystem obj = new BankingSystem();
        obj.activities(deposit, withdraw);
        obj.activities(deposit, withdraw, true); 

        Display obj1 = new Display();
        obj1.activities();                          
    }
}
