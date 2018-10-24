package com.xtzx.wl;

import java.math.BigDecimal;

public class DataTypeDemo 
{
	public static void main(String[] args) 
	{
		//光的一天运行距离
		long speed = 299792458;
		long second;
		long distance;
		second = 24*60*60;
		distance = speed*second;
		System.out.println("光在一天中运行的距离为:"+distance+"米");
		
		//计算圆的面积
		double pi = 3.1415926535;
		double r  = 12.3;
		double area = pi*r*r;
		System.out.println("圆的面积为:"+area);
		
		
		//数据类型转换
		//1.自动转换(隐式转换)     由小的数据类型范围转为大的数据类型范围          安全
		//  int->float     long->float   long->double  可能会丢失精度不会丢失宽度
		//2.强制转换(显式转换)     由大的数据类型范围转为小的数据类型范围        不安全
		//  可能会丢失精度与宽度
		
		//自动转换
		byte  b   = 127;
		short s   = b;
		int  int1 = b;
		int1 = s;
		long l = b;
		l = s ;
		l = int1;
		
		char c = 'a';
		int1 = c;
		l = c;
		
		float f = 3.5f;
		double d = f;
		
		f = b;
		f = s;
		f = int1;
		f = l;
		f = c;
		
		d = b;
		d = s;
		d = int1;
		d = l;
		d = c;
		
		
		//强制转换(Type)
		double  d2 = 3.5;
		float f2 = (float)d2;
		System.out.println(f2);
		
		int i2 = (int)d2;//3.5->3丢弃了小数部分
		System.out.println(i2);
		
		i2 = 126;
		byte b2 = (byte)i2;
		System.out.println(b2);
		
		int i6 =  1000;
		short s4 = (short)i6;
		System.out.println(s4);
		
		//java中定义当强制转换时,
		//原始数据值超过目标数据类型表示范围时,数据结果为原始结果值取余目标类型所能表示的数据个数
		int i3 = 128;
		byte b3 = (byte)i3;
		System.out.println(b3);
		System.out.println(b3%256 == b3);
		
		int i7 =  99000;
		short s5 = (short)i7;
		System.out.println(s5);
		System.out.println(s5%655356);
		
		
		//如果表达式中操作数的数据类型不一致,遵循以下规则进行转换(自动类型提升):
		//如果出现了double类型的操作数,那么其他所有非double类型的操作数都会先转换为double,结果为double
		//否则
		//如果出现了float类型的操作数,那么其他所有非float类型的操作数都会先转换为float,结果为float
		//否则
		//如果出现了long类型的操作数,那么其他所有非long类型的操作数都会先转换为long,结果为long 
		//否则
		//所有的操作数转换为int类型,结果为int
		
		byte b7 = 50;
		short s7 = 2048;
		char c7 = 'a';
		int i8 = 20000;
		long l7 = 10000000L;
		float f7 = 8.28F;
		double d7 = 5.232;
		
		//自动类型提升
		double r7  = b7 * i8 + (f7 - d7);
		float  r8  = f7/i8 + (s7-c7);
		long   r9  = (s7+c7)*i8 +l7;
		int    r10 = i8*c7/(s7+b7);
		
		//尽管b7=50,将50*2 = 100,未超过byte类型范围,但仍会报错,因为根据自动数据类型提升规则
		//所有不含double,float,long类型的数据计算都会被转换为int,所以将int赋值给byte自然就出错
		//需要强制转换
		b7=(byte)(b7 * 2);
		System.out.println("b7的值为"+b7);
		
		
//byte   占1字节     -128 --- 127                                  -->计256个数据                                                 =2^8
//short  占2字节     -32768 --- 32767                              -->计65536个数据                                            =2^16
//int    占4字节     -2147483648 --- 2147483647                    -->计4294967296个数据                               =2^32
//long   占8字节     -9223372036854775808 --- 9223372036854775807  -->计18446744073709551616个数据    =2^64

//下面的值都是正负。仅讨论的是位数的最大值和最小值
//float(精度6--7位有效数字)单精度浮点数转化为10进制后，可以保证至少6位、最多7位(可能丢失)有效数字
//		最大值：3.4028235E38 = 340282350000000000000000000000000000000
//		最小值：1.4E-45 = 0.0000000000000000000000000000000000000000000014
//double(精度15--16位有效数字)单精度浮点数转化为10进制后，可以保证至少15位、最多16位(可能丢失)有效数字
//		最大值：1.7976931348623157E308这个值太大了就是
//			    1.7976931348623157这个数小数点往右移308位
//		最小值：4.9E-324
//				这个数就是4.9除以10的324次方。  
		
		//该数字使用float将会丢失精度
		float f9 = 1234567890123f;//变为1234567950000,第8位丢失精度
		System.out.println("f9:"+f9);
		//可见float浮点数精度很小
		
		double d9 = 1234567890123d;
		System.out.println("d9:"+d9);
		
//当需要表示15位以上有限数字的小数时,需要引入
//java.math.BigDecimal
//import java.math*;
//-------------------------------------------------------------------------------------------------
//序号	方法													类型		描述
//-------------------------------------------------------------------------------------------------
//1		public BigDecimal(double val)						构造		将double表示形式转换为BigDecimal
//2		public BigDecimal(int val)							构造		将int表示形式转换为BigDecimal
//3		public BigDecimal(String val)						构造		将字符串表示形式转换为BigDecimal
//4		public BigDecimal add(BigDecimal augend)			普通		加法
//5 	public BigDecimal subtract(BigDecimal subtrahend)	普通		减法
//6 	public BigDecimal multiply(BigDecimal multiplicand) 普通 	乘法
//7 	public BigDecimal divide(BigDecimal divisor) 		普通 	除法
//--------------------------------------------------------------------------------------------------		
//BigDecimal是Java中用来表示任意精确浮点数运算的类，
//在BigDecimal中，使用unscaledValue × 10-scale来表示一个浮点数。
//其中，unscaledValue是一个BigInteger，scale是一个int。
//从这个表示方法来看，BigDecimal只能标识有限小数，
//不过可以表示的数据范围远远大于double，在实际应用中基本足够。
	}
	
}
