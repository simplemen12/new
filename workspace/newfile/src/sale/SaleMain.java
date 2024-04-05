package sale;

import java.util.Scanner;

import day19.SaleManager;

public class SaleMain {

	public static void main(String[] args) {
		/*
		 * 1.메뉴추가 2.메뉴삭제 3.메뉴수정(가격수정)
		 * 4.메뉴보기(전체메뉴출력) 5.주문 6.주문내역출력(영수증) 
		 * 7.종료
		 */
Scanner scan = new Scanner(System.in);
		
		SaleManager1 sm = new SaleManager1();
		Order sm1 = new Order();
		
		int menu = -1;
		
		do {
			System.out.println("1.메뉴추가 2.메뉴삭제 3.메뉴수정(가격수정) 4.메뉴보기(전체메뉴출력)");
			System.out.println("5.주문 6.주문내역출력(영수증)");
			
			menu=scan.nextInt();
			switch(menu) {
			case 1: sm.add(scan); break;  //do while로 만들고 함수 클릭한 뒤에 add
			
			case 2: sm.menudel(scan); break;
			
			case 3: sm.menuMod(scan); break;
				
			case 4: sm.menuPrint(); break;
			
			case 5: sm.menuOrder(scan); break;
			
			case 6: sm.menuOrderRec(); break;
			default:
				System.out.println("잘못된 메뉴");
			}
			
		}while(menu !=5);
		
		
		
		
		
		scan.close();

	}

}

