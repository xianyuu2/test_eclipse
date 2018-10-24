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
		
		//构造方法与类名相同
		//声明构造方法时使用this关键字
		//可以使用this关键字在一个构造方法中调用另外的构造方法
		//有效的避免冗余
		
		
}


