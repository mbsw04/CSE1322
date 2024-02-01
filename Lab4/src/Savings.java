public class Savings extends Account{
    Savings(float balance){
        setAccountBalance(balance);
    }
    private int deposit = 0;
    public int getDeposit(){
        return deposit;
    }
    @Override
    public void withdrawal(float x){
        if ((getAccountBalance()-x)<500.00f){
            setAccountBalance(getAccountBalance()-(x+10.00f));
        }else{
            setAccountBalance(getAccountBalance()-x);
        }
    }
    public void annual_interest(){
        float interest = getAccountBalance()*.015f;
        setAccountBalance(getAccountBalance()+interest);
        System.out.println("Customer earned "+interest+" in interest");
    }
    @Override
    public void deposit(float x){
        deposit++;
        System.out.println("This is deposit "+getDeposit()+" to this account");
        if(deposit>5){
            setAccountBalance((getAccountBalance()+x)-10.00f);
            System.out.println("Charging a fee of $10");
        }else{
            setAccountBalance(getAccountBalance()+x);
        }
    }
}
