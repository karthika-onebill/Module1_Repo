package com.onebill.corejava.basics.Asessments;

import java.util.Scanner;

public class Syntax_Display {
	public static void main(String[] args) {
		int ch,choice_seq,choice_it,choice_ju,i=1;
		do {
		System.out.println("Select any one option to know syntax of this : \n 1:Sequential \n 2:Iteration \n 3:Jumping \n 4: Exit \nEnter the choice :\n");
		Scanner sc = new Scanner(System.in);
		ch=sc.nextInt();
		
		switch(ch) {
		case 1: //selection
			System.out.println("Choose any one choice :\n 1:if-else\n 2: if-else-ladder\nEnter the choice :\n");
			choice_seq=sc.nextInt();
			switch(choice_seq) {
			case 1: //if-else
					System.out.println("if (condition) {");
					System.out.println("     // Block of statements");
					System.out.println("               }");

					System.out.println("else {");
					System.out.println(" // Block of statements");
					System.out.println("     }");
				break;
			case 2: //if-elseif-else
				System.out.println("if (condition) {");
				System.out.println("     // Block of statements");
				System.out.println("               }");
				System.out.println("else if (condition) {");
				System.out.println("     // Block of statements");
				System.out.println("                    }");

				System.out.println("else {");
				System.out.println(" // Block of statements");
				System.out.println("     }");
				break;
			default:
				System.out.println("Nothing matched!!");
			}
			break;
		case 2: //Iteration
			System.out.println("Enter the choice : \n 1 : for loop\n 2 : while loop\n 3: do-while loop\n");
			choice_it=sc.nextInt();
			switch(choice_it) {
			case 1 :  //for loop
				System.out.println(" for(initializtion;condition;modification");
				System.out.println("  {");
				System.out.println("         //block of statements");
				System.out.println("  }");
				
				break;
				
			case 2 : //while loop
				System.out.println(" while (cond)");
				System.out.println(" { ");
				System.out.println("     //block of statements");
				System.out.println(" }");
				break;
			case 3 :
					//do-while loop
				System.out.println(" do {");
				System.out.println("    // block of statements");
				System.out.println(" while(cond);");
				System.out.println("    }");
				break;
			default :
				System.out.println("Nothing matched!!");
		
			}
			
			break;
		case 3: //Jumping
			System.out.println("Enter the choice : \n 1 : Break \n 2 : Continue\n");
			choice_ju = sc.nextInt();
			switch(choice_ju) {
			case 1 : //Break
				System.out.println(" for(initializtion;condition;modification");
				System.out.println("  {");
				System.out.println("         //block of statements");

				System.out.println("if (condition) {");
				System.out.println("     break;");
				System.out.println("               }");
				System.out.println("  }");
				break;
			case 2 : //continue
				System.out.println(" for(initializtion;condition;modification");
				System.out.println("  {");
				System.out.println("         //block of statements");

				System.out.println("if (condition) {");
				System.out.println("     continue;");
				System.out.println("               }");
				System.out.println("  }");
				break;
			default :
				System.out.println("Nothing matched!!");
			}
			break;
		default :
			i=0;
			System.out.println("Exited");
			
		}
		}while(i!=0);
		
	}

}
