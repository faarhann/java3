public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;

    }

    public void deposit(double amount) {
        this.balance += amount;

    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public static void transfer(Account from, Account to, double howMuch){
        to.balance += howMuch;
        from.balance -= howMuch;
    }


    public static void main(String[] args) {

        Account firstAcc = new Account("John", 100.0);
        Account mattsAccount = new Account("matt's account", 1000);
        Account myAccount = new Account("my account", 0);
        Account a = new Account("a", 100.0);
        Account b = new Account("b", 0.0);
        Account c = new Account("c", 0.0);

        Account.transfer(a, b, 50.0);
        Account.transfer(b, c, 25.0);

        System.out.println(a.balance);
        System.out.println(b.balance);

    }

}
