package day15;

import java.util.Scanner;

import management.Stmg;

public class CustomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		//객체를 생성하는 것은 항상 미리 해놓고 메서드 호출 
		Scanner scan = new Scanner(System.in);
		//호출하기 위한 객체
		Customer sm = new Customer();
		int menu =0;
		do {
			
			
			//메뉴넣기 
			System.out.println("---menu----");
			System.out.println("1.고객등록 | 2.고객정보출력 | 3.상품구매");
			System.out.println("4.- | 5.- | 6.-");
			System.out.println(">>메뉴선택");
	menu = scan.nextInt();
	//메뉴에 따른 분기 구현
	switch(menu) {
	case 1: sm.insertCustomer(scan); break; // st 108 public void insertSubject(Scanner scan)
	case 2: sm.customerInfo();
		break;
	case 3: 
		System.out.println("고객명을 입력해주세요.");
		String cg = scan.next();
		System.out.println("상품가격을 입력해주세요");
		System.out.println();
		 int name = scan.nextInt();
		sm.price(cg,name);
		
		System.out.println("-----할인된 가격--------");
		System.out.println(sm.price(cg,name));
		break;
	
	//case 4: sm.registerSubject(scan);break;
	case 5: break;
	case 6: break;
	default:
		System.out.println("잘못된 메뉴입니다.");

			
			
		}
		}while(menu !=6 );
		
		
		
		
		scan.close();

	



	}
	
	//agentId = 1111 퇴사  => 3333으로 변경 

}
