package management;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		
		//��ü�� �����ϴ� ���� �׻� �̸� �س��� �޼��� ȣ�� 
		Scanner scan = new Scanner(System.in);
		//ȣ���ϱ� ���� ��ü
		Stmg sm = new Stmg();
		int menu =0;
		do {
			
			
			//�޴��ֱ� 
			System.out.println("---menu----");
			System.out.println("1.�л���� | 2.�л�����Ʈ��� | 3.�л��˻�(�л�����,��������)");
			System.out.println("4.������û | 5.����öȸ | 6.����");
			System.out.println(">>�޴�����");
	menu = scan.nextInt();
	//�޴��� ���� �б� ����
	switch(menu) {
	case 1: sm.insertStudent(scan); break; // st 108 public void insertSubject(Scanner scan)
	case 2: sm.printStudent();
		break;
	case 3: sm.searchStudent(scan);break;
	
	case 4: sm.registerSubject(scan);break;
	case 5: break;
	case 6: break;
	default:
		System.out.println("�߸��� �޴��Դϴ�.");

			
			
		}
		}while(menu !=6 );
		
		
		
		
		scan.close();

	

}
}
