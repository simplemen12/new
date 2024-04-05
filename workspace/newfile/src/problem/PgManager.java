package problem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileOutputStream;

public class PgManager {
	
	//������� Problem
	
	private String Problem; //������� ox������ ����
	private String Write; //������� �ְ��Ĺ����� ����
	private String Pbex; //������ ������ ����
	private String answer;
	private String answer1;
	private String answer2;
	
	public PgManager() {}
	public PgManager(String Problem, String Write, String Pbex, String answer,String answer1,String answer2) {
		this.Problem = Problem;
		this.Write = Write;
		this.Pbex = Pbex;
		this.answer = answer;//�Ϲݴ�
		this.answer1 = answer1;//���������� �Ͻ����δ�
		this.answer2 = answer2;//����������
	}
	
	
	public String getPbex() {
		return Pbex;
	}
	public void setPbex(String pbex) {
		Pbex = pbex;
	}

	

	public String getAnswer1() {
		return answer1;
	}
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	public String getAnswer2() {
		return answer2;
	}
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "PgManager [Problem=" + Problem + ", Write=" + Write + ", Pbex=" + Pbex + ", answer=" + answer
				+ ", answer1=" + answer1 + ", answer2=" + answer2 + ", p=" + p + ", p1=" + p1 + ", p2=" + p2 + ", a3="
				+ a3 + ", getProblem=" + getProblem + "]";
	}
	public String getProblem() { //getset ����
		return Problem;
	}
	public void setProblem(String problem) {
		Problem = problem;
	}
	
	ArrayList<PgManager> p = new ArrayList<>(); //������ ���� ����Ʈ
	ArrayList<PgManager> p1= new ArrayList<>(); //�ְ���
	ArrayList<PgManager> p2= new ArrayList<>(); //������ ������ ���� ����Ʈ [��ĭ]
	
	ArrayList<PgManager> a3= new ArrayList<>(); //������ ������ ���� ����Ʈ [��ĭ]
	//ArrayList<PgManager>[] p = new ArrayList<>[](); //�迭ó��
	private Object getProblem;

	
	//�޼���
	
	
	//  4 ����Ǯ��, 7. ���� ���� 0 : �����ִ�
	
	//���� �������� ����Ȯ�� ������ 
	//4������ ��� �� ���� �ٷ� Ȯ
	
	//ox���� �Է� �޼���
	public void WorkbookRegister(Scanner scan) {
		// TODO Auto-generated method stub
		//ox���� ��ϱ���
		//1. ���� ���� ��ũ
		//2. �ؽ�Ʈ ���� ��ũ
		//3. �ؽ�Ʈ ��ũ �Է� �� ���� �Է� // map (?)
		
		//�ְ��Ĺ��� ���� �����Ĺ��� ���� 
		
		//�����ϰ� ���� �ؽ�Ʈ���� ""ǥ���Ѵ�
		//���ڴ� �ش����
		//�Է��� list�� ���λ���
		
		
		
		System.out.println("�Է��� ox������ �������ּ��� .");
		
		String ox = scan.next();
		System.out.println("�Է��� ox������ ���� �Է����ּ���.");
		String a = scan.next();
		
		
       
		
		
		System.out.println("�Է��� �ְ��Ĺ����� �������ּ��� .");
		System.out.println("�Է��� '�Է� �� �����ϰ��� �ϴ� ������ �κ��� ''���̿� ���� ");
		String Write = scan.next();
		this.p.add(new PgManager(ox,Write,null,null,null,null));//������ �����߰��Ϸ� �����˻��� �ѹ��� �ϱ����� ����Ʈ
		this.p1.add(new PgManager(null,Write,null,null,null,null));//�ְ��Ĺ����߰��Ϸ�, �ְ��ĸ� ��Ƽ� �������� ����Ʈ
		
		System.out.println("�Է��� �ְ��Ĺ����� ���� �Է����ּ���.");
		String a1 = scan.next();
		this.a3.add(new PgManager(null,null,null,a,null,null));//ox ���߰�
		//this.a3.add(new PgManager(null,null,null,a1,null,null));//�ְ��� ���߰�
		this.a3.add(new PgManager(null,null,null,null,a1,null));//�ְ��� ���߰�
		
		System.out.println("�����Էµ� ��������" +p+p1+p2);
		System.out.println("�����Էµ� �����" +a3);
		
		//���⼭ ���ʹ� �޸������� ��� - �� ��ǻ�Ϳ��� ���� UTP-8�� �ƴϴ�. ����
		FileWriter fw = null;
		
		
		
		
	}
	
	
	//ox���� �ܿ��Է� �޼���
	public void SubjectRegister(Scanner scan) {
		//1.�ܿ��� �� �Է� 2. �� �ܿ��� �������� �Է�
		//�ܿ��� ��ϵǴ� ��ŭ �� �ܿ��� �������� ������ �Է� 
		//�� ���������� �Էµ� ���߸�ŭ ������ ����� ����
		System.out.println("�Է��� ox������ �ܿ��� �������ּ��� .");

		String oxsub = scan.next();
		
		this.p.add(new PgManager(Problem,null,null,null,null,null));//�����߰��Ϸ�
		
			System.out.println("���ڸ� �Է°���");
		
	}

	//ox���� �˻� �޼���
	public void Search(Scanner scan) {
		//1. �Էµ� ���� �˻� �� ���
		//2. Ǯ���� ���� �˻� �� ���
		//3. ������ ���� �˻� �� ���
		System.out.println("�˻��ϰ��� �ϴ� list�� �Է����ּ��� ");
		String ox = scan.next();
		try {
			FileWriter fw3 = new FileWriter("writer.txt",true);
			for(int i=1; i<p.size(); i++) {
				String data = p.get(i).Problem+ " test \r\n";  // \n Enter \r ĳ��������
				fw3.write(data); //���
				fw3.write("my project IO test \r\n");
				
			}
			fw3.close();
			} catch (IOException e) {
				
			}
		
		
		
	}
	public void  ui() throws IOException {
		System.out.println("�˻��ϰ��� �ϴ� list�� �Է����ּ��� ");
		
		/*
			FileWriter fw3 = new FileWriter("writer.txt",true);
			for(int i=1; i<p.size(); i++) {
				String data = p.get(i).Problem+ " test \r\n";  // \n Enter \r ĳ��������
				fw3.write(data); //���
				fw3.write("my project IO test \r\n");
				
			}
			fw3.close();
			*/
			System.out.println("+++");
			PrintWriter fw4 = new PrintWriter(new FileWriter("Print.txt59",true));
			for(int i=1; i<p.size(); i++) {
				String data = p.get(i).Problem+ " test \r\n";
				System.out.println("=====");// \n Enter \r ĳ��������
				fw4.print(data); //���
				fw4.print("problem \r\n");
				
			}
			fw4.close();
			
		
	}
	
	//ox����Ǯ�� �޼���
	public void SolvingPb(Scanner scan) {
		//1. �Էµ� ���� + ������ �������� ���� ����
		//2. ������ ������ �ܿ��� �� ��ŭ �Է� �� ����ȭ
		//int a = (int)(Math.random()*p.size())+1;//��������
		
		//ox������� �� �� ����Ʈ�� �Է�
		for(int i=1; i<p.size(); i++) {
			String Answer = p.get(i).Problem;//������� ������ ����� p����Ʈ��ŭ�� ��������
			String Question  = a3.get(i).answer; 
			System.out.println("ox���� ���");// \n Enter \r ĳ��������
			//System.out.println(i+"������"+Answer);
			System.out.println(a3.get(i).answer+"-----����");
			this.a3.add(new PgManager(null,null,null,null,Question,null));
			//������ ������� �ٷ� ������ ��������Ʈ�� ����
			
		
			
		}
		
		
		//������ ���� ��� �� �� ���� �����ȹ��� p1 p1�� �������� �����ؾ��Ѵ�.
		
		//�ְ��� ������� �� �� ����Ʈ�� �Է�
		for(int i=1; i<p.size(); i++) {
			String Answer = p.get(i).Write;//�ְ��Ĺ���
			String Question  = a3.get(i).answer1; //�ְ��Ĵ� 
			System.out.println("�ְ���");// \n Enter \r ĳ��������
			System.out.println(i+"-"+"������"+Answer);
			this.a3.add(new PgManager(null,null,null,null,null,Question));//���������� ������ ���� ����
			//������ ������� �ٷ� ������ ��������Ʈ�� ����
			
		}
		
		        //���� ������� �� �� ����Ʈ�� �Է�
				for(int i=1; i<p.size(); i++) {
					String Answer = p.get(i).Pbex;//
					String Question  = a3.get(i).answer2;
					System.out.println("��������");// \n Enter \r ĳ��������
					System.out.println(i+"-"+"������"+Answer);
					this.a3.add(new PgManager(null,null,null,null,null,Question));//���������� ������ ���� ����
					//������ ������� �ٷ� ������ ��������Ʈ�� ����
					
				}
	}

	//ox���� ä�� �޼���
	public void Resert(Scanner scan) {
		//1.����Ǯ���� ���� ä��
		//2.ä���� ���� ���� 
		
	}
	
	

	//ox���� ä���м� �޼���
	public void ResertAnalysis(Scanner scan) {
		//1.Resert �޼��忡�� ����� ä���� ����� �м�
		//2. �м����ִ� ����   2-1.�ܿ��� Ʋ������ 2-2. ����� �ܿ� ǥ�� �� ����ȭ 
		//2-3 ���ܿ� �ַ�� ����
		//
		
	}

	//ox���� �Է��Ѱ��� �������� ���� �޼���
	public void WorkbookModify(Scanner scan) {
		
		//ox���� ���� 3����
		
		String ox = null;
		//1.�Էµ� ������ ���ڸ� ������ ��ĭȭ
		System.out.println("������ ox������ �˻����ּ���.");
		String search = scan.next(); //�Էµ� ox������ ã�� �ý�Ʈ
		for(int i=0; i<p.size(); i++) { //����Ʈ p�����ŭ �ݺ�
			if(p.get(i).getProblem().contains(search)){
				//p��ü�� ����� ������ i������ �Էµ� search ���� �ִٸ�
				System.out.println("�˻����."+p.get(i).getProblem());
				ox=p.get(i).getProblem(); //i������ �ִ� �ش� �˻��� �Է� 
			}
			//ox=p.get(i).getProblem().contains(search);
			
		}
		
		//String ox = "���ȼ����� 20�ظ�";
		System.out.println("�������� ���� Ű���带 �Է����ּ���");
		String ox1 = scan.next(); //�Էµ� ox�������� ����Ű����
		 System.out.println("--------�˻��� ù ���� ---");
		    char a = ox1.charAt(0);
		    //System.out.println(a); //�˻��� ù���� �Է�
		    
		    char b23 = ox1.charAt(ox1.length()-1);
		    //System.out.println(b23); //�˻��� ���������� ���
		    
		    //System.out.println(ox1.indexOf(a));
		    //System.out.println(ox1.indexOf(b23));
		    
		    int v = ox.indexOf(a); //�˻��� �ؽ�Ʈ���� ù������ ��ġ
		    int v1 = ox.indexOf(b23); //�˻��� �ؽ�Ʈ���� ������ ������ ��ġ
		    
		   //System.out.println(v+v1);
		    
		    //System.out.println(ox.substring(0,v)); //�չ���
		    //System.out.println(ox.substring(v1,ox.length())); //�޹���
		    //System.out.println(ox.substring(0,v)+"   "+ox.substring(v1+1,ox.length()));
			
			//String r = ox.substring(0,v)+"   "+ox.substring(v1+1,ox.length());
			
			this.p1.add(new PgManager(null,null,ox.substring(0,v)+"   "+ox.substring(v1+1,ox.length()),null,null,null));
			//������ ������ ����
			System.out.println("�����Էµ� ��������" +p1);
			
		
		//2.�Էµ� ������ ���ڸ� ��ü
		//3.�ؽ�Ʈ�� �Է� �� Ư���ؽ�Ʈ�� ��ȯ
		
		
		
	    }
	    //3.�ؽ�Ʈ�� �Է� �� Ư���ؽ�Ʈ�� ��ȯ
        public void WorkbookModify2(Scanner scan) {
		//���⼭ �䵵 ���� �����ؾ� ����Ǯ�̰� ����
        	
        	
		//ox���� ���� 3����
        //3.�ؽ�Ʈ�� �Է� �� Ư���ؽ�Ʈ�� ��ȯ
		String ox = null;
		//1.�Էµ� ������ ���ڸ� ������ ��ĭȭ
		System.out.println("������ ox������ �˻����ּ���.");
		String search = scan.next(); //�Էµ� ox������ ã�� �ý�Ʈ
		for(int i=0; i<p.size(); i++) { //����Ʈ p�����ŭ �ݺ�
			if(p.get(i).getProblem().contains(search)){
				//p��ü�� ����� ������ i������ �Էµ� search ���� �ִٸ�
				System.out.println("�˻����."+p.get(i).getProblem());
				ox=p.get(i).getProblem(); //i������ �ִ� �ش� �˻��� �Է� 
			}
			//ox=p.get(i).getProblem().contains(search);
			
		}
		
		//String ox = "���ȼ����� 20�ظ�";
		System.out.println("�������� ���� Ű���带 �Է����ּ���");
		String ox1 = scan.next(); //�Էµ� ox�������� ����Ű����
		 System.out.println("--------�˻��� ù ���� ---");
		    char a = ox1.charAt(0);
		    //System.out.println(a); //�˻��� ù���� �Է�
		    
		    char b23 = ox1.charAt(ox1.length()-1);
		
		    
		    int v = ox.indexOf(a); //�˻��� �ؽ�Ʈ���� ù������ ��ġ
		    int v1 = ox.indexOf(b23); //�˻��� �ؽ�Ʈ���� ������ ������ ��ġ
		    
		
			
			this.p1.add(new PgManager(null,null,ox.substring(0,v)+"   "+ox.substring(v1+1,ox.length()),null,null,null));
			//������ ������ ����
			
			System.out.println("�������� ���� Ű���忡 �Է��� Ű���带 �Է����ּ���.1.Ű����");
			String key1 = scan.next(); //�Էµ� ox�������� ����Ű����
			System.out.println("Ű����� ��");
			String q1 = scan.next(); 
			
			
			System.out.println("�������� ���� Ű���忡 �Է��� Ű���带 �Է����ּ���.2.Ű����");
			String key2 = scan.next(); //�Էµ� ox�������� ����Ű����
		
			System.out.println("�������� ���� Ű���忡 �Է��� Ű���带 �Է����ּ���.3.Ű����");
			String key3 = scan.next(); //�Էµ� ox�������� ����Ű����
		
			
			
			
			//��������(Ű���� ����)
			this.p2.add(new PgManager(null,null,ox.substring(0,v)+key1+ox.substring(v1+1,ox.length()),null,null,null));
			this.p2.add(new PgManager(null,null,ox.substring(0,v)+key2+ox.substring(v1+1,ox.length()),null,null,null));
			this.p2.add(new PgManager(null,null,ox.substring(0,v)+key3+ox.substring(v1+1,ox.length()),null,null,null));
			
			//�����ȹ����� ��
			this.a3.add(new PgManager(null,null,null,null,null,q1));
			
		
		
		
		
	}

	public void Print() {
		// TODO Auto-generated method stub
		System.out.println("�����Էµ� �����Ĺ�����"+p);
		System.out.println("------------------------");
		System.out.println("�����Էµ� ������ ��ĭ �����Ĺ�����"+p1);
		System.out.println("------------------------");
		System.out.println("�����Էµ� ������ ��ĭ�� ä���� �����Ĺ�����"+p2);
	}

}
