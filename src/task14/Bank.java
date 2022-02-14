package task14;

import java.util.*;

public class Bank {
    private Map<Integer, Map<Integer, Account>> allAccounts = new HashMap<>();

    public void addClient(Client client) {
        Map<Integer, Account> clientAccounts = new HashMap<>();
        List<Account> accounts = client.getAccounts();
        for (Account account : accounts) {
            clientAccounts.put(account.getNumber(), account);
        }
        allAccounts.put(client.getId(), clientAccounts);
    }

    public void blockAccount(int clientId, int accountNumber) {
        Map<Integer, Account> clientAccounts = allAccounts.get(clientId);
        Account account = clientAccounts.get(accountNumber);
        account.setActive(false);
    }

    public void activateAccount(int clientId, int accountNumber) {
        Map<Integer, Account> clientAccounts = allAccounts.get(clientId);
        Account account = clientAccounts.get(accountNumber);
        account.setActive(true);
    }

    public int getAllAccountsBalance(int clientId) {
        Map<Integer, Account> clientAccounts = allAccounts.get(clientId);
        List<Account> accounts = new ArrayList<>(clientAccounts.values());
        int balance = 0;
        for (Account account : accounts) {
            balance += account.getBalance();
        }
        return balance;
    }

    public int getDebitBalance(int clientId) {
        Map<Integer, Account> clientAccounts = allAccounts.get(clientId);
        List<Account> accounts = new ArrayList<>(clientAccounts.values());
        int balance = 0;
        for (Account account : accounts) {
            if (account.getBalance() > 0 || account.getBalance() == 0)
                balance += account.getBalance();
        }
        return balance;
    }

    public int getCreditBalance(int clientId) {
        Map<Integer, Account> clientAccounts = allAccounts.get(clientId);
        List<Account> accounts = new ArrayList<>(clientAccounts.values());
        int balance = 0;
        for (Account account : accounts) {
            if (account.getBalance() < 0)
                balance += account.getBalance();
        }
        return balance;
    }

    public Map<Integer, Account> findAccounts(int clientId) {
        return allAccounts.get(clientId);
    }

    public Map<Integer, Map<Integer, Account>> sortClientsById() {
        return new TreeMap<>(allAccounts);
    }

    public Map<Integer, Account> sortAccountsByBalance(int balance) {
        Map <Integer, Account> result = new HashMap<>();
        Collection<Map<Integer, Account>> clientAccount = allAccounts.values();
        for (Map<Integer, Account> accountMap : clientAccount) {
            List<Account> eachClientAccounts = new ArrayList<>(accountMap.values());
            for (Account eachClientAccount : eachClientAccounts) {
                if (eachClientAccount.getBalance() > balance) {
                    result.put(eachClientAccount.getNumber(), eachClientAccount);
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "allAccounts=" + allAccounts +
                '}';
    }


}
