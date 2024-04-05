package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 과제29 {

	public static void main(String[] args) {
		/*
		 * 숫자를 입력받아 입력받은 숫자를 list로 구성하고, 출력 
		 * 합계를 출력
		 * 입력 : 45 , 78, 89, 97, 68, 57, 48 => String
		 * 
		 * list에 넣고, 출력 => 합계(인원수) 출력
		 * 70점 이상 점수 개수 출력
		 * 
		 */
		
		String num = "45,78,97,68,57,48";
		
		ArrayList<Integer> number = new ArrayList<Integer>(); //문자열로 받은 숫자를 숫자 int로 변환후 입력할 List 


		Scanner scan = new Scanner(System.in);
		System.out.println("1:계속 / 0: 종료");
		int e=1;
		int g=0;
		int a1=0;
		int cnt=0;
		e = scan.nextInt();
		int sum =0;
		int sum1=0;
		int sum3=0;
		int a=0;
		String b="1";
		

		
		
		
		while(e!=0) { //종료는 0 이 입력될 때까지 반복
			
		
			
			System.out.println("숫자를 입력해 주세요[String]");
			
			
			
			b = scan.next(); //글자 입력
			a1 = Integer.parseInt(b); //문자를 숫자로 변환 한 것은 int형인 변수 a1에 입력
			
			number.add(a1); //변수 a1을 number리스트에 입력
			
			for(int i=0; i<number.size(); i++) { //
				cnt++; //평균 나누기용 cnt
			}
			
			sum3 += a1; //입력된 숫자를 계속 더 한다
			
			System.out.println("실시간 더해진 값 "+sum3);
			
			
			
			
		
			

		
			System.out.println("-------------");
			
	
			System.out.println("1:계속 / 0: 종료");
			e = scan.nextInt();
	
			
		}
		System.out.println("-------------");
		System.out.println("-------종료-----");
		
		System.out.println("입력된 값의 평균"+sum3/cnt);
		

	
		
		
		

		scan.close();
		
		
		
		
		
		
		
	}
	
}