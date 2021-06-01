package com.onebill.corejava.basics.Asessments;
class Sum1{
public int calculation1(int a,int b,int c) {
	int m;
	m=++a * 5;
	return m;
}
public int calculation2(int a,int b,int c) {
	int n;
	n=b++-c*2;
	return n;
}
}
class Sum2{
	int x,y,p;
	public Sum2() {
		this.x=10;
		this.y=2;
		this.p=2;
	}
	public int calculation3() {
		p*=x/y;
		return p;
	}
}

public class Arithmetic_calculation {

	public static void main(String[] args) {
		//Determine the value of the expression
		Sum1 sum1 = new Sum1();
		System.out.println("m=++a *5 => ans is : "+sum1.calculation1(5,2,1));
		System.out.println("n=b++ - c*2  => ans is : "+sum1.calculation2(5,2,1) );
		Sum2 sum2 = new Sum2();
		System.out.println("p*=x/y  =>  ans is : "+sum2.calculation3());
		
	}
}
