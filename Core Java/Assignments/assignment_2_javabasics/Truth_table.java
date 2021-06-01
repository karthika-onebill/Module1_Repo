package com.onebill.corejava.basics.Asessments;

import java.util.Scanner;

class Cal_Truth_Table{
	
	/* ------------------------
	 *   P    Q   P&Q
	 * ------------------------
	 *   T    T    T
	 *   T    F    F
	 *   F    T    F
	 *   F    F    F
	 * ----------------------
	 * 
	 */
	public void displayTable(String operation_symbol,int ch) {
	
		int res_table = 0;
		System.out.println("--------------------");
		System.out.println("    P    Q    "+operation_symbol);
		System.out.println("--------------------");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				if(ch==1) {
					//AND operation
					res_table=i&j;
					System.out.print((i==0)?"    F":"    T");

					System.out.print((j==0)?"    F":"    T");

					System.out.print((res_table==0)?"    F":"    T");
					System.out.println();
					
				}
				else if(ch==2) {
					//OR operation
					res_table=i|j;
					System.out.print((i==0)?"    F":"    T");

					System.out.print((j==0)?"    F":"    T");

					System.out.print((res_table==0)?"    F":"    T");
					System.out.println();
				}
				else if(ch==3) {
					res_table=i^j;
				System.out.print((i==0)?"    F":"    T");

				System.out.print((j==0)?"    F":"    T");

				System.out.print((res_table==0)?"    F":"    T");
				System.out.println();}
				else
					System.out.println("Not matched!");
				
			}
		}
		
		System.out.println("--------------------");
		
	}
}
public class Truth_table {

	public static void main(String[] args) throws Exception {
		int ch;
		Cal_Truth_Table a=new Cal_Truth_Table();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose any one operation to show Truth table :\n1 : AND \n2 :OR \n 3: EX-OR\n\nEnter the choice here :");
		ch =sc.nextInt();
		switch(ch) {
		case 1 : //truth table for AND operation
				a.displayTable("P & Q", 1);
				break;
		case 2 : //truth table for OR operation
			a.displayTable("P | Q", 2);
				break;
		case 3 : //truth table for EX-OR operation
			a.displayTable("P ^ Q", 3);
				break;
		default : //warning
				System.out.println("Your choices not exist");
		}
		sc.close();

	}
}
