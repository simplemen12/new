package std2;

import java.util.ArrayList;
import java.util.Scanner;

public class StdManager2 {
	
	private ArrayList<Student2> list = new ArrayList<>();
	
	public void add() {
		list.add(new Student2("ȫ�浿"));
		list.add(new Student2("ȫ��"));
		list.add(new Student2("ȫ��"));
		list.add(new Student2("�浿"));
		list.add(new Student2("1ȫ�浿"));
		list.add(new Student2("ȫ2�浿"));
	}
	
	
	public void printStd2() {
		for(int i=0; i<list.size(); i++) {
			list.get(i).printOne();
		}
	}
	
	public void addStd(Scanner scan) {
		System.out.println("�л��� > ");
		String name = scan.next();
		System.out.println("���� > ");
		String age = scan.next();
		System.out.println("��ȭ��ȣ ");
		String num = scan.next();
		
		
		
		
		
		}
	
	public void delStd2(Scanner scan) {
		System.out.println("�л���");
		String name = scan.next();
		boolean result = list.remove(new Student2(name));
		if(!result) {
			System.out.println("�л��� �����ϴ�.");
			return;
		}
		System.out.println("�л������Ϸ�");
	}
	
	public void searchStd2(Scanner scan) {
		System.out.println("�л���>");
		String name = scan.next();	
		
		for(Student2 s : list) {
			if(s.getName().equals(name)) {
				s.printOne();
				return;
			}
		}
		System.out.println("�˻��� �л��� �����ϴ�.");
		}
	
	public void modStd2(Scanner scan) {
		System.out.println("�л���");
		String name = scan.next();
	for(int i=0; i<list.size(); i++) {
		if(list.get(i).getName().equals(name)) {
			System.out.println("������ ���� (�̸�, ����, �� �� �ϳ� �Է�)");
			String op = scan.next();
			
			switch(op) {
			case"�̸�" :
				String modName = scan.next();
				list.get(i).setName(modName);
				break;
			case"����" :
				int modAge = scan.nextInt();
				list.get(i).setAge(modAge);
				break;
			case"��" :
				String modPhone = scan.next();
				list.get(i).setPhone(modPhone);
				break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		
			}
			}
		System.out.println("�л��� �������� �ʽ��ϴ�.");
	}
	}

}
