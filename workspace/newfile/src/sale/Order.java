package sale;

import java.util.ArrayList;
import java.util.Scanner;

import day19.Sale;

public class Order extends Sale1 { //Sale1Ŭ���� ���
	
	
private int index=0;
	
	Sale1 s = new Sale1();
	
	private Sale1[] order1 = new Sale1[40];

	 ArrayList<Sale1<String,Integer>> menu = new ArrayList<>();
		private ArrayList<Sale1<String,Integer>> order = new ArrayList<>();






public void orderPick(Scanner scan) {
	// �Է¹޴� ���� ��ǰ��, ����
			// ��ǰ�� ����*���� (���ұݾ�) order�� �߰�  //ex �ܹ��� 5 => �ܹ��� 25000��
	
	//��ǰ�߰�
			System.out.println("��ǰ��");
			String a = scan.next();
			System.out.println("����");
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
		String ProductMenu = menu.get(i).getMenu(); //String ������ ���� ���� �� menu���� 1���� �� ����
		int ProductPrice = menu.get(i).getPrice(); // �̰� int��
		if(ProductMenu.equals(name)){
			Sale1 p = new Sale1(ProductMenu,(ProductPrice*count));
			order.add(p);
			
		}
	}
}

public void orderPrint() {
	//�ֹ����� ��� 
	//�� ���ұݾ� ���
	
	int sum = 0;
	for(Sale1 tmp : order) {
		System.out.println(tmp);
		sum+=(int)tmp.getPrice();
	}
}

public void orderSearch(String name) {
	//name �ֹ��޴�
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
