package std;

import java.util.Scanner;

public interface stdProgram {
	
	Scanner scan = new Scanner(System.in);
	void stdPrint(); // �л�������� 2
	void addStd(Scanner scan); // �л��Է� 1
	
	void modStd(Scanner scan); // �л���������3
	void delStd(Scanner scan); // �л�����4
	
	void searchStd(Scanner scan); // �л��˻�5
	
	
	
	void addSub(Scanner scan); // �����߰�6
	void modSub(Scanner scan); // �����������7
	void delSub(Scanner scan); // �����������8
	void regSub(Scanner scan); // ����������
	//�������� �� ���� �Է�
	

}
