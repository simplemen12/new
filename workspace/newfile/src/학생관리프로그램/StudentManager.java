package �л��������α׷�;

import java.util.Scanner;

public class StudentManager implements Program {
	
	//source => override implements
	
	//�л��� �迭�� ��������� �߰� 
	private Student[] studentList = new Student[5];
	//indexó�� ���� 
	private int stdCnt;

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		System.out.println("��ü �л� ����");
		for(int i=0; i<stdCnt; i++) {
			studentList[i].stdPrint();//�л����� ���
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
