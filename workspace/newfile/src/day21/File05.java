package day21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class File05 {

	public static void main(String[] args) throws IOException {
		/*
		 * test.txt파일을 읽어들여 map에 저장하여
		 * 명단, 합계, 평균을 출력
		 * window proference encoding에서 파일의 타입이 다르면 
		 * 파일이 깨진다.
		 */
BufferedReader br1 = new BufferedReader(new FileReader("test.txt"));
HashMap<String, Integer> map = new HashMap<>();
		
		while(true) {
			String line = br1.readLine(); //한 라인 읽어오기
			if(line == null) {
				break;
				
			}
			int num3 = Integer.parseInt(line.substring(4,6));
			map.put(line.substring(0,3), num3);
			
			
			System.out.println(line);
		}
		br1.close();
		
		System.out.println(map);
		
		int sum=0;
		//향상된 for 출력
		for(String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));// key에 대한 values 리턴
			
			sum+=map.get(key); //map의 value를 누적
			System.out.println("점수합계"+sum);
		}
		
		int avg =0;
		avg=sum / map.size();
		System.out.println("평균"+avg);
		
		
		
		//txt에서 읽어들이는 값은 모두 String, 계산을 위해서는 int 자료형으로 변환이 필요
		//Integer.parseInt(); String -> int로 변환
		BufferedReader br2 = new BufferedReader(new FileReader("test.txt"));
		HashMap<String, Integer> map2 = new HashMap<>();
		
		while(true) {
			String line = br2.readLine();
			if(line == null) {
				break;
			}
			//null이 아니라면 ...
			//subString(포함, 미포함)
			String name = line.substring(0,line.indexOf(""));
			int score = Integer.parseInt(line.substring(line.indexOf("")));
			sum+=score;
			map2.put(name, score);
	}
		System.out.println(map2);
		System.out.println("합계"+sum+" / 평균"+(double)sum/map2.size());
		for(String key : map2.keySet()) {
			System.out.println(key+" : "+map2.get(key));
		}
		System.out.println("합계"+sum+"/ 평균"+(double)sum/map2.size());
		
		
		//br2 끊기
		if(br2 != null) { //객체가 생성되었다면 끊기
		br2.close();
		}
		
		

	}

}
