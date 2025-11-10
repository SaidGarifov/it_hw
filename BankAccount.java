public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private String currency;
    private boolean isActive;
    public BankAccount(String accountNumber, String ownerName, double balance,String currency, boolean isActive) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.currency = currency;
        this.isActive = isActive;
    }
    public BankAccount(String accountNumber, String ownerName){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }
    public BankAccount(){
    }
    public String displayInfo(){
        String x = "Номер счета: " + accountNumber + "\nИмя владельца: " + ownerName + "\nБаланс: " + balance + "\nВалюта: " + currency + "\nАвтивность: " + isActive;
        return x;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount < balance) {
            balance -= amount;
        }
    }
    public void activateAccount(){
        isActive = true;
    }
    public void deactivateAccount(){
        isActive = false;
    }
}

