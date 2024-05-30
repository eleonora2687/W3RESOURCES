public class SavingsAccount extends BankAccount{
    
    public SavingsAccount(int balance) {
        super(balance);
    }

    @Override
    public void deposit(int amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Deposit of $" + amount+" successful. Current balance: $ "+getBalance() );
        }
    }

    @Override
    public void withdraw(int amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
     
}
