package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ��������Ʈ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭�� ����Ʈ�� ������ ��
				//List<Integer> List = new ArrayList<Integer>(Arrays.asList(arr));
		Scanner scan = new Scanner(System.in);
		System.out.println("�Է�");
		String num = "45,78,89,97,68,57,48";
		
		List<Integer> List = new ArrayList<Integer>(Arrays.asList());
		
		String[] numbers =  num.split(",");
		
		//int[] tmp = 
		
	
		
		for(String n : numbers) {
			List.add(Integer.parseInt(n)); //String�� int�� ��ȯ
			System.out.println(n);
		}
		
		
		int sum=0;
		int count=0;
		for(int tmp : List) {
			sum=+tmp;
			if(tmp>=70) {
				count++;
			}
		}
		System.out.println("����"+sum+"   70�� �̻�"+count);
		
		
	
		scan.close();

	}

}
