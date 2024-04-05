package management;

import java.util.Scanner;

//import studentManger.Student;
//import studentManger.Subject;

public class Student {

		
		public Object getId() { //형식적
			// TODO Auto-generated method stub
			return null;
		}
		
		
		
		class student{
			/*
			 * 학번,이름,나이,전화번호,주소,수강과목Subject[] 5개
			 */
			private String Id; //학번
			private String Name; //이름
			private String Age; //나이
			private String Num; //전화번호
			private String add; //주소
			private String[] subject = new String[5]; //수강과목은 여러개 배열
			
			public student() {} //기본생성자
			
			public student(String Id, String Name, String Age, String Num, String add) {
				this.Id = Id;
				this.Name = Name;
				this.Age = Age;
				this.Num = Num;
				this.add = add;
				
				
				
				
			}

			public String getId() {
				return Id;
			}

			public void setId(String id) {
				Id = id;
			}

			public String getName() {
				return Name;
			}

			public void setName(String name) {
				Name = name;
			}

			public String getAge() {
				return Age;
			}

			public void setAge(String age) {
				Age = age;
			}

			public String getNum() {
				return Num;
			}

			public void setNum(String num) {
				Num = num;
			}

			public String getAdd() {
				return add;
			}

			public void setAdd(String add) {
				this.add = add;
			}

			public String[] getSubject() {
				return subject;
			}

			public void setSubject(String[] subject) {
				this.subject = subject;
			}
			
			public String toString() {
				return "학생리스트:"+ Name +Id+  Age+ Num+ add ;
			}
		
		
		}//클래스끝
		
		
		//메서드 생성
		private Student[] students = new Student[10];  //Student클래스를 Program클래스에서 끌어씀
	    private int count = 0;
	    
	    private Subject[] subjects = new Subject[10];

	    
	    
	    public void printStudent() { //학생출력 메서드
	        for (int i = 0; i < count; i++) {
	            System.out.println(students[i].toString());
	        }
	    }

	    public void insertStudent(Scanner scan) { //학생추가 메서드
	        if (count > students.length) {
	            System.out.println("더 이상 학생을 추가할 수 없습니다.");
	           
	        }

	        System.out.println("학생 정보를 입력해주세요.");
	        System.out.println("이름: ");
	        String name = scan.next(); //소문자인데 대문자로 변경하나?
	        System.out.println("학번: ");
	        String id = scan.next(); // 동
	        System.out.print("나이: ");
	        String age = scan.next(); //동
	        students[count++] = new Student(); //배열에 정보
	    }

	    public void searchStudent(Scanner scan) { //학생검색 메서드
	        System.out.println("검색할 학생의 학번을 입력해주세요.");
	        String id = scan.next();
	               
	        for (int i = 0; i < count; i++) {
	            if (students[i].getId().equals(id)) {
	                System.out.println(students[i].toString());
	                return;
	            }
	        }
	        System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
	    }
	    
	    public void addSubject(Subject subject) {
	    	if(count == subjects.length) {
	    		Subject[] temp = new Subject[subjects.length];
	    		for(int i=0; i<subjects.length; i++) {
	    			temp[i] = subjects[i];
	    		}
	    		subjects = temp;
	    	}
	    	subjects[count] = subject;
	    	count++;
	    }

	    public void registerSubject(Scanner scan) { //수강과목추가 메서드
	        System.out.println("수강 신청할 학생의 학번과 수강 신청할 과목 정보를 입력해주세요.");
	        String id = scan.next();
	        String group = scan.next();
	        for (int i = 0; i < count; i++) {
	            if (students[i].getId().equals(id)) { //Student클래스 안에 student배열 객체에 getId로 검색
	                students[i].addSubject(new Subject());
	                return;
	            }
	        }
	        System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
	    }
	/*
	    public void deleteSubject(Scanner scan) { //수강과목삭제 메서드
	        System.out.println("수강 철회할 학생의 학번과 수강 철회할 과목 정보를 입력해주세요.");
	        String id = scan.next();
	        String group = scan.next();
	        for (int i = 0; i < count; i++) {
	            if (students[i].getId().equals(id)) {
	                students[i].deleteSubject(new Subject());
	                return;
	            }
	        }
	        System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
	    }
	    */
		
		

	}



