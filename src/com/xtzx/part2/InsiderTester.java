package com.xtzx.part2;

public class InsiderTester 
{
	public static void main(String[] args) 
	{
		Circle c1 = new Circle();
		c1.radius = 8 ;
		Circle c2 = new Circle();
		c2.radius = 15 ;
		
		Rectangle r2 = new Rectangle();
		r2.width = 20;
		r2.height = 30;
		
		System.out.println("Is c1 fits r2?\n\t:"+c1.fitsInside(r2));
		System.out.println("Is c2 fits r2?\n\t:"+c2.fitsInside(r2));
		
		//调用静态方法
		System.out.println(Converter.centigradeToFahrenheit(25));
	
		
	}

}
