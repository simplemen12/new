package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * List, Set, Map => �������̽�. �ݵ�� ���� Ŭ������ ��ü�� ���� //��� ��� �ڹ� c ���̽� ���� ���
		 * 
		 * �����͸� ��� ������ �� ���
		 * �ַ� �迭��� ���  
		 * List[�迭�� ����]
		 * - ���� �ϳ��� ����
		 * - ������ ���� [indext]
		 * - �ߺ��� ��� 
		 * - �迭 ��ſ� ���� ���� ����ϴ� ����
		 * 
		 * 
		 * 
		 * Set 
		 * - ���� �ϳ��� ����
		 * - ������ �������� ����[index�� ����]
		 * - �ߺ����x [���� �ڷᰡ �ԷµǸ� ������]
		 * 
		 * 
		 * 
		 * 
		 * Map
		 * - ���� �ΰ��� ���� key / value ������ ����  
		 * - key�� �ߺ��� �Ұ��� / value�� �ߺ�����. /Ű�� �������� ������ ������ ���  
		 * - key�� �ߺ��Ǹ� value�� ����� ��.
		 * - ���̵�/�н������ ���� �ϳ��� �ڷḦ ��� �����ؾ� �� �� ��� 
		 * 
		 * 
		 * �迭�� �⺻�ڷ���, Ŭ���� �ڷ��� ������ ������.
		 * int arr[], String arr[], Student arr[] �� ���� .
		 * 
		 * collection������ �⺻�ڷ����� �Ұ����� Ŭ���� �ڷ����� ��������. 
		 * 
		 * �⺻ �ڷ����� �´� Ŭ���� �ڷ����� ����ϸ� ��.
		 * int => Integer, String
		 * �������� �⺻�ڷ����� ù���ڸ� �빮�ڷ� ��ȯ�ϸ� Ŭ������ ��.
		 * long => Long, byte => Byte, boolean => Boolean ...  
		 * 
		 * ���� Ŭ������ �������� ������ Object�� �ڵ� ������.
		 * 
		 * List<Ŭ������> ��ü�� = new ����Ŭ����<Ŭ������>();
		 * List = >  ���� Ŭ���� ArrayList, LinkedList
		 * 
		 * ArrayList : �˻� �� ����  (�迭�� ���)
		 * - �̸� ���̸� �������� ����. �߰��Ǹ� �þ. �����Ǹ� �پ�� 
		 * - �߰�, ������ ����. �˻��ϴ� �͵� ����.
		 * 
		 * 
		 * 
		 * LinkedList : �߰�, ������ ���� ��� ����
		 * - ���� �߰��� �����ְų�, ���°� ����.
		 * - �˻��� ������. 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		List<Integer> list = new ArrayList<Integer>();//�θ� �������� ����
		ArrayList<Integer> list1 = new ArrayList<Integer>(10);//�ڽ� �������� ���� 
		
		ArrayList list2 = new ArrayList(); // object�� ����  
		
		ArrayList<Integer> list3 = new ArrayList<>();
		
		
		//add() : ��Ҹ� �߰�
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		//get(index) : index������ ��Ҹ� ��������
		System.out.println(list.get(0)); // get set�� ���� ���� �������� �����ü� �ִ�
		//set(index) : index������ ���� �����ϱ�
		list.set(0, 5);
		System.out.println(list.get(0));
		
		
		
	
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); //0���ٰ� i��  �ְ� for������ ������ ������ �ִ�
		}
		
		//size() : �Ѱ����� Ȯ�� 
		System.out.println(list.size());
		
		//���ڿ��� ���� �� �ִ� ArrayList�� ����
		//���ڿ� 5���� ������ �� ���.
		// �� ������ ������� ���  
		
		ArrayList<String> list4 = new ArrayList<>();
		list4.add("�ϳ�");
		list4.add("��");
		list4.add("��");
		list4.add("��");
		list4.add("�ټ�");
		System.out.println(list4);
		System.out.println("list4�� ũ���"+list4.size());
		
		//���� for���� ���� ���
		for(String s : list4) {
			System.out.println(s);
		}
		
		
		System.out.println("-------------");
		
		//list1�� 1���� 10���� ���� ������ �� ��� 
		for(int i=0; i<10; i++) {
			list1.add(i+1);
			//0���ٰ� i��  �ְ� for������ ������ ������ �ִ�
		}
		
		for(int s1 : list1) {
			System.out.println(s1);
		}
	
		//0���� ���� 7�� ���� �� ��� 
		list1.set(0, 7);
		System.out.println("---------------");
		for(int s1 : list1) {
			System.out.println(s1);
		}
		
		//remove(index) : index ������ ���� ����  
		//remove(object) : object�� ��Ҹ� ����
		list1.remove(0);
		System.out.println(list1);
		
		Integer a = 9;
		list1.remove(a);
		System.out.println(list1);
		
		//Contains(object): list�� ���� �ִ��� �˻� true  false�� ����
		System.out.println(list1.contains(a));
		
		//clear(); : ����Ʈ�� ��� (��� ���� ����)
		list.clear();
		System.out.println(list1);
		
		//isEmpty() : ����Ʈ ����ִ��� üũ ��������� true / false 
		System.out.println(list.isEmpty());
		
		//ArrayList�� number ���� ���ڸ� �����ϴ� ����Ʈ
		//1���� 10���� ä�� �� ���  (���� for���� �̿��Ͽ� ���)
		ArrayList<Integer> number = new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
			number.add(i);
		}
		System.out.println(number);
		
		
		/*
		 * Iterator : index�� ���� ���� ����ϱ� ���� ��� 
		 * list������ ������ �����ϱ� ������ get(i)�� ����Ͽ� ���ϴ� ������ ���ٰ��� 
		 * 
		 * set/map�� ������ �������� �ʱ� ������ �Ϲ� for���� ����� �� ����.
		 * ���� for, Iterator�� ���
		 * ������ ������� ���� ������ �� �ִ� ������ ����ؾ� ��. 
		 * map��  ���� for, Iterator �Ѵ� ���� ��� �Ұ���  
		 * 
		 */
		
		System.out.println(">>Iterator ���");
		Iterator<Integer> it = number.iterator();
		while(it.hasNext()) {//hasNext()���� ��Ұ� �ִ��� üũ true / false
			Integer tmp = it.next(); // next() ������� ��������
			System.out.println(tmp+ " ");
			
		}
		System.out.println();
		
		//indexOf(��) : �ش� ���� list�� index��ȯ / ���ٸ� -1 ���� 
		System.out.println(number.indexOf(a));
		System.out.println(number.contains(a));
		
		//number ����Ʈ�� ����, ���� �������� 5���� �߰�
		number.clear();
		number.add(92);
		number.add(82);
		number.add(72);
		number.add(92);
		number.add(32);
		number.add(22);
		number.add(21);
		number.add(12);
		System.out.println(number);
		
		//����
		//Collections.sort(); //���������� ���İ���
		
		Collections.sort(number);
		System.out.println(number);
		
		// sort(Comparator�� ������ ��ü) : ����
		//Compatator �������̽��� ������ ����ü�� �־�� ��. (�͸�Ŭ���� ���)
		//CompareTo �޼��带 �����Ͽ� ��ü�� ����
		// - compareTo : ������ �տ� ������ -1, ������ 0, �ڿ� ������ 1 
		System.out.println("Comparator�� �̿��� ����");
		number.sort(new Comparator<Integer>() {
			//o1 - o2 : �������� / o2 - o1 : �������� ���� 
			// �����  - �� ������ ������, + �� �ڷ� ������ ���� 
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println(number);
		
		
		
		
		
	}

}
