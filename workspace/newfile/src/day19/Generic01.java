package day19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Generic01 {

	public static void main(String[] args) {
		
		/*
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<E>();
		//제네릭 : 데이터의 타입을 나중에 확정하는 기법
		
		HashMap<String, String> map = new HashMap<K, V >();
		
		//클래스나 메서드를 선언할 떄 string에 들어오는 데이터가 확신할 수 없다면
		//generic 타입으로 구현하게 되면 나중에 객체를 확정하여 구현
		
		//객체의 타입을 컴파일 할 때 체크할수 있어서 타입의 안정성을 헤치지 않는
		//선에서 적당히 형변환이 가능한 기법 
		List<E> list = new ArrayList<E>();
		*/
		
		//안정성 의도하지 않는 타입의 객체가 저장되는 것을 막는다.
		
		/*
		 * Sale 클래스 성생 
		 * 1. 제품추가 | 2. 제품리스트보기 | 3. 제품주문 | 4. 주문내역보기 | 5.종료 |
		 */
		
		Scanner scan = new Scanner(System.in);
		
		SaleManager sm = new SaleManager();
		
		int menu = -1;
		
		do {
			System.out.println("1.제품추가 2.제품리스트보기 3.제품주문 4.주문내역보기 5.종료");
			
			menu=scan.nextInt();
			switch(menu) {
			case 1: sm.add(scan); break;  //do while로 만들고 함수 클릭한 뒤에 add
			case 2: sm.menuPrint(); break;
			case 3:
				String name = scan.next();
				int count = scan.nextInt();
				sm.orderPick1(name,count); break;
			case 4: sm.orderPrint(); break;
			case 5: break;
			default:
				System.out.println("잘못된 메뉴");
			}
			
		}while(menu !=5);
		
		
		
		
		
		scan.close();

	}

}
