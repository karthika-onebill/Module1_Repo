package com.onebill.corejava.basics;

class Inputs {

	double width, height, depth, volume;

	public Inputs() {
		this.width = 0.0;
		this.height = 0.0;
		this.depth = 0.0;
		this.volume = 0.0;
	}

	public Inputs(double width, double height, double depth) {
		this();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}


}

class Calculate_Volume extends Inputs {
	public double calculateVolume() {
		volume = width * height * depth;

		return volume;
	}
	@Override
	public String toString() {
		return "Inputs [width=" + width + ", height=" + height + ", depth=" + depth + "]" + "Volume = " + volume;
	}

}

public class Box_Class {
	public static void main(String[] args) {
		Inputs input1 = new Inputs(100, 2.0, 45.7);
		Calculate_Volume cv = new Calculate_Volume();
		cv.calculateVolume();

		System.out.println(cv.toString());

	}
}
