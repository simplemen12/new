package �л��������α׷�;

import java.util.Arrays;

public class Student {
	
	private String stdNum;
	private String stdName;
	private String stdPhone;
	
	private Subject[] subjectList = new Subject[5]; 
	private int cnt; // subjectList �迭�� index���� 
	
	//������
	public Student() {}
	public Student(String stdNum, String stdName,String stdPhone) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.stdPhone = stdPhone;
	}
	
	//�޼���
	
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
	//�л����� ��� �޼��� (toString �̿밡��)
	public void stdPrint() {
		System.out.println("�л���"+stdName+"("+stdNum+")/"+stdPhone);
		
	}
	
	//�������� ��� �޼��� : �迭�� ������ ����
	public void subPrint() {
		//SubjectŬ������ toString ȣ��
		if(cnt==0) {
			System.out.println("�������� ������ �����ϴ�.");
			return;
		}
		//toString�� ��ü�� ������ ���ڷ� ���� sysout(��ü) => toStringȣ��
		for(int i=0; i<cnt; i++) {
			System.out.println(subjectList[i]);//toString ȣ��
		}
	}
	
	//�������� �߰� �޼���, 
	//�Ű����� : �������� ��ü Subject subjectList �迭�� �ش� ��ü ���
	public void insertSubject(Subject sub) {
		//�迭�� �� á�ٸ� .. �迭�� �÷��ֱ�.
		//�迭�� ���̸� ���ϸ� ����Ұ���.
		// �� �� ������ �迭�� �����Ͽ� �迭 ���� �� �迭 �ٲٱ�  
		if(cnt == subjectList.length) {
			Subject[] tmp = new Subject[subjectList.length+5];
			//�迭����
			System.arraycopy(subjectList, 0, tmp, 0 , cnt);
			subjectList = tmp;
		}
		
		//subjectList �迭�� �ش� ��ü ���
		subjectList[cnt] = sub ; 
		cnt++;
	}
	
	
	//�������� ���� �޼���
	public void deleteSubject(String subName) {
		//�������� �迭���� subName�� �˻��Ͽ� ���� 
		int index = -1 ;
		if(subName == null) {
			return;
		}
		for(int i=0; i<cnt; i++) {
			if(subjectList[i].getSubName().equals(subName)) { // subjecList��ü�� ��� ������ get���� �����ϰ� equals�� �˻��� text�� ������ Ȯ�� �� ������ index�� ã�� i���� �ּҸ� �Է� 
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("ã�� ������ �����ϴ�.");
			return;
		}
		
		//���� : ã�� ��ġ���� �޹����� �չ����� �ű�� �۾�
		for(int i = index; i<cnt-1; i++) {
			subjectList[i] = subjectList[i+1];
		}
		
		//�������� null 
		subjectList[cnt-1]=null;
		//�Ѱ��� ���� ���� ������ �پ��
		cnt--;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
