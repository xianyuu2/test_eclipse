package com.xtzx.wl;

public class DubleArray 
{
	public static void main(String[] args) 
	{
		//int[][] doubArray = new int[3][5];
		int[][] doubArray = 
		{{1,2,3,4,5},{1,3,5,7,9},{2,4,6,8,0}};
		
		System.out.println("数组doubArray[][]中的第2,3个元素为"+doubArray[1][2]+"\n");
		
		int[][] doubArray2 = 
		{{1,2,4},{3,5,2,4},{88,5,6,3,34}};
		
		System.out.println("二维数组doubArray[][]的长度为:"+doubArray2.length);
		
		System.out.println("一维数组doubArray[0]的长度为:"+doubArray2[0].length);
		System.out.println("一维数组doubArray[1]的长度为:"+doubArray2[1].length);
		System.out.println("一维数组doubArray[2]的长度为:"+doubArray2[2].length);
		System.out.println("可见二维数组就是由一维数组构成的数组");
		System.out.println("二维数组doubArray的元素个数为:"
				+((int)doubArray2[0].length
						+(int)doubArray2[1].length
						+(int)doubArray2[2].length));
		System.out.println("二维数组doubArray的长度不等于其所含元素个数,而是等于所含一维数组个数,也叫行数");
	}

}
