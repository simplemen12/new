package day15;

import java.util.Scanner;

import management.Stmg;

public class CustomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		//��ü�� �����ϴ� ���� �׻� �̸� �س��� �޼��� ȣ�� 
		Scanner scan = new Scanner(System.in);
		//ȣ���ϱ� ���� ��ü
		Customer sm = new Customer();
		int menu =0;
		do {
			
			
			//�޴��ֱ� 
			System.out.println("---menu----");
			System.out.println("1.����� | 2.��������� | 3.��ǰ����");
			System.out.println("4.- | 5.- | 6.-");
			System.out.println(">>�޴�����");
	menu = scan.nextInt();
	//�޴��� ���� �б� ����
	switch(menu) {
	case 1: sm.insertCustomer(scan); break; // st 108 public void insertSubject(Scanner scan)
	case 2: sm.customerInfo();
		break;
	case 3: 
		System.out.println("������ �Է����ּ���.");
		String cg = scan.next();
		System.out.println("��ǰ������ �Է����ּ���");
		System.out.println();
		 int name = scan.nextInt();
		sm.price(cg,name);
		
		System.out.println("-----���ε� ����--------");
		System.out.println(sm.price(cg,name));
		break;
	
	//case 4: sm.registerSubject(scan);break;
	case 5: break;
	case 6: break;
	default:
		System.out.println("�߸��� �޴��Դϴ�.");

			
			
		}
		}while(menu !=6 );
		
		
		
		
		scan.close();

	



	}
	
	//agentId = 1111 ���  => 3333���� ���� 

}
