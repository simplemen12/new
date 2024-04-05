package std;

import java.util.HashMap;
import java.util.Scanner;

public class StdMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        HashMap<String, Integer> map1 = new HashMap<>(); //저장받기 위한 map1 생성 (과목, 점수)
		
        Student s = new Student();
        
        //s.insertSub("풀",500, map1);
        
        
        
        int menu = 0 ;
		
		do {
			System.out.println("---학생부----");
			System.out.println("1.학생입력 | 2.학생정보출력 | 3.학생정보수정");
			System.out.println("4.학생정보삭제 | 5.학생정보검색 | 6.과목점수추가");
			System.out.println("7.수강과목수정 | 8.수강과목삭제 ");
			System.out.println("9.수강신청 / 0.종료");
			System.out.println("> menu >");
			
			menu = scan.nextInt();
			
			
			//실제 기능을 구현하는 처리문
			
			switch(menu) {
			case 1:
				System.out.println("학생정보입력");
				s.addStd(scan);	break;
				
			case 2:
				System.out.println("학생정보출력"); 
				s.searchStd(scan); 
				
				break;
				
			case 3:
				System.out.println("수정할 학생을 입력해주세요.");
				s.delStd(scan);
				System.out.println("수정된 학생정보입력");
				s.addStd(scan);	break;
				
			case 4:
				System.out.println("삭제할 학생을 입력해주세요.");
				s.delStd(scan);
				
			
				break;
			case 5:
				System.out.println("검색할 학생을 입력해주세요.");
				s.searchStd(scan);

				break;
			case 6:
				System.out.println("점수추가할 과목을 입력해주세요.");
				
				s.delStd(scan);
			
				
				
				break;
			case 7:
				System.out.println("수강과목수정 및 점수수정.");
				s.modSub(scan);
			
				
				
				break;
			case 8:
				System.out.println("삭제할 학생을 입력해주세요.");
				s.delStd(scan);
			
				
				
				break;
		
			case 9:
				s.regSub(scan);
				
				
				
				break;
				
			}
			
		}while(menu!=0);
		System.out.println("종료");

	}

}
