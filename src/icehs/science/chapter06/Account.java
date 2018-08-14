package icehs.science.chapter06;

public class Account {
	String name;
	String number;
	int balance;
	
	void deposit(int money) {
		if (money<0) {
			System.out.println("음수 불가.");
		}else {
		System.out.println(money + "원을 입금합니다.");
		balance += money;
	}
	}
	void withdraw(int money) {
		if (money<0) {
			System.out.println("음수 불가.");
		}else if(money > balance) {
			System.out.println("잔액이 부족합니다.");
		}
		else {
		System.out.println(money + "원을 출금합니다.");
		balance -= money;
	}
	}
	void checkAccount() {
		System.out.println(name +number +balance);
	}
	void checkBalance() {
		System.out.println(balance);
	}
}
