package com.xtzx.wl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlowConrol 
{
	public enum Color //ö��
	{RED, GREEN, BLANK, YELLOW,WHITE} 
	
	public static void main(String[] args) throws IOException 
	{
		//Java�е����������
		//max=a>b?a:b;
		//��a>b������max=a;
		//��a>b��������max=b;
		//��Java�б���Ҫ��һ������ȥ������������ʽ��ֵ��sum=max=a>b?a:b;
		String b = 
			javax.swing.JOptionPane.showInputDialog(null,"������һ����Ч����:");
		int i=Integer.parseInt(b);//Stringתint
		//�쳣����NumberFormatException
		
		
		//if��֧��� 
		if( i < 5)
		{System.out.println("i��ֵ[0,5)Ϊ"+i);}
		else if(i<10)
		{System.out.println("i��ֵ[5,10)Ϊ"+i);}
		else
		{System.out.println("i��ֵ[10,+oo)Ϊ"+i);}
		
		//�쳣����
		int h = 10;
        int j = 0;
        try{
        int temp = h/j;                        //�˴�������쳣
        System.out.println("��������"+temp);
        }catch(Exception e){
            System.out.println("�����쳣��"+e); //��ӡ�쳣��Ϣ
            e.printStackTrace();               //��ӡ�������쳣��Ϣ
        }finally{
            System.out.println("�����Ƿ�����쳣��ִ�д˴���");
        }
        System.out.println("�������");
		
        //switch��� 
        String c = 
			javax.swing.JOptionPane.showInputDialog(null,"������һ����Ч����:");
		int d=Integer.parseInt(c);//Stringתint
        switch(d)
        {
        case 8: 
        	System.out.println("case1ƥ��,Ϊ8");;
        	break;
        case 9: 
        	System.out.println("case2ƥ��,Ϊ9");;
        	break;
        default : 
        	System.out.println("δƥ��");
        	break;
        }
        
        //����ö��
        System.out.println(Color.YELLOW);
        
        
        
        //forѭ��
        //for(start-exp;check-exp;update-exp)
        //{
        //   loop;
	    //}
        //start-exp���ѭ�����������������ĳ�ʼ������ 
        //check-exp���ز���ֵ���������ʽ,�����ж�ѭ���Ƿ����
        //update-exp��������ѭ������,�ı�ѭ������
        //�������ʽ֮����";"����
        
        for(int f = i;f < 20; f++)
        {
        	System.out.println("f��ֵΪ"+f);
        }
        List<String> testList = new ArrayList<String>();
        testList.add("a");
        testList.add("b");
        testList.add("c");
        testList.add("d");
        testList.add("e");
        
        //��ǿ��forѭ��
        //���ڱ�������򼯺�
        //��ʽ
        //for(Type name:����򼯺����Ͷ���)
        //{loop}
        for(String forResult:testList)
        {System.out.println(forResult+" ");}
        
        //whileѭ��
        //while(check-exp)
        //{loop;}
        //check-exp���ز���ֵ,����trueִ��loop,��������
        //loop�����ǵ������,Ҳ�����Ǹ�������
        int g=0;
        while(g < 10)
        { 
        	System.out.println("g��ֵΪ:"+g);
        	g++;
        }
        
        //do whileѭ��
        //do{loop;}while(check-exp);
        //��ִ��һ��ѭ�����ٽ����ж�,ѭ��,Ҳ����˵.ѭ��������ִ��һ��
        int l = 5;
        do{System.out.println("l��ֵΪ:"+l); --l;} while(l > 0);
        
        //break���
        //����switch��֧���
        //��for/whileѭ������,���������ڲ�ѭ��
        //������ʹ��,���������ʾѭ��
        //���������
        
        
        //continue���
        //ֻ������ѭ����
        //1.�������:ֹͣ���ε���,�ص�ѭ����ͷ 
        //2.�����:ת����ѭ����
        
        
        
        char a;
        outer:  //this is the label for the outer loop����
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

