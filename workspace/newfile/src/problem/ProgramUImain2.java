package problem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class ProgramUImain2 {

	

		//플랫폼 대상은 공무원 시험 1일 1문제 해마 자극 및 개인 수험성의 인강 및 도움

		public static void main(String[] args) throws IOException {
			Scanner scan = new Scanner(System.in);
			//객체를 생성하는 것은 항상 미리 해놓고 메서드 호출
			//manager를 호출하기위한 객체
			//StudentManger sm = new StudenManager();
		    
			ArrayList<PgManager2> p = new ArrayList<>();
			
			PgManager2 sm = new PgManager2(); //메서드를 받기위한 객체생성
			
			
			int menu = 0;

			do {
				System.out.println("1. ox문제등록 2. 문제단원등록 3. 등록검색(문제등록,단원등록)/및 메모장");
				System.out.println("4. 문제풀기 5. 문제풀이결과정보 6. 문제풀이분석");
				System.out.println("7. ox문제변형 8.ox문제변형2 9.저장된 문제 출력");
				System.out.println("10. 종료");
				
				menu = scan.nextInt();
				
				//메뉴에 따른 분기 구현
				switch(menu) {
				case 1: sm.WorkbookRegister(scan); break;
				case 2: sm.SubjectRegister(scan); break;
				case 3: sm.Search(scan); break;
				case 4: sm.SolvingPb(scan); break;
				case 5: sm.Resert(scan); break;
				case 6: sm.ResertAnalysis(scan); break;
				case 7: sm.WorkbookModify(scan); break;
				case 8: sm.WorkbookModify2(scan); break;
				case 9: sm.ui(); break;
				
				default:
					System.out.println("잘못된 메뉴입니다.");
				}
			}while(menu != 10);
			
			System.out.println("종료");
			
			scan.close();

		

	}
	}
