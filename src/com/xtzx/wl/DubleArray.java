package com.xtzx.wl;

public class DubleArray 
{
	public static void main(String[] args) 
	{
		//int[][] doubArray = new int[3][5];
		int[][] doubArray = 
		{{1,2,3,4,5},{1,3,5,7,9},{2,4,6,8,0}};
		
		System.out.println("����doubArray[][]�еĵ�2,3��Ԫ��Ϊ"+doubArray[1][2]+"\n");
		
		int[][] doubArray2 = 
		{{1,2,4},{3,5,2,4},{88,5,6,3,34}};
		
		System.out.println("��ά����doubArray[][]�ĳ���Ϊ:"+doubArray2.length);
		
		System.out.println("һά����doubArray[0]�ĳ���Ϊ:"+doubArray2[0].length);
		System.out.println("һά����doubArray[1]�ĳ���Ϊ:"+doubArray2[1].length);
		System.out.println("һά����doubArray[2]�ĳ���Ϊ:"+doubArray2[2].length);
		System.out.println("�ɼ���ά���������һά���鹹�ɵ�����");
		System.out.println("��ά����doubArray��Ԫ�ظ���Ϊ:"
				+((int)doubArray2[0].length
						+(int)doubArray2[1].length
						+(int)doubArray2[2].length));
		System.out.println("��ά����doubArray�ĳ��Ȳ�����������Ԫ�ظ���,���ǵ�������һά�������,Ҳ������");
	}

}
