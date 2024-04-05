package day21;

import java.io.IOException;

public class File01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * java.io���� �����ϴ� Ŭ�������� try~catch / throws�� ����� ��.
		 * IOStream : �ܹ������� �����Ͱ� �귯���� ���� 
		 * �ڹٴ� �Է½�Ʈ��, ��½�Ʈ���� ���� �����͸� ����� �Ѵ�.
		 * �پ��� ��ġ�� �������̰�, �ϰ����ִ� ������� �����ϱ� ���ؼ� 
		 * ����� ��Ʈ���� ���� �ϰ����� ����
		 * 
		 * �� ���� ������ ��Ʈ�� 
		 * - ����Ʈ ������ ��Ʈ�� : �⺻(����, �׸�, ��Ƽ�̵��)
		 * - ���� ������ ��Ʈ�� : ���ڸ� �Է��� �� ��� 
		 * 
		 * 
		 * ����Ʈ ��Ʈ�� 
		 * - �Է� (InputStream) : fileInputStream, BufferedInputStream, DataInputStream...
		 * - ��� (OutputStram) : fileOutputStream, BufferedOutputStram, DataOutputStream...
		 * ���� ��Ʈ��
		 * - �Է� (Reader) : FileReader, BufferedReader, InputStreamReader...
		 * - ��� (writer) : FileWriter, BufferedWriter, PrintWriter...  
		 * 
		 * �⺻��Ʈ�� : ���� �ڷḦ �а� ���� ����� �ִ� ��Ʈ��
		 * - FileInputStream, FileOutStream, FileReader, FileWriter
		 * ������Ʈ�� : ���� �а� ���� ����� ������ �߰����� ����� �����ִ� ��Ʈ��
		 *  - Buffered
		 */
		
		//ǥ�����(�����=�ܼ�) ��� ��Ʈ�� 
		System.out.println();
		
		
		//ǥ���Է�(Ű����) ��Ʈ��
		try {
			int b =System.in.read(); //Ʈ���� ĳġ ���� ��� �Ұ�
			System.out.println("read() > "+b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ǥ�� ���� ��� ��Ʈ��
		System.err.println("error");
		System.out.println("error");

	}

}
