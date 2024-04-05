package day17;

import java.util.HashMap;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 과목과 점수를 입력 받아 (Scanner) map에 저장 후 출력
		 * 
		 * 합계, 평균 출력
		 * 
		 * 종료 키워드가 나올때 까지 반복 (1=계속 / 0=종료)
		 * 
		 * 과목과 점수를 입력해주세요> 
		 * 
		 * 국어 89
		 * 수학78
		 * 0 종료
		 * map으로 저장 후 출력
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("1:계속 / 0: 종료");
		int e=1;
		int g=0;
		
		e = scan.nextInt();
		int sum =0;
		int sum1 =0;
		int a=0;
		String b="1";
		
		HashMap<String, Integer> map = new HashMap<>();
		while(e!=0) { //종료는 0 이 입력될 때까지 반복
			
			System.out.println("과목을 입력해 주세요");
			
			
			
			b = scan.next(); //글자 입력
			System.out.println("점수를 입력해 주세요");
			
			a = scan.nextInt(); //숫자 입력
		
			

			
			map.put(b, a);
		//	sum+=map.get(a); //map의 value를 누적
			System.out.println(map.keySet()); //key만 별도로 set 구성  > apple banna orange
			System.out.println(map.values()); // value만 별도로 구성 > 2000 1000 1500
			
			System.out.println("-------------");
			
		
			System.out.println(map.get("국어"));
			System.out.println(map.get("수학"));
			System.out.println("-------------");
			
			System.out.println("1:계속 / 0: 종료");
			e = scan.nextInt();
	
			
		}
		System.out.println("-------------");
		System.out.println("-------종료-----");
		
		
		
		
		int count1=0;
		int count2=0;
		for(String key : map.keySet()) {
		
			System.out.print(sum+=map.get("국어"));
			sum+=map.get(key); //map의 value를 누적
			count1++; //국어가 하나 있을떄 마다 평균값을 내기 위한 count1 누적
			System.out.println(sum);
		}
		
		
		System.out.println("-------------------------------");
		for(String key : map.keySet()) {
			
			System.out.print(sum1+=map.get("수학"));
			sum1+=map.get(key); //map의 value를 누적
			count2++; //수학가 하나 있을떄 마다 평균값을 내기 위한 count2 누적
			System.out.println(sum1);
		}
		
		System.out.println("=============================");
		System.out.println((sum+=map.get("국어"))/count1);
		System.out.println((sum+=map.get("수학"))/count2);
		
		System.out.println(sum+=map.get("국어"));
		System.out.println(sum+=map.get("수학"));
	
	
		
		
		
		
//		
//		map.get("apple");
//		for(int i=0; i<map.langth; i++) {
//		if(map.get("수학")='수학') {
//			
//		}
//		}
		
		scan.close();
		
		
		
		
		
		
		
	}

}
