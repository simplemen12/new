package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set01 {

	public static void main(String[] args) {
		/*
		 * Set ��������x, �ߺ�x
		 * HashSet(��ǥ���� Set �÷��� ���� Ŭ����/ ������ �ȵ�)
		 * TreeSet(������ �Ǵ� set)
		 */
		
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("peach");
		set.add("orange");
		set.add("fruth");
		set.add("apple");
		System.out.println(set); // ��������� ��
		
		//index�� ��� get�޼��尡 ����.
		for(String tmp : set) {
			System.out.println(tmp+" / ");
			
		}
		System.out.println();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			
			String tmp = it.next();
			System.out.println(tmp+" / ");
;
			}
		System.out.println();
		
		
		
		//set���� : set�� ������ ��� ������ �ȵ�.
		//set => list�� ��ȯ �� ����
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);
		System.out.println(list);

	}

}
