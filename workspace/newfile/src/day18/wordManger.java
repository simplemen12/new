package day18;

import java.util.HashMap;
import java.util.Scanner;

public class wordManger {
	
	
	Scanner scan = new Scanner(System.in);
	
	private HashMap<String,String> map  = new HashMap<>(); //이렇게 접근하면 get set 할 필요가 없다 왜일까
	
	public void addword() {
		map.put("애플", "apple");
	}
	
	public void insertword(Scanner scan) {
		System.out.println("단어");
		String word = scan.next();
		
		System.out.println("뜻");
		String mean = scan.next();
		
		map.put(word, mean);
	}
	
	public void searchword(Scanner scan) {
		System.out.println("검색할 단어");
		String word = scan.next();
		if(map.containsKey(word)) {
			System.out.println(word+" "+map.get(word));
			return;
		}
	}
	
	public void modifyword(Scanner scan) {
		System.out.println("수정할 단어");
		String word = scan.next();
		if(map.containsKey(word)) {
			System.out.println("의미");
			String mean = scan.next();
			map.remove(word);
			map.put(word, mean);
			return;
		}
		System.out.println("수정할 단어가 없습니다.");
	}
	
	
	
	
	//메모장 메서드 
	//멤버변수 map구성 
	public static HashMap<String, String> printMap(String a, String b, HashMap<String, String> map1) {
		//HashMap<String, Integer> map1 = new HashMap<>();
		

		map1.put(a, b);
		
		System.out.println(map1);
		
	
		
		int sum=0;
		//향상된 for 출력
		for(String key : map1.keySet()) {
			System.out.println(key+":"+map1.get(key));// key에 대한 values 리턴
			
			//sum+=map1.get(key); //map의 value를 누적
			System.out.println(sum);
		}
		
	
		 return map1;
	}
	
	//저장된 단어출력 메서드
	public void printMap1(HashMap<String,String>map2) {
		int sum=0;
		int cnt=0;
		for(String key : map2.keySet()) {
			cnt++;
			System.out.println(cnt+"번"+key+":"+map2.get(key));// key에 대한 values 리턴
			
			//sum+=map2.get(key); //map의 value를 누적
			System.out.println();
		}
	}
	
	//삭제 메서드
	public void remove(HashMap<String,String>map2) {
		/*
		int sum=0;
		System.out.println("검색 할 단어를 적어주세요.");
		a="";
		a=scan.next(); //스트링으로 입력 받은 것을 넣어줌
		
	
		map1.remove(a);
	}
	*/
	}
	
	
}
