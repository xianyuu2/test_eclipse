package com.xtzx.part2;

public class BankAccount2 
{
		String ownerName;
		long accountNumber;
		float balance;
		
		
		
		
		public  BankAccount2(String initName,long  initAccountNumber,float  initBalance) 
		{
			ownerName = initName;
			accountNumber = initAccountNumber;
			balance = initBalance;
		}
		
		public  BankAccount2(String initName,long  initAccountNumber) 
		{
			this(initName,initAccountNumber,0.0f);
		}
		
		public  BankAccount2()
		{
			this("",99999,0.0f);
		}
		
		//�������췽��ʱʹ��this�ؼ���
		//����ʹ��this�ؼ�����һ�����췽���е�������Ĺ��췽��
		//��Ч�ı�������
		
		
}


