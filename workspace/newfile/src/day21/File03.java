package day21;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File03 {

	public static void main(String[] args) throws IOException {
		//FileWriter�� �̿��� ���� ����
		//�Ϲ������� �ٽ� ���� �̸��� ������ �����ϸ� �����.
		//���� ���Ͽ� �߰���尡 ����. 
		FileWriter fw = new FileWriter("writer5.txt");
		for(int i=1; i<=10; i++) {
			String data = i+ " test \r\n";  // \n Enter \r ĳ��������
			fw.write(data); //���
			fw.write("my project IO test \r\n");
			
		}
		
		fw.close();
		
		//�������Ͽ� �����͸� ������ �� �� : �߰����
		FileWriter fw3 = new FileWriter("writer5.txt",true);
		for(int i=11; i<=20; i++) {
			String data = i+ " test \r\n";  // \n Enter \r ĳ��������
			fw3.write(data); //���
			fw3.write("my project IO test \r\n");
			
		}
		fw3.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		//PrintWriter�� �̿��� ���Ͼ���
		//�߰���尡 ��� ���� ��ü�� �����ؼ� �߰�
		PrintWriter fw1 = new PrintWriter("Print.txt");
		for(int i=1; i<=10; i++) {
			String data = i+ " test \r\n";  // \n Enter \r ĳ��������
			fw1.print(data); //���
			fw1.print("my project IO test print \r\n");
			
		}
		fw1.close();
		
		PrintWriter fw4 = new PrintWriter(new FileWriter("Print.txt2",true));
		for(int i=11; i<=20; i++) {
			String data = i+ " test \r\n";  // \n Enter \r ĳ��������
			fw4.print(data); //���
			fw4.print("my project IO test print \r\n");
			
		}
		fw4.close();
		
		//����Ʈ��� ��Ʈ�� 
		//FileOutputStream�� �̿��� ���� ����
		FileOutputStream output = new FileOutputStream("out.txt");
		for(int i=1; i<=10; i++) {
			String data = i+ "Test mode \n\n";
			output.write(data.getBytes()); //����Ʈ ��� ��Ʈ���̱� ������ ����Ʈ ������ ���� 
			
			
		}

	}

}
