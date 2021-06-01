package com.onebill.java_basics.assignments;

import java.util.Scanner;
class Encoding{
	int len;
	int[] res;
	Encoding(int len){
		this.len=len;
		res=new int[len];
	}
	
	
	public void toEncode(char i,String alpha,int[] data,int j) {
		if(i==' ')
			res[j]=99;
		else {
			int index = alpha.indexOf(i);
			res[j]=data[index];
			
			
		}
			
	}
	public int[] toDisplay() {
		System.out.println("\n Ending Message : \n");
		for(int x=0;x<res.length;x++)
			System.out.print(" "+res[x]);
		return res;
	}
}
class Decoding{
	String res= "";
	public void toDecode(int i,String alpha,int[] data,int j) {
		if(i==99)
			res+=" ";
		else {
			res+=alpha.charAt(i);
		}
			
		
	}
	public String toDisplay() {
		return res;
	}
}
public class Cipher_Demo {

	public static void main(String[] args) {
		
		/*Encoding and Decoding
		 * 
		 *   char[] alpha = {'A'...'Z'}
		 *   int[] data = {0,...25}
		 *    char space =99
		 * 
		 */
		String alpha="";
		int[] data = new int[26];
		String user_input;
		int space = 99;
		int ch;
		char k='A';
		Scanner sc = new Scanner(System.in);
	
		for(int i=0;i<26;i++)
			data[i]=i;
		for(int i=0;i<26;i++) {
			alpha+=k;
			k++;
		}
		
		
		//display
			System.out.print(alpha);
		System.out.println();
		for(int x:data)
			System.out.print(" "+x);
		
		//Reading the Text
		
		System.out.println();
		System.out.println(" Enter the string : ");
		user_input = sc.nextLine();
		Encoding enc = new Encoding(user_input.length());
		Decoding dec = new Decoding();
		int[] res = new int[user_input.length()];
		System.out.println("Choose any one option : \n 1: Encoding \n 2: Decoding");
		ch = sc.nextInt();
		user_input=user_input.toUpperCase();
		switch(ch) {
		case 1 : //encoding
			
			for(int i=0,j=0;i<user_input.length();i++,j++) {
					enc.toEncode(user_input.charAt(i), alpha, data,j);
			}
			res=enc.toDisplay();
			//.out.println(" Encoding Message  : \n "+enc.toDisplay());
			break;
		case 2 : //decoding

			for(int i=0,j=0;i<user_input.length();i++,j++) {
					enc.toEncode(user_input.charAt(i), alpha, data,j);
			}
			res=enc.toDisplay();
			for(int i=0,j=0;i<res.length;i++,j++) {
			
				dec.toDecode(res[i], alpha, data,j);
		}
			System.out.println();
			System.out.println("\nDecoding Message: \n"+dec.toDisplay());
			
			break;
		default :
			System.out.println(" Wrong option");
			
		}
		
			
		
	}

}
