
public abstract class AccountHolder {
    private String name;
    private double income;
    private int accountNumber;

    public abstract void downPayment();

    public void setName( String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setIncome(int income){
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
}
