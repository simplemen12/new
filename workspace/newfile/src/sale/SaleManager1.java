package sale;

import java.util.ArrayList;
import java.util.Scanner;

import day19.Sale;

public class SaleManager1 {

	public Object menuPrint;
	//메뉴를 저장하기 위한 list
	private ArrayList<Sale1<String,Integer>> menu1 = new ArrayList();
	//주문을 저장하기 위한 list
	private ArrayList<Order> oder1 = new ArrayList<>();
	
	
	//기본메뉴 구성
	private void addMenu() {
		menu1.add(new Sale1("햄버거",1000));
		menu1.add(new Sale1("햄버거",1000));
		menu1.add(new Sale1("햄버거",1000));
		menu1.add(new Sale1("햄버거",1000));
		menu1.add(new Sale1("햄버거",1000));
	}
	
	public void printSale() {
		//메뉴출력
		System.out.println("메뉴");
		for(Sale1 s : menu1) {
			System.out.println(s);
		}
	}
	
	public void add1(Scanner scan) {
		System.out.println("메뉴와 가격을 입력해주세요.");
	    String menu = scan.next();
	    int Price = scan.nextInt();
	    menu1.add(new Sale1<String,Integer>(menu,Price));
	}
	
	public void del1(Scanner scan) {
		System.out.println("삭제");
		String delMenu = scan.next();
		for(int i=0; i<menu1.size(); i++) {
			if(menu1.get(i).getMenu().equals(delMenu)) {
				//list.remove(index) / list.remove(Object)
				menu1.remove(i);// i번지의 객체 삭제
				menu1.remove(menu1.get(i)); // 객체의 오브젝트 삭제
				System.out.println("삭제완료.");
				return; 
			}
			
		}
		System.out.println("찾는 메뉴가 없습니다.");
		
	
	}
	
	public void update(Scanner scan) {
		//메뉴수정 
		//list.set(index, object ) : 해당번지의 객체를 번경
		System.out.println("수정할 메뉴 > ");
		String upMenu = scan.next();
		System.out.println("가격");
		int upPrice = scan.nextInt();
	for(int i=0; i<menu1.size(); i++) {
		if(menu1.get(i).getMenu().equals(upMenu)){ //오류시 getMenu1 으로 변경
			menu1.get(i).setPrice(upPrice);
			System.out.println("수정완료");
		}
	}
	
	}
	
	public void orderPrint1() {
		int sum = 0;
		System.out.println("주문내역");
//		for(Oder1 o : oder1) {
//			sum += o.getTotal();
//			o.print();
//		}
//		System.out.println("총 지불금액 "+ sum);
	}
	
	public void orderPick(String name, int count) {
		//메뉴와 수량을 입력받아 order 객체를 생성 후 orderList에 추가
		//price는 menuList에서 가져와야함.
		for(int i=0; i<menu1.size(); i++) {
			//내가 주문한 메뉴의 가격
			int price = menu1.get(i).getPrice();
			//oredr의 데이터가 없다면 비교자체가 불가
			Oder1 o = new Oder1(name, price, count);
		
			return;
		}
	}
	
	
	
	
	
	
	
	
	
	
    ArrayList<Sale1<String,Integer>> menu = new ArrayList<>();
	private ArrayList<Sale1<String,Integer>> order = new ArrayList<>();
	private ArrayList<Rec<String,Integer>> rec = new ArrayList<>();
	
	//order은 클래스로 만드는데 sale을 상속받아서 사용, order menu.price
	
	private int index=0;
	
	Sale1 s = new Sale1();
	

	public void add(Scanner scan) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//제품추가
				System.out.println("제품명");
				String a = scan.next();
				System.out.println("가격");
				int b = scan.nextInt();
				
				//객체생성 후 추가
				Sale1<String,Integer> s = new Sale1<String,Integer>(a,b);
				this.menu.add(s);
	}

	public void menudel(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("제품명");
		String a = scan.next();
		System.out.println("가격");
		int b = scan.nextInt();
		for(int i=0; i<menu.size(); i++) {
			String pp = menu.get(i).getMenu();
			int pp1 = menu.get(i).getPrice();
			if(pp.equals(a)) {
				menu.remove(menu.get(i).getMenu());
				System.out.println("입력된 제품을 리스트에서 삭제했습니다.");
				return;
			}
			System.out.println("입력된 제품이 리스트에 없습니다.");
		}
		//this.add(scan);
	}

	public void menuMod(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("제품명");
		String a = scan.next();
		System.out.println("가격");
		int b = scan.nextInt();
		for(int i=0; i<menu.size(); i++) {
			String pp = menu.get(i).getMenu();
			int pp1 = menu.get(i).getPrice();
			if(pp.equals(a)) {
				menu.remove(menu.get(i).getMenu());
				System.out.println("입력된 제품을 리스트에서 삭제했습니다.");
				return;
			}
			System.out.println("입력된 제품이 리스트에 없습니다.");
		}
		this.add(scan);
		
		
	}

	public void menuOrder(Scanner scan) {
		// TODO Auto-generated method stub
		// 입력받는 값은 제품명, 수량
		// 제품명 가격*수량 (지불금액) order에 추가  //ex 햄버거 5 => 햄버거 25000원

        //제품추가
		System.out.println("제품명");
		String a = scan.next();
		System.out.println("수량");
		int b = scan.nextInt();
		int z=0;
		
		
		for(int i=0; i<menu.size(); i++) {
			String pp = menu.get(i).getMenu();
			int pp1 = menu.get(i).getPrice();
			if(pp.equals(a)) {
				menu.remove(menu.get(i).getMenu());
				System.out.println("입력된 제품을 주문했습니다.");
				
				
				Rec<String,Integer> s = new Rec<String,Integer>(pp,pp1);
				this.rec.add(s);
				
				
				
				
				
				b=pp1*b;
				System.out.println(b);
				
			}
			if(!pp.equals(a)){
			System.out.println("입력된 제품이 리스트에 없습니다.");
			}
		}
	
	}

	public void menuOrderRec() {
		// TODO Auto-generated method stub
		
	}

	public void menuPrint() {
		// TODO Auto-generated method stub
		for(Sale1<String,Integer> tmp : menu) {
			System.out.println(tmp);
		}
			System.out.println(s.getMenu());
			System.out.println("-----------");
			System.out.println(menu);
	
	}

}
