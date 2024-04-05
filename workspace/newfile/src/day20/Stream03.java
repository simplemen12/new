package day20;

import java.util.ArrayList;
import java.util.Arrays;


public class Stream03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * StudentŬ������ ����Ʈ ����
		 * add�� 5�� �߰�
		 * ��Ʈ���� �̿��Ͽ� �ֿܼ� ��� ��) ȫ�浿 98 
		 */
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("ȫ�浿",98));
		list.add(new Student("��浿",97));
		list.add(new Student("ȫ��",96));
		list.add(new Student("ȫ",95));
		list.add(new Student("ȫ��",99));
		
		list.stream().forEach(n->{
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name+" "+score);
			
			
		});
		
		
		//list�� ���� �հ� / ��ü �ο��� ���
		list.stream().forEach(n->{
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name+" "+score);
			
			

		});
		
		//�����հ�
		
		int sum = list.stream().mapToInt(n->n.getScore())
				.sum();
		System.out.println("�����հ�"+sum);
		
		
		//�ο���
		long count = list.stream().count();
		
		System.out.println(count);
		
	
		

	}

}
