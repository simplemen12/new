package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Stream(스트림)
		 *  - 실제입력 / 출력이 표현된 데이터의 이상화된 흐름
		 *  - 스트림은 자료에 대한 스트림을 생성하여 연산
		 *  - 그 연산을 다 수행하면 스트림은 소모됨.
		 *  - 스트림 연산은 기존 자료에 변경을 유발하지 않음.
		 *  - 스트림은 기존 자료를 복사하여 복사본은 연산에 사용
		 *  - 중간연산과 최종연산으로 구분됨.
		 *  - 중간연산은 메서드를 이어서 사용할 수 있음.
		 *     distinct(): 중복제어, filter():조건에 맞는 값만 다음 스트림으로 넘김,
		 *     limit(), skip(): 스트림의 일부를 건너뜀, peak(): 작업수행, sorted():정렬...
		 *  - 최종연산은 마지막에만 가능
		 *     forEach(), count(), sum(), allMatch():하나라도 일치하는지, anyMatch(), toArray():배열로 변환,
		 *     collect(): 스트림
		 *  
		 *  
		 * 
		 */
		
		int[] arr = {1,2,3,4,5,6,7,8};
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("스트림을 이용한 합계");
		int total = Arrays.stream(arr).sum();
		System.out.println(total);
		
		System.out.println("스트림 count()");
		long cnt = Arrays.stream(arr).count();
		System.out.println(cnt);
		
		System.out.println("---스트림 average()--");
		OptionalDouble a = Arrays.stream(arr).average();
		System.out.println(a);
		
		
		int sS = Arrays.stream(arr).filter(n-> n>=5).sum();
		
		System.out.println(sS);
		
		//점수 배열을 생성한 후 70점 이상(filter)만 합계, 평균
		//가장 높은 점수 출력
		
		int[] arr1 = {71,52,63,64,55,46,57,38};
		
		int sS1 = Arrays.stream(arr1).filter(n-> n>=70).sum();
		
		OptionalDouble sS2 = Arrays.stream(arr1).filter(n-> n>=70).average();
		OptionalInt sS3 = Arrays.stream(arr1).filter(n-> n>=70).max();
		System.out.println(sS1+" "+ sS2+" "+sS3);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(7);
		list.add(8);
		
		System.out.println("list");
		list.stream().forEach(n->System.out.println(n+" "));
		System.out.println("distinct() : 중복제거");
		System.out.println();
		
		list.stream().distinct().forEach(n->System.out.println(n+" "));
		System.out.println();
		
		System.out.println("--sorted(): 정렬");
		list.stream().sorted().forEach(n->System.out.println(n+" "));
		
		System.out.println("--스트림 객체생성--");
		Stream<Integer> s1 = Stream.of(10,20,30); 
		System.out.println("합계");
		//map : 스트림 변환에 사용하는 중간연산
		int s = s1.mapToInt(n-> n.intValue()).sum(); //s를 map(int)로 변환
		System.out.println(s);
		//s1.forEach(n->System.out.println(n+" ")); //한번 스트림을 썻기때문에 다시 사용하면 error발생
		//한번 소모된 스트림은 다시 사용할 수 없음.
		
		
	
		

	}

}
