package oop1.ex;

public class Account {

    int balance; //잔액

    void deposit(int amount){
        this.balance += amount;
        System.out.println(amount+"원 입금 완료");
    }

    void withdraw(int amount){

        if(this.balance<amount){
            System.out.println("출금 잔액이 부족합니다 현재 잔액: "+this.balance);
        }
        else{
            this.balance -= amount;
            System.out.println(amount+"원 출금 완료");
        }
    }
    void confirm(){
        System.out.println("계좌 잔액: "+balance+"원");
    }


}
