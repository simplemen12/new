package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	//제네릭 클래스 처리
	
	private ArrayList<Sale<String,Integer>> menu = new ArrayList<>();
	private ArrayList<Sale<String,Integer>> order = new ArrayList<>();
	//order은 클래스로 만드는데 sale을 상속받아서 사용, order menu.price
	
	private int index=0;
	
	Sale s = new Sale();
	public void add(Scanner scan) {
		// TODO Auto-generated method stub
		//제품추가
		System.out.println("제품명");
		String a = scan.next();
		System.out.println("가격");
		int b = scan.nextInt();
		
		//객체생성 후 추가
		Sale<String,Integer> s = new Sale<String,Integer>(a,b);
		this.menu.add(s);
		
		
	
		
	}
	
	
	public void menuPrint() {
		// TODO Auto-generated method stub
		//제품리스트보기
		
		for(Sale<String,Integer> tmp : menu) {
			System.out.println(tmp);
		}
			System.out.println(s.getMenu());
			System.out.println("-----------");
			System.out.println(menu);
	
		
	}
	//제네릭 클래스 처리
	
	public void orderPick(Scanner scan) {
		// 입력받는 값은 제품명, 수량
				// 제품명 가격*수량 (지불금액) order에 추가  //ex 햄버거 5 => 햄버거 25000원
		
		//제품추가
				System.out.println("제품명");
				String a = scan.next();
				System.out.println("수량");
				int b = scan.nextInt();
				int z=0;
				
				for(Sale<String,Integer> tmp : menu) {
					//System.out.println(tmp);
					System.out.println(tmp.getMenu());
					System.out.println(tmp.getPrice());
					System.out.println("=======");
					
					if(a==tmp.getMenu()) {
					z=tmp.getPrice();
					System.out.println("******");
					}
					System.out.println(z);
					System.out.println("----------");
					System.out.println(z*b);
				}
				
				
			
				if(a==s.getMenu()) {
					z=(int) s.getPrice();
					System.out.println("******");
					}
					System.out.println(z);
					System.out.println("&&&&&&&&");
					System.out.println(z*b);
				
			
	}
	
	public void orderPick1(String name, int count) {
		for(int i=0; i<menu.size(); i++) {
			String ProductMenu = menu.get(i).getMenu(); //String 형태의 변수 생성 및 menu에서 1번지 값 접근
			int ProductPrice = menu.get(i).getPrice(); // 이건 int형
			if(ProductMenu.equals(name)){
				Sale p = new Sale(ProductMenu,(ProductPrice*count));
				order.add(p);
				
			}
		}
	}

	public void orderPrint() {
		//주문내역 출력 
		//총 지불금액 출력
		
		int sum = 0;
		for(Sale tmp : order) {
			System.out.println(tmp);
			sum+=(int)tmp.getPrice();
		}
	}
	
	public void orderSearch(String name) {
		//name 주문메뉴
		for(int i=0; i<order.size(); i++) {
			if(order.get(i).getMenu().equals(name)) {
				index = i;
				return;
			}
		}
		
	}


	
	

}
