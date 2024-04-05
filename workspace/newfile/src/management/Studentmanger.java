package management;

import java.util.Arrays;
import java.util.Scanner;


public class Studentmanger {
    private String id;
    private String name;
    private int age;
    private String phone;
    private String address;
    private Subject[] subjects = new Subject[10];
    private int count = 0;

    public Studentmanger() {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public void addSubject(Subject subject) {
        if(count == subjects.length) {
            Subject[] temp = new Subject[subjects.length];
            for(int i = 0; i < subjects.length; i++) {
                temp[i] = subjects[i];
            }
            subjects = temp;
        }
        subjects[count] = subject;
        count++;
    }

    public void deleteSubject(Subject subject) {
        for(int i=0; i<count; i++) {
            if(subjects[i].equals(subject)) {
                for(int j = i; j < count-1; j++) {
                    subjects[j] = subjects[j+1];
                }
                subjects[count] = null;
                count--;
                return;
            }
        }
    }

    public void printSubjects() {
        System.out.println(name + " �л��� �����ϴ� ����");
        for(int i=0; i<count; i++) {
            System.out.println(subjects[i].toString());
        }
    }
    
    
    private Student[] students = new Student[10];
    private int count1 = 0;

    public void printStudent() {
        for (int i = 0; i < count1; i++) {
            System.out.println(students[i].toString());
        }
    }
    
    public void insertStudent(Scanner scan) {
        if (count > students.length) {
            System.out.println("�� �̻� �л��� �߰��� �� �����ϴ�.");
           
        }

        System.out.println("�л� ������ �Է����ּ���.");
        System.out.println("�̸�: ");
        String name = scan.next();
        System.out.println("�й�: ");
        String id = scan.next();
        System.out.print("����: ");
        String age = scan.next();
        students[count++] = new Student();
    }

    public void searchStudent(Scanner scan) {
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
    
    public void registerSubject(Scanner scan) {
        System.out.println("���� ��û�� �л��� �й��� ���� ��û�� ���� ������ �Է����ּ���.");
        String id = scan.next();
        String group = scan.next();
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                students[i].addSubject(new Subject());
                return;
            }
        }
        System.out.println("�ش� �й��� �л��� ã�� �� �����ϴ�.");
    }



    


    

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
	public String toString() {
		return  ", name=" + name +"�й�"+ id + ", age=" + age  ;

	}
}
