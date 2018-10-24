package com.xtzx.wl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlowConrol 
{
	public enum Color //枚举
	{RED, GREEN, BLANK, YELLOW,WHITE} 
	
	public static void main(String[] args) throws IOException 
	{
		//Java中的条件运算符
		//max=a>b?a:b;
		//若a>b成立则max=a;
		//若a>b不成立则max=b;
		//在Java中必须要用一个变量去存这个条件表达式的值：sum=max=a>b?a:b;
		String b = 
			javax.swing.JOptionPane.showInputDialog(null,"请输入一个有效数字:");
		int i=Integer.parseInt(b);//String转int
		//异常处理NumberFormatException
		
		
		//if分支语句 
		if( i < 5)
		{System.out.println("i的值[0,5)为"+i);}
		else if(i<10)
		{System.out.println("i的值[5,10)为"+i);}
		else
		{System.out.println("i的值[10,+oo)为"+i);}
		
		//异常处理
		int h = 10;
        int j = 0;
        try{
        int temp = h/j;                        //此处会产生异常
        System.out.println("计算结果："+temp);
        }catch(Exception e){
            System.out.println("出现异常："+e); //打印异常信息
            e.printStackTrace();               //打印完整的异常信息
        }finally{
            System.out.println("不管是否出现异常都执行此代码");
        }
        System.out.println("计算结束");
		
        //switch语句 
        String c = 
			javax.swing.JOptionPane.showInputDialog(null,"请输入一个有效数字:");
		int d=Integer.parseInt(c);//String转int
        switch(d)
        {
        case 8: 
        	System.out.println("case1匹配,为8");;
        	break;
        case 9: 
        	System.out.println("case2匹配,为9");;
        	break;
        default : 
        	System.out.println("未匹配");
        	break;
        }
        
        //调用枚举
        System.out.println(Color.YELLOW);
        
        
        
        //for循环
        //for(start-exp;check-exp;update-exp)
        //{
        //   loop;
	    //}
        //start-exp完成循环变量或其他变量的初始化工作 
        //check-exp返回布尔值的条件表达式,用于判断循环是否继续
        //update-exp用于修整循环变量,改变循环条件
        //三个表达式之间用";"隔开
        
        for(int f = i;f < 20; f++)
        {
        	System.out.println("f的值为"+f);
        }
        List<String> testList = new ArrayList<String>();
        testList.add("a");
        testList.add("b");
        testList.add("c");
        testList.add("d");
        testList.add("e");
        
        //增强型for循环
        //用于遍历数组或集合
        //格式
        //for(Type name:数组或集合类型对象)
        //{loop}
        for(String forResult:testList)
        {System.out.println(forResult+" ");}
        
        //while循环
        //while(check-exp)
        //{loop;}
        //check-exp返回布尔值,布尔true执行loop,否则跳出
        //loop可以是单个语句,也可以是复合语句块
        int g=0;
        while(g < 10)
        { 
        	System.out.println("g的值为:"+g);
        	g++;
        }
        
        //do while循环
        //do{loop;}while(check-exp);
        //先执行一遍循环体再进行判断,循环,也就是说.循环体至少执行一次
        int l = 5;
        do{System.out.println("l的值为:"+l); --l;} while(l > 0);
        
        //break语句
        //跳出switch分支语句
        //在for/while循环体中,跳出其最内层循环
        //搭配标号使用,跳出标号所示循环
        //跳出代码块
        
        
        //continue语句
        //只能用于循环中
        //1.不带标号:停止本次迭代,回到循环开头 
        //2.带标号:转入标号循环处
        
        
        
        char a;
        outer:  //this is the label for the outer loop　　
        for(int m=0;m<10;m++)
        {
            for(int n=0;n<10;n++)
            {
                a=(char)System.in.read();
                if(a=='b')
                	break outer;

                if(a=='c')
                	continue outer; 
            }
        }        
        
        
        
        
        
	}
}

