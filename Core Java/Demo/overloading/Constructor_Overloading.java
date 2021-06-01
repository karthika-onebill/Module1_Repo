package com.onebill.corejava.basics.Asessments;
class Box{
	double width,height,breadth;
	public Box() {
		this.width=0.0;
		this.height=0.0;
		this.breadth=0.0;
	}
	public Box(double width)
	{
		this.width=width;
	}
	public Box(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	public Box(double width,double height,double breadth)
	{
		this.width=width;
		this.height=height;
		this.breadth=breadth;
	}
	@Override
	public String toString() {
		return "Box [width=" + width + ", height=" + height + ", breadth=" + breadth + "]";
	}
}



public class Constructor_Overloading {
	public static void main(String[] args) {
		
		Box b = new Box();
		Box b1 = new Box(24.5);
		Box b2 = new Box(2.3,12.6);
		Box b3 = new Box(2.5,12.34,34.6);

		System.out.println("Calling Default Constructor \n "+b.toString() );

		System.out.println("Calling Single parameter Constructor \n "+b1.toString() );
		System.out.println("Calling Two parameter Constructor \n "+b2.toString() );

		System.out.println("Calling Three parameter Constructor \n "+b3.toString() );
		
		
		
	}

}
