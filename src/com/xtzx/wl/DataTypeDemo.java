package com.xtzx.wl;

import java.math.BigDecimal;

public class DataTypeDemo 
{
	public static void main(String[] args) 
	{
		//���һ�����о���
		long speed = 299792458;
		long second;
		long distance;
		second = 24*60*60;
		distance = speed*second;
		System.out.println("����һ�������еľ���Ϊ:"+distance+"��");
		
		//����Բ�����
		double pi = 3.1415926535;
		double r  = 12.3;
		double area = pi*r*r;
		System.out.println("Բ�����Ϊ:"+area);
		
		
		//��������ת��
		//1.�Զ�ת��(��ʽת��)     ��С���������ͷ�ΧתΪ����������ͷ�Χ          ��ȫ
		//  int->float     long->float   long->double  ���ܻᶪʧ���Ȳ��ᶪʧ���
		//2.ǿ��ת��(��ʽת��)     �ɴ���������ͷ�ΧתΪС���������ͷ�Χ        ����ȫ
		//  ���ܻᶪʧ��������
		
		//�Զ�ת��
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
		
		
		//ǿ��ת��(Type)
		double  d2 = 3.5;
		float f2 = (float)d2;
		System.out.println(f2);
		
		int i2 = (int)d2;//3.5->3������С������
		System.out.println(i2);
		
		i2 = 126;
		byte b2 = (byte)i2;
		System.out.println(b2);
		
		int i6 =  1000;
		short s4 = (short)i6;
		System.out.println(s4);
		
		//java�ж��嵱ǿ��ת��ʱ,
		//ԭʼ����ֵ����Ŀ���������ͱ�ʾ��Χʱ,���ݽ��Ϊԭʼ���ֵȡ��Ŀ���������ܱ�ʾ�����ݸ���
		int i3 = 128;
		byte b3 = (byte)i3;
		System.out.println(b3);
		System.out.println(b3%256 == b3);
		
		int i7 =  99000;
		short s5 = (short)i7;
		System.out.println(s5);
		System.out.println(s5%655356);
		
		
		//������ʽ�в��������������Ͳ�һ��,��ѭ���¹������ת��(�Զ���������):
		//���������double���͵Ĳ�����,��ô�������з�double���͵Ĳ�����������ת��Ϊdouble,���Ϊdouble
		//����
		//���������float���͵Ĳ�����,��ô�������з�float���͵Ĳ�����������ת��Ϊfloat,���Ϊfloat
		//����
		//���������long���͵Ĳ�����,��ô�������з�long���͵Ĳ�����������ת��Ϊlong,���Ϊlong 
		//����
		//���еĲ�����ת��Ϊint����,���Ϊint
		
		byte b7 = 50;
		short s7 = 2048;
		char c7 = 'a';
		int i8 = 20000;
		long l7 = 10000000L;
		float f7 = 8.28F;
		double d7 = 5.232;
		
		//�Զ���������
		double r7  = b7 * i8 + (f7 - d7);
		float  r8  = f7/i8 + (s7-c7);
		long   r9  = (s7+c7)*i8 +l7;
		int    r10 = i8*c7/(s7+b7);
		
		//����b7=50,��50*2 = 100,δ����byte���ͷ�Χ,���Իᱨ��,��Ϊ�����Զ�����������������
		//���в���double,float,long���͵����ݼ��㶼�ᱻת��Ϊint,���Խ�int��ֵ��byte��Ȼ�ͳ���
		//��Ҫǿ��ת��
		b7=(byte)(b7 * 2);
		System.out.println("b7��ֵΪ"+b7);
		
		
//byte   ռ1�ֽ�     -128 --- 127                                  -->��256������                                                 =2^8
//short  ռ2�ֽ�     -32768 --- 32767                              -->��65536������                                            =2^16
//int    ռ4�ֽ�     -2147483648 --- 2147483647                    -->��4294967296������                               =2^32
//long   ռ8�ֽ�     -9223372036854775808 --- 9223372036854775807  -->��18446744073709551616������    =2^64

//�����ֵ���������������۵���λ�������ֵ����Сֵ
//float(����6--7λ��Ч����)�����ȸ�����ת��Ϊ10���ƺ󣬿��Ա�֤����6λ�����7λ(���ܶ�ʧ)��Ч����
//		���ֵ��3.4028235E38 = 340282350000000000000000000000000000000
//		��Сֵ��1.4E-45 = 0.0000000000000000000000000000000000000000000014
//double(����15--16λ��Ч����)�����ȸ�����ת��Ϊ10���ƺ󣬿��Ա�֤����15λ�����16λ(���ܶ�ʧ)��Ч����
//		���ֵ��1.7976931348623157E308���ֵ̫���˾���
//			    1.7976931348623157�����С����������308λ
//		��Сֵ��4.9E-324
//				���������4.9����10��324�η���  
		
		//������ʹ��float���ᶪʧ����
		float f9 = 1234567890123f;//��Ϊ1234567950000,��8λ��ʧ����
		System.out.println("f9:"+f9);
		//�ɼ�float���������Ⱥ�С
		
		double d9 = 1234567890123d;
		System.out.println("d9:"+d9);
		
//����Ҫ��ʾ15λ�����������ֵ�С��ʱ,��Ҫ����
//java.math.BigDecimal
//import java.math*;
//-------------------------------------------------------------------------------------------------
//���	����													����		����
//-------------------------------------------------------------------------------------------------
//1		public BigDecimal(double val)						����		��double��ʾ��ʽת��ΪBigDecimal
//2		public BigDecimal(int val)							����		��int��ʾ��ʽת��ΪBigDecimal
//3		public BigDecimal(String val)						����		���ַ�����ʾ��ʽת��ΪBigDecimal
//4		public BigDecimal add(BigDecimal augend)			��ͨ		�ӷ�
//5 	public BigDecimal subtract(BigDecimal subtrahend)	��ͨ		����
//6 	public BigDecimal multiply(BigDecimal multiplicand) ��ͨ 	�˷�
//7 	public BigDecimal divide(BigDecimal divisor) 		��ͨ 	����
//--------------------------------------------------------------------------------------------------		
//BigDecimal��Java��������ʾ���⾫ȷ������������࣬
//��BigDecimal�У�ʹ��unscaledValue �� 10-scale����ʾһ����������
//���У�unscaledValue��һ��BigInteger��scale��һ��int��
//�������ʾ����������BigDecimalֻ�ܱ�ʶ����С����
//�������Ա�ʾ�����ݷ�ΧԶԶ����double����ʵ��Ӧ���л����㹻��
	}
	
}
