package com.onebill.corejava.basics;

class Inputs{
	
	double width,height,depth,volume;
	public Inputs() {
		this.width=0.0;
		this.height=0.0;
		this.depth=0.0;
		this.volume=0.0;
	}
	public Inputs(double width,double height,double depth) {
		this();
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	@Override
	public String toString() {
		return "width=" + width + "\n height=" + height + "\n depth=" + depth + "\n Volume = "+volume;
	}
	
	public double calculateVolume() {
		volume=width*height*depth;
		
		return volume;
	}
	
}

public class Box {

	public static void main(String[] args) {
		Inputs input1=new Inputs(100,2.0,45.7);
		input1.calculateVolume();
		System.out.println(input1.toString());
		
		
		
	}
}
