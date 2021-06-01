package com.onebill.corejava.basics.Asessments;

public class Shifting_Operators {
	public static void main(String[] args) {
		// << - signed Right shift ( allocate 1bit for MSB ( 0 - +ve ; 1 - -ve )
		// >>- signed Left shift ( allocate 1bit for MSB ( 0 - +ve ; 1 - -ve )
	
		// >>>- unsigned Left shift (no msb)
		int a=5;
		//System.out.println("<< "+(a<<2));
		System.out.println(">> "+(a>>2));
		System.out.println(">>> "+(a>>>2));
	}

}
