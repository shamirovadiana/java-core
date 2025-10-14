package lessons.lesson03;
public class BankAccount {
    private String fio;
    private String accountNumber;
    private long balance;
    public BankAccount(String fio, String accountNumber){
        this.fio = fio;
        this.accountNumber = accountNumber;
        this.balance = 0L;
    }
    public BankAccount(){}

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        if(balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Баланс не может принимать отрицательные значения!");
        }
    }
}

