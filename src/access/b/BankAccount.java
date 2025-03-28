package access.b;

public class BankAccount {

    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    //public 메서드 : deposit
    public void deposit(int amount){
        if (isAmountValid(amount)){
            balance += amount;
        }
        else{
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    //public 메서드 :with draw
    public void withdraw(int amount){
        if(isAmountValid(amount)&& balance - amount >= 0){
            balance -= amount;
        }
        else{
            System.out.println("유효하지 않은 금액이거나 잔액입니다.");
        }
    }

    private boolean isAmountValid(int amount){
        //금액이 0보다 커야함
        return amount > 0;
    }

    public int getBalance() {
        return balance;
    }
}
