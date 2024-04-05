package day21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File04 {

	public static void main(String[] args) throws IOException {
		/*
		 * BufferedReader : ���ں�����Ʈ��
		 * ���δ����� �бⰡ ����
		 * �� �̻� ���� ������ ������ null�� ����
		 * 
		 * ������Ʈ�� : ���� �а� ���� ����� ���� ������
		 * ��ݽ�Ʈ���� �Ű������� �����ؾ� ��.
		 * 
		 * 
		 */
		
		BufferedReader br = new BufferedReader(new FileReader("Print.txt"));
		
		while(true) {
			String line = br.readLine(); //�� ���� �о����
			if(line == null) {
				break;
				
			}
			System.out.println(line);
		}
		br.close();

	}

}
