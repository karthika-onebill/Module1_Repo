/*
 *  Banking operation 
 *  Deposit() = amount+deposit_amount
 *  withdraw() = amount-withdraw_amount
 *  balance
 * 
 * 
 */
package com.onebill.java_basics.assignments;

class Bank {
	int amount;

	synchronized void   toSync(int am, int type) {
		if (type == 1) {
			// deposit
			amount += am;
			System.out.println("After done Deposit Balance : " + amount);
		} else {
			// withdraw
			amount -= am;
			System.out.println("After done withdraw Balance : " + amount);
		}
	}

}

class Deposit extends Thread {
	int deposit_amount=1000;
	Bank bank;

	public Deposit(Bank b) {
		
		bank = b;
	}
	public void toinput(int am) {
		deposit_amount=am;
	}

	@Override
	public void run() {
		bank.toSync(deposit_amount, 1);

	}

}

class Withdraw extends Thread {
	int withdraw_amount=200;
	Bank bank;

	public  Withdraw(Bank b) {
		
		bank = b;
	}
	public void toinput(int am) {
		withdraw_amount =am;
	}
	@Override
	public void run() {
		bank.toSync(withdraw_amount, 2);

	}

}

public class Banking_Operation_sync {

	public static void main(String[] args) {
		Bank b = new Bank();
		Deposit deposit =new  Deposit(b);
		Withdraw withdraw = new Withdraw(b);
	//	deposit.toinput(1000);
		deposit.run();
		//withdraw.toinput(200);
		withdraw.run();
		//deposit.toinput(1000);
		deposit.run();
		//withdraw.toinput(200);
		withdraw.run();
		//deposit.toinput(1000);
		deposit.run();
		//withdraw.toinput(200);
		withdraw.run();
		//deposit.toinput(1000);
		deposit.run();
		//withdraw.toinput(200);
		withdraw.run();

	}

}
