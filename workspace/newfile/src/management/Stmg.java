package management;

import java.util.Scanner;

public class Stmg implements Program{
	//학생의 배열을 멤버변수로 추가
	private St[] studentList = new St[5];
	//intdex처리변수
	
	private int stdCnt;
	
	
	public void printStudent() {
		System.out.println("전체학생정보");
		for(int i=0; i<stdCnt; i++) {
			studentList[i].stdPrint();//학생정보 출력
		}
	}
	
	public void insertStudent(Scanner scan) {
		//1명의 학생정보를 입력 받아서 객체를 생성한 후 studentList에 추가  이것은 다 St에서 정보를 저장 및 받아야 함 
		System.out.println("학번");
		String stdNum = scan.next();
		System.out.println("이름");
		String name = scan.next();
		System.out.println("전화번호");
		String Phone = scan.next();
		//입력받은 값을 객체로 생성 (student)
		St s = new St(stdNum, name, Phone);
		
		if(stdCnt == studentList.length) {
			St[] tmp = new St[studentList.length+5];
			System.arraycopy(studentList, 0, tmp, 0, stdCnt);
			
				studentList[stdCnt] = s;
			}
			studentList[stdCnt]=s;
			stdCnt++;
	}

	@Override
	public void searchStudent(Scanner scan) {
		//검색할 학생이름 입력받아 배열에서 탐색 후 있다면 
		// 검색정보 + 수강정보 출력 
		System.out.println("검색할 학생명 >");
		String searchName = scan.next();
		
		//배열탐색
		for(int i=0; i<stdCnt; i++) {
			if(searchName.equals(studentList[i].getStdName())) {
				studentList[i].stdPrint();
				studentList[i].subPrint();
				return;
			}
		}
		System.out.println("검색가능한 학생이 없습니다.");
		
	}

	@Override
	public void registerSubject(Scanner scan) {
		// TODO Auto-generated method stub
		int index =-1;
		//누가 무슨과목을 추가할지 설정
		//수강신철할 학생이름을 입력받아 
		System.out.println("수강신청 학생명>");
		String name = scan.next();
		//학생의 위치를 탐색 후
		for(int i=0; i<stdCnt; i++) {
			if(name.equals(studentList[i].getStdName())) {
				index = i; // 학생의 번지를 저장하기 위한 변수  
				break;
			}
		}
		//학생이 없다면 ... 
		if(index == -1 ) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		
	// 그 학생의 배열에 수강과목[] 추가
		//수강과목의 객체를 생성
		System.out.println("수강신청 과목 >");
		String sName =scan.next();
		String subProfesor =scan.next();
		String subtime =scan.next();
		String subScheduler =scan.next();
		Sub s1 = new Sub(sName ,subtime, subProfesor,subScheduler); //sub클래스의 sub함수와 겹침..
		//Student클래스[수강신청을 한 학생]의 insertSubject호출
		studentList[index].insertSubject(s1);
		
	}
	
	

	@Override
	public void deleteSubject(Scanner scan) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	

}
