public class Checking extends Account{
    Checking(float balance){
        setAccountBalance(balance);
    }
    @Override
    public void withdrawal(float x){
        if ((getAccountBalance()-x)<0){
            setAccountBalance(getAccountBalance()-(x+20.00f));
        }else{
            setAccountBalance(getAccountBalance()-x);
        }
    }
}
