package std;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Student {
	//멤버변수 : 이름, 나이, 전화번호, map(과목,점수), 합계, 평균
	//생성자,메서드,getset, 출력메서드 / toString가능
	//메서드  - 출력메서드(학생정보, 과목점수(성적표) 합계, 평균)
	//map(과목, 점수) 추가/삭제
	private String stdName; 
	private String stdOld;
	private String stdPhone;
	private String stdSum;
	private String stdAvr;

	Scanner scan = new Scanner(System.in);
	HashMap<String, Integer> map1 = new HashMap<>(); //과목, 점수
	//학생의 배열을 멤버변수로 추가
	private Student[] studentList = new Student[5];
	int stdCnt=0;
	
	//생성자 
	public Student() {}
	
	public Student(String stdName, String stdOld,String stdPhone,String stdSum, String stdAvr) {
		this.stdName = stdName;
		this.stdOld = stdOld;
		this.stdPhone = stdPhone;
		this.stdPhone = stdSum;
		this.stdPhone = stdAvr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", stdOld=" + stdOld + ", stdPhone=" + stdPhone + ", stdSum=" + stdSum
				+ ", stdAvr=" + stdAvr + ", map1=" + map1 + "]";
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdOld() {
		return stdOld;
	}

	public void setStdOld(String stdOld) {
		this.stdOld = stdOld;
	}

	public String getStdPhone() {
		return stdPhone;
	}

	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}

	public String getStdSum() {
		return stdSum;
	}

	public void setStdSum(String stdSum) {
		this.stdSum = stdSum;
	}

	public String getStdAvr() {
		return stdAvr;
	}

	public void setStdAvr(String stdAvr) {
		this.stdAvr = stdAvr;
	}

	public HashMap<String, Integer> getMap1() {
		return map1;
	}

	public void setMap1(HashMap<String, Integer> map1) {
		this.map1 = map1;
	}
	
	//메서드  - 출력메서드(학생정보, 과목점수(성적표) 합계, 평균)
		
	//map(과목, 점수) 추가/삭제
	
	
	//학생정보 입력 메서드
	public void addStd(Scanner scan) {
		//입력받은 값을 객체로 생성 (Student)
			
			//	ArrayList<String> sN = new ArrayList<>(); //기존 배열생성을 List로 생성		
			//	ArrayList<String> sO = new ArrayList<>();		
			//	ArrayList<String> sP = new ArrayList<>();		
			//	ArrayList<String> sS = new ArrayList<>();		
			//	ArrayList<String> sA = new ArrayList<>();		
		
		
		System.out.println("학생이름");
		String stdName = scan.next();
	   //sN.add(stdName); //입력된 값을 list에 저장
		
		System.out.println("학생나이");
		String stdOld = scan.next();
		//sO.add(stdName); //입력된 값을 list에 저장
		
		System.out.println("학생번호");
		String stdPhone = scan.next();
		//sP.add(stdName); //입력된 값을 list에 저장
		
		System.out.println("학점합계");
		String stdSum = scan.next();
		//sS.add(stdName); //입력된 값을 list에 저장
		
		System.out.println("학점평균");
		String stdAvr = scan.next();
		//sA.add(stdName); //입력된 값을 list에 저장
		
		//입력받은 값을 객체로 생성(Student)
		Student s = new Student(stdName, stdOld, stdPhone, stdSum, stdAvr );
		
		
		//배열이 다 찼을경우 배열복사
		if(stdCnt == studentList.length) {
			Student[] tmp = new Student[studentList.length+5];
			System.arraycopy(studentList, 0, tmp, 0, stdCnt);
			studentList = tmp;
		}
		//배열에 등록
		studentList[stdCnt] = s; //studentList라는 Student 클래스에서 생성된 배열에
		stdCnt++;                //stdCnt로 번지를 준 값으로 저장
				
	}
	
	
	
	//과목,점수입력 메서드
	//map을 매개변수로 받는 케이스
		public static HashMap<String, Integer> insertSub(String a, int b, HashMap<String, Integer> map1) {
			//HashMap<String, Integer> map1 = new HashMap<>();
			
		
		
			map1.put(a, b);
			
			System.out.println(map1);
			
			//int sum=0;
			//향상된 for 출력
			for(String key : map1.keySet()) {
				System.out.println(key+":"+map1.get(key));// key에 대한 values 리턴
				
				//sum+=map1.get(key); //map의 value를 누적
				System.out.println();
			}
			
		
			 return map1;
		}
		
		//학생정보 출력 메서드 (toString 이용가능)
		public void stdPrint() {
			System.out.println("학생명:"+stdName); //
		}
		
		//수강정보 출력메서드
		public void subPrint() {
			System.out.println(map1);
		}
		//학생정보검색 메서드
		public void searchStd(Scanner scan) {
			//검색할 학생이름을 입력받아 배열에서 탐색 후 있다면
			//학생정보 + 수강정보 출력
			System.out.println("검색할 학생명 >");
			String searchName = scan.next();
			
			//배열 탐색
			for(int i=0; i<stdCnt; i++) {
				//System.out.println("+++++");
				if(searchName.equals(studentList[i].getStdName())) {
					studentList[i].stdPrint();
					System.out.println(studentList[i]);
					subPrint();
					return;
				}
			}
			System.out.println("검색한 이름이 없습니다.");
			
		}
		
		
		//학생정보 삭제 메서드
		public void delStd(Scanner scan) {
			//학생정보 배열에서 stdName을 검색하여 삭제
			System.out.println("학생이름");
			String Name = scan.next();
			
			
			int index = -1;
			if(Name == null) {
				return;
			}
			
			for(int i=0; i<stdCnt; i++) { //StudentList객체의 index역할하는 stdCnt
				if(studentList[i].getStdName().equals(Name)) {
					index = i;
						break;
				}
			}
			
			if(index == -1) {
				System.out.println("찾는 과목이 없습니다.");
				return;
			}
			
			//삭제 : 찾은 위치부터 뒷번지를 앞번지로 옮기는 작업
			for(int i=index; i <stdCnt-1; i++) {
				studentList[i] = studentList[i+1];
			}
			//끝번지는 null
			studentList[stdCnt-1]=null;
			//한과목 삭제 과목 개수가 줄어듦
			stdCnt--;
			
		
		}
		
		public void modSub(Scanner scan) {
			//map은 set이 없음. remove => put
			//key 중복 불가능. put => 덮어쓰기
            System.out.println("수강신청학생명");
			
			String name = scan.next();
			int index = -1;//학생의 번지를 저장하기 위한 변수
			
			//학생의 위치름 탐색 후
			for(int i=0; i<stdCnt; i++) {
				if(name.equals(studentList[i].getStdName())){ //studentList에서 이름을 찾아야 그 i번지의 값을 index에 저장하는 것인데
					index = i;
					break;
				}
			}
			//검색학생이 없다면 index에 값이 안들어가서 그대로 변수 -1
			if(index == -1) {
				System.out.println("학생정보가 없습니다.");
				return;
			}
			//map은 set이 없음. remove => put  => 덮어쓰기
			//key중복 불가능
			
			
			
			System.out.println("수정할 수강신청 과목");
			String m = scan.next();
			System.out.println("수정 수강신청 점수");
			int n = scan.nextInt();
			map1.remove(m);
			map1.remove(n);
//			if(map1.remove(m)==null) {
//				System.out.println("수정할 단어가 없습니다.");
//				return;
//			}

			System.out.println("재수강신청 과목");
			String m1 = scan.next();
			System.out.println("재수강신청 점수");
			int n1 = scan.nextInt();
			studentList[index].map1.put(m1, n1);
			System.out.println("수정완료");
		
			
			
		}
		
		public void delSub(Scanner scan) {
			
		}
		
		//수강과목등록
		public void regSub(Scanner scan) {
			//누구 무슨과목을 추가할지 설정 / 수가신청할 학생이름을 입력받아
			System.out.println("수강신청학생명");
			
			String name = scan.next();
			int index = -1;//학생의 번지를 저장하기 위한 변수
			
			//학생의 위치름 탐색 후
			for(int i=0; i<stdCnt; i++) {
				if(name.equals(studentList[i].getStdName())){ //studentList에서 이름을 찾아야 그 i번지의 값을 index에 저장하는 것인데
					index = i;
					break;
				}
			}
			//검색학생이 없다면 index에 값이 안들어가서 그대로 변수 -1
			if(index == -1) {
				System.out.println("학생정보가 없습니다.");
				return;
			}
			
			//그 학생의 배열에 수강과목[]을 추가
			//수강과목의 객체를 생성
			System.out.println("수강신청 과목");
			String m = scan.next();
			System.out.println("수강신청 점수");
			int n = scan.nextInt();
			
			//Student z = new Student(sName, sName, sName, sName, sName);
			
			studentList[index].insertSub(m, n, map1);
			
			
			
			
		}
		
		
}