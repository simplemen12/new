package day19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Generic01 {

	public static void main(String[] args) {
		
		/*
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<E>();
		//���׸� : �������� Ÿ���� ���߿� Ȯ���ϴ� ���
		
		HashMap<String, String> map = new HashMap<K, V >();
		
		//Ŭ������ �޼��带 ������ �� string�� ������ �����Ͱ� Ȯ���� �� ���ٸ�
		//generic Ÿ������ �����ϰ� �Ǹ� ���߿� ��ü�� Ȯ���Ͽ� ����
		
		//��ü�� Ÿ���� ������ �� �� üũ�Ҽ� �־ Ÿ���� �������� ��ġ�� �ʴ�
		//������ ������ ����ȯ�� ������ ��� 
		List<E> list = new ArrayList<E>();
		*/
		
		//������ �ǵ����� �ʴ� Ÿ���� ��ü�� ����Ǵ� ���� ���´�.
		
		/*
		 * Sale Ŭ���� ���� 
		 * 1. ��ǰ�߰� | 2. ��ǰ����Ʈ���� | 3. ��ǰ�ֹ� | 4. �ֹ��������� | 5.���� |
		 */
		
		Scanner scan = new Scanner(System.in);
		
		SaleManager sm = new SaleManager();
		
		int menu = -1;
		
		do {
			System.out.println("1.��ǰ�߰� 2.��ǰ����Ʈ���� 3.��ǰ�ֹ� 4.�ֹ��������� 5.����");
			
			menu=scan.nextInt();
			switch(menu) {
			case 1: sm.add(scan); break;  //do while�� ����� �Լ� Ŭ���� �ڿ� add
			case 2: sm.menuPrint(); break;
			case 3:
				String name = scan.next();
				int count = scan.nextInt();
				sm.orderPick1(name,count); break;
			case 4: sm.orderPrint(); break;
			case 5: break;
			default:
				System.out.println("�߸��� �޴�");
			}
			
		}while(menu !=5);
		
		
		
		
		
		scan.close();

	}

}
