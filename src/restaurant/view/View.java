package restaurant.view;

import java.util.Scanner;

import restaurant.service.West2FriedChickenRestuarant;


public class View {


	public static void main(String[] args) {
//		��ȡ�û�������
		Scanner sc=new Scanner(System.in);
		System.out.println("��ӭ����������ը����");
		System.out.println("�����뵱ǰ���������");
		
//		��ȡ�û����õ����ֵ��Ȼ�󴴽�����
		double balance=sc.nextDouble();
		West2FriedChickenRestuarant restaurant=new West2FriedChickenRestuarant(balance);
		System.out.println("���óɹ���");
		System.out.println("��ӭ����������ը�������ϵͳ");
//		��choose�������û���ѡ��
		int choose=0;
		boolean loopFlag=true;//����ѭ��
		while (loopFlag) {
//			����ҳ��
			String menuList ="-------����ը���������ҳ��-------\n";
			menuList += "1.���\n";
			menuList += "2.�鿴���\n";
			menuList += "3.��ʼ����\n";
			menuList += "4.�鿴�������\n";
			menuList += "5.�˳�\n";
			menuList += "���������Ĳ��������������֡�\n";
			menuList += "----------------------------------\n";
			System.out.println(menuList);
//			��ȡ�û���ѡ��
			try {
				choose = sc.nextInt();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println("�Ƿ�����");
			}
			//����ѡ����в�ͬ�Ĳ���
			switch (choose) {
//			1.���
			case 1:
				try {
					restaurant.sellMeal();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				} 
				break;
//			2.�鿴���
			case 2:
				restaurant.checkInventory();
				break;
//			3.��ʼ����
			case 3:
				try {
					restaurant.purchases();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
//			4.�鿴�������
			case 4:
				System.out.println("��ǰ������"+restaurant.getBalance()+"Ԫ");
				break;
//			5.�˳�
			case 5:
				System.out.println("���ٴ�ȷ���Ƿ��˳�(Y/N)");
				char isExit=sc.next().charAt(0);
				if(isExit=='Y'||isExit=='y') {
					loopFlag=false;
					System.out.println("���Ѿ��ɹ��˳�����ը����ϵͳ");
				}
				break;
			default:
				System.out.println("����������Ч�����������롣");
				break;
			}
		}

		
	}


}
