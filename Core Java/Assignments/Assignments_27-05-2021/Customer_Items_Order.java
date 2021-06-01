/*
 *  Customer  -> can see all the items and its price of the restaurent
 *            -----------------------------
 *  			sl.n0  items           price/1 set
 *            ----------------------------
 *  			1.     Chickenfry      50RS
 *              2.     Muttonfry       74Rs
 *              3.     pizza           35Rs
 *             --------------------------
 *     
 *  		  -> select any items (  item_no quantity
 *                                    2       2/set
 *                                    1       5/set ) 
 *            -> get the bill
 * 
 * 
 */
package com.onebill.java_basics.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer_Items_Order {

	public static void main(String[] args) {
		// control variable
		int exit = 1;
		// user input
		// String[][] user_items = new String[11][3];
		ArrayList<String> user_items = new ArrayList<String>();
		// generate items -price list
		String[][] list_mat = new String[11][3];

		String[] items = { "SugarPupee", "Parotta-spicy", "MiniRice", "FruitsSalat", "Chicken-Fry", "KushKa-Briyani",
				"Mutton-kadai", "Fish_briyani", "RasaMalai", "PaniPoori" };
		int[] price = { 150, 34, 86, 90, 98, 55, 124, 50, 50, 67 };

		for (int i = 1; i <= 10; i++) {
			list_mat[i][0] = "" + i + ".";
			list_mat[i][1] = items[i - 1];
			list_mat[i][2] = "" + price[i - 1] + " Rs.";
		}

		// display the list items

		System.out.println("       Welcome to ABC Restaurent        \n");
		System.out.println(" ------------------------------------------------------");
		System.out.println("\n\tsl.no\tItems\t\tPrice");
		System.out.println(" ------------------------------------------------------");
		for (int i = 1; i <= 10; i++) {

			System.out.println("\n\t" + list_mat[i][0] + "\t" + list_mat[i][1] + "\t" + list_mat[i][2]);
		}
		// read the inputs from users
		int r = 0;
		int price_amount = 0;
		int quantity = 0;
		while (exit != 0) {
			Scanner sc = new Scanner(System.in);

			System.out.print("\n Enter the item no : ");
			int t = sc.nextInt();

			System.err.println("Your item is : " + items[t - 1]);
			System.out.print("\n Enter the quantity (how may sets ) : ");
			int s = sc.nextInt();
			user_items
					.add("" + (r + 1) + "." + "\t" + items[t - 1] + "\t" + s + " sets\t\t" + s * price[s - 1] + "Rs.");

			System.err.print("\n Your new price is : " + s * price[s - 1] + "Rs.");
			price_amount += s * price[s - 1];
			quantity += s;
			r++;
			System.out.print("\n Are you continue to purchase items ? (1 :yes ; 2: NO )");
			int ch = sc.nextInt();
			if (ch == 2) {
				// generate billing

				System.out.println(" ------------------------------------------------------");
				System.out.println("\n\tsl.no\tItems\t\tQuantity\t\tPrice");
				System.out.println(" ------------------------------------------------------");

				for (int i = 0; i < user_items.size(); i++) {

					System.out.println("\n\t" + user_items.get(i));

				}
				System.out.println(" ------------------------------------------------------");
				System.out.println("\t\t    Total sets :" + quantity + "   \tTotal amount :" + price_amount+"Rs.");
				System.out.println(" ------------------------------------------------------");

				System.out.println("Thank you for coming!!");
				exit = 0;
			}

		}

	}

}
