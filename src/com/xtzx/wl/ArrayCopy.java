package com.xtzx.wl;

public class ArrayCopy 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		char[] charArray1={'a','b','c','d','e','f','g','h','i'};
		char[] charArray2=new char[5];
		//复制数组
		//使用System.arraycopy方法
		System.arraycopy(charArray1, 2, charArray2, 0, 5);
		//从数组1中的第3位开始取5个元素到数组2中的第1-5个元素中
		System.out.println(new String(charArray2));
		System.out.println(charArray2[0]=='c');
		//==判断相等 ,= 赋值
	}

}
