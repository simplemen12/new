package management;

public class Sub {  //��������
	//����ټ� ������ gett sett toString ������ �����  
	
	private String subName;
	private String subtime;
	private String subProfesor;// ��米��
	private String subScheduler; // �ð�ǥ
	
	
	//��� �� �ִ� ������ 
	public Sub(String subName, String subtime, String subProfesor, String subScheduler) {
		this.subName = subName;
		this.subtime = subtime;
		this.subProfesor = subProfesor;
		this.subScheduler = subScheduler;
		
		
		
		// g s t
		
		
		
	}


	@Override
	public String toString() {
		return "Stdmanager [subName=" + subName + ", subTime=" + subtime + ", subProfesor=" + subProfesor
				+ ", subScheduler=" + subScheduler + "]";
	}


	public String getSubName() {
		return subName;
	}


	public void setSubName(String subName) {
		this.subName = subName;
	}


	public String getSubTime() {
		return subtime;
	}


	public void setSubTime(int subTime) {
		this.subtime = subtime;
	}


	public String getSubProfesor() {
		return subProfesor;
	}


	public void setSubProfesor(String subProfesor) {
		this.subProfesor = subProfesor;
	}


	public String getSubScheduler() {
		return subScheduler;
	}


	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}


}
