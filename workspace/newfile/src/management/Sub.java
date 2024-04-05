package management;

public class Sub {  //수강과목
	//멤버볌서 생성자 gett sett toString 순서로 만든다  
	
	private String subName;
	private String subtime;
	private String subProfesor;// 담당교수
	private String subScheduler; // 시간표
	
	
	//모두 다 넣는 생성자 
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
