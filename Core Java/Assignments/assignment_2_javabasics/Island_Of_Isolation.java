package com.onebill.corejava.basics.Asessments;

public class Island_Of_Isolation {
	public static void main(String[] args) {
		/*Island of isolation : Two objects are referenced with each other - not reference with other class
		 * 
		 *  object a ref b
		 *  object b ref a  => both are island of isolation 
		 */
		
		Island_Of_Isolation i1 = new Island_Of_Isolation();

		Island_Of_Isolation i2= new Island_Of_Isolation();

		System.out.println("Before :");
		System.out.println("Object reference of i1 : "+i1);
		System.out.println("Object reference of i2 : "+i2);
		i1=i2;
		i2=i1; //island of isolation
		System.out.println("After :");
		System.out.println("Object reference of i1 : "+i1);
		System.out.println("Object reference of i2 : "+i2);
		System.gc(); //deallocate the memory		
		
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("pooling of memory!!");
	}

}
