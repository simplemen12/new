package management;

import java.util.Scanner;

//import studentManger.Student;
//import studentManger.Subject;

public class Student {

		
		public Object getId() { //������
			// TODO Auto-generated method stub
			return null;
		}
		
		
		
		class student{
			/*
			 * �й�,�̸�,����,��ȭ��ȣ,�ּ�,��������Subject[] 5��
			 */
			private String Id; //�й�
			private String Name; //�̸�
			private String Age; //����
			private String Num; //��ȭ��ȣ
			private String add; //�ּ�
			private String[] subject = new String[5]; //���������� ������ �迭
			
			public student() {} //�⺻������
			
			public student(String Id, String Name, String Age, String Num, String add) {
				this.Id = Id;
				this.Name = Name;
				this.Age = Age;
				this.Num = Num;
				this.add = add;
				
				
				
				
			}

			public String getId() {
				return Id;
			}

			public void setId(String id) {
				Id = id;
			}

			public String getName() {
				return Name;
			}

			public void setName(String name) {
				Name = name;
			}

			public String getAge() {
				return Age;
			}

			public void setAge(String age) {
				Age = age;
			}

			public String getNum() {
				return Num;
			}

			public void setNum(String num) {
				Num = num;
			}

			public String getAdd() {
				return add;
			}

			public void setAdd(String add) {
				this.add = add;
			}

			public String[] getSubject() {
				return subject;
			}

			public void setSubject(String[] subject) {
				this.subject = subject;
			}
			
			public String toString() {
				return "�л�����Ʈ:"+ Name +Id+  Age+ Num+ add ;
			}
		
		
		}//Ŭ������
		
		
		//�޼��� ����
		private Student[] students = new Student[10];  //StudentŬ������ ProgramŬ�������� ���
	    private int count = 0;
	    
	    private Subject[] subjects = new Subject[10];

	    
	    
	    public void printStudent() { //�л���� �޼���
	        for (int i = 0; i < count; i++) {
	            System.out.println(students[i].toString());
	        }
	    }

	    public void insertStudent(Scanner scan) { //�л��߰� �޼���
	        if (count > students.length) {
	            System.out.println("�� �̻� �л��� �߰��� �� �����ϴ�.");
	           
	        }

	        System.out.println("�л� ������ �Է����ּ���.");
	        System.out.println("�̸�: ");
	        String name = scan.next(); //�ҹ����ε� �빮�ڷ� �����ϳ�?
	        System.out.println("�й�: ");
	        String id = scan.next(); // ��
	        System.out.print("����: ");
	        String age = scan.next(); //��
	        students[count++] = new Student(); //�迭�� ����
	    }

	    public void searchStudent(Scanner scan) { //�л��˻� �޼���
	        System.out.println("�˻��� �л��� �й��� �Է����ּ���.");
	        String id = scan.next();
	               
	        for (int i = 0; i < count; i++) {
	            if (students[i].getId().equals(id)) {
	                System.out.println(students[i].toString());
	                return;
	            }
	        }
	        System.out.println("�ش� �й��� �л��� ã�� �� �����ϴ�.");
	    }
	    
	    public void addSubject(Subject subject) {
	    	if(count == subjects.length) {
	    		Subject[] temp = new Subject[subjects.length];
	    		for(int i=0; i<subjects.length; i++) {
	    			temp[i] = subjects[i];
	    		}
	    		subjects = temp;
	    	}
	    	subjects[count] = subject;
	    	count++;
	    }

	    public void registerSubject(Scanner scan) { //���������߰� �޼���
	        System.out.println("���� ��û�� �л��� �й��� ���� ��û�� ���� ������ �Է����ּ���.");
	        String id = scan.next();
	        String group = scan.next();
	        for (int i = 0; i < count; i++) {
	            if (students[i].getId().equals(id)) { //StudentŬ���� �ȿ� student�迭 ��ü�� getId�� �˻�
	                students[i].addSubject(new Subject());
	                return;
	            }
	        }
	        System.out.println("�ش� �й��� �л��� ã�� �� �����ϴ�.");
	    }
	/*
	    public void deleteSubject(Scanner scan) { //����������� �޼���
	        System.out.println("���� öȸ�� �л��� �й��� ���� öȸ�� ���� ������ �Է����ּ���.");
	        String id = scan.next();
	        String group = scan.next();
	        for (int i = 0; i < count; i++) {
	            if (students[i].getId().equals(id)) {
	                students[i].deleteSubject(new Subject());
	                return;
	            }
	        }
	        System.out.println("�ش� �й��� �л��� ã�� �� �����ϴ�.");
	    }
	    */
		
		

	}



