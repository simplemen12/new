package day19;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		/*
		 * 중복저장 x 
		 * set 로또번호 6개 생성후 출력
		 * 
		 */
		
		 // 1~45까지의 생성


		HashSet<Integer> set = new HashSet<Integer>(6);
		for(int i=0; i<7; i++) {
			int random = (int)(Math.random()*45)+1;
			//System.out.println("-");
			set.add(random);
		}
		System.out.println(set);
		
		//set중에서 정렬이 되는 set TreeSet
		TreeSet<Integer> treeSet = new TreeSet<>();
		while(treeSet.size()<6) {
			int random1 = new Random().nextInt(45)+1;
			treeSet.add(random1);
		}
		System.out.println(treeSet.first()); //first() 가장 앞에 있는 값 / last() 가장 뒤에 있는 값
		System.out.println(treeSet.last()); //first() 가장 앞에 있는 값 / last() 가장 뒤에 있는 값
		System.out.println(treeSet.headSet(20)); //headSet 지정한 값보다 작은 값 / tailset 지정한 값보다 큰값
		System.out.println(treeSet.tailSet(20)); //headSet 지정한 값보다 작은 값 / tailset 지정한 값보다 큰값
		
		//subSet 검색 범위 지정 뒤쪽 값은 미포함
		System.out.println(treeSet.subSet(15, 30));//15- 30사이의 값 30은 미포함
	}

}
