package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.confirm();
        account.deposit(10000);
        account.confirm();
        account.withdraw(9000);
        account.confirm();
        account.withdraw(2000);
        account.confirm();
    }
}
