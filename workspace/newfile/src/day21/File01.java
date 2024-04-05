package day21;

import java.io.IOException;

public class File01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * java.io에서 제공하는 클래스들은 try~catch / throws를 해줘야 함.
		 * IOStream : 단방향으로 데이터가 흘러들어가는 형태 
		 * 자바는 입력스트림, 출력스트림을 통해 데이터를 입출력 한다.
		 * 다양한 장치에 독립적이고, 일관성있는 입출력을 유지하기 위해서 
		 * 입출력 스트림을 통해 일관성을 제공
		 * 
		 * 두 가지 형태의 스트림 
		 * - 바이트 형태의 스트림 : 기본(문자, 그림, 멀티미디어)
		 * - 문자 형태의 스트림 : 문자만 입력할 떄 사용 
		 * 
		 * 
		 * 바이트 스트림 
		 * - 입력 (InputStream) : fileInputStream, BufferedInputStream, DataInputStream...
		 * - 출력 (OutputStram) : fileOutputStream, BufferedOutputStram, DataOutputStream...
		 * 문자 스트림
		 * - 입력 (Reader) : FileReader, BufferedReader, InputStreamReader...
		 * - 출력 (writer) : FileWriter, BufferedWriter, PrintWriter...  
		 * 
		 * 기본스트림 : 직접 자료를 읽고 쓰는 기능이 있는 스트림
		 * - FileInputStream, FileOutStream, FileReader, FileWriter
		 * 보조스트림 : 직접 읽고 쓰는 기능은 없지만 추가적인 기능을 더해주는 스트림
		 *  - Buffered
		 */
		
		//표준출력(모니터=콘솔) 출력 스트림 
		System.out.println();
		
		
		//표준입력(키보드) 스트림
		try {
			int b =System.in.read(); //트라이 캐치 없이 사용 불가
			System.out.println("read() > "+b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//표준 에러 출력 스트림
		System.err.println("error");
		System.out.println("error");

	}

}
