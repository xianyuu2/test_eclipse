package com.xtzx.part2;

public class BankTester 
{
	public static void main(String[] args) 
	{
		BankAccount a1 = new BankAccount();
		System.out.println("accountNumber:"+a1.accountNumber);
		System.out.println("OwnerName:"+a1.ownerName);
		System.out.println("Balance:"+a1.balance+"\n");
		//默认的构造方法会给数据成员初始化为null(引用类)或0(数值)
		
		//自定义构造方法与方法重载
		//在生成对象时给构造方法传送初始值,为对象进行初始化
		//构造方法可以重载
		//一个类中有一个以上的同名方法,但参数表不同,称为重载:参数个数,类型,顺序任何一处不同都算参数不相同
		//只要显式地声明了构造方法,编译器就不会再生成默认的构造方法
		
		BankAccount2 a2 = new BankAccount2("xianyu",320125199912314811L,1.32F);
		System.out.println("accountNumber:"+a2.accountNumber);
		System.out.println("OwnerName:"+a2.ownerName);
		System.out.println("Balance:"+a2.balance);
		
		
		//final 变量的初始化
		//实例和类变量都能被声明为final;
		//实例final 变量可以在类中定义时给出初始值,或者在每个构造方法结束之前完成初始化
		//final类变量必须在声明的同时进行初始化
		
		
		
	}

}
