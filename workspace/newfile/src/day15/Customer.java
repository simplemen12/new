package day15;

import java.util.Arrays;
import java.util.Scanner;

import management.St;

public class Customer {
	/*
	 * Silver �Ϲݰ� / Gold��(discount) / VIP�� (discount)
	 * 
	 * �� ID : int customerID
	 * ���̸� : String customerName
	 * ����� : String customerGrade
	 * ���ʽ����ε� : int bonusPoint
	 * ���ʽ��������� : double bonusRatio
	 * 
	 * Ŭ���� ����
	 * - �⺻ customerGrade = "Silver"
	 * - bonusRatip = 0.01 => 1%
	 * 
	 * 
	 * - �޼��� 
	 * 1. ���ʽ� ���� ��� �޼��� [�޼���� : calcPrice[int price]]
	 * => ���űݾ��� �ְ� ���� ���ʽ��� ����ϴ� bonusPoint�� ����
	 * => ���ʽ��� ����, ���ο��θ� üũ�ؼ� ���� price�� ����
	 * 
	 * 2. ��¸޼��� [�޼����:customerInfo()]
	 * => ȫ�浿�� ����� VIP�̸� �������� 111�Դϴ�, ���ʽ� ����Ʈ�� 1000�Դϴ�.
	 * 
	 * - Silver ���  ��ǰ���Ž� 0% ���� ���ʽ��� 1% ���� 
	 * - Gold ��� ��ǰ���Ž� 10% ���� ���ʽ��� 2% ����
	 * - VIP ��� ��ǰ���Ž� 10% ���� ���ʽ��� 5% ����  
	 * => ���� ���縦 ��������� �߰�[int agentID]
	 * 
	 * 
	 * GoldCustomer extends Customer{
	 * 
	 * �⺻�޼��带 �������̵� �Ͽ� ���
	 * }
	 * 
	 * VIPCustomer extends Customer{
	 * �⺻�޼��带 �������̵� �Ͽ� ���
	 * }
	 * 
	 * CustomerMain Ŭ�������� Ȯ�� 
	 * 
	 *
	 * ���ʽ��������� : double bonusRatio
	 */
	private String customerId; //�� ���̵�
	private int bonusPoint; // ���ʽ�����Ʈ
	private String customerName; //���̸� 
	private String customerGrade; //�����
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", bonusPoint=" + bonusPoint + ", customerName=" + customerName
				+ ", customerGrade=" + customerGrade + ", bonusRatio=" + bonusRatio ;
	}

	private double bonusRatio; //���ʽ���������
	
	public Customer() {}
	
	public Customer(String customerId, int bonusPoint, String customerName, String customerGrade, double bonusRatio ) {
		this.customerId = customerId;
		this.bonusPoint = bonusPoint;
		this.customerName = customerName;
		this.customerGrade = customerGrade;
		this.bonusRatio = bonusRatio;
	}
	
