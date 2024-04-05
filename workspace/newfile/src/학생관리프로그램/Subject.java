package 학생관리프로그램;

public class Subject {
	
	private String subName; // 과목명
	private int subTime; // 시수
	private String subProfessor; // 담당교수
	private String subScheduler; // 시간표
	
	
	public Subject() {} //생성자
	
	
	//과목명만 받는 생성자
	public Subject(String subName){
		this.subName = subName;
	}
	
	//모두다 넣는 생성자 
	public Subject(String subName, int subTime, String subProfessor, String subScheduler) {
		this.subName = subName;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subScheduler = subScheduler;
	}


	public String getSubName() {
		return subName;
	}


	@Override
	public String toString() {
		return "Subject [subName=" + subName + ", subTime=" + subTime + ", subProfessor=" + subProfessor
				+ ", subScheduler=" + subScheduler + "]";
	}


	public void setSubName(String subName) {
		this.subName = subName;
	}


	public int getSubTime() {
		return subTime;
	}


	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}


	public String getSubProfessor() {
		return subProfessor;
	}


	public void setSubProfessor(String subProfessor) {
		this.subProfessor = subProfessor;
	}


	public String getSubScheduler() {
		return subScheduler;
	}


	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}
	
	
	
	
	
	
	
	
	

}
