package day17;

import java.util.HashMap;
import java.util.Iterator;

public class Map {

	public static void main(String[] args) {
		/*
		 * Map
		 * - 값을 2개 쌍으로 저장, key / value
		 * 
		 * - key : 중복 불가, value : 중복가능.
		 * 
		 * - HashMap을 가장많이 사용
		 * 
		 * HashMap<클래스,클래스> map = new HashMap<클래스,클래스>();
		 * 
		 * map은 값이 2개이기 떄문에 향상된 for / iterator 사용 안됨.
		 * 
		 * map의 key => set으로 구성 후 출력 
		 * list, set => add(): 추가 
		 * map => put() : 추가 
		 * getkey(), getvalue() // 추출 가능
		 */
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("apple", 2000);
		map.put("Banna", 1000);
		map.put("Orange", 1500);
		map.put("peach", 4000);
		map.put("kiwi", 3000);
		
		System.out.println(map);
		System.out.println(map.keySet()); //key만 별도로 set 구성  > apple banna orange
		System.out.println(map.values()); // value만 별도로 구성 > 2000 1000 1500
		System.out.println(map.get("apple")); // values값만 구성
		
		
		//remove 가능 => key 값을 삭제하면서 value 값을 리턴
		System.out.println(map.remove("apple"));
		System.out.println(map.remove(map.remove("apple")));
		System.out.println(map.remove(map.remove("a"))); //null리턴
		System.out.println(map.remove(map.remove("apple",2000))); //true false
		System.out.println(map);
		
		System.out.println("-----------------------");
		int sum=0;
		//향상된 for 출력
		for(String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));// key에 대한 values 리턴
			
			sum+=map.get(key); //map의 value를 누적
			System.out.println(sum);
		}
		System.out.println("-----------------------");
		//iterator 출력
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
		System.out.println(key+":"+map.get(key));	
		}
	}

}
