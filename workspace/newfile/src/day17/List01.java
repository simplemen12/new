package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * �Ϸ� �ϰ��� �����ϴ� list�� ����
		 * ��� for / ���� for / iterator ���
		 * 
		 */
		ArrayList<String> list4 = new ArrayList<>();
		list4.add("�̺�����");
		list4.add("���尡��");
		list4.add("����Ļ� ���");
		list4.add("��ϱ�");
		list4.add("�ڱ� �� �ϱ⾲��");
		System.out.println(list4);
		System.out.println("list4�� ũ���"+list4.size());
		
		ArrayList<Integer> number = new ArrayList<>();
		
		
		Integer a = 9;
		System.out.println(">>Iterator ���");
		Iterator<String> it = list4.iterator();
		while(it.hasNext()) {//hasNext()���� ��Ұ� �ִ��� üũ true / false
			String tmp = it.next(); // next() ������� ��������
			System.out.println(tmp+ " ");
			
		}
		System.out.println();
		
		//indexOf(��) : �ش� ���� list�� index��ȯ / ���ٸ� -1 ���� 
		System.out.println(number.indexOf(a));
		System.out.println(number.contains(a));
		
		System.out.println("���� ����");
		for(String s1 : list4) {
			System.out.println(s1);
		}
		
		
		ArrayList<String> list = new ArrayList<String>();
		//��Ʈ�� ����Ʈ o ������ �ڵ� ����Ʈ 
		list.add("���");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		
		for(String s : list) {
			System.out.println(s+" / ");
			
		}
		System.out.println();
		
		
		Iterator<String> it1 =  list.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp+" / ");
			
			}
		
		System.out.println();
		
		
		//����
		
	        list.sort(new Comparator<String>() {
			
			
			
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
	
		
		

	}

}
