package day21;

import java.io.IOException;

public class File02 {

	public static void main(String[] args) {
		/*
		 * System.in�� �̿��Ͽ� ���ĺ� �ϳ��� ���� 
		 * Enter�� ������ ���ĺ��� �ֿܼ� ���
		 * �ݺ��ϱ� .
		 */

		
		
		//���ĺ� ���
		try {
			int b =System.in.read(); //Ʈ���� ĳġ ���� ��� �Ұ�
			System.out.println("read() > "+(char)b);
		   while((b =System.in.read())!= '\n') {
			   System.out.println((char)b);
		   }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
