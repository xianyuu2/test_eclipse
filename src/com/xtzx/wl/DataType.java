package com.xtzx.wl;


public class DataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] xianyuAray;
		//String[] xyArray;
		//����д��
		//int xianyuAray[];
		//String xyArray[];
		xianyuAray = new int[2];
		//xyArray = new String[5];
		//��int[] xianyuAray = new int[3],xianyuArray2 = new int[4]һ�������������������;
		//��ʹ�� int a[] = {1,2,3,4,5}һ�����������\�����븳ֵ�������;
		
		//���鸳ֵ
		int a[] = {1,2,3,4,5};
		xianyuAray[0]=1;
		xianyuAray[1]=12;
		//���鳤�� ������.length
		
		//��������ָ��ͬһ������
		int a2[];
		a2 = a;
		System.out.println("��ӡa����");
		for(int i = 0;i < a.length ;i++){
			System.out.println("a["+i+"]:"+a[i]);
		}
		System.out.println("��a2���ñ�����1");
		for(int i = 0;i < a.length ;i++){
			a2[i]++;
			System.out.println("a["+i+"]:"+a[i]);
		}
		System.out.println("a����Ҳ�����˱仯");
		
		 for(int forResult:a2)
         {System.out.println(forResult+" ");}
		 
		 
		 
		 //����(Ĭ��int)
		 //byte  short int long 
		 //Ĭ��int,����ʹ�ø�ֵ����int��ֵ��long��ʱ,Ҫ��L/l,�� long l3 = 99999999999L; 
		 long l3 = 99999999999L;
		 
		 //int 10����
		 int i1 = 10;//10
		 //int 8����,��0ǰ׺,������0-7���������
		 int i2 = 010;//8
		 //int 16����,��0x/0Xǰ׺,����0-f�����
		 int i3 = -0xff;//-255
		 
		 //java7��ʼ֧��2����,��0b/0Bǰ׺,����0-1�����
		 ///int i4 = 0b1010;//10
		 //java7֧��ʹ���»��߶����ֽ��зָ������Ķ�
		 //int  i5 = 123_456_789;/=12345_6789;�»��߲��ܼ������ֿ�ͷ���β,����Ӷ����»���,�ҿ�������Ӷ����»���
		 
		 
		 
		 
		 //������(Ĭ��double)
		 //float double
		 //Ĭ��Ϊdouble����float f1 = 0.8�ᱨ��,��Ҫ���f/F��
		 float f1 = 0.8f; //0.8
		 float f2 = .8f;  //0.8,��ʡ��.ǰ���0
		 float f3 = 1.2E+3f;//��ѧ��������ʾ1.2*10^3�ĸ�����
		 float f4 = 1.2E-3f;//��ѧ��������ʾ1.2*10^-3�ĸ�����
		 //double����
		 double b1 = 0.7;
		 double b2 = 0.7d;//Ҳ���Լ�d/D��ʾdouble����,Ҳ���Բ���,Ĭ�Ͼ���double
		 double b3 = 1.2E+100d;//��ѧ������
		 //double 16����,����ʹ�����¸�ʽ�Ŀ�ѧ������
		 double b5 = 0x12.2P2;//��ʾ16���Ƶ�12.2*2��2�η�=10���Ƶ�72.5,P2��ʾ2��2�η�,P3��ʾ2��3�η�
		 //Ҳ����ʹ���»���
		 
		 
		 //char�ַ�����,ֻ���õ�����,ֻ�ܱ�ʾ�����ַ�()����0-65535��int����������ʾunicode�ַ�)
		 char c1 = 'a';
		 //char c2 = 'bb';����ֻ�ܵ����ַ�
		 //char c3 = "a";����ֻ�ܵ�����
		 char c4 = 65;//��ʾ"A"
		 //char c5 = 65536;//����65536>[0,65535]
		 System.out.println(c4);
		 
		 //ת���
		 char c6 = '\n'; 
		 //  \n���� \r�س����� \b�˸� \tˮƽ�Ʊ� \f��ҳ  \'������ \"˫���� \\��б��
		 //  \101 ʹ��3λ8���Ƶ����ֱ�ʾ0-377(10���Ƶ�0-255)��256���ַ�(�ɱ�ʾasciiǰ256λ)
		 //  \u4e01ʹ��4λ16�������ֱ�ʾ \u0000-\uffff��Χ�ڵ��ַ�(10���Ƶ�0-65535),(�ɱ�ʾ����unicode�ַ���)
		 
		 
		 
		 //��������
		 boolean bool1 = true;
		 
		 
	}    

}