//	//����� ������
//	public Customer(int bonusPoint,double bonusRatio) {
//		this.bonusPoint = bonusPoint;
//		this.bonusRatio = bonusRatio;
//	}
	
	

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	//������ getset������ toSting������

	//�޼��� ����
		/*
		 *  * 2. ��¸޼��� [�޼����:customerInfo()]
		 * => ȫ�浿�� ����� VIP�̸� �������� 111�Դϴ�, ���ʽ� ����Ʈ�� 1000�Դϴ�.
		 */
	public Customer[] ctiarr = new Customer[20]; //Customer Ŭ������ cti��� �迭�� �������� 20�� �޾���
	private int cnt; //�迭����
	
	//������ ��� �޼���
	/*
	 * "Customer [customerId=" + customerId + ", bonusPoint=" + bonusPoint + ", customerName=" + customerName
				+ ", customerGrade=" + customerGrade + ", bonusRatio=" + bonusRatio ;
	 */
	
	//������ �Է� �޼���
	public void insertCustomer(Scanner scan) {
		//1���� �������� �Է� �޾Ƽ� ��ü�� ������ �� cuti�� �߰�  �̰��� �� Customer���� ������ ���� �� �޾ƾ� �� 
		System.out.println("�����̵�");
		String ci = scan.next();
		
		System.out.println("������Ʈ");
		int cp = scan.nextInt();
		
		System.out.println("���̸�");
		String cn = scan.next();
		
		System.out.println("�����");
		String cg = scan.next();

		System.out.println("�����κ���");
		double cd = scan.nextDouble();
	
		
		
		//�Է¹��� ���� ��ü�� ���� (cuti)
		Customer cuti = new Customer(ci, cp, cn, cg, cd); //65�����ΰ� ������ġ����
		
		if(cnt == ctiarr.length) { //�������� ����ִ� ctiarr�� cnt�� ���� ã��
			Customer[] tmp = new Customer[ctiarr.length+5];
			System.arraycopy(ctiarr, 0, tmp, 0, cnt); //�迭�� �� á�ٸ� ���� 5������
			
				ctiarr[cnt] = cuti; //cuti�迭�� �����Է��ϸ� �ٽ� ctiarr����
			}
			ctiarr[cnt]=cuti;
			cnt++;
	}
	
	
	//��������� �޼��� ��ǰ���1
	public void customerPrint() { 
		System.out.println("������");
		//System.out.println("ȫ�浿�� ����� "+"�̸� �������� 111�Դϴ�, ���ʽ� ����Ʈ�� 1000�Դϴ�.");
	
		System.out.println("Id"+customerId+"���ʽ�����Ʈ"+bonusPoint+"���̸�"+customerName);
		System.out.println("�����"+customerGrade+"���ʽ����κ���"+bonusRatio);
	}
	
	//��������� �޼��� [��ǰ���1 ����]
	public void customerInfo() { 
		System.out.println("��ü������");
		for(int i=0; i<cnt; i++) {
			ctiarr[i].customerPrint();//�л����� ���
		}
	}
	
	//���ʽ� ���� ��� �޼���
	/*
	1. ���ʽ� ���� ��� �޼��� 
	[�޼���� : calcPrice[int price]]
	=> ���űݾ��� �ְ� ���� 
	
	���ʽ��� ����ϴ� bonusPoint�� 
	����=> ���ʽ��� ����
	
	, ���ο��θ� üũ�ؼ� ���� 
	price�� ����
	*/
	
	//������ ������ this. ������ super.
       public int price(String cn, int price) {
		
		//cn�� ���̸��� �ް� price�� ��ǰ������ �޴´�.
		String cg="Vip"; //����� Ȯ�ο�
		String cg1="Gold"; //����� Ȯ�ο�
		String cg2="Silver"; //����� Ȯ�ο�
		
		
		
		int cal=0;
		int Bonus=0;
		
		for(int i=0; i<cnt; i++) {
			if(cn.equals(ctiarr[i].getCustomerName())) { //�Էµ� ���� ã��
				ctiarr[i].customerPrint();
				
				
				if(cg.equals(ctiarr[i].getCustomerGrade())) { //Vip�� ������ 
				cal=(price/100)*90; //10%�� ���ε� ����
				
				Bonus = (cal/100)*5;
				
				Bonus=ctiarr[i].getBonusPoint()+Bonus; //���� ���ʽ��� get�ؼ� ������ ��
				System.out.println("������������Ʈ"+Bonus);
				System.out.println("���Ұ���"+cal);
				ctiarr[i].setBonusPoint(Bonus); //���ʽ�����Ʈ �Է�
				return cal;
				}
				
				if(cg1.equals(ctiarr[i].getCustomerGrade())) { //Gold�� ������
					cal=price*(5/100); //5%�� ���ε� ����
					
					Bonus = (cal/100)*2;
					Bonus=ctiarr[i].getBonusPoint()+Bonus; 
					System.out.println("������������Ʈ"+Bonus);
					System.out.println("���Ұ���"+cal);
					ctiarr[i].setBonusPoint(Bonus); //���ʽ�����Ʈ �Է�
					return cal;
				}
				
				if(cg2.equals(ctiarr[i].getCustomerGrade())) { //Silver�� ������
					cal=price; //0%�� ���ε� ����
					
					Bonus = (cal/100)*1;
					Bonus=ctiarr[i].getBonusPoint()+Bonus; 
					System.out.println("������������Ʈ"+Bonus);
					System.out.println("���Ұ���"+cal);
					ctiarr[i].setBonusPoint(Bonus); //���ʽ�����Ʈ �Է�
					return cal;
				}
		}
	}
	return cal; //�� if�� 3�����߿� �ϳ��� ������ ����� �������� ���� ��ȯ

       
       }

	
	
	
	



class Silver extends Customer{
	/*
	int i=0;
	Customer s = new Customer();
	s.setbonusPoint(i);
	
	//this.bonusRatio
*/
	
//	int q=1; //������Ʈ 1%
//	double q1 =0; //�����η� 0
//	Customer cuti1 = new Customer(q,q1); //73�� ���� //����� �������Է�
//	//��ü�����Ͽ� q�� q1�� �Է�
	@Override
	public String getCustomerId() {
		// TODO Auto-generated method stub
		return super.getCustomerId();
	}

