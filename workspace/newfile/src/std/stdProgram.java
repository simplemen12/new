package std;

import java.util.Scanner;

public interface stdProgram {
	
	Scanner scan = new Scanner(System.in);
	void stdPrint(); // 학생정보출력 2
	void addStd(Scanner scan); // 학생입력 1
	
	void modStd(Scanner scan); // 학생정보수정3
	void delStd(Scanner scan); // 학생삭제4
	
	void searchStd(Scanner scan); // 학생검색5
	
	
	
	void addSub(Scanner scan); // 점수추가6
	void modSub(Scanner scan); // 수강과목수정7
	void delSub(Scanner scan); // 수강과목삭제8
	void regSub(Scanner scan); // 수강과목등록
	//수강과목 및 점수 입력
	

}
