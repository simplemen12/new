package 학생관리프로그램;

import java.util.Arrays;

public class Student {
	
	private String stdNum;
	private String stdName;
	private String stdPhone;
	
	private Subject[] subjectList = new Subject[5]; 
	private int cnt; // subjectList 배열의 index역할 
	
	//생성자
	public Student() {}
	public Student(String stdNum, String stdName,String stdPhone) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.stdPhone = stdPhone;
	}
	
	//메서드
	
	@Override
	public String toString() {
		return "Student [stdNum=" + stdNum + ", stdName=" + stdName + ", stdPhone=" + stdPhone + ", subjectList="
				+ Arrays.toString(subjectList) + ", cnt=" + cnt + "]";
	}
	public String getStdNum() {
		return stdNum;
	}
	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdPhone() {
		return stdPhone;
	}
	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}
	public Subject[] getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(Subject[] subjectList) {
		this.subjectList = subjectList;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	//학생정보 출력 메서드 (toString 이용가능)
	public void stdPrint() {
		System.out.println("학생명"+stdName+"("+stdNum+")/"+stdPhone);
		
	}
	
	//수강과목 출력 메서드 : 배열로 여러개 존재
	public void subPrint() {
		//Subject클래스의 toString 호출
		if(cnt==0) {
			System.out.println("수강중인 과목이 없습니다.");
			return;
		}
		//toString은 객체의 내용이 문자로 리턴 sysout(객체) => toString호출
		for(int i=0; i<cnt; i++) {
			System.out.println(subjectList[i]);//toString 호출
		}
	}
	
	//수강과목 추가 메서드, 
	//매개변수 : 수강과목 객체 Subject subjectList 배열에 해당 객체 담기
	public void insertSubject(Subject sub) {
		//배열이 다 찼다면 .. 배열을 늘려주기.
		//배열은 길이를 정하면 변경불가능.
		// 더 긴 길이의 배열을 생성하여 배열 복사 후 배열 바꾸기  
		if(cnt == subjectList.length) {
			Subject[] tmp = new Subject[subjectList.length+5];
			//배열복사
			System.arraycopy(subjectList, 0, tmp, 0 , cnt);
			subjectList = tmp;
		}
		
		//subjectList 배열에 해당 객체 담기
		subjectList[cnt] = sub ; 
		cnt++;
	}
	
	
	//수강과목 삭제 메서드
	public void deleteSubject(String subName) {
		//수강과목 배열에서 subName을 검색하여 삭제 
		int index = -1 ;
		if(subName == null) {
			return;
		}
		for(int i=0; i<cnt; i++) {
			if(subjectList[i].getSubName().equals(subName)) { // subjecList객체에 담긴 정보에 get으로 접근하고 equals로 검색한 text가 같은지 확인 후 있으면 index에 찾은 i번지 주소를 입력 
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("찾는 과목이 없습니다.");
			return;
		}
		
		//삭제 : 찾은 위치부터 뒷번지를 앞번지로 옮기는 작업
		for(int i = index; i<cnt-1; i++) {
			subjectList[i] = subjectList[i+1];
		}
		
		//끝번지는 null 
		subjectList[cnt-1]=null;
		//한과목 삭제 과목 개수가 줄어듦
		cnt--;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
