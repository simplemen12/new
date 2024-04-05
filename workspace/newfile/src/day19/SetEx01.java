package day19;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		/*
		 * �ߺ����� x 
		 * set �ζǹ�ȣ 6�� ������ ���
		 * 
		 */
		
		 // 1~45������ ����


		HashSet<Integer> set = new HashSet<Integer>(6);
		for(int i=0; i<7; i++) {
			int random = (int)(Math.random()*45)+1;
			//System.out.println("-");
			set.add(random);
		}
		System.out.println(set);
		
		//set�߿��� ������ �Ǵ� set TreeSet
		TreeSet<Integer> treeSet = new TreeSet<>();
		while(treeSet.size()<6) {
			int random1 = new Random().nextInt(45)+1;
			treeSet.add(random1);
		}
		System.out.println(treeSet.first()); //first() ���� �տ� �ִ� �� / last() ���� �ڿ� �ִ� ��
		System.out.println(treeSet.last()); //first() ���� �տ� �ִ� �� / last() ���� �ڿ� �ִ� ��
		System.out.println(treeSet.headSet(20)); //headSet ������ ������ ���� �� / tailset ������ ������ ū��
		System.out.println(treeSet.tailSet(20)); //headSet ������ ������ ���� �� / tailset ������ ������ ū��
		
		//subSet �˻� ���� ���� ���� ���� ������
		System.out.println(treeSet.subSet(15, 30));//15- 30������ �� 30�� ������
	}

}
