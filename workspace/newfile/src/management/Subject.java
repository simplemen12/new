package management;

public class Subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class subject1 {
		
		class subject{  //subject class �ϳ��� �������������� �����ϴ� Ŭ����
			//�����ڵ�,�����,����,�ü�,������,�б�,�ð�ǥ,������
			private String Cord; //�����ڵ�
			private String Subn; //�����
			private String  Score;//����
			private String  Time;//�ü�
			private String  Pro;//������
			private String Sem ;//�б�
			private String Tt ;//�ð�ǥ
			private String Rh ;//������
			
			//gtst toString 
			
			
			public subject() {} //�⺻������
			
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
