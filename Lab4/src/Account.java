public class Account {
    private int accountNumber;
    private static int next_accountNumber = 10001;
    private float accountBalance;
    Account(){
        accountNumber = next_accountNumber;
        next_accountNumber++;
        accountBalance = 0.00f;
    }
    Account(float balance){
        accountNumber = next_accountNumber;
        next_accountNumber++;
        accountBalance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public float getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(float new_Balance){
        accountBalance = new_Balance;
    }
    public void withdrawal(float x){
        accountBalance -= x;
    }
    public void deposit(float x){
        accountBalance += x;
    }
}
