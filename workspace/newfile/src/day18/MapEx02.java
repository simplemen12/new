package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx02 {

	public static void main(String[] args) {
		/*
		 * 단어장
		 * 단어 5개를 입력받아 콘솔에 출력하는 기능 
		 * 
		 * ---단어장---
		 * hello : 안녕
		 * apple : 사과
		 * orange : 오렌지
		 * map에 저장 후 출력
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		 String a = "";
	     String b = "";
        HashMap<String, String> map1 = new HashMap<>();
        
        System.out.println("메모장입력");
        
        System.out.println("영어를 입력해주세요.");
        a=scan.next(); 
        
        System.out.println("한글을 입력해주세요");
        b=scan.next();    
   
		

        printMap(a,b,map1);


        scan.close();
        
        
        //선생님 답 
        HashMap<String, String> map0 = new HashMap<>();
        
        //Scanner scan = new Scanner(System.in);

        int size = 3;
        while(map0.size()< size) {
        	System.out.println("단어");
        	String word = scan.next();
        	
        	System.out.println("의미");
        	String mean = scan.next();
        	map0.put(word, mean);
        }
        
        Iterator<String> it = map0.keySet().iterator();
        while(it.hasNext()) {
        	String word = it.next();
        	String mean = it.next();
        	System.out.println(word+" "+mean);
        }

	}
	
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

}
