package com.xtzx.part2;

public class BankAccount 
{
		String ownerName;
		long accountNumber;
		float balance;
		
		public  BankAccount(String initName,long  initAccountNumber,float  initBalance) 
		{
			ownerName = initName;
			accountNumber = initAccountNumber;
			balance = initBalance;
		}
		
		public  BankAccount(String initName,long  initAccountNumber) 
		{
			ownerName = initName;
			accountNumber = initAccountNumber;	
			balance = 0.0f;
		}
		
		public  BankAccount() 
		{
			ownerName = "";
			accountNumber = 888;	
			balance = 0.0f;	
		}
		
		//���췽����������ͬ
		//�������췽��ʱʹ��this�ؼ���
		//����ʹ��this�ؼ�����һ�����췽���е�������Ĺ��췽��
		//��Ч�ı�������
		
		
}


