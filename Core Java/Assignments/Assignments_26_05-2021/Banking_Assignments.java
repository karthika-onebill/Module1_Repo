/*   
 *  Banking Application
 *  int amount = 2000
 *  Operations : 1) Credit => user_input (amount) =30 (Generate Exception for -ve inputs) => res: 2030
 *  			 2) Debit => user_input(amount) =1000 (Generate Exception amount beyond 1000) => res:1000
 *  			 3)Read Transcation History => (name credit/debit amount =res:balance)
 *  
 * 
 * 
 */

package com.onebill.java_basics.assignments;

import java.util.Scanner;

class Credit_Credentials extends Exception {

	public Credit_Credentials(String msg) {

		super(msg);

	}

}

class Credit {
	long credit_amount;
	Scanner scc = new Scanner(System.in);

	void input() {
		System.out.println("Enter the amount to credit : ");
		credit_amount = scc.nextLong();
	}

	boolean checkingConstraints() {
		boolean temp = true;
		try {
			if (credit_amount < 0)
				throw new Credit_Credentials("Please give valid amount");

		} catch (Credit_Credentials c) {
			temp = false;
			System.err.println(c.getMessage());
		}
		return temp;
	}

	long addAmount(long amount) {

		amount += credit_amount;
		return amount;

	}
}

class Debit {
	long debit_amount;
	Scanner ds = new Scanner(System.in);

	void input() {
		System.out.println("Enter the amount to debit : ");
		debit_amount = ds.nextLong();
	}

	boolean checkingConstraints(long amount) {
		boolean temp = true;
		try {
			if ((amount - debit_amount) <= 1000)
				throw new Credit_Credentials("Transcation Declined! \n Amount goes to beyond the money limit !");

		} catch (Credit_Credentials c) {
			temp = false;
			System.err.println(c.getMessage());
		}
		return temp;
	}

	long decAmount(long amount) {

		amount -= debit_amount;
		return amount;

	}

}


public class Banking_Assignments {

	public static void main(String[] args) {

		long amount = 1000; // initial amount 1000 (for opening account)
		int choice; // choices
		int exit = 1;
		
		// for mataining the Transcation History
		/*
		 * sl.no | operation | Old_amount | transcation amount | new_amount |
		 * 
		 * 1 | credit | 1000 | 23 | 1023
		 * 
		 * 2 | debit | 1023 | 23 | 1000
		 * 
		 */
		int[][] history = new int[10][4];
		int row_index = 0, column_index;
		Scanner sc = new Scanner(System.in);
		Credit credit = new Credit();
		Debit debit = new Debit();
		while (exit != 0) {

			System.out.println(
					"\n----------Welcome to ABC Bank Of India--------\n 1 : Credit \n 2 : Debit \n 3 : Transcation History \n 4: Balance Enquiry \n 5: Exit \n\nEnter the choice :");
			choice = sc.nextInt();
			switch (choice) {
			case 1: // Credit
				credit.input();
				boolean temp = credit.checkingConstraints();
				if (temp == true) {

					for (column_index = 0; column_index < 4; column_index++) {
						switch (column_index) {

						case 0: // 01 - operation
							history[row_index][column_index] = 0;
							break;
						case 1: // 02 - old amount
							history[row_index][column_index] = (int) amount;
							break;
						case 2: // 03 - new amount

							amount = credit.addAmount(amount);
							history[row_index][column_index] = (int) amount;
							break;
						}

					}
					row_index++;

					System.out.println("\nAccount Balance : " + amount);
				}

				break;
			case 2: // Debit
				debit.input();
				boolean temp1 = debit.checkingConstraints(amount);
				if (temp1 == true) {
					for (column_index = 0; column_index < 4; column_index++) {
						switch (column_index) {

						case 0: // 01 - operation
							history[row_index][column_index] = 1;
							break;
						case 1: // 02 - old amount
							history[row_index][column_index] = (int) amount;
							break;
						case 2: // 03 - new amount

							amount = debit.decAmount(amount);
							history[row_index][column_index] = (int) amount;
							break;
						}

					}
					row_index++;
					System.out.println("\nAccount Balance : " + amount);
				}
				break;
			case 3: // History
				System.out.println("operation | old amount | new amount |");
				for (int i = 0; i < row_index; i++) {
					if (history[i][0] == 0) {
						System.out.print("credit    |     ");
					} else {
						System.out.print("debit      | ");
					}
					for (int j = 1; j < 3; j++) {

						System.out.print(history[i][j] + "     | ");
					}
					System.out.println();
				}
				break;
			case 4: // balance
				System.out.println(" \n Your Account Balance :" + amount);

				break;
			case 5:
				// exit
				exit = 0;
				System.out.println("Thank you!");
				break;
			default:

				System.out.println("Try other choices!");
			}
		}

	}

}
