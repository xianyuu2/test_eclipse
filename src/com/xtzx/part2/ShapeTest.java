package com.xtzx.part2;

public class ShapeTest 
{
	
	public static void main(String[] args) 
	{
		Circle x;
		x = new Circle();
		System.out.println(x);
		//默认的toString()方法返回
		//getClass().getName()+"@"+Integer.toHexString(hashCode());
		System.out.println(	"Radius is :"+x.radius);
		
		Rectangle y;
		y = new Rectangle();
		System.out.println(x+"  "+y);
	}
	private  static double area()
	{
		Circle c1;
		c1 = new Circle();
		c1.radius = 10;
		return c1.radius*c1.radius*c1.PI;
		
	}
	
	

}
