public class CurrentAccount extends BankAccount {
    public CurrentAccount(int balance) {
        super(balance);
    }

    public void deposit(int amount) {
        if(amount > 0) {
            setBalance(getBalance()+amount);
            System.out.println("Deposit of "+amount+"$ succsseful. Current balance: "+getBalance()+"$");
        }

    }
    public void withdraw(int amount)
    {
        if(getBalance() - amount >=0) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of " + amount + " $ successful. Current balance: " + getBalance()+"$");

        }
    }
}
