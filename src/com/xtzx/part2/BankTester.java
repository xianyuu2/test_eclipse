package com.xtzx.part2;

public class BankTester 
{
	public static void main(String[] args) 
	{
		BankAccount a1 = new BankAccount();
		System.out.println("accountNumber:"+a1.accountNumber);
		System.out.println("OwnerName:"+a1.ownerName);
		System.out.println("Balance:"+a1.balance+"\n");
		//Ĭ�ϵĹ��췽��������ݳ�Ա��ʼ��Ϊnull(������)��0(��ֵ)
		
		//�Զ��幹�췽���뷽������
		//�����ɶ���ʱ�����췽�����ͳ�ʼֵ,Ϊ������г�ʼ��
		//���췽����������
		//һ��������һ�����ϵ�ͬ������,��������ͬ,��Ϊ����:��������,����,˳���κ�һ����ͬ�����������ͬ
		//ֻҪ��ʽ�������˹��췽��,�������Ͳ���������Ĭ�ϵĹ��췽��
		
		BankAccount2 a2 = new BankAccount2("xianyu",320125199912314811L,1.32F);
		System.out.println("accountNumber:"+a2.accountNumber);
		System.out.println("OwnerName:"+a2.ownerName);
		System.out.println("Balance:"+a2.balance);
		
		
		//final �����ĳ�ʼ��
		//ʵ������������ܱ�����Ϊfinal;
		//ʵ��final �������������ж���ʱ������ʼֵ,������ÿ�����췽������֮ǰ��ɳ�ʼ��
		//final�����������������ͬʱ���г�ʼ��
		
		
		
	}

}
