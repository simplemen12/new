package 학생관리프로그램;

import java.util.Scanner;

public class StudentManager implements Program {
	
	//source => override implements
	
	//학생의 배열을 멤버변수로 추가 
	private Student[] studentList = new Student[5];
	//index처리 변수 
	private int stdCnt;

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		System.out.println("전체 학생 정보");
		for(int i=0; i<stdCnt; i++) {
			studentList[i].stdPrint();//학생정보 출력
		}
		
	}

	@Override
	public void insertStudent(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchStudent(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerSubject(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

}
