package day20;

import java.util.ArrayList;

public class Lamda01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lambda : ���ٽ� (�޼��带 �ܼ��ϰ� ǥ���ϴ� ���) / �ܺ� �ڷ��� �μ����� ����(side effect)��
		 * ���� �ʵ��� �����ϴ� ���
		 * Lambda + stream => ���ٿ� ��Ʈ��
		 * stream : �ڷ��� ���� ������� ������ ������ ������ �� �ֵ��� ���ִ� �ݺ���
		 * - �޼��� ü�̴� ����� ���
		 * 
		 * 
		 * 
		 * 
		 * lambda fuctions : �����Լ� => �͸�Ŭ������ ����Ͽ� ���� �Լ� 
		 * ������ ��� : �ڵ��� ���Ἲ, ����ó�� ����, ���ʿ��� �ڵ带 �ּ�ȭ �� �� �ִ�.
		 * ���� : �������� ��������. �ݺ��� ���� ���� ���� 
		 *  - ������ ǥ���� 
		 *  (�Ű�����) -> {����};
		 *  �Ű������� 1���� ()��������. 
		 *  x -> {return x+1};
		 *  return�� ������ {} ��������
		 *  x - > x+1;
		 *  (x,y) -> x+y;
		 *  (x,y) -> {return x+y;}
		 *  
		 *  
		 *  
		 *  
		 *  
		 */
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(45);
		list.add(34);
		list.add(29);
		list.add(53);
		list.add(44);
		list.add(52);
		list.add(12);
		list.add(145);
		
		for(Integer tmp : list) {
			System.out.println(tmp+" ");
		}
		
		
		System.out.println("-------���ٽ�--------");
		
		list.forEach(n->{
			System.out.println(n+" ");
		});
		
		
		

	}

}
