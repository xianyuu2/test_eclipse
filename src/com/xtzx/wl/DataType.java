package com.xtzx.wl;


public class DataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] xianyuAray;
		//String[] xyArray;
		//或者写成
		//int xianyuAray[];
		//String xyArray[];
		xianyuAray = new int[2];
		//xyArray = new String[5];
		//或int[] xianyuAray = new int[3],xianyuArray2 = new int[4]一次声明并创建多个数组;
		//或使用 int a[] = {1,2,3,4,5}一次性完成声明\创建与赋值数组操作;
		
		//数组赋值
		int a[] = {1,2,3,4,5};
		xianyuAray[0]=1;
		xianyuAray[1]=12;
		//数组长度 数组名.length
		
		//数组引用指向同一个数组
		int a2[];
		a2 = a;
		System.out.println("打印a数组");
		for(int i = 0;i < a.length ;i++){
			System.out.println("a["+i+"]:"+a[i]);
		}
		System.out.println("将a2引用遍历加1");
		for(int i = 0;i < a.length ;i++){
			a2[i]++;
			System.out.println("a["+i+"]:"+a[i]);
		}
		System.out.println("a数组也发生了变化");
		
		 for(int forResult:a2)
         {System.out.println(forResult+" ");}
		 
		 
		 
		 //整型(默认int)
		 //byte  short int long 
		 //默认int,所以使用赋值超过int最值得long型时,要加L/l,如 long l3 = 99999999999L; 
		 long l3 = 99999999999L;
		 
		 //int 10进制
		 int i1 = 10;//10
		 //int 8进制,加0前缀,并跟上0-7的数字组合
		 int i2 = 010;//8
		 //int 16进制,加0x/0X前缀,跟上0-f的组合
		 int i3 = -0xff;//-255
		 
		 //java7开始支持2进制,加0b/0B前缀,跟上0-1的组合
		 ///int i4 = 0b1010;//10
		 //java7支持使用下划线对数字进行分割易于阅读
		 //int  i5 = 123_456_789;/=12345_6789;下划线不能加在数字开头或结尾,可添加多条下划线,且可连续添加多条下划线
		 
		 
		 
		 
		 //浮点型(默认double)
		 //float double
		 //默认为double所以float f1 = 0.8会报错,需要添加f/F如
		 float f1 = 0.8f; //0.8
		 float f2 = .8f;  //0.8,可省略.前面的0
		 float f3 = 1.2E+3f;//科学计数法表示1.2*10^3的浮点数
		 float f4 = 1.2E-3f;//科学计数法表示1.2*10^-3的浮点数
		 //double声明
		 double b1 = 0.7;
		 double b2 = 0.7d;//也可以加d/D表示double类型,也可以不加,默认就是double
		 double b3 = 1.2E+100d;//科学计数法
		 //double 16进制,必须使用以下格式的科学计数法
		 double b5 = 0x12.2P2;//表示16进制的12.2*2的2次方=10进制的72.5,P2表示2的2次方,P3表示2的3次方
		 //也可以使用下划线
		 
		 
		 //char字符类型,只能用单引号,只能表示单个字符()或用0-65535的int类数字来表示unicode字符)
		 char c1 = 'a';
		 //char c2 = 'bb';错误只能单个字符
		 //char c3 = "a";错误只能单引号
		 char c4 = 65;//表示"A"
		 //char c5 = 65536;//错误65536>[0,65535]
		 System.out.println(c4);
		 
		 //转义符
		 char c6 = '\n'; 
		 //  \n换行 \r回车换行 \b退格 \t水平制表 \f换页  \'单引号 \"双引号 \\反斜线
		 //  \101 使用3位8进制的数字表示0-377(10进制的0-255)的256个字符(可表示ascii前256位)
		 //  \u4e01使用4位16进制数字表示 \u0000-\uffff范围内的字符(10进制的0-65535),(可表示所有unicode字符集)
		 
		 
		 
		 //布尔类型
		 boolean bool1 = true;
		 
		 
	}    

}
