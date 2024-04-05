package day15;

import java.util.Arrays;
import java.util.Scanner;

import management.St;

public class Customer {
	/*
	 * Silver 일반고객 / Gold고객(discount) / VIP고객 (discount)
	 * 
	 * 고객 ID : int customerID
	 * 고객이름 : String customerName
	 * 고객등급 : String customerGrade
	 * 보너스포인드 : int bonusPoint
	 * 보너스적립비율 : double bonusRatio
	 * 
	 * 클래스 생성
	 * - 기본 customerGrade = "Silver"
	 * - bonusRatip = 0.01 => 1%
	 * 
	 * 
	 * - 메서드 
	 * 1. 보너스 적립 계산 메서드 [메서드명 : calcPrice[int price]]
	 * => 구매금액을 주고 적립 보너스를 계산하는 bonusPoint에 누적
	 * => 보너스를 적립, 할인여부를 체크해서 구매 price를 리턴
	 * 
	 * 2. 출력메서드 [메서드명:customerInfo()]
	 * => 홍길동님 등급은 VIP이며 전담상담사는 111입니다, 보너스 포인트는 1000입니다.
	 * 
	 * - Silver 등급  제품구매시 0% 할인 보너스는 1% 적립 
	 * - Gold 등급 제품구매시 10% 할인 보너스는 2% 적립
	 * - VIP 등급 제품구매시 10% 할인 보너스는 5% 적립  
	 * => 전담 상담사를 멤버변수로 추가[int agentID]
	 * 
	 * 
	 * GoldCustomer extends Customer{
	 * 
	 * 기본메서드를 오버라이딩 하여 사용
	 * }
	 * 
	 * VIPCustomer extends Customer{
	 * 기본메서드를 오버라이딩 하여 사용
	 * }
	 * 
	 * CustomerMain 클래스에서 확인 
	 * 
	 *
	 * 보너스적립비율 : double bonusRatio
	 */
	private String customerId; //고객 아이디
	private int bonusPoint; // 보너스포인트
	private String customerName; //고객이름 
	private String customerGrade; //고객등급
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", bonusPoint=" + bonusPoint + ", customerName=" + customerName
				+ ", customerGrade=" + customerGrade + ", bonusRatio=" + bonusRatio ;
	}

	private double bonusRatio; //보너스적립비율
	
	public Customer() {}
	
	public Customer(String customerId, int bonusPoint, String customerName, String customerGrade, double bonusRatio ) {
		this.customerId = customerId;
		this.bonusPoint = bonusPoint;
		this.customerName = customerName;
		this.customerGrade = customerGrade;
		this.bonusRatio = bonusRatio;
	}
	
