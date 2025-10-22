package lessons.lesson03;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BankSystem {
    public BankSystem(){
        accountMap = new HashMap<>();
    }
    private final Map<String,BankAccount> accountMap;
    public void addAccount(String fio, String accountNumber){
        BankAccount account = new BankAccount(fio, accountNumber);
        accountMap.put(fio, account);
    }
    public void deleteAccount(String fio){
        accountMap.remove(fio);
    }
    public void getAccountInfo(String fio){
        String accountNumber = accountMap.get(fio).getAccountNumber();
        long balance = accountMap.get(fio).getBalance();
        System.out.println(String.format("ФО: %s Лицевой счёт: %s Баланс: %s", fio, accountNumber, balance));
    }

    public void deposit(final String fio, final long amount){
        final BankAccount account;
        if(accountMap.containsKey(fio)){
            account = accountMap.get(fio);
        }else {
            account = new BankAccount(fio, UUID.randomUUID().toString());
            accountMap.put(fio,account);
            System.out.println(String.format("Счёт пополнен на %s. Баланс составляет %s", amount, account.getBalance()));
        }
        account.setBalance(account.getBalance() + amount);
    }
    public void withdraw(final String fio, final long amount){
        final BankAccount account;
        if(accountMap.containsKey(fio)){
            account = accountMap.get(fio);
            long balance = account.getBalance();
            if(amount <= balance) {
                account.setBalance(balance - amount);
                System.out.println(String.format("Обналичено %s. Баланс составляет %s", amount, account.getBalance()));
            }else{
                System.out.println(String.format("Недостаточно денег на счету. Обналичьте сумму меньше"));;
            }
        } else {
            System.out.println("Данного счёта не существует!");
        }

    }
    public void getBalance(final String fio){
        final BankAccount account;
        if(accountMap.containsKey(fio)) {
            account = accountMap.get(fio);
            System.out.println(String.format("Баланс составляет %s", account.getBalance()));
        }else{
            System.out.println("Такого счёта не существует!");
        }
    }
    public void transferMoneyBetweenAccounts(final String senderFio, final String receiverFio, final long amount){
        final BankAccount sender;
        final BankAccount receiver;
        if(accountMap.containsKey(senderFio) && accountMap.containsKey(receiverFio)){
            sender = accountMap.get(senderFio);
            receiver = accountMap.get(receiverFio);
            long senderBalance = sender.getBalance();
            long receiverBalance = receiver.getBalance();
            if(amount <= senderBalance){
                senderBalance -= amount;
                receiverBalance += amount;
                sender.setBalance(senderBalance);
                receiver.setBalance(receiverBalance);
                System.out.println(String.format("Успешно переведено %s на счёт %s. Баланс составляет %s", amount, receiverFio, senderBalance));
            }
            else{
                throw new RuntimeException("Недостаточно средств на счету!");
            }
        }
    }

}

