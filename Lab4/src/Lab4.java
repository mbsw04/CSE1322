import java.util.Scanner;
public class Lab4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Checking checking = new Checking(0);
        Savings savings = new Savings(0);

        while (true){
            System.out.println("1. Withdraw from Checking");
            System.out.println("2. Withdraw from Savings");
            System.out.println("3. Deposit to Checking");
            System.out.println("4. Deposit to Savings");
            System.out.println("5. Balance of Checking");
            System.out.println("6. Balance of Savings");
            System.out.println("7. Award Interest to Savings now");
            System.out.println("8. Quit");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice){
                case 1 -> {
                    System.out.println("How much would you like to withdraw from Checking?");
                    float amount = scan.nextFloat();
                    checking.withdrawal(amount);
                }
                case 2 -> {
                    System.out.println("How much would you like to withdraw from Savings?");
                    float amount = scan.nextFloat();
                    savings.withdrawal(amount);
                }
                case 3 -> {
                    System.out.println("How much would you like to deposit into Checking?");
                    float amount = scan.nextFloat();
                    checking.deposit(amount);
                }
                case 4 -> {
                    System.out.println("How much would you like to deposit into Savings?");
                    float amount = scan.nextFloat();
                    savings.deposit(amount);
                }
                case 5 -> {
                    System.out.println("Your balance for checking "+checking.getAccountNumber()+" is "+checking.getAccountBalance());
                }
                case 6 -> {
                    System.out.println("Your balance for checking "+savings.getAccountNumber()+" is "+savings.getAccountBalance());
                }
                case 7 -> {
                    savings.annual_interest();
                }
                case 8 -> {
                    System.exit(0);
                }
            }
        }
    }
}