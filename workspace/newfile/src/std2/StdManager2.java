package std2;

import java.util.ArrayList;
import java.util.Scanner;

public class StdManager2 {
	
	private ArrayList<Student2> list = new ArrayList<>();
	
	public void add() {
		list.add(new Student2("홍길동"));
		list.add(new Student2("홍길"));
		list.add(new Student2("홍동"));
		list.add(new Student2("길동"));
		list.add(new Student2("1홍길동"));
		list.add(new Student2("홍2길동"));
	}
	
	
	public void printStd2() {
		for(int i=0; i<list.size(); i++) {
			list.get(i).printOne();
		}
	}
	
	public void addStd(Scanner scan) {
		System.out.println("학생명 > ");
		String name = scan.next();
		System.out.println("나이 > ");
		String age = scan.next();
		System.out.println("전화번호 ");
		String num = scan.next();
		
		
		
		
		
		}
	
	public void delStd2(Scanner scan) {
		System.out.println("학생명");
		String name = scan.next();
		boolean result = list.remove(new Student2(name));
		if(!result) {
			System.out.println("학생이 없습니다.");
			return;
		}
		System.out.println("학생삭제완료");
	}
	
	public void searchStd2(Scanner scan) {
		System.out.println("학생명>");
		String name = scan.next();	
		
		for(Student2 s : list) {
			if(s.getName().equals(name)) {
				s.printOne();
				return;
			}
		}
		System.out.println("검색된 학생이 없습니다.");
		}
	
	public void modStd2(Scanner scan) {
		System.out.println("학생명");
		String name = scan.next();
	for(int i=0; i<list.size(); i++) {
		if(list.get(i).getName().equals(name)) {
			System.out.println("수정할 정보 (이름, 나이, 폰 중 하나 입력)");
			String op = scan.next();
			
			switch(op) {
			case"이름" :
				String modName = scan.next();
				list.get(i).setName(modName);
				break;
			case"나이" :
				int modAge = scan.nextInt();
				list.get(i).setAge(modAge);
				break;
			case"폰" :
				String modPhone = scan.next();
				list.get(i).setPhone(modPhone);
				break;
				default:
					System.out.println("잘못 입력하셨습니다.");
		
			}
			}
		System.out.println("학생이 존재하지 않습니다.");
	}
	}

}
