package com.onebill.java_basics.assignments;

import java.util.Scanner;

public class Jagged_Array_rider {

	public static void main(String[] args) {
		//Jagged array rider
		int temp=1;
		int[][] riders = new int[2][]; //1 - weekday; 2 - weekend
		String[] weekday_string = {"Monday","Tuesday","Wednesday","thursday","Friday"};
		String[] weekend_string = {"Saturday","Sunday"};
		riders[0] = new int[5];  // monday tuesday wednesday thurs fri
		riders[1] = new int[2];// sat sun
		Scanner sc = new Scanner(System.in);
		while(temp==1) {
		System.out.println(" Are you a rider ?\n ( 1: Yes  0: No)");
		int rider_choice = sc.nextInt();
		
		if(rider_choice==1) {
			System.out.println("Which one you prefered ? \n (1: WeekDays 2 :WeekEnds 3:Display");
			int ch1 = sc.nextInt();
			switch(ch1) {
			case 1 :
				   //weekdays

				for(int i=0;i<riders[0].length;i++) {
				System.out.println("Enter your Km :"+weekday_string[i]);
				int km = sc.nextInt();

					riders[0][i]=km;
					System.out.println(riders[0][i]);
				}
				
				break;
			case 2 :
				//weekends

				for(int i=0;i<riders[1].length;i++) {
				System.out.println("Enter your Km :"+weekend_string[i]);
				int km = sc.nextInt();

					riders[1][i]=km;
					System.out.println(riders[1][i]);
				}
				break;
			case 3:
				//display
				System.out.println(" Week Days Riders Km's");
				for(int i=0;i<riders[0].length;i++)
					System.out.print(" "+riders[0][i]);
				System.out.println();
				System.out.println(" Week End Riders Km's");
				for(int i=0;i<riders[1].length;i++)
					System.out.print(" "+riders[1][i]);
				
				break;
			default :
				System.out.println("Wrong choices");
				break;
			}
			
		}
		else {
			System.out.println("Sorry! Riders only allowed!\n Are u continue ? \n(1 :Yes 0: No)");
			int ch = sc.nextInt();
			if(ch==0)
				temp=0;
				
		}
		}
	}

}
