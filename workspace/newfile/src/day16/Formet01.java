package day16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Formet01 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		//��¥�� ���Ŀ� ���缭 ���ڿ��� ��ȯ
		//���ڸ� ��¥�� ��ȯ 
		Date date = new Date();
		System.out.println(date);
		
		//yyyy-mm-dd(E) hh:mm:ss
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss");
		String dateString = sdf.format(date);
		System.out.println(dateString);
		
		//���ڸ� ��¥�� ��ȯ
		String dateStr = "2024-01-26 04:56:00";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss");
		//Date date2 = sdf2.parse(dateStr);

	}

}
