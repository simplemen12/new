package management;

import java.util.Scanner;

public class St {  //학생정보
	
	private String stdNum;
	private String stdName;
	private String stdPhone;
	
	private Sub[] subjectList = new Sub[5];
	private int cnt; //subject배열의 index역할
	
	public St() {}
	
	public St(String stdNum, String stdName, String stdPhone) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.stdPhone = stdPhone;


	}
	
	//메서드
	public void stdPrint() { //학생정보출력 메서드
		System.out.println("학생정보");
		System.out.println("학번"+stdNum+"이름"+stdName+"폰"+stdPhone);
	}
	
	//수강과목 출력 메서드
	public void subPrint() {
		//st 클래스의 toString호출
		if(cnt==0) {
			System.out.println("수강과목이 없습니다.");
			return; //없으면 for 넘어서 탈출
		}
		for(int i=0; i<cnt; i++) {
			System.out.println(subjectList[i]); //투스트링 호출
			//투스트링은 객체의 내용이 문자로 리턴 sysout 객체 => 투스트링 호출
		}
		
	}
	
	//수강과목 추가 메서드 - 매개변수 수강과목 객체 subject subjectList배열에 해당 객체 담기
	public void insertSubject(Sub sub) {
		//배열이 다 찼다면 ...배열을 늘려줘야 하는데 배열은 한번 길이가 정해지면 바꿀수 없다. 
		//더 긴 길이의 배열을 생성하여 배열 복사 후 배열 바꾸기  
		if(cnt == subjectList.length) {
			Sub[] temp = new Sub[subjectList.length+5];
			//배열복사
			System.arraycopy(subjectList,0, temp, 0, cnt);
			subjectList = temp;
		}
		
		//subjectList 배열에 해당 객체 담기
		subjectList[cnt] = sub;
		cnt++;
	}
	
	public void deleteSubject(String subName) {
		// TODO Auto-generated method stub
		//수강과목 배열에서 subName을 검색하여 삭제 
		int index = -1;
		if(subName == null) {
			return;
		}
		
		/*
		for(int i=0; i<cnt; i++) {
			if(subjectList[i].getSubName.equals(subName)){
				index = i;
				break;
			}
		}
		*/
		
		if(index ==-1){
			System.out.println("찾는과목이 없습니다");
			return;
		}
		//삭제
		for(int i=index; i<cnt-1; i++) {
			subjectList[i] = subjectList[i+1];
		}
		//끝번지는 null
	subjectList[cnt-1]= null;
	cnt--;
		
	}
	
	
	
	

	@Override
	public String toString() {
		return "St [stdNum=" + stdNum + ", stdName=" + stdName + ", stdPhone=" + stdPhone + ", cnt=" + cnt + "]";
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

//	public Subject[] getSubjectList() {
//		return subjectList;
//	}
//
//	public void setSubjectList(Subject[] subjectList) {
//		this.subjectList = subjectList;
//	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	

}
