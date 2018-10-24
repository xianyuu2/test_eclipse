package com.xtzx.wl;

import java.util.Arrays;

public class Array 
{
	public static void main(String[] args) 
	{
	//数组:使用统一名称,引用一组相同类型的数据	
	//java数组属于引用对象,数组中的数据称为数组对象的元素
	//可以通过索引值来访问数组中的某个元素(索引值取值范围: 0 ---> 数组长度-1),索引0代表数组中的第一个元素
	//可以声明任意数据类型的数组 如int型,String型
	//分为
	//一维数组
		int[] Array1;		//声明
		int Array2[];		//或这样声明
		Array1 = new int[5];//初始化
		//也可以声明与初始化合在一起写 int[] Array1 = new int[5];
		System.out.println(Arrays.toString(Array1));//输出[0,0,0,0,0]
		/*
		 * 在开辟数组对象内存空间后
		 * (声明并制定长度后,系统就开始分配内存,声明未制定长度,在使用时系统开始分配内存),
		 * java会为每一个数组元素进行初始化值的自动设置
		 * byte short int long类型统一初始化为0
		 * float double 类型统一初始化为0.0
		 * char类型数组元素统一初始化为'\u0000'(即为空字符)
		 * booleanl类型统一初始化为false
		 * 所有引用类数组(就是String[])元素统一初始化为null
		 */
		int[] a3  =  new int[]{1,2,3,4};
		int[] a4  = {5,6,7,8};
		System.out.println(Arrays.toString(a3));
		System.out.println(Arrays.toString(a4));
		//理论上数组最大长度length为2147483647;因为length为int型
		//int[] a5 = new int[2147483647];
		//但实际使用时,由于java虚拟机内存有限,所以一般不会用到这么长的数组
		
		//0长数组
		int[] a6 = new int[0];
		//数组长度不能为负数
		
		
		//数组索引
        int[] aa1 = {10,20,30,40,50};
        System.out.println(aa1[0]);//数组名[0]索引表示数组的第一个元素
        System.out.println(aa1[1]);
        System.out.println(aa1[2]);
        System.out.println(aa1[3]);
        System.out.println(aa1[4]);
        //System.out.println(aa1[5]);//不存在,会报错java.lang.ArrayIndexOutOfBoundsException: 5索引越界
        //用索引修改数组值
        aa1[2] = 300;
        System.out.println(aa1[2]);
 
        //栈到堆
        
        
	//二维数组
		int[][] doubarr1 = new int[3][4];//3行 4列
		//  	0	1	2	3
		//0		0	0	0	0
		//1		0	0	0	0
		//2		0	0	0	0
		doubarr1[1][2]= 12;		
		//  	0	1	2	3
		//0		0	0	0	0
		//1		0	0	12	0
		//2		0	0	0	0
		//{{0,0,0,0}, {0,0,12,0}, {0,0,0,0}}
		System.out.println(Arrays.toString(doubarr1[0]));
		System.out.println(Arrays.toString(doubarr1[1]));
		System.out.println(Arrays.toString(doubarr1[2]));
		doubarr1[1][3] = 10000;
		System.out.println(Arrays.toString(doubarr1[0]));
		System.out.println(Arrays.toString(doubarr1[1]));
		System.out.println(Arrays.toString(doubarr1[2]));
		
		int[][] doubarr2 = {{1,2,3,4}, {2,3,4,5},{3,4,5,6},{4,5,6,7} ,{5,6,7,8}};
		System.out.println(Arrays.toString(doubarr2[0]));
		System.out.println(Arrays.toString(doubarr2[1]));
		System.out.println(Arrays.toString(doubarr2[2]));
		System.out.println(Arrays.toString(doubarr2[3]));
		System.out.println(Arrays.toString(doubarr2[4]));
		
		//java也支持不规则的二维数组如:
		int[][] doubarr3 = {{1,}, {2,3},{4,5,6},{5,6,7,8}};
		System.out.println(Arrays.toString(doubarr3[0]));
		System.out.println(Arrays.toString(doubarr3[1]));
		System.out.println(Arrays.toString(doubarr3[2]));
		System.out.println(Arrays.toString(doubarr3[3]));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//多维数组
	}

}
