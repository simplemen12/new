package management;

import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Studentmanger st1 = new Studentmanger();
		
	
		
		
		
		
	
		int menu = 0;
		do {
			System.out.println("---menu----");
			System.out.println("1.학생등록 | 2.학생리스트출력 | 3.학생검색(학생정보,수강정보)");
			System.out.println("4.수강신청 | 5.수강철회 | 6.종료");
			
			
			menu = scan.nextInt();
			
			
			//실제 기능을 구현하는 처리문
			
			switch(menu) {
			case 1:				
				System.out.println("1.학생등록");
				st1.insertStudent(scan); //
				break;
			case 2:
				System.out.println("2.학생리스트출력");
				st1.printSubjects();
				break;
			case 3:
				System.out.println("3.학생검색(학생정보,수강정보)");
				st1.searchStudent(scan);//
				break;
			case 4:
				System.out.println("4.수강신청");
				st1.registerSubject(scan);//
				break;
			case 5:
				System.out.println("5.수강철회");
				//st2.deleteSubject();
				break;
				default:
					System.out.println("종료");
				
				
			}
			
		}while(menu!=6);
		System.out.println("잘못 입력");
		
		scan.close();
    }
	
}