	@Override
	public void setCustomerId(String customerId) {
		// TODO Auto-generated method stub
		super.setCustomerId(customerId);
	}

	@Override
	public int getBonusPoint() {
		// TODO Auto-generated method stub
		return super.getBonusPoint();
	}

	@Override
	public void setBonusPoint(int bonusPoint) {
		// TODO Auto-generated method stub
		super.setBonusPoint(bonusPoint);
	}

	@Override
	public String getCustomerName() {
		// TODO Auto-generated method stub
		return super.getCustomerName();
	}

	@Override
	public void setCustomerName(String customerName) {
		// TODO Auto-generated method stub
		super.setCustomerName(customerName);
	}

	@Override
	public String getCustomerGrade() {
		// TODO Auto-generated method stub
		return super.getCustomerGrade();
	}

	@Override
	public void setCustomerGrade(String customerGrade) {
		// TODO Auto-generated method stub
		super.setCustomerGrade(customerGrade);
	}

	@Override
	public double getBonusRatio() {
		// TODO Auto-generated method stub
		return super.getBonusRatio();
	}

	@Override
	public void setBonusRatio(double bonusRatio) {
		// TODO Auto-generated method stub
		super.setBonusRatio(bonusRatio);
	}
	
	
	
	
}

class Gold extends Customer{
	
//	int q=2; //������Ʈ 1%
//	double q1 =10; //�����η� 0
//	Customer cuti1 = new Customer(q,q1);

	@Override
	public String getCustomerId() {
		// TODO Auto-generated method stub
		return super.getCustomerId();
	}

	@Override
	public void setCustomerId(String customerId) {
		// TODO Auto-generated method stub
		super.setCustomerId(customerId);
	}

	@Override
	public int getBonusPoint() {
		// TODO Auto-generated method stub
		return super.getBonusPoint();
	}

	@Override
	public void setBonusPoint(int bonusPoint) {
		// TODO Auto-generated method stub
		super.setBonusPoint(bonusPoint);
	}

	@Override
	public String getCustomerName() {
		// TODO Auto-generated method stub
		return super.getCustomerName();
	}

	@Override
	public void setCustomerName(String customerName) {
		// TODO Auto-generated method stub
		super.setCustomerName(customerName);
	}

	@Override
	public String getCustomerGrade() {
		// TODO Auto-generated method stub
		return super.getCustomerGrade();
	}

	@Override
	public void setCustomerGrade(String customerGrade) {
		// TODO Auto-generated method stub
		super.setCustomerGrade(customerGrade);
	}

	@Override
	public double getBonusRatio() {
		// TODO Auto-generated method stub
		return super.getBonusRatio();
	}

	@Override
	public void setBonusRatio(double bonusRatio) {
		// TODO Auto-generated method stub
		super.setBonusRatio(bonusRatio);
	}
	
}

class Vip extends Customer{
	int q=5; //������Ʈ 5%
	double q1 =10; //�����η� 10%
     
//	Customer b = new Customer();
//	Vip a = new Vip();
	
	

	@Override
	public String getCustomerId() {
		// TODO Auto-generated method stub
		return super.getCustomerId();
	}

	@Override
	public void setCustomerId(String customerId) {
		// TODO Auto-generated method stub
		super.setCustomerId(customerId);
	}

	@Override
	public int getBonusPoint() {
		// TODO Auto-generated method stub
		return super.getBonusPoint();
	}

	@Override
	public void setBonusPoint(int bonusPoint) {
		// TODO Auto-generated method stub
		super.setBonusPoint(bonusPoint);
	}

	@Override
	public String getCustomerName() {
		// TODO Auto-generated method stub
		return super.getCustomerName();
	}

	@Override
	public void setCustomerName(String customerName) {
		// TODO Auto-generated method stub
		super.setCustomerName(customerName);
	}

	@Override
	public String getCustomerGrade() {
		// TODO Auto-generated method stub
		return super.getCustomerGrade();
	}

	@Override
	public void setCustomerGrade(String customerGrade) {
		// TODO Auto-generated method stub
		super.setCustomerGrade(customerGrade);
	}

	@Override
	public double getBonusRatio() {
		// TODO Auto-generated method stub
		return super.getBonusRatio();
	}

	@Override
	public void setBonusRatio(double bonusRatio) {
		// TODO Auto-generated method stub
		super.setBonusRatio(bonusRatio);
	}
	
}
}

