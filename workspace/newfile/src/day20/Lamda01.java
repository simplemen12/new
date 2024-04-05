package day20;

import java.util.ArrayList;

public class Lamda01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lambda : 람다식 (메서드를 단순하게 표현하는 방법) / 외부 자료의 부수적인 영향(side effect)를
		 * 주지 않도록 구현하는 방식
		 * Lambda + stream => 람다와 스트림
		 * stream : 자료의 대상과 관계없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		 * - 메서드 체이닝 기법을 사용
		 * 
		 * 
		 * 
		 * 
		 * lambda fuctions : 람다함수 => 익명클래스를 사용하여 쓰는 함수 
		 * 람다의 장범 : 코드의 간결성, 병렬처리 가능, 불필요한 코드를 최소화 할 수 있다.
		 * 단점 : 가독성이 떨어진다. 반복문 사용시 성능 저하 
		 *  - 람다의 표현식 
		 *  (매개변수) -> {구현};
		 *  매개변수가 1개면 ()생략가능. 
		 *  x -> {return x+1};
		 *  return이 없으면 {} 생략가능
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
		
		
		System.out.println("-------람다식--------");
		
		list.forEach(n->{
			System.out.println(n+" ");
		});
		
		
		

	}

}
