package day21;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File03 {

	public static void main(String[] args) throws IOException {
		//FileWriter를 이용한 파일 쓰기
		//일반적으로 다시 같은 이름의 파일을 생성하면 덮어쓰기.
		//기존 파일에 추가모드가 가능. 
		FileWriter fw = new FileWriter("writer5.txt");
		for(int i=1; i<=10; i++) {
			String data = i+ " test \r\n";  // \n Enter \r 캐리지리턴
			fw.write(data); //기록
			fw.write("my project IO test \r\n");
			
		}
		
		fw.close();
		
		//기존파일에 데이터를 쓰려고 할 때 : 추가모드
		FileWriter fw3 = new FileWriter("writer5.txt",true);
		for(int i=11; i<=20; i++) {
			String data = i+ " test \r\n";  // \n Enter \r 캐리지리턴
			fw3.write(data); //기록
			fw3.write("my project IO test \r\n");
			
		}
		fw3.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		//PrintWriter를 이용한 파일쓰기
		//추가모드가 없어서 파일 객체를 생성해서 추가
		PrintWriter fw1 = new PrintWriter("Print.txt");
		for(int i=1; i<=10; i++) {
			String data = i+ " test \r\n";  // \n Enter \r 캐리지리턴
			fw1.print(data); //기록
			fw1.print("my project IO test print \r\n");
			
		}
		fw1.close();
		
		PrintWriter fw4 = new PrintWriter(new FileWriter("Print.txt2",true));
		for(int i=11; i<=20; i++) {
			String data = i+ " test \r\n";  // \n Enter \r 캐리지리턴
			fw4.print(data); //기록
			fw4.print("my project IO test print \r\n");
			
		}
		fw4.close();
		
		//바이트기반 스트림 
		//FileOutputStream을 이용한 파일 쓰기
		FileOutputStream output = new FileOutputStream("out.txt");
		for(int i=1; i<=10; i++) {
			String data = i+ "Test mode \n\n";
			output.write(data.getBytes()); //바이트 기반 스트림이기 떄문에 바이트 단위로 쓰기 
			
			
		}

	}

}
