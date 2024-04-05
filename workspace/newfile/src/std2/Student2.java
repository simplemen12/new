package std2;

import java.util.HashMap;
import java.util.Objects;

public class Student2 {
	//멤버변수는 private 설정 / 메서드 public 
	/*
	 * 클래스명은 대문자로 시작, 변수명, 메서드명은 소문자로 시작 
	 * 변수명, 메서드명에 단어가 많아지면 다음 시작단어 대문자 카멜페이스 기번
	 * indent 들여쓰기 잘 맞추기
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
	
	//출력 메서드 
	
	public void printOne() {
		System.out.println(name+" ( "+age+" ) / ");
		if(phone != null) {
			System.out.println(phone);
		}
	System.out.println();
	if(subject.size()<=0) {
		System.out.println("점수가 없습니다.");
		return;
	}
	printSub();
	calc();
	System.out.println("result"+ sum+" --"+ avg);
		
	}
	
	//과목의 성적표 출력 - map출력
    public void printSub() {
    	System.out.println("-------------");
    	for(String sub : subject.keySet()) {
    		System.out.println(sub+" : "+subject.get(sub));
    	}
    	System.out.println("-------------");
	}
    
  

	//합계평균계산
    public void calc() {
    	this.sum=0;
    	this.avg=0;
    	for(String sub : subject.keySet()) {
    		sum+=subject.get(sub);
    	}
    	avg = (double)sum / subject.size();		
	}
    
    //합계평균계산
    public void addSubject() {
		
	}
    
    //과목삭제
    public void delSubject(String sub) {
		//Integer del = subject.remove(sub);
		if(subject.remove(sub)==null) {
			System.out.println("해당과목ㅇ이 없습니다.");
			return;
		}
		subject.remove(sub);
		System.out.println("점수삭제");
		
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
		if (this == obj) //주소가 내 객체의 주소와 같다면
			return true; 
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //클래스 정보가 다르다면 false
			return false;
		Student2 other = (Student2) obj;
		return Objects.equals(name, other.name); //이름만 일치하면 true
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
