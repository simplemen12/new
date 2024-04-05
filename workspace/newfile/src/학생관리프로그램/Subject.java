package �л��������α׷�;

public class Subject {
	
	private String subName; // �����
	private int subTime; // �ü�
	private String subProfessor; // ��米��
	private String subScheduler; // �ð�ǥ
	
	
	public Subject() {} //������
	
	
	//����� �޴� ������
	public Subject(String subName){
		this.subName = subName;
	}
	
	//��δ� �ִ� ������ 
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
