package management;

import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Studentmanger st1 = new Studentmanger();
		
	
		
		
		
		
	
		int menu = 0;
		do {
			System.out.println("---menu----");
			System.out.println("1.�л���� | 2.�л�����Ʈ��� | 3.�л��˻�(�л�����,��������)");
			System.out.println("4.������û | 5.����öȸ | 6.����");
			
			
			menu = scan.nextInt();
			
			
			//���� ����� �����ϴ� ó����
			
			switch(menu) {
			case 1:				
				System.out.println("1.�л����");
				st1.insertStudent(scan); //
				break;
			case 2:
				System.out.println("2.�л�����Ʈ���");
				st1.printSubjects();
				break;
			case 3:
				System.out.println("3.�л��˻�(�л�����,��������)");
				st1.searchStudent(scan);//
				break;
			case 4:
				System.out.println("4.������û");
				st1.registerSubject(scan);//
				break;
			case 5:
				System.out.println("5.����öȸ");
				//st2.deleteSubject();
				break;
				default:
					System.out.println("����");
				
				
			}
			
		}while(menu!=6);
		System.out.println("�߸� �Է�");
		
		scan.close();
    }
	
}
