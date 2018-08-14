package icehs.science.chapter06;

public class AccountTest {

	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.number = "123-456789";
		acc1.name ="ȫ�浿";
		acc1.balance = 10000;
		
		acc1.checkAccount();
		acc1.checkBalance();
		
		acc1.deposit(20000);
		acc1.checkBalance();
		
		System.out.println();
		
		acc1.withdraw(45000);
		acc1.checkBalance();
		

	}

}
