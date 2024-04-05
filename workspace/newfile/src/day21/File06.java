package day21;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File06 {

	public static void main(String[] args) {
		/*
		 * 파일이 가지고 있는 정보 출력
		 */
		File f = new File("C:\\Users\\coldh\\neDrive\\바탕 화면\\수업\\workspace\\newfile\\write.txt");
		
		String name =f.getName();
		System.out.println(name);
		System.out.println(f.getPath()); //경로 + 이름
		System.out.println(f.getParent());//경로만 
		System.out.println(File.separator);//파일 구분자
	
		
		String f2 = f.toString();
		System.out.println(f2);
		
		//f2를 기준으로 파일명만 추출 seperator이용 test.txt 
		System.out.println(File.separator);//파일 구분자
		String fileName = f2.substring(f2.lastIndexOf(File.separator));
		System.out.println(fileName);
		
		/*
		
		public void filePrint() throw new IOException() {
			
			FileWriter fs =  new FileWriter("Wrod.txt");
			BufferedWriter bw = new BufferedWriter(fs);
			
			StringBuffer sb = new StringBuffer();
			
			String data = null;
			sb.append("단어장");
			sb.append("\r\n");
			
			int cnt = 0;
			while(cnt < map.size()) {
				for(String key : map.keySet()) {
					sb.append(key+":"+map.get(key));
					sb.append("\r\n");
					cnt++;
				}
				data = sb.toString();
				
				
			}
			*/
			
		}
		

	}


