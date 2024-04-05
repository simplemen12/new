package std2;

import java.util.HashMap;
import java.util.Objects;

public class Student2 {
	//��������� private ���� / �޼��� public 
	/*
	 * Ŭ�������� �빮�ڷ� ����, ������, �޼������ �ҹ��ڷ� ���� 
	 * ������, �޼���� �ܾ �������� ���� ���۴ܾ� �빮�� ī�����̽� ���
	 * indent �鿩���� �� ���߱�
	 * 
	 */
	private String name;
	private int age;
	private String phone;
	private HashMap<String,Integer> subject = new HashMap<>();
	private int sum;
	private double avg;
	
	public Student2() {}
	
	public Student2(String name) {
		this.name = name;
		this.age = 15;
	}
	
	public Student2(String name, int age ,String phone) {
		this.name = name;
		this.age = 15;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", age=" + age + ", phone=" + phone + ", subject=" + subject + ", sum=" + sum
				+ ", avg=" + avg + "]";
	}
	
	//��� �޼��� 
	
	public void printOne() {
		System.out.println(name+" ( "+age+" ) / ");
		if(phone != null) {
			System.out.println(phone);
		}
	System.out.println();
	if(subject.size()<=0) {
		System.out.println("������ �����ϴ�.");
		return;
	}
	printSub();
	calc();
	System.out.println("result"+ sum+" --"+ avg);
		
	}
	
	//������ ����ǥ ��� - map���
    public void printSub() {
    	System.out.println("-------------");
    	for(String sub : subject.keySet()) {
    		System.out.println(sub+" : "+subject.get(sub));
    	}
    	System.out.println("-------------");
	}
    
  

	//�հ���հ��
    public void calc() {
    	this.sum=0;
    	this.avg=0;
    	for(String sub : subject.keySet()) {
    		sum+=subject.get(sub);
    	}
    	avg = (double)sum / subject.size();		
	}
    
    //�հ���հ��
    public void addSubject() {
		
	}
    
    //�������
    public void delSubject(String sub) {
		//Integer del = subject.remove(sub);
		if(subject.remove(sub)==null) {
			System.out.println("�ش������ �����ϴ�.");
			return;
		}
		subject.remove(sub);
		System.out.println("��������");
		
	}
    
    
    
    
    
    
    
    
    
    

    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
//source - gennarate hashcod  
	@Override
	public int hashCode() {
		return Objects.hash(age, avg, name, phone, subject, sum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //�ּҰ� �� ��ü�� �ּҿ� ���ٸ�
			return true; 
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //Ŭ���� ������ �ٸ��ٸ� false
			return false;
		Student2 other = (Student2) obj;
		return Objects.equals(name, other.name); //�̸��� ��ġ�ϸ� true
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	

}
