package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ����29 {

	public static void main(String[] args) {
		/*
		 * ���ڸ� �Է¹޾� �Է¹��� ���ڸ� list�� �����ϰ�, ��� 
		 * �հ踦 ���
		 * �Է� : 45 , 78, 89, 97, 68, 57, 48 => String
		 * 
		 * list�� �ְ�, ��� => �հ�(�ο���) ���
		 * 70�� �̻� ���� ���� ���
		 * 
		 */
		
		String num = "45,78,97,68,57,48";
		
		ArrayList<Integer> number = new ArrayList<Integer>(); //���ڿ��� ���� ���ڸ� ���� int�� ��ȯ�� �Է��� List 


		Scanner scan = new Scanner(System.in);
		System.out.println("1:��� / 0: ����");
		int e=1;
		int g=0;
		int a1=0;
		int cnt=0;
		e = scan.nextInt();
		int sum =0;
		int sum1=0;
		int sum3=0;
		int a=0;
		String b="1";
		

		
		
		
		while(e!=0) { //����� 0 �� �Էµ� ������ �ݺ�
			
		
			
			System.out.println("���ڸ� �Է��� �ּ���[String]");
			
			
			
			b = scan.next(); //���� �Է�
			a1 = Integer.parseInt(b); //���ڸ� ���ڷ� ��ȯ �� ���� int���� ���� a1�� �Է�
			
			number.add(a1); //���� a1�� number����Ʈ�� �Է�
			
			for(int i=0; i<number.size(); i++) { //
				cnt++; //��� ������� cnt
			}
			
			sum3 += a1; //�Էµ� ���ڸ� ��� �� �Ѵ�
			
			System.out.println("�ǽð� ������ �� "+sum3);
			
			
			
			
		
			

		
			System.out.println("-------------");
			
	
			System.out.println("1:��� / 0: ����");
			e = scan.nextInt();
	
			
		}
		System.out.println("-------------");
		System.out.println("-------����-----");
		
		System.out.println("�Էµ� ���� ���"+sum3/cnt);
		

	
		
		
		

		scan.close();
		
		
		
		
		
		
		
	}
	
}