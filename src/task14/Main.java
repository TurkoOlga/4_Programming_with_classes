package task14;

import java.util.ArrayList;
import java.util.List;

/*
4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.

 */
public class Main {
    public static void main(String[] args) {
        Bank bank = createBank();
        bank.blockAccount(1, 301402);
        bank.activateAccount(1, 301403);
        bank.getAllAccountsBalance(1);
        bank.getDebitBalance(1);
        bank.getCreditBalance(1);
        bank.findAccounts(2);
        bank.sortClientsById();
        bank.sortAccountsByBalance(2);
    }

    public static Bank createBank() {
        Client turko = createTurkoClient();
        Client shibkova = createShibkovaClient();

        Bank bank = new Bank();
        bank.addClient(shibkova);
        bank.addClient(turko);
        return bank;
    }

    private static Client createShibkovaClient() {
        List<Account> accountsShibkova = new ArrayList<>();
        Account accountOne = new Account(301412, 344, true);
        Account accountTwo = new Account(301666, -12, true);
        Account accountThree = new Account(301403, 2, false);
        accountsShibkova.add(accountOne);
        accountsShibkova.add(accountTwo);
        accountsShibkova.add(accountThree);

        return new Client(2, "Shibkova Olga", accountsShibkova);
    }

    private static Client createTurkoClient() {
        List<Account> accountsTurko = new ArrayList<>();
        Account accountOneTurko = new Account(301401, 234, true);
        Account accountTwoTurko = new Account(301402, -12, true);
        Account accountThreeTurko = new Account(301403, 2345, false);
        accountsTurko.add(accountOneTurko);
        accountsTurko.add(accountTwoTurko);
        accountsTurko.add(accountThreeTurko);

        return new Client(1, "Turko Olga", accountsTurko);
    }
}
