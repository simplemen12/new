package day18;

import java.util.HashMap;

public class MapEx01 {

	public static void main(String[] args) {
		/*
		 * map을 이용하여 상품과 가겪을 추가하여 합계를 구하시오.
		 * 
		 * 상품에 map을 추가하는 작업은 메서드를 활용
		 * 1. map을 main에 생성해 놓고, 매개변수로 받아 map의 데이터를 채우는 메서드
		 * 2. map을 메서드 내부에서 생성하여, main으로 리턴하는 메서드  
		 * 
		 * 가위 2500 map.해서 입력 
		 * 크레파스 4000
		 * 물감 5000
		 * 합계 ? 
		 */
		HashMap<String, Integer> map1 = new HashMap<>();
		
		printMap("풀",500, map1);
		printMap("가위",1500,map1);
		printMap("도화지",1000,map1);
		printMap("글루건",2500,map1);
		printMap("카드",500,map1);
		
		HashMap<String, Integer> map0 = new HashMap<>();
		
		
		MapEx01 m = new MapEx01();
		//m.makeMap(map0);
		int sum0 = 0;
		
		for(String s : map0.keySet()) {
			sum0+= map0.get(s);
			System.out.println();
		}
		
		
		HashMap<String, Integer> map = m.MakeMap2(); //메서드에서 만든 map을 받아주는 map
		System.out.println(map);
		
	
		
		

	}
	//map을 매개변수로 받는 케이스
	public static HashMap<String, Integer> printMap(String a, int b, HashMap<String, Integer> map1) {
		//HashMap<String, Integer> map1 = new HashMap<>();
		
	
	
		map1.put(a, b);
		
		System.out.println(map1);
		
		int sum=0;
		//향상된 for 출력
		for(String key : map1.keySet()) {
			System.out.println(key+":"+map1.get(key));// key에 대한 values 리턴
			
			sum+=map1.get(key); //map의 value를 누적
			System.out.println(sum);
		}
		
	
		 return map1;
	}
	
	//map을 내부에서 생성하여 리턴하는 케이스
	public static HashMap<String, Integer> printMap1(String a, int b, HashMap<String, Integer> map1) {
		HashMap<String, Integer> map2 = new HashMap<>();
		
		
		
		map2.put(a,b);// 외부 반출용
	
	
		map1.put(a, b); //왜부에서 입력 받은 map1
		
		System.out.println(map1);
		
		int sum=0;
		//향상된 for 출력
		for(String key : map2.keySet()) {
			System.out.println(key+":"+map2.get(key));// key에 대한 values 리턴
			
			sum+=map2.get(key); //map의 value를 누적
			System.out.println(sum);
		}
		
	
		 return map2;
	}
	
	
	
	//1 map을 매개변수로 받는 케이스
	public HashMap<String, Integer> makeMap(HashMap<String,Integer>map,String a) {  
		map.put(a,1);
		
		return map;
	}
	
	
	//2map을 내부에서 생성하여 리턴
	public HashMap<String,Integer> MakeMap2(){
		HashMap<String, Integer>map = new HashMap();
		
		map.put("풀", 13);
		map.put("가위", 14);
	
		return map;
	}
	
	
	//map을 받아서 출력하는 메서드
	public void printMap(HashMap<String,Integer>map2) {
		int sum=0;
		for(String key : map2.keySet()) {
			System.out.println(key+":"+map2.get(key));// key에 대한 values 리턴
			
			sum+=map2.get(key); //map의 value를 누적
			System.out.println(sum);
		}
	}

}
