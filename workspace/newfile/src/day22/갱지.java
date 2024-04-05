package day22;

import java.util.Scanner;

public class 갱지 {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a=0;
		System.out.println("난수의 개수를 입력하세요.");
		int num = scan.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++) {
			a = (int)(Math.random()*99)+0;
			//System.out.println(a+"랜덤난수생성");
			sum=sum+a;
			
			//System.out.println(sum+"랜덤난수총합");
		}
		System.out.println("난수"+num+"개의 합은"+sum);
		
		*/
		
		
		//다음 배열변수 값의 합을 구하는 프로그램을 작성하시오 
		//각 구문별로 배열생성,for문,실행문,출력문,결과여부 
		
		
		        // 배열 생성
		        int[][] b = {{10, 20, 50}, {20, 30, 15}, {100, 110, 120}};
		        
		      
		        int sum1 = 0;

		        for (int i = 0; i < b.length; i++) {
		            for (int j = 0; j < b[i].length; j++) {
		                sum1 += b[i][j];
		            }
		        }

		        System.out.println("배열값총합: " + sum1);

		     
		    }
		
	}




