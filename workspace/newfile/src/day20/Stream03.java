package day20;

import java.util.ArrayList;
import java.util.Arrays;


public class Stream03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Student클래스로 리스트 구성
		 * add로 5명 추가
		 * 스트림을 이용하여 콘솔에 출력 예) 홍길동 98 
		 */
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("홍길동",98));
		list.add(new Student("김길동",97));
		list.add(new Student("홍동",96));
		list.add(new Student("홍",95));
		list.add(new Student("홍동",99));
		
		list.stream().forEach(n->{
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name+" "+score);
			
			
		});
		
		
		//list의 점수 합계 / 전체 인원수 출력
		list.stream().forEach(n->{
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name+" "+score);
			
			

		});
		
		//점수합계
		
		int sum = list.stream().mapToInt(n->n.getScore())
				.sum();
		System.out.println("점수합계"+sum);
		
		
		//인원수
		long count = list.stream().count();
		
		System.out.println(count);
		
	
		

	}

}
