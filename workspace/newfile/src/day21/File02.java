package day21;

import java.io.IOException;

public class File02 {

	public static void main(String[] args) {
		/*
		 * System.in을 이용하여 알파벳 하나를 쓰고 
		 * Enter를 누르면 알파벳을 콘솔에 찍기
		 * 반복하기 .
		 */

		
		
		//알파벳 출력
		try {
			int b =System.in.read(); //트라이 캐치 없이 사용 불가
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