//	//실험용 생성자
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
	
	//생성자 getset생성완 toSting생성와

	//메서드 생성
		/*
		 *  * 2. 출력메서드 [메서드명:customerInfo()]
		 * => 홍길동님 등급은 VIP이며 전담상담사는 111입니다, 보너스 포인트는 1000입니다.
		 */
	public Customer[] ctiarr = new Customer[20]; //Customer 클래스안 cti라는 배열에 고객정보를 20개 받아줌
	private int cnt; //배열번지
	
	//고객정보 출력 메서드
	/*
	 * "Customer [customerId=" + customerId + ", bonusPoint=" + bonusPoint + ", customerName=" + customerName
				+ ", customerGrade=" + customerGrade + ", bonusRatio=" + bonusRatio ;
	 */
	
	//고객정보 입력 메서드
	public void insertCustomer(Scanner scan) {
		//1명의 고객정보를 입력 받아서 객체를 생성한 후 cuti에 추가  이것은 다 Customer에서 정보를 저장 및 받아야 함 
		System.out.println("고객아이디");
		String ci = scan.next();
		
		System.out.println("고객포인트");
		int cp = scan.nextInt();
		
		System.out.println("고객이름");
		String cn = scan.next();
		
		System.out.println("고객등급");
		String cg = scan.next();

		System.out.println("고객할인비율");
		double cd = scan.nextDouble();
	
		
		
		//입력받은 값을 객체로 생성 (cuti)
		Customer cuti = new Customer(ci, cp, cn, cg, cd); //65번라인과 순서일치요함
		
		if(cnt == ctiarr.length) { //고객정보가 들어있는 ctiarr에 cnt로 번지 찾기
			Customer[] tmp = new Customer[ctiarr.length+5];
			System.arraycopy(ctiarr, 0, tmp, 0, cnt); //배열이 다 찼다면 복사 5개증가
			
				ctiarr[cnt] = cuti; //cuti배열에 정보입력하면 다시 ctiarr저장
			}
			ctiarr[cnt]=cuti;
			cnt++;
	}
	
	
	//고객정보출력 메서드 부품기능1
	public void customerPrint() { 
		System.out.println("고객정보");
		//System.out.println("홍길동님 등급은 "+"이며 전담상담사는 111입니다, 보너스 포인트는 1000입니다.");
	
		System.out.println("Id"+customerId+"보너스포인트"+bonusPoint+"고객이름"+customerName);
		System.out.println("고객등급"+customerGrade+"보너스할인비율"+bonusRatio);
	}
	
	//고객정보출력 메서드 [부품기능1 포함]
	public void customerInfo() { 
		System.out.println("전체고객정보");
		for(int i=0; i<cnt; i++) {
			ctiarr[i].customerPrint();//학생정보 출력
		}
	}
	
	//보너스 적립 계산 메서드
	/*
	1. 보너스 적립 계산 메서드 
	[메서드명 : calcPrice[int price]]
	=> 구매금액을 주고 적립 
	
	보너스를 계산하는 bonusPoint에 
	누적=> 보너스를 적립
	
	, 할인여부를 체크해서 구매 
	price를 리턴
	*/
	
	//나한테 있으면 this. 조상은 super.
       public int price(String cn, int price) {
		
		//cn은 고객이름을 받고 price는 상품가격을 받는다.
		String cg="Vip"; //고객등급 확인용
		String cg1="Gold"; //고객등급 확인용
		String cg2="Silver"; //고객등급 확인용
		
		
		
		int cal=0;
		int Bonus=0;
		
		for(int i=0; i<cnt; i++) {
			if(cn.equals(ctiarr[i].getCustomerName())) { //입력된 고객명 찾기
				ctiarr[i].customerPrint();
				
				
				if(cg.equals(ctiarr[i].getCustomerGrade())) { //Vip와 같으면 
				cal=(price/100)*90; //10%로 할인된 가격
				
				Bonus = (cal/100)*5;
				
				Bonus=ctiarr[i].getBonusPoint()+Bonus; //기존 보너스를 get해서 더해준 뒤
				System.out.println("현재적립포인트"+Bonus);
				System.out.println("지불가격"+cal);
				ctiarr[i].setBonusPoint(Bonus); //보너스포인트 입력
				return cal;
				}
				
				if(cg1.equals(ctiarr[i].getCustomerGrade())) { //Gold와 같으면
					cal=price*(5/100); //5%로 할인된 가격
					
					Bonus = (cal/100)*2;
					Bonus=ctiarr[i].getBonusPoint()+Bonus; 
					System.out.println("현재적립포인트"+Bonus);
					System.out.println("지불가격"+cal);
					ctiarr[i].setBonusPoint(Bonus); //보너스포인트 입력
					return cal;
				}
				
				if(cg2.equals(ctiarr[i].getCustomerGrade())) { //Silver와 같으면
					cal=price; //0%로 할인된 가격
					
					Bonus = (cal/100)*1;
					Bonus=ctiarr[i].getBonusPoint()+Bonus; 
					System.out.println("현재적립포인트"+Bonus);
					System.out.println("지불가격"+cal);
					ctiarr[i].setBonusPoint(Bonus); //보너스포인트 입력
					return cal;
				}
		}
	}
	return cal; //위 if문 3가지중에 하나만 있으면 상단의 리턴으로 값을 반환

       
       }

	
	
	
	



class Silver extends Customer{
	/*
	int i=0;
	Customer s = new Customer();
	s.setbonusPoint(i);
	
	//this.bonusRatio
*/
	
//	int q=1; //고객포인트 1%
//	double q1 =0; //고객할인률 0
//	Customer cuti1 = new Customer(q,q1); //73번 라인 //실험용 생성자입력
//	//객체생성하여 q와 q1을 입력
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
	
//	int q=2; //고객포인트 1%
//	double q1 =10; //고객할인률 0
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
	int q=5; //고객포인트 5%
	double q1 =10; //고객할인률 10%
     
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

