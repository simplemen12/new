package sale;

import java.util.ArrayList;
import java.util.Scanner;

import day19.Sale;

public class Order extends Sale1 { //Sale1클래스 상속
	
	
private int index=0;
	
	Sale1 s = new Sale1();
	
	private Sale1[] order1 = new Sale1[40];

	 ArrayList<Sale1<String,Integer>> menu = new ArrayList<>();
		private ArrayList<Sale1<String,Integer>> order = new ArrayList<>();






public void orderPick(Scanner scan) {
	// 입력받는 값은 제품명, 수량
			// 제품명 가격*수량 (지불금액) order에 추가  //ex 햄버거 5 => 햄버거 25000원
	
	//제품추가
			System.out.println("제품명");
			String a = scan.next();
			System.out.println("수량");
			int b = scan.nextInt();
			int z=0;
			SaleManager1 s = new SaleManager1();
			
			for(Sale1<String, Integer> tmp : menu) {
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
			
			
		
			if(a==getMenu()) {
				z=(int) getPrice();
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
			Sale1 p = new Sale1(ProductMenu,(ProductPrice*count));
			order.add(p);
			
		}
	}
}

public void orderPrint() {
	//주문내역 출력 
	//총 지불금액 출력
	
	int sum = 0;
	for(Sale1 tmp : order) {
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





public ArrayList<Sale1<String, Integer>> getOrder() {
	return order;
}

public void setOrder(ArrayList<Sale1<String, Integer>> order) {
	this.order = order;
}

public int getIndex() {
	return index;
}

public void setIndex(int index) {
	this.index = index;
}

public Sale1 getS() {
	return s;
}

public void setS(Sale1 s) {
	this.s = s;
}

public Sale1[] getOrder1() {
	return order1;
}

public void setOrder1(Sale1[] order1) {
	this.order1 = order1;
}

}
