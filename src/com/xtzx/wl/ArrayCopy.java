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
		//��������
		//ʹ��System.arraycopy����
		System.arraycopy(charArray1, 2, charArray2, 0, 5);
		//������1�еĵ�3λ��ʼȡ5��Ԫ�ص�����2�еĵ�1-5��Ԫ����
		System.out.println(new String(charArray2));
		System.out.println(charArray2[0]=='c');
		//==�ж���� ,= ��ֵ
	}

}
