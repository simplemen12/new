package sale;

import sale.Sale1;

public class Oder1 extends Sale1{
	
	//�ֹ� ��ü > �ֹ��� �Ϸ��� �޴��� ���� ���� �հ�(���� * ����)
	//(�޴���, ����) : ��ӹ��� ��ü�� �� super
	//������ �հ�� : order�� ������ �ִ� �� ��ü => this
	private int count; //����
	private int total; // ���� * ������ �հ�
	
	//������
	public Oder1() {} //�⺻������
	public Oder1(String menu, int price, int count) {
		/*
		super.setMenu(menu);
		super.setPrice(price); // �θ��� set���
		*/
		//������ ȣ��
		super(menu,price); 
		this.count = count;
		this.total = price * count;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	//�ֹ����� ����ϴ� �޼���
	public void print() {
		System.out.println(super.getMenu()+" : "+super.getPrice()+"/");
		System.out.println(count+"�� �ֹ� => �ݾ� : "+ total);
	}
	

}
