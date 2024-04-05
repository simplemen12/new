package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 하루 일과를 저장하는 list를 생성
		 * 출력 for / 향상된 for / iterator 출력
		 * 
		 */
		ArrayList<String> list4 = new ArrayList<>();
		list4.add("이불정리");
		list4.add("출장가기");
		list4.add("저녁식사 약속");
		list4.add("운동하기");
		list4.add("자기 전 일기쓰기");
		System.out.println(list4);
		System.out.println("list4의 크기는"+list4.size());
		
		ArrayList<Integer> number = new ArrayList<>();
		
		
		Integer a = 9;
		System.out.println(">>Iterator 출력");
		Iterator<String> it = list4.iterator();
		while(it.hasNext()) {//hasNext()다음 요소가 있는지 체크 true / false
			String tmp = it.next(); // next() 다음요소 가져오기
			System.out.println(tmp+ " ");
			
		}
		System.out.println();
		
		//indexOf(값) : 해당 값이 list에 index반환 / 없다면 -1 리턴 
		System.out.println(number.indexOf(a));
		System.out.println(number.contains(a));
		
		System.out.println("향상된 포문");
		for(String s1 : list4) {
			System.out.println(s1);
		}
		
		
		ArrayList<String> list = new ArrayList<String>();
		//컨트롤 시프트 o 누르면 자동 임포트 
		list.add("기상");
		list.add("수업");
		list.add("점심");
		list.add("수업");
		list.add("저녁");
		
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
		
		
		//정렬
		
	        list.sort(new Comparator<String>() {
			
			
			
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
	
		
		

	}

}
