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
		
		//声明构造方法时使用this关键字
		//可以使用this关键字在一个构造方法中调用另外的构造方法
		//有效的避免冗余
		
		
}


