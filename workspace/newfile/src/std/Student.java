package std;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Student {
	//������� : �̸�, ����, ��ȭ��ȣ, map(����,����), �հ�, ���
	//������,�޼���,getset, ��¸޼��� / toString����
	//�޼���  - ��¸޼���(�л�����, ��������(����ǥ) �հ�, ���)
	//map(����, ����) �߰�/����
	private String stdName; 
	private String stdOld;
	private String stdPhone;
	private String stdSum;
	private String stdAvr;

	Scanner scan = new Scanner(System.in);
	HashMap<String, Integer> map1 = new HashMap<>(); //����, ����
	//�л��� �迭�� ��������� �߰�
	private Student[] studentList = new Student[5];
	int stdCnt=0;
	
	//������ 
	public Student() {}
	
	public Student(String stdName, String stdOld,String stdPhone,String stdSum, String stdAvr) {
		this.stdName = stdName;
		this.stdOld = stdOld;
		this.stdPhone = stdPhone;
		this.stdPhone = stdSum;
		this.stdPhone = stdAvr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", stdOld=" + stdOld + ", stdPhone=" + stdPhone + ", stdSum=" + stdSum
				+ ", stdAvr=" + stdAvr + ", map1=" + map1 + "]";
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdOld() {
		return stdOld;
	}

	public void setStdOld(String stdOld) {
		this.stdOld = stdOld;
	}

	public String getStdPhone() {
		return stdPhone;
	}

	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}

	public String getStdSum() {
		return stdSum;
	}

	public void setStdSum(String stdSum) {
		this.stdSum = stdSum;
	}

	public String getStdAvr() {
		return stdAvr;
	}

	public void setStdAvr(String stdAvr) {
		this.stdAvr = stdAvr;
	}

	public HashMap<String, Integer> getMap1() {
		return map1;
	}

	public void setMap1(HashMap<String, Integer> map1) {
		this.map1 = map1;
	}
	
	//�޼���  - ��¸޼���(�л�����, ��������(����ǥ) �հ�, ���)
		
	//map(����, ����) �߰�/����
	
	
	//�л����� �Է� �޼���
	public void addStd(Scanner scan) {
		//�Է¹��� ���� ��ü�� ���� (Student)
			
			//	ArrayList<String> sN = new ArrayList<>(); //���� �迭������ List�� ����		
			//	ArrayList<String> sO = new ArrayList<>();		
			//	ArrayList<String> sP = new ArrayList<>();		
			//	ArrayList<String> sS = new ArrayList<>();		
			//	ArrayList<String> sA = new ArrayList<>();		
		
		
		System.out.println("�л��̸�");
		String stdName = scan.next();
	   //sN.add(stdName); //�Էµ� ���� list�� ����
		
		System.out.println("�л�����");
		String stdOld = scan.next();
		//sO.add(stdName); //�Էµ� ���� list�� ����
		
		System.out.println("�л���ȣ");
		String stdPhone = scan.next();
		//sP.add(stdName); //�Էµ� ���� list�� ����
		
		System.out.println("�����հ�");
		String stdSum = scan.next();
		//sS.add(stdName); //�Էµ� ���� list�� ����
		
		System.out.println("�������");
		String stdAvr = scan.next();
		//sA.add(stdName); //�Էµ� ���� list�� ����
		
		//�Է¹��� ���� ��ü�� ����(Student)
		Student s = new Student(stdName, stdOld, stdPhone, stdSum, stdAvr );
		
		
		//�迭�� �� á����� �迭����
		if(stdCnt == studentList.length) {
			Student[] tmp = new Student[studentList.length+5];
			System.arraycopy(studentList, 0, tmp, 0, stdCnt);
			studentList = tmp;
		}
		//�迭�� ���
		studentList[stdCnt] = s; //studentList��� Student Ŭ�������� ������ �迭��
		stdCnt++;                //stdCnt�� ������ �� ������ ����
				
	}
	
	
	
	//����,�����Է� �޼���
	//map�� �Ű������� �޴� ���̽�
		public static HashMap<String, Integer> insertSub(String a, int b, HashMap<String, Integer> map1) {
			//HashMap<String, Integer> map1 = new HashMap<>();
			
		
		
			map1.put(a, b);
			
			System.out.println(map1);
			
			//int sum=0;
			//���� for ���
			for(String key : map1.keySet()) {
				System.out.println(key+":"+map1.get(key));// key�� ���� values ����
				
				//sum+=map1.get(key); //map�� value�� ����
				System.out.println();
			}
			
		
			 return map1;
		}
		
		//�л����� ��� �޼��� (toString �̿밡��)
		public void stdPrint() {
			System.out.println("�л���:"+stdName); //
		}
		
		//�������� ��¸޼���
		public void subPrint() {
			System.out.println(map1);
		}
		//�л������˻� �޼���
		public void searchStd(Scanner scan) {
			//�˻��� �л��̸��� �Է¹޾� �迭���� Ž�� �� �ִٸ�
			//�л����� + �������� ���
			System.out.println("�˻��� �л��� >");
			String searchName = scan.next();
			
			//�迭 Ž��
			for(int i=0; i<stdCnt; i++) {
				//System.out.println("+++++");
				if(searchName.equals(studentList[i].getStdName())) {
					studentList[i].stdPrint();
					System.out.println(studentList[i]);
					subPrint();
					return;
				}
			}
			System.out.println("�˻��� �̸��� �����ϴ�.");
			
		}
		
		
		//�л����� ���� �޼���
		public void delStd(Scanner scan) {
			//�л����� �迭���� stdName�� �˻��Ͽ� ����
			System.out.println("�л��̸�");
			String Name = scan.next();
			
			
			int index = -1;
			if(Name == null) {
				return;
			}
			
			for(int i=0; i<stdCnt; i++) { //StudentList��ü�� index�����ϴ� stdCnt
				if(studentList[i].getStdName().equals(Name)) {
					index = i;
						break;
				}
			}
			
			if(index == -1) {
				System.out.println("ã�� ������ �����ϴ�.");
				return;
			}
			
			//���� : ã�� ��ġ���� �޹����� �չ����� �ű�� �۾�
			for(int i=index; i <stdCnt-1; i++) {
				studentList[i] = studentList[i+1];
			}
			//�������� null
			studentList[stdCnt-1]=null;
			//�Ѱ��� ���� ���� ������ �پ��
			stdCnt--;
			
		
		}
		
		public void modSub(Scanner scan) {
			//map�� set�� ����. remove => put
			//key �ߺ� �Ұ���. put => �����
            System.out.println("������û�л���");
			
			String name = scan.next();
			int index = -1;//�л��� ������ �����ϱ� ���� ����
			
			//�л��� ��ġ�� Ž�� ��
			for(int i=0; i<stdCnt; i++) {
				if(name.equals(studentList[i].getStdName())){ //studentList���� �̸��� ã�ƾ� �� i������ ���� index�� �����ϴ� ���ε�
					index = i;
					break;
				}
			}
			//�˻��л��� ���ٸ� index�� ���� �ȵ��� �״�� ���� -1
			if(index == -1) {
				System.out.println("�л������� �����ϴ�.");
				return;
			}
			//map�� set�� ����. remove => put  => �����
			//key�ߺ� �Ұ���
			
			
			
			System.out.println("������ ������û ����");
			String m = scan.next();
			System.out.println("���� ������û ����");
			int n = scan.nextInt();
			map1.remove(m);
			map1.remove(n);
//			if(map1.remove(m)==null) {
//				System.out.println("������ �ܾ �����ϴ�.");
//				return;
//			}

			System.out.println("�������û ����");
			String m1 = scan.next();
			System.out.println("�������û ����");
			int n1 = scan.nextInt();
			studentList[index].map1.put(m1, n1);
			System.out.println("�����Ϸ�");
		
			
			
		}
		
		public void delSub(Scanner scan) {
			
		}
		
		//����������
		public void regSub(Scanner scan) {
			//���� ���������� �߰����� ���� / ������û�� �л��̸��� �Է¹޾�
			System.out.println("������û�л���");
			
			String name = scan.next();
			int index = -1;//�л��� ������ �����ϱ� ���� ����
			
			//�л��� ��ġ�� Ž�� ��
			for(int i=0; i<stdCnt; i++) {
				if(name.equals(studentList[i].getStdName())){ //studentList���� �̸��� ã�ƾ� �� i������ ���� index�� �����ϴ� ���ε�
					index = i;
					break;
				}
			}
			//�˻��л��� ���ٸ� index�� ���� �ȵ��� �״�� ���� -1
			if(index == -1) {
				System.out.println("�л������� �����ϴ�.");
				return;
			}
			
			//�� �л��� �迭�� ��������[]�� �߰�
			//���������� ��ü�� ����
			System.out.println("������û ����");
			String m = scan.next();
			System.out.println("������û ����");
			int n = scan.nextInt();
			
			//Student z = new Student(sName, sName, sName, sName, sName);
			
			studentList[index].insertSub(m, n, map1);
			
			
			
			
		}
		
		
}