package sale;

import java.util.ArrayList;
import java.util.Scanner;

import day19.Sale;

public class SaleManager1 {

	public Object menuPrint;
	//�޴��� �����ϱ� ���� list
	private ArrayList<Sale1<String,Integer>> menu1 = new ArrayList();
	//�ֹ��� �����ϱ� ���� list
	private ArrayList<Order> oder1 = new ArrayList<>();
	
	
	//�⺻�޴� ����
	private void addMenu() {
		menu1.add(new Sale1("�ܹ���",1000));
		menu1.add(new Sale1("�ܹ���",1000));
		menu1.add(new Sale1("�ܹ���",1000));
		menu1.add(new Sale1("�ܹ���",1000));
		menu1.add(new Sale1("�ܹ���",1000));
	}
	
	public void printSale() {
		//�޴����
		System.out.println("�޴�");
		for(Sale1 s : menu1) {
			System.out.println(s);
		}
	}
	
	public void add1(Scanner scan) {
		System.out.println("�޴��� ������ �Է����ּ���.");
	    String menu = scan.next();
	    int Price = scan.nextInt();
	    menu1.add(new Sale1<String,Integer>(menu,Price));
	}
	
	public void del1(Scanner scan) {
		System.out.println("����");
		String delMenu = scan.next();
		for(int i=0; i<menu1.size(); i++) {
			if(menu1.get(i).getMenu().equals(delMenu)) {
				//list.remove(index) / list.remove(Object)
				menu1.remove(i);// i������ ��ü ����
				menu1.remove(menu1.get(i)); // ��ü�� ������Ʈ ����
				System.out.println("�����Ϸ�.");
				return; 
			}
			
		}
		System.out.println("ã�� �޴��� �����ϴ�.");
		
	
	}
	
	public void update(Scanner scan) {
		//�޴����� 
		//list.set(index, object ) : �ش������ ��ü�� ����
		System.out.println("������ �޴� > ");
		String upMenu = scan.next();
		System.out.println("����");
		int upPrice = scan.nextInt();
	for(int i=0; i<menu1.size(); i++) {
		if(menu1.get(i).getMenu().equals(upMenu)){ //������ getMenu1 ���� ����
			menu1.get(i).setPrice(upPrice);
			System.out.println("�����Ϸ�");
		}
	}
	
	}
	
	public void orderPrint1() {
		int sum = 0;
		System.out.println("�ֹ�����");
//		for(Oder1 o : oder1) {
//			sum += o.getTotal();
//			o.print();
//		}
//		System.out.println("�� ���ұݾ� "+ sum);
	}
	
	public void orderPick(String name, int count) {
		//�޴��� ������ �Է¹޾� order ��ü�� ���� �� orderList�� �߰�
		//price�� menuList���� �����;���.
		for(int i=0; i<menu1.size(); i++) {
			//���� �ֹ��� �޴��� ����
			int price = menu1.get(i).getPrice();
			//oredr�� �����Ͱ� ���ٸ� ����ü�� �Ұ�
			Oder1 o = new Oder1(name, price, count);
		
			return;
		}
	}
	
	
	
	
	
	
	
	
	
	
    ArrayList<Sale1<String,Integer>> menu = new ArrayList<>();
	private ArrayList<Sale1<String,Integer>> order = new ArrayList<>();
	private ArrayList<Rec<String,Integer>> rec = new ArrayList<>();
	
	//order�� Ŭ������ ����µ� sale�� ��ӹ޾Ƽ� ���, order menu.price
	
	private int index=0;
	
	Sale1 s = new Sale1();
	

	public void add(Scanner scan) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//��ǰ�߰�
				System.out.println("��ǰ��");
				String a = scan.next();
				System.out.println("����");
				int b = scan.nextInt();
				
				//��ü���� �� �߰�
				Sale1<String,Integer> s = new Sale1<String,Integer>(a,b);
				this.menu.add(s);
	}

	public void menudel(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("��ǰ��");
		String a = scan.next();
		System.out.println("����");
		int b = scan.nextInt();
		for(int i=0; i<menu.size(); i++) {
			String pp = menu.get(i).getMenu();
			int pp1 = menu.get(i).getPrice();
			if(pp.equals(a)) {
				menu.remove(menu.get(i).getMenu());
				System.out.println("�Էµ� ��ǰ�� ����Ʈ���� �����߽��ϴ�.");
				return;
			}
			System.out.println("�Էµ� ��ǰ�� ����Ʈ�� �����ϴ�.");
		}
		//this.add(scan);
	}

	public void menuMod(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("��ǰ��");
		String a = scan.next();
		System.out.println("����");
		int b = scan.nextInt();
		for(int i=0; i<menu.size(); i++) {
			String pp = menu.get(i).getMenu();
			int pp1 = menu.get(i).getPrice();
			if(pp.equals(a)) {
				menu.remove(menu.get(i).getMenu());
				System.out.println("�Էµ� ��ǰ�� ����Ʈ���� �����߽��ϴ�.");
				return;
			}
			System.out.println("�Էµ� ��ǰ�� ����Ʈ�� �����ϴ�.");
		}
		this.add(scan);
		
		
	}

	public void menuOrder(Scanner scan) {
		// TODO Auto-generated method stub
		// �Է¹޴� ���� ��ǰ��, ����
		// ��ǰ�� ����*���� (���ұݾ�) order�� �߰�  //ex �ܹ��� 5 => �ܹ��� 25000��

        //��ǰ�߰�
		System.out.println("��ǰ��");
		String a = scan.next();
		System.out.println("����");
		int b = scan.nextInt();
		int z=0;
		
		
		for(int i=0; i<menu.size(); i++) {
			String pp = menu.get(i).getMenu();
			int pp1 = menu.get(i).getPrice();
			if(pp.equals(a)) {
				menu.remove(menu.get(i).getMenu());
				System.out.println("�Էµ� ��ǰ�� �ֹ��߽��ϴ�.");
				
				
				Rec<String,Integer> s = new Rec<String,Integer>(pp,pp1);
				this.rec.add(s);
				
				
				
				
				
				b=pp1*b;
				System.out.println(b);
				
			}
			if(!pp.equals(a)){
			System.out.println("�Էµ� ��ǰ�� ����Ʈ�� �����ϴ�.");
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
