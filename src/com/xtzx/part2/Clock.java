package com.xtzx.part2;

public class Clock 
{
	//变量成员
	int hour;
	int minute;
	int second;
	//方法成员
	public	void setTime(int newH,int newM,int newS)
	{
		hour = newH;
		minute = newM;
		second = newS;
	}
	public void showTime() 
	{
		System.out.println("现在时间是:"+hour+":"+minute+":"+second);
	}
	
	
	//使用类
	//类-->实例对象
	
	//对象引用声明
	//语法:
	//定义引用变量名
	Clock acolck,
	//对象创建
	aclock  = new Clock();//在内存中为Clock类型的对象分配内存空间返回对象的引用
	//引用变量可以被赋予空值(即可以不初始化)
	
	//数据成员声明
	//[public |protected|private] [static][final][transient][volatile]数据类型 变量名1=[变量初值],变量名2[=变量初值],...;	
	//[public |protected|private] 访问控制符
	//[static]静态成员变量,  类变量,与 实例变量 相对
	//[final]不能被修改
	//[transient]不需要序列化
	//[volatile]共享变量
	
	
	//实例变量  没有static修饰的变量
	//访问: <实例名>.<实例变量名>  //访问控制允许下
	
	//类变量	
	//用static修饰
	//在整个类中只有一个值
	//在类初始化时就被赋值
	//适用于
	//		类中所有对象都相同的类
	//		经常需要共享的数据
	//		系统中常用的一些变量值
	//使用 <类名|实例对象名>.<类变量名>
	
	
	
	
	
	
}
