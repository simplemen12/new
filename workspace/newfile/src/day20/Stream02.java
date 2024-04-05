package day20;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 배열에서 짝수만 출력 (정렬) 중복되는 값 제거
		 * 
		 */
		
		int[] arr = {1,8,4,5,7,8,9,6,5,4,1,2,3,6,8,2,4 };
		
		Arrays.stream(arr).filter(a->a%2==0).distinct().sorted().forEach(n-> System.out.println(n+" "));
		
	/*	
		int[] result = Arrays.stream;
	for(int tmp : result) {
		System.out.println(tmp+"");
	}
	*/
	
		

	

	}

}
