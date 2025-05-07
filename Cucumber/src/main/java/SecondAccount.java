public class SecondAccount {
    private String firstname;
    private long accountNumber;
    private int balance;

    public SecondAccount(String firstname, int balance, long accountNumber) {
        this.firstname = firstname;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
