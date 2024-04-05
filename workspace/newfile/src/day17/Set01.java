package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set01 {

	public static void main(String[] args) {
		/*
		 * Set 순서보장x, 중복x
		 * HashSet(대표적인 Set 컬렉션 구현 클래스/ 정렬이 안됨)
		 * TreeSet(정렬이 되는 set)
		 */
		
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("peach");
		set.add("orange");
		set.add("fruth");
		set.add("apple");
		System.out.println(set); // 지마음대로 들어감
		
		//index가 없어서 get메서드가 없다.
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
		
		
		
		//set정렬 : set은 순서가 없어서 정렬이 안됨.
		//set => list로 반환 후 정렬
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);
		System.out.println(list);

	}

}
