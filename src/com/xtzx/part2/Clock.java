package com.xtzx.part2;

public class Clock 
{
	//������Ա
	int hour;
	int minute;
	int second;
	//������Ա
	public	void setTime(int newH,int newM,int newS)
	{
		hour = newH;
		minute = newM;
		second = newS;
	}
	public void showTime() 
	{
		System.out.println("����ʱ����:"+hour+":"+minute+":"+second);
	}
	
	
	//ʹ����
	//��-->ʵ������
	
	//������������
	//�﷨:
	//�������ñ�����
	Clock acolck,
	//���󴴽�
	aclock  = new Clock();//���ڴ���ΪClock���͵Ķ�������ڴ�ռ䷵�ض��������
	//���ñ������Ա������ֵ(�����Բ���ʼ��)
	
	//���ݳ�Ա����
	//[public |protected|private] [static][final][transient][volatile]�������� ������1=[������ֵ],������2[=������ֵ],...;	
	//[public |protected|private] ���ʿ��Ʒ�
	//[static]��̬��Ա����,  �����,�� ʵ������ ���
	//[final]���ܱ��޸�
	//[transient]����Ҫ���л�
	//[volatile]�������
	
	
	//ʵ������  û��static���εı���
	//����: <ʵ����>.<ʵ��������>  //���ʿ���������
	
	//�����	
	//��static����
	//����������ֻ��һ��ֵ
	//�����ʼ��ʱ�ͱ���ֵ
	//������
	//		�������ж�����ͬ����
	//		������Ҫ���������
	//		ϵͳ�г��õ�һЩ����ֵ
	//ʹ�� <����|ʵ��������>.<�������>
	
	
	
	
	
	
}
