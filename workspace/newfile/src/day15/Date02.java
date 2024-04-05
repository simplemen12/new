package day15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		String t = today.toString(); //toString() ��Ʈ������ ��ü�� ��ȯ
		System.out.println(t);
		//��¥ 2024-01-26  /�ð� 17:03:34
		//toString() ����޼���
		
		String fileName = t.substring(0, t.indexOf("T"));
		System.out.println(fileName); 
		
		String fileName1 = t.substring(11,19);
		System.out.println(fileName1); 
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate = LocalDateTime.of(2009, 9, 30, 8 , 30); //��¥ ����
		System.out.println(sDate.format(dtf));
	}

}
