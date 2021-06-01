package com.onebill.java_basics.assignments;

class NonInt_Exception1 extends Exception {
	NonInt_Exception1(String msg) {
		super(msg);
	}

}

public class NonInt_Exception {

	public static void main(String[] args) throws NonInt_Exception1 {
		// nested try-catch block
		int[] num = new int[] { 2, 4, 8, -16, 32, -64, 128, 256 };
		try {// outer try
			for (int i = 0; i < num.length; i++) {
				try {
					// inner try
					if (num[i] < 0) {
						throw new NonInt_Exception1(num[i] + " - is a negative value ");
					}

				} catch (NonInt_Exception1 e) {
					System.err.println(e.getMessage());

					// throw e;

				}

			} // end of for
		} // end of try
		catch (Exception e) {
			System.out.println("Invalid input Exception occured");
		}

	}

}
