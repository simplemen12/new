package sale;

import java.util.Scanner;

import day19.SaleManager;

public class SaleMain {

	public static void main(String[] args) {
		/*
		 * 1.�޴��߰� 2.�޴����� 3.�޴�����(���ݼ���)
		 * 4.�޴�����(��ü�޴����) 5.�ֹ� 6.�ֹ��������(������) 
		 * 7.����
		 */
Scanner scan = new Scanner(System.in);
		
		SaleManager1 sm = new SaleManager1();
		Order sm1 = new Order();
		
		int menu = -1;
		
		do {
			System.out.println("1.�޴��߰� 2.�޴����� 3.�޴�����(���ݼ���) 4.�޴�����(��ü�޴����)");
			System.out.println("5.�ֹ� 6.�ֹ��������(������)");
			
			menu=scan.nextInt();
			switch(menu) {
			case 1: sm.add(scan); break;  //do while�� ����� �Լ� Ŭ���� �ڿ� add
			
			case 2: sm.menudel(scan); break;
			
			case 3: sm.menuMod(scan); break;
				
			case 4: sm.menuPrint(); break;
			
			case 5: sm.menuOrder(scan); break;
			
			case 6: sm.menuOrderRec(); break;
			default:
				System.out.println("�߸��� �޴�");
			}
			
		}while(menu !=5);
		
		
		
		
		
		scan.close();

	}

}

