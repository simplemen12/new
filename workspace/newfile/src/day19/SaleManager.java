package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	//���׸� Ŭ���� ó��
	
	private ArrayList<Sale<String,Integer>> menu = new ArrayList<>();
	private ArrayList<Sale<String,Integer>> order = new ArrayList<>();
	//order�� Ŭ������ ����µ� sale�� ��ӹ޾Ƽ� ���, order menu.price
	
	private int index=0;
	
	Sale s = new Sale();
	public void add(Scanner scan) {
		// TODO Auto-generated method stub
		//��ǰ�߰�
		System.out.println("��ǰ��");
		String a = scan.next();
		System.out.println("����");
		int b = scan.nextInt();
		
		//��ü���� �� �߰�
		Sale<String,Integer> s = new Sale<String,Integer>(a,b);
		this.menu.add(s);
		
		
	
		
	}
	
	
	public void menuPrint() {
		// TODO Auto-generated method stub
		//��ǰ����Ʈ����
		
		for(Sale<String,Integer> tmp : menu) {
			System.out.println(tmp);
		}
			System.out.println(s.getMenu());
			System.out.println("-----------");
			System.out.println(menu);
	
		
	}
	//���׸� Ŭ���� ó��
	
	public void orderPick(Scanner scan) {
		// �Է¹޴� ���� ��ǰ��, ����
				// ��ǰ�� ����*���� (���ұݾ�) order�� �߰�  //ex �ܹ��� 5 => �ܹ��� 25000��
		
		//��ǰ�߰�
				System.out.println("��ǰ��");
				String a = scan.next();
				System.out.println("����");
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
			String ProductMenu = menu.get(i).getMenu(); //String ������ ���� ���� �� menu���� 1���� �� ����
			int ProductPrice = menu.get(i).getPrice(); // �̰� int��
			if(ProductMenu.equals(name)){
				Sale p = new Sale(ProductMenu,(ProductPrice*count));
				order.add(p);
				
			}
		}
	}

	public void orderPrint() {
		//�ֹ����� ��� 
		//�� ���ұݾ� ���
		
		int sum = 0;
		for(Sale tmp : order) {
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


	
	

}
