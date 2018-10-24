package com.xtzx.part2;

public class Circle 
{
	static double PI = 3.14159265;
	int radius;
	
	public double circumference() 
	{
		return 2*PI*radius;
	}
		
	public void enlarge(int factor) 
	{
		radius *= factor;
	}
	
	public boolean fitsInside(Rectangle r1) 
	{
		return (2*radius < r1.width) && (2*radius < r1.height);
	}
	
	
}
