package com.xtzx.wl;

import java.util.Arrays;

public class Array 
{
	public static void main(String[] args) 
	{
	//����:ʹ��ͳһ����,����һ����ͬ���͵�����	
	//java�����������ö���,�����е����ݳ�Ϊ��������Ԫ��
	//����ͨ������ֵ�����������е�ĳ��Ԫ��(����ֵȡֵ��Χ: 0 ---> ���鳤��-1),����0���������еĵ�һ��Ԫ��
	//�������������������͵����� ��int��,String��
	//��Ϊ
	//һά����
		int[] Array1;		//����
		int Array2[];		//����������
		Array1 = new int[5];//��ʼ��
		//Ҳ�����������ʼ������һ��д int[] Array1 = new int[5];
		System.out.println(Arrays.toString(Array1));//���[0,0,0,0,0]
		/*
		 * �ڿ�����������ڴ�ռ��
		 * (�������ƶ����Ⱥ�,ϵͳ�Ϳ�ʼ�����ڴ�,����δ�ƶ�����,��ʹ��ʱϵͳ��ʼ�����ڴ�),
		 * java��Ϊÿһ������Ԫ�ؽ��г�ʼ��ֵ���Զ�����
		 * byte short int long����ͳһ��ʼ��Ϊ0
		 * float double ����ͳһ��ʼ��Ϊ0.0
		 * char��������Ԫ��ͳһ��ʼ��Ϊ'\u0000'(��Ϊ���ַ�)
		 * booleanl����ͳһ��ʼ��Ϊfalse
		 * ��������������(����String[])Ԫ��ͳһ��ʼ��Ϊnull
		 */
		int[] a3  =  new int[]{1,2,3,4};
		int[] a4  = {5,6,7,8};
		System.out.println(Arrays.toString(a3));
		System.out.println(Arrays.toString(a4));
		//������������󳤶�lengthΪ2147483647;��ΪlengthΪint��
		//int[] a5 = new int[2147483647];
		//��ʵ��ʹ��ʱ,����java������ڴ�����,����һ�㲻���õ���ô��������
		
		//0������
		int[] a6 = new int[0];
		//���鳤�Ȳ���Ϊ����
		
		
		//��������
        int[] aa1 = {10,20,30,40,50};
        System.out.println(aa1[0]);//������[0]������ʾ����ĵ�һ��Ԫ��
        System.out.println(aa1[1]);
        System.out.println(aa1[2]);
        System.out.println(aa1[3]);
        System.out.println(aa1[4]);
        //System.out.println(aa1[5]);//������,�ᱨ��java.lang.ArrayIndexOutOfBoundsException: 5����Խ��
        //�������޸�����ֵ
        aa1[2] = 300;
        System.out.println(aa1[2]);
 
        //ջ����
        
        
	//��ά����
		int[][] doubarr1 = new int[3][4];//3�� 4��
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
		
		//javaҲ֧�ֲ�����Ķ�ά������:
		int[][] doubarr3 = {{1,}, {2,3},{4,5,6},{5,6,7,8}};
		System.out.println(Arrays.toString(doubarr3[0]));
		System.out.println(Arrays.toString(doubarr3[1]));
		System.out.println(Arrays.toString(doubarr3[2]));
		System.out.println(Arrays.toString(doubarr3[3]));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//��ά����
	}

}
