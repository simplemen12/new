package problem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PgManager2 {
	
	//������� Problem
	
	private String Answer; //������� ox������ ����
	


	private String Question; //������� �ְ��Ĺ����� ����

	
	public PgManager2() {}
	public PgManager2(String Answer, String Question) {
		this.Answer = Answer;
		this.Question = Question;//
	}
	
	@Override
	public String toString() {
		return "PgManager2 [Answer=" + Answer + ", Question=" + Question ;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public ArrayList<PgManager2> getP() {
		return p;
	}
	public void setP(ArrayList<PgManager2> p) {
		this.p = p;
	}

	public Object getGetProblem() {
		return getProblem;
	}
	public void setGetProblem(Object getProblem) {
		this.getProblem = getProblem;
	}
	
	ArrayList<PgManager2> p = new ArrayList<>(); //������ ���� ����Ʈ
	
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
		String A = scan.next();
		System.out.println("�Է��� ox������ ���� �Է����ּ���.");
		String Q = scan.next();
	
		System.out.println("�Է��� �ְ��Ĺ����� �������ּ��� .");
		System.out.println("�Է��� '�Է� �� �����ϰ��� �ϴ� ������ �κ��� ''���̿� ���� ");
		String A1 = scan.next();

		System.out.println("�Է��� �ְ��Ĺ����� ���� �Է����ּ���.");
		String Q1 = scan.next();
		
		this.p.add(new PgManager2(A,null));//���� �Է�
		this.p.add(new PgManager2(A1,null));//���� �ְ��� �Է�

		this.p.add(new PgManager2(null,Q));//���߰�
		this.p.add(new PgManager2(null,Q1));//���߰�
		
		System.out.println("�����Էµ� ����/��" +p);
		System.out.println("+++++"+p.size());
	
		
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
		
		//this.p.add(new PgManager2(Problem,null,null,null,null,null));//�����߰��Ϸ�
		
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
				String data = p.get(i).Answer+ " test \r\n";  // \n Enter \r ĳ��������
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
				String data = p.get(i).Answer+ " test \r\n";
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
			String Answer = p.get(i).Answer;//������� ������ ����� p����Ʈ��ŭ�� ��������
			String Question  = p.get(i).Question; 
			System.out.println("ox���� ���");// \n Enter \r ĳ��������
			//System.out.println(i+"������"+Answer);
			System.out.println(p.get(i).Answer+"-----��");
			this.p.add(new PgManager2(null,Question));
			//������ ������� �ٷ� ������ ��������Ʈ�� ����
			
		
			
		}
	}
		
		
		//������ ���� ��� �� �� ���� �����ȹ��� p1 p1�� �������� �����ؾ��Ѵ�.
		
		//�ְ��� ������� �� �� ����Ʈ�� �Է�
	
		        //���� ������� �� �� ����Ʈ�� �Է�
			

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
		
		String ox ="";
		int i=0;
		//1.�Էµ� ������ ���ڸ� ������ ��ĭȭ
		try {
		System.out.println("������ ox������ �˻����ּ���.");
		String search = scan.next(); //�Էµ� ox������ ã�� �ý�Ʈ
		for(i=0; i<=p.size()/4; i++) { //����Ʈ p�����ŭ �ݺ�     �ι�° �Էµ� ������ ������ ã���� ���� .
			if(p.get(i).getAnswer().contains(search)){
				//p��ü�� ����� ������ i������ �Էµ� search ���� �ִٸ�
				System.out.println("�˻����."+p.get(i).getAnswer());
				ox=p.get(i).getAnswer(); //i������ �ִ� �ش� �˻��� �Է� 
			}
			//ox=p.get(i).getProblem().contains(search);
			
		}
		} catch (NullPointerException e) {
			System.out.println("��ü�� null�Դϴ�.");
			return;
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
			
			this.p.add(new PgManager2(ox.substring(0,v)+"   "+ox.substring(v1+1,ox.length()),null));
			//������ ������ ����
			System.out.println("�����Էµ� ��������" +p);
			
		
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
		try {
		System.out.println("������ ox������ �˻����ּ���.");
		String search = scan.next(); //�Էµ� ox������ ã�� �ý�Ʈ
		for(int i=0; i<p.size(); i++) { //����Ʈ p�����ŭ �ݺ�
			if(p.get(i).getAnswer().contains(search)){
				//p��ü�� ����� ������ i������ �Էµ� search ���� �ִٸ�
				System.out.println("�˻����."+p.get(i).getAnswer());
				ox=p.get(i).getAnswer(); //i������ �ִ� �ش� �˻��� �Է� 
				break;
			}
			//ox=p.get(i).getProblem().contains(search);
			
		}
		} catch (NullPointerException e) {
			System.out.println("��ü�� null�Դϴ�.");
			return;
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
		    
		
			
			this.p.add(new PgManager2(ox.substring(0,v)+"   "+ox.substring(v1+1,ox.length()),null));
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
			this.p.add(new PgManager2(ox.substring(0,v)+key1+ox.substring(v1+1,ox.length()),null));
			this.p.add(new PgManager2(ox.substring(0,v)+key2+ox.substring(v1+1,ox.length()),null));
			this.p.add(new PgManager2(ox.substring(0,v)+key3+ox.substring(v1+1,ox.length()),null));
			
			//�����ȹ����� ��
			this.p.add(new PgManager2(null,q1));
			
		
		
		
		
	}

	public void Print() {
		// TODO Auto-generated method stub
		System.out.println("�����Էµ� �����Ĺ�����"+p);
		System.out.println("------------------------");
		System.out.println("�����Էµ� ������ ��ĭ �����Ĺ�����"+p);
		System.out.println("------------------------");
		System.out.println("�����Էµ� ������ ��ĭ�� ä���� �����Ĺ�����"+p);
	}

}
