package day18;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Wordmain {

	public static void main(String[] args) throws IOException {
		/*
		 * �ܾ��� ���α׷� �ۼ�
		 * 
		 * 1. �ܾ��� | 2. �ܾ�˻� | 3. �ܾ���� | 4. �ܾ���� | 5. �ܾ���� | 6.����
		 * wordMangerŬ���� �����Ͽ� �޼��� ����
		 * 
		 * map�� �̿��Ͽ� �ܾ� ���
		 * �⺻�ܾ� ��� (5���� ���)
		 * do while main���� �ݺ� ����  
		 * 
		 */
		
		wordManger m = new wordManger(); //wordMangerŬ���� ��ü����
		
		HashMap<String, String> map1 = new HashMap<>(); //�ܾ���� main map1����
		HashMap<String, String> wm = new HashMap<>(); //�ܾ���� main map1����
		
		Scanner scan = new Scanner(System.in);
		int menu = 0 ;
		
		do {
			System.out.println("---memo----");
			System.out.println("1.�ܾ��� | 2.�ܾ�˻� | 3.�ܾ����");
			System.out.println("4.�ܾ���� | 5.�ܾ���� | 6.����� �ܾ��Ʈ Ȯ��");
			System.out.println("0.���� �� �ܾ��� ���ϻ���");
		
			
			menu = scan.nextInt();
			
			
			//���� ����� �����ϴ� ó����
			
			switch(menu) {
			case 1:
				
				//wm.insertword(scan);
			
				
				
				
				//���ϱ� �޼���  
				System.out.println("�Է� �� �ܾ �����ּ���.");
				String a="";
				String b="";
				a=scan.next(); //��Ʈ������ �Է� ���� ���� �־���
				
				System.out.println("�Է� �� �ܾ��� ���� �����ּ���.");
				b=scan.next(); // 
				m.printMap(a,b,map1);
				
				
				FileWriter fw = new FileWriter("writer2.txt");
				String data =  " test \r\n"; 
				fw.write(data); //���
				fw.write(a);
				
				FileWriter fw2 = new FileWriter("writer2.txt");
				String data2 =  " test \r\n"; 
				fw2.write(data2); //���
				fw2.write(b);
				
				break;
			case 2:
				System.out.println("�˻� �� �ܾ �����ּ���.");
				a="";
				a=scan.next(); //��Ʈ������ �Է� ���� ���� �־���
				
				map1.keySet();
				//map1.remove();
				map1.values();
				if(map1.get(a) != null) {
					System.out.println(a);
				}
				
		
				
				break;
			case 3:
				System.out.println("���� �� �ܾ �����ּ���.");
				a="";
				a=scan.next(); //��Ʈ������ �Է� ���� ���� �־���
				if(map1.get(a) != null) {
					
					map1.remove(a);//������ �ܾ� ����
					m.printMap(a,null,map1);
					System.out.println(a);
					
				}
				System.out.println("���� �� �Է��� �ܾ �����ּ���.");
				
				
				a=scan.next(); //��Ʈ������ �Է� ���� ���� �־���
				
				System.out.println("���� �� �ܾ��� ���� �����ּ���.");
				b=scan.next(); // 
				m.printMap(a,b,map1);
				break;
			case 4:
				System.out.println("����� �ܾ����");
				m.printMap1(map1);				
				break;
			case 5:
				System.out.println("������ �ܾ �Է����ּ���.");
				
				a="";
				a=scan.next(); //��Ʈ������ �Է� ���� ���� �־���
				
			
				map1.remove(a);
				
				break;
				
				//System.out.println("�߸��� �޴��Դϴ�.");
			case 6:
				System.out.println("����� Ȯ��"+map1);
				break;
				
			case 7:
				
				break;
				


			
			
			
			
			}//����ġ
		}while(menu!=7);
		
	}
}
			
		
	
			

	
		
		
	
		
	
