package com.xtzx.wl;

public class Variable 
{
	public static void main(String[] args) 
	{
		//声明在方法或小的程序块中的变量称为局部变量
		//声明在类的变量叫做实例变量
		int a;
		int b= 10;
		int c,d,e,f;
		int x = 10,y =20,z = 100;
		//局部变量在第一次使用之前,必须进行初始化
		a = 100;
		String a1 = "1";
		a = 100-25;
		System.out.println(a);
	    //基本数据类型存储在	虚拟机栈		中;
		//特点:容量小速度快
		
		
		//变量作用域:变量声明的代码块之内:最近的一对大括号
		int x1 = 10;
		{
			int y1 =20;
			System.out.println(x1);//可以访问x1
			System.out.println(y1);
		}
		System.out.println(x1);//可以访问x1
		//System.out.println(y1);//访问不了y1
		
		//常量	final;
		final int fin1 ;
		fin1 =1;
		//fin1 =2;//常量赋值后不能再被更改值,会报错
		System.out.println(fin1);
	    
		
		

		
		
	}
}
