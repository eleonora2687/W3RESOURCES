public abstract class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    protected void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return this.balance;
    }

    
    abstract void deposit(int amount);
    abstract void withdraw(int amount);
}
