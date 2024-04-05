package management;

import java.util.Scanner;

public class Stmg implements Program{
	//�л��� �迭�� ��������� �߰�
	private St[] studentList = new St[5];
	//intdexó������
	
	private int stdCnt;
	
	
	public void printStudent() {
		System.out.println("��ü�л�����");
		for(int i=0; i<stdCnt; i++) {
			studentList[i].stdPrint();//�л����� ���
		}
	}
	
	public void insertStudent(Scanner scan) {
		//1���� �л������� �Է� �޾Ƽ� ��ü�� ������ �� studentList�� �߰�  �̰��� �� St���� ������ ���� �� �޾ƾ� �� 
		System.out.println("�й�");
		String stdNum = scan.next();
		System.out.println("�̸�");
		String name = scan.next();
		System.out.println("��ȭ��ȣ");
		String Phone = scan.next();
		//�Է¹��� ���� ��ü�� ���� (student)
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
		//�˻��� �л��̸� �Է¹޾� �迭���� Ž�� �� �ִٸ� 
		// �˻����� + �������� ��� 
		System.out.println("�˻��� �л��� >");
		String searchName = scan.next();
		
		//�迭Ž��
		for(int i=0; i<stdCnt; i++) {
			if(searchName.equals(studentList[i].getStdName())) {
				studentList[i].stdPrint();
				studentList[i].subPrint();
				return;
			}
		}
		System.out.println("�˻������� �л��� �����ϴ�.");
		
	}

	@Override
	public void registerSubject(Scanner scan) {
		// TODO Auto-generated method stub
		int index =-1;
		//���� ���������� �߰����� ����
		//������ö�� �л��̸��� �Է¹޾� 
		System.out.println("������û �л���>");
		String name = scan.next();
		//�л��� ��ġ�� Ž�� ��
		for(int i=0; i<stdCnt; i++) {
			if(name.equals(studentList[i].getStdName())) {
				index = i; // �л��� ������ �����ϱ� ���� ����  
				break;
			}
		}
		//�л��� ���ٸ� ... 
		if(index == -1 ) {
			System.out.println("�л������� �����ϴ�.");
			return;
		}
		
	// �� �л��� �迭�� ��������[] �߰�
		//���������� ��ü�� ����
		System.out.println("������û ���� >");
		String sName =scan.next();
		String subProfesor =scan.next();
		String subtime =scan.next();
		String subScheduler =scan.next();
		Sub s1 = new Sub(sName ,subtime, subProfesor,subScheduler); //subŬ������ sub�Լ��� ��ħ..
		//StudentŬ����[������û�� �� �л�]�� insertSubjectȣ��
		studentList[index].insertSubject(s1);
		
	}
	
	

	@Override
	public void deleteSubject(Scanner scan) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	

}
