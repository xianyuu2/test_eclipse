package com.xtzx.part2;

public class UnfixedLengthParam 
{
	static double  maxArea(Circle c,Rectangle... varRec) 
	{
		double maxarea0  = 0f;
		Rectangle[]  rec = varRec;
		
		for(int i =0 ;i< rec.length; i++)
		//for(Rectangle r: rec) 
		{
			if(rec[i].height*rec[i].width> maxarea0) 
			{
				maxarea0 = rec[i].height* rec[i].width;
				System.out.println("一阶段最大面积对象:\n\t 长方形对象"+i+1);
				}			
		}
		if(c.radius*c.radius*c.PI> maxarea0) 
		{
			System.out.println("进入二阶段:");
			maxarea0= c.radius*c.radius*c.PI;
			System.out.println("二阶段最大面积对象:圆对象");
		}
		return maxarea0;
	}
	public static void main(String[] args) 
	{
		Circle c1 = new Circle();
		c1.radius =10;
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.height = 30;
		r2.height = 5;
		r1.width = 4;
		r2.width = 6;
		System.out.println("c1 r1 r2中最大面积是:\n\t"+maxArea(c1, r1,r2));
		System.out.println("c1 面积是:\n\t"+c1.radius*c1.radius*c1.PI);
		System.out.println("r1 面积是:\n\t"+r1.height*r1.width);
		System.out.println("r2 面积是:\n\t"+r2.height*r2.width);
		System.out.println("\n-------------------------------------------");
		System.out.println("c1  r2中最大面积是:\n\t"+maxArea(c1,r2));
		System.out.println("\n-------------------------------------------");
		System.out.println("c1  中最大面积是:\n\t"+maxArea(c1));
		
		
	}

}
