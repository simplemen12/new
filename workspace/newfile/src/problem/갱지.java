package problem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ���� {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		
		String ox = "����ر�������2ô����";
		
		//Scanner sc = new Scanner(System.in);
		
		//String s = sc.next().replaceAll("��[0-9]","");
		String s = ox.replaceAll("[^0-9]","");
		Integer i = Integer.parseInt(s);
		System.out.println(i);
		char expected = '��';
	    String text = "���� ��α�";

	    //when
	    char value = text.charAt(0);
	    System.out.println(value);
	    
	   */
		//��ܿ� �Ҵܿ�
	    //�ۼ�Ʈ
	    //Ư������ 5�� �Է½� �����ϰ� �Է�
	    /*
	    System.out.println("----subString---");
		System.out.println(ox.substring(0,2)); 
		// 0�������� 2���� ������ ����[2������ ����x]
		System.out.println(ox.substring(1)); // 
		
		//charAt(index) : index������ �ִ� ���ڿ��� ��ȯ 
		System.out.println("----charAt(index)--");
		System.out.println(ox.charAt(1));
		//indexOf : ������ ��ġ(index)�� ã���ִ� ���, ã�� ���ڰ� ������ 
		//-1�� ����
		System.out.println("---indexOf---");
		System.out.println(ox.indexOf("��"));
				//lastIndexOf : ������ ��ġ�� �ڿ������� ã���ִ� ���  
		System.out.println(ox.lastIndexOf("!"));
		*/
		//"���ȼ���"�� ����� �ʹٰ� ����
		//"��"�� "��"
		
		/*
		char expected = '��';
	    String text = "���� ��α�";

	    //when
	    char value = text.charAt(0);
	    System.out.println(value);
	    
	*/
		/*
		System.out.println(ox.indexOf("��"));
		//�Էµ� ���ڿ� ù���� String a ;�Է�
		
		//String ox = "����ر�������2ô����"; //���� ��� �ؽ�Ʈ
		String ox1 = "������"; //���� Ű����

	    System.out.println("--------�˻��� ù ���� ---");
	    char a = ox1.charAt(0);
	    System.out.println(a); //�˻��� ù���� �Է�
	    
	    char b23 = ox1.charAt(ox1.length()-1);
	    System.out.println(b23); //�˻��� ���������� ���
	    
	    System.out.println(ox1.indexOf(a));
	    System.out.println(ox1.indexOf(b23));
	    
	    int v = ox.indexOf(a); //�˻��� �ؽ�Ʈ���� ù������ ��ġ
	    int v1 = ox.indexOf(b23); //�˻��� �ؽ�Ʈ���� ������ ������ ��ġ
	    
	    System.out.println(v+v1);
	    
	    System.out.println(ox.substring(0,v)); //�չ���
	    System.out.println(ox.substring(v1,ox.length())); //�޹���
	    System.out.println(ox.substring(0,v)+"   "+ox.substring(v1+1,ox.length()));
	    
	    */
		PrintWriter fw4 = new PrintWriter(new FileWriter("Print.txt3",true));
		for(int i=11; i<=20; i++) {
			String data = i+ " test \r\n";  // \n Enter \r ĳ��������
			fw4.print(data); //���
			fw4.print("my project IO test print \r\n");
			
		}
		fw4.close();
	    
	}

}
