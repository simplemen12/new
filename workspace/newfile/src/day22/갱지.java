package day22;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a=0;
		System.out.println("������ ������ �Է��ϼ���.");
		int num = scan.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++) {
			a = (int)(Math.random()*99)+0;
			//System.out.println(a+"������������");
			sum=sum+a;
			
			//System.out.println(sum+"������������");
		}
		System.out.println("����"+num+"���� ����"+sum);
		
		*/
		
		
		//���� �迭���� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ� 
		//�� �������� �迭����,for��,���๮,��¹�,������� 
		
		
		        // �迭 ����
		        int[][] b = {{10, 20, 50}, {20, 30, 15}, {100, 110, 120}};
		        
		      
		        int sum1 = 0;

		        for (int i = 0; i < b.length; i++) {
		            for (int j = 0; j < b[i].length; j++) {
		                sum1 += b[i][j];
		            }
		        }

		        System.out.println("�迭������: " + sum1);

		     
		    }
		
	}




