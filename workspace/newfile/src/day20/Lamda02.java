package day20;

import java.util.HashMap;

public class Lamda02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//map을 구성하여 forEach를 사용하여 출력
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("길동", 2);
		map.put("영이", 3);
		map.put("순이", 4);
		map.put("길삼", 5);
		map.put("길사", 6);
		
		map.forEach((x,y)->{
			System.out.println(x+y+" ");
		});
		
		/*
		ConcurrentHashMap<Integer> method = (n)->{
			system.out.print(n+" ");
		}
		*/
		System.out.println("consumer을 이용한 출력");
		//map.forEach(method);
		
		
		
//		Number add = (a,b) -> {
//			return a+b;
//		};
//		
//		int hap = sum.add(50,60);
//		System.out.println(sum.add(100,200));
		
		Number max = (a,b)-> (a>=b)? a:b;//함수구 
	
	}

}

//함수형 인터페이스
//메서드가 반드시 1개여야만 함.
@FunctionalInterface //Fun + 컨트롤 + 스페이스 단축기
interface Number{
	int add(int a, int b);
	
}