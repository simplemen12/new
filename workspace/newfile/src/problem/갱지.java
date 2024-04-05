package problem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class 갱지 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		
		String ox = "대양해군마라도함2척보유";
		
		//Scanner sc = new Scanner(System.in);
		
		//String s = sc.next().replaceAll("＾[0-9]","");
		String s = ox.replaceAll("[^0-9]","");
		Integer i = Integer.parseInt(s);
		System.out.println(i);
		char expected = '멍';
	    String text = "멍토 블로그";

	    //when
	    char value = text.charAt(0);
	    System.out.println(value);
	    
	   */
		//대단원 소단원
	    //퍼센트
	    //특정선지 5개 입력시 랜덤하게 입력
	    /*
	    System.out.println("----subString---");
		System.out.println(ox.substring(0,2)); 
		// 0번지부터 2번지 전까지 추출[2번지는 포함x]
		System.out.println(ox.substring(1)); // 
		
		//charAt(index) : index번지에 있는 문자열을 반환 
		System.out.println("----charAt(index)--");
		System.out.println(ox.charAt(1));
		//indexOf : 문자의 위치(index)를 찾아주는 기능, 찾는 문자가 없으면 
		//-1을 리턴
		System.out.println("---indexOf---");
		System.out.println(ox.indexOf("동"));
				//lastIndexOf : 문자의 위치를 뒤에서부터 찾아주는 기능  
		System.out.println(ox.lastIndexOf("!"));
		*/
		//"연안수역"을 지우고 싶다고 가정
		//"연"과 "역"
		
		/*
		char expected = '멍';
	    String text = "멍토 블로그";

	    //when
	    char value = text.charAt(0);
	    System.out.println(value);
	    
	*/
		/*
		System.out.println(ox.indexOf("동"));
		//입력된 문자열 첫글자 String a ;입력
		
		//String ox = "대양해군마라도함2척보유"; //추출 대상 텍스트
		String ox1 = "마라도함"; //추출 키워드

	    System.out.println("--------검색된 첫 글자 ---");
	    char a = ox1.charAt(0);
	    System.out.println(a); //검색된 첫글자 입력
	    
	    char b23 = ox1.charAt(ox1.length()-1);
	    System.out.println(b23); //검색된 마지막글차 출력
	    
	    System.out.println(ox1.indexOf(a));
	    System.out.println(ox1.indexOf(b23));
	    
	    int v = ox.indexOf(a); //검색할 텍스트에서 첫글자의 위치
	    int v1 = ox.indexOf(b23); //검색할 텍스트에서 마지막 글자의 위치
	    
	    System.out.println(v+v1);
	    
	    System.out.println(ox.substring(0,v)); //앞문장
	    System.out.println(ox.substring(v1,ox.length())); //뒷문장
	    System.out.println(ox.substring(0,v)+"   "+ox.substring(v1+1,ox.length()));
	    
	    */
		PrintWriter fw4 = new PrintWriter(new FileWriter("Print.txt3",true));
		for(int i=11; i<=20; i++) {
			String data = i+ " test \r\n";  // \n Enter \r 캐리지리턴
			fw4.print(data); //기록
			fw4.print("my project IO test print \r\n");
			
		}
		fw4.close();
	    
	}

}
