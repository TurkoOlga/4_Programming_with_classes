package task14;

public class Account {
    private int number;
    private int balance;
    private boolean isActive;

    public Account(int number, int balance, boolean isActive) {
        this.number = number;
        this.balance = balance;
        this.isActive = isActive;
    }

    public int getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", balance=" + balance +
                ", isActive=" + isActive +
                '}';
    }

}
