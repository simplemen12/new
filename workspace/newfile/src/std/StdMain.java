package std;

import java.util.HashMap;
import java.util.Scanner;

public class StdMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        HashMap<String, Integer> map1 = new HashMap<>(); //����ޱ� ���� map1 ���� (����, ����)
		
        Student s = new Student();
        
        //s.insertSub("Ǯ",500, map1);
        
        
        
        int menu = 0 ;
		
		do {
			System.out.println("---�л���----");
			System.out.println("1.�л��Է� | 2.�л�������� | 3.�л���������");
			System.out.println("4.�л��������� | 5.�л������˻� | 6.���������߰�");
			System.out.println("7.����������� | 8.����������� ");
			System.out.println("9.������û / 0.����");
			System.out.println("> menu >");
			
			menu = scan.nextInt();
			
			
			//���� ����� �����ϴ� ó����
			
			switch(menu) {
			case 1:
				System.out.println("�л������Է�");
				s.addStd(scan);	break;
				
			case 2:
				System.out.println("�л��������"); 
				s.searchStd(scan); 
				
				break;
				
			case 3:
				System.out.println("������ �л��� �Է����ּ���.");
				s.delStd(scan);
				System.out.println("������ �л������Է�");
				s.addStd(scan);	break;
				
			case 4:
				System.out.println("������ �л��� �Է����ּ���.");
				s.delStd(scan);
				
			
				break;
			case 5:
				System.out.println("�˻��� �л��� �Է����ּ���.");
				s.searchStd(scan);

				break;
			case 6:
				System.out.println("�����߰��� ������ �Է����ּ���.");
				
				s.delStd(scan);
			
				
				
				break;
			case 7:
				System.out.println("����������� �� ��������.");
				s.modSub(scan);
			
				
				
				break;
			case 8:
				System.out.println("������ �л��� �Է����ּ���.");
				s.delStd(scan);
			
				
				
				break;
		
			case 9:
				s.regSub(scan);
				
				
				
				break;
				
			}
			
		}while(menu!=0);
		System.out.println("����");

	}

}
