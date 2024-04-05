package day18;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Wordmain {

	public static void main(String[] args) throws IOException {
		/*
		 * 단어장 프로그램 작성
		 * 
		 * 1. 단어등록 | 2. 단어검색 | 3. 단어수정 | 4. 단어출력 | 5. 단어삭제 | 6.종료
		 * wordManger클래스 생성하여 메서드 구현
		 * 
		 * map을 이용하여 단어 등록
		 * 기본단어 등록 (5가지 등록)
		 * do while main에서 반복 실행  
		 * 
		 */
		
		wordManger m = new wordManger(); //wordManger클래스 객체생성
		
		HashMap<String, String> map1 = new HashMap<>(); //단어장용 main map1생성
		HashMap<String, String> wm = new HashMap<>(); //단어장용 main map1생성
		
		Scanner scan = new Scanner(System.in);
		int menu = 0 ;
		
		do {
			System.out.println("---memo----");
			System.out.println("1.단어등록 | 2.단어검색 | 3.단어수정");
			System.out.println("4.단어출력 | 5.단어삭제 | 6.출력전 단어리스트 확인");
			System.out.println("0.종료 및 단어장 파일생성");
		
			
			menu = scan.nextInt();
			
			
			//실제 기능을 구현하는 처리문
			
			switch(menu) {
			case 1:
				
				//wm.insertword(scan);
			
				
				
				
				//더하기 메서드  
				System.out.println("입력 할 단어를 적어주세요.");
				String a="";
				String b="";
				a=scan.next(); //스트링으로 입력 받은 것을 넣어줌
				
				System.out.println("입력 할 단어의 뜻을 적어주세요.");
				b=scan.next(); // 
				m.printMap(a,b,map1);
				
				
				FileWriter fw = new FileWriter("writer2.txt");
				String data =  " test \r\n"; 
				fw.write(data); //기록
				fw.write(a);
				
				FileWriter fw2 = new FileWriter("writer2.txt");
				String data2 =  " test \r\n"; 
				fw2.write(data2); //기록
				fw2.write(b);
				
				break;
			case 2:
				System.out.println("검색 할 단어를 적어주세요.");
				a="";
				a=scan.next(); //스트링으로 입력 받은 것을 넣어줌
				
				map1.keySet();
				//map1.remove();
				map1.values();
				if(map1.get(a) != null) {
					System.out.println(a);
				}
				
		
				
				break;
			case 3:
				System.out.println("수정 할 단어를 적어주세요.");
				a="";
				a=scan.next(); //스트링으로 입력 받은 것을 넣어줌
				if(map1.get(a) != null) {
					
					map1.remove(a);//수정할 단어 삭제
					m.printMap(a,null,map1);
					System.out.println(a);
					
				}
				System.out.println("수정 후 입력할 단어를 적어주세요.");
				
				
				a=scan.next(); //스트링으로 입력 받은 것을 넣어줌
				
				System.out.println("수정 한 단어의 뜻을 적어주세요.");
				b=scan.next(); // 
				m.printMap(a,b,map1);
				break;
			case 4:
				System.out.println("저장된 단어출력");
				m.printMap1(map1);				
				break;
			case 5:
				System.out.println("삭제할 단어를 입력해주세요.");
				
				a="";
				a=scan.next(); //스트링으로 입력 받은 것을 넣어줌
				
			
				map1.remove(a);
				
				break;
				
				//System.out.println("잘못된 메뉴입니다.");
			case 6:
				System.out.println("출력전 확인"+map1);
				break;
				
			case 7:
				
				break;
				


			
			
			
			
			}//스위치
		}while(menu!=7);
		
	}
}
			
		
	
			

	
		
		
	
		
	
