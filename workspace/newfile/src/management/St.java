package management;

import java.util.Scanner;

public class St {  //�л�����
	
	private String stdNum;
	private String stdName;
	private String stdPhone;
	
	private Sub[] subjectList = new Sub[5];
	private int cnt; //subject�迭�� index����
	
	public St() {}
	
	public St(String stdNum, String stdName, String stdPhone) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.stdPhone = stdPhone;


	}
	
	//�޼���
	public void stdPrint() { //�л�������� �޼���
		System.out.println("�л�����");
		System.out.println("�й�"+stdNum+"�̸�"+stdName+"��"+stdPhone);
	}
	
	//�������� ��� �޼���
	public void subPrint() {
		//st Ŭ������ toStringȣ��
		if(cnt==0) {
			System.out.println("���������� �����ϴ�.");
			return; //������ for �Ѿ Ż��
		}
		for(int i=0; i<cnt; i++) {
			System.out.println(subjectList[i]); //����Ʈ�� ȣ��
			//����Ʈ���� ��ü�� ������ ���ڷ� ���� sysout ��ü => ����Ʈ�� ȣ��
		}
		
	}
	
	//�������� �߰� �޼��� - �Ű����� �������� ��ü subject subjectList�迭�� �ش� ��ü ���
	public void insertSubject(Sub sub) {
		//�迭�� �� á�ٸ� ...�迭�� �÷���� �ϴµ� �迭�� �ѹ� ���̰� �������� �ٲܼ� ����. 
		//�� �� ������ �迭�� �����Ͽ� �迭 ���� �� �迭 �ٲٱ�  
		if(cnt == subjectList.length) {
			Sub[] temp = new Sub[subjectList.length+5];
			//�迭����
			System.arraycopy(subjectList,0, temp, 0, cnt);
			subjectList = temp;
		}
		
		//subjectList �迭�� �ش� ��ü ���
		subjectList[cnt] = sub;
		cnt++;
	}
	
	public void deleteSubject(String subName) {
		// TODO Auto-generated method stub
		//�������� �迭���� subName�� �˻��Ͽ� ���� 
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
			System.out.println("ã�°����� �����ϴ�");
			return;
		}
		//����
		for(int i=index; i<cnt-1; i++) {
			subjectList[i] = subjectList[i+1];
		}
		//�������� null
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
