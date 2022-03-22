import java.util.Scanner;

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("bhavya",100000);

        System.out.println("choose an option");
        System.out.println("1. To know the owner of the account");
        System.out.println("2. To know the balance in the account");
        System.out.println("3. To deposite amount");
        System.out.println("4. To withdraw an amount");
        System.out.println("5. exit");

        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        while(option <= 4) {

            switch (option) {
                case 1:
                    System.out.println("The owner of account is : " + account.getOwner());
                    break;

                case 2:
                    System.out.println("The balance of account is : " + account.getBalance());
                    break;

                case 3:
                    System.out.println("Enter amount to be deposited:");
                    int depositeAmount = scan.nextInt();
                    account.deposit(depositeAmount);
                    System.out.println("Successfully deposited amount");
                    break;

                case 4:
                    System.out.println("Enter amount to withdraw:");
                    int withdrawAmount = scan.nextInt();
                    account.withDraw(withdrawAmount);
                    System.out.println("Successfully withdrawed amount");
                    break;

            }

            option = scan.nextInt();

        }

    }
}
