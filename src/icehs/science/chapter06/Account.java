package icehs.science.chapter06;

public class Account {
	String name;
	String number;
	int balance;
	
	void deposit(int money) {
		if (money<0) {
			System.out.println("���� �Ұ�.");
		}else {
		System.out.println(money + "���� �Ա��մϴ�.");
		balance += money;
	}
	}
	void withdraw(int money) {
		if (money<0) {
			System.out.println("���� �Ұ�.");
		}else if(money > balance) {
			System.out.println("�ܾ��� �����մϴ�.");
		}
		else {
		System.out.println(money + "���� ����մϴ�.");
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
