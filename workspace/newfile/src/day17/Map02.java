package day17;

import java.util.HashMap;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ����� ������ �Է� �޾� (Scanner) map�� ���� �� ���
		 * 
		 * �հ�, ��� ���
		 * 
		 * ���� Ű���尡 ���ö� ���� �ݺ� (1=��� / 0=����)
		 * 
		 * ����� ������ �Է����ּ���> 
		 * 
		 * ���� 89
		 * ����78
		 * 0 ����
		 * map���� ���� �� ���
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("1:��� / 0: ����");
		int e=1;
		int g=0;
		
		e = scan.nextInt();
		int sum =0;
		int sum1 =0;
		int a=0;
		String b="1";
		
		HashMap<String, Integer> map = new HashMap<>();
		while(e!=0) { //����� 0 �� �Էµ� ������ �ݺ�
			
			System.out.println("������ �Է��� �ּ���");
			
			
			
			b = scan.next(); //���� �Է�
			System.out.println("������ �Է��� �ּ���");
			
			a = scan.nextInt(); //���� �Է�
		
			

			
			map.put(b, a);
		//	sum+=map.get(a); //map�� value�� ����
			System.out.println(map.keySet()); //key�� ������ set ����  > apple banna orange
			System.out.println(map.values()); // value�� ������ ���� > 2000 1000 1500
			
			System.out.println("-------------");
			
		
			System.out.println(map.get("����"));
			System.out.println(map.get("����"));
			System.out.println("-------------");
			
			System.out.println("1:��� / 0: ����");
			e = scan.nextInt();
	
			
		}
		System.out.println("-------------");
		System.out.println("-------����-----");
		
		
		
		
		int count1=0;
		int count2=0;
		for(String key : map.keySet()) {
		
			System.out.print(sum+=map.get("����"));
			sum+=map.get(key); //map�� value�� ����
			count1++; //��� �ϳ� ������ ���� ��հ��� ���� ���� count1 ����
			System.out.println(sum);
		}
		
		
		System.out.println("-------------------------------");
		for(String key : map.keySet()) {
			
			System.out.print(sum1+=map.get("����"));
			sum1+=map.get(key); //map�� value�� ����
			count2++; //���а� �ϳ� ������ ���� ��հ��� ���� ���� count2 ����
			System.out.println(sum1);
		}
		
		System.out.println("=============================");
		System.out.println((sum+=map.get("����"))/count1);
		System.out.println((sum+=map.get("����"))/count2);
		
		System.out.println(sum+=map.get("����"));
		System.out.println(sum+=map.get("����"));
	
	
		
		
		
		
//		
//		map.get("apple");
//		for(int i=0; i<map.langth; i++) {
//		if(map.get("����")='����') {
//			
//		}
//		}
		
		scan.close();
		
		
		
		
		
		
		
	}

}
