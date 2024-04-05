package management;

public class Subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class subject1 {
		
		class subject{  //subject class 하나의 수강과목정보를 저장하는 클래스
			//과목코드,과목명,학점,시수,교수명,학기,시간표,강의장
			private String Cord; //과목코드
			private String Subn; //과목명
			private String  Score;//학점
			private String  Time;//시수
			private String  Pro;//교수명
			private String Sem ;//학기
			private String Tt ;//시간표
			private String Rh ;//강의장
			
			//gtst toString 
			
			
			public subject() {} //기본생성자
			
			public subject(String Cord, String Subn, String Score, String Time, String Pro, String Sem, String Tt, String Rh) {
				this.Cord = Cord;
				this.Subn = Subn;
				this.Score = Score;
				this.Time = Time;
				this.Pro = Pro;
				this.Sem = Sem;
				this.Tt = Tt;
				this.Rh = Rh;
				
				
				
				
			}
			
			
			
			public String toString() {
				return "Subn(SubjectName):"+ Subn ;
			}
		

			public String getCord() {
				return Cord;
			}

			public void setCord(String cord) {
				Cord = cord;
			}

			public String getSubn() {
				return Subn;
			}

			public void setSubn(String subn) {
				Subn = subn;
			}

			public String getScore() {
				return Score;
			}

			public void setScore(String score) {
				Score = score;
			}

			public String getTime() {
				return Time;
			}

			public void setTime(String time) {
				Time = time;
			}

			public String getPro() {
				return Pro;
			}

			public void setPro(String pro) {
				Pro = pro;
			}

			public String getSem() {
				return Sem;
			}

			public void setSem(String sem) {
				Sem = sem;
			}

			public String getTt() {
				return Tt;
			}

			public void setTt(String tt) {
				Tt = tt;
			}

			public String getRh() {
				return Rh;
			}

			public void setRh(String rh) {
				Rh = rh;
			}
			
		}

	}


}
