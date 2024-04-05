package day21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class File05 {

	public static void main(String[] args) throws IOException {
		/*
		 * test.txt������ �о�鿩 map�� �����Ͽ�
		 * ���, �հ�, ����� ���
		 * window proference encoding���� ������ Ÿ���� �ٸ��� 
		 * ������ ������.
		 */
BufferedReader br1 = new BufferedReader(new FileReader("test.txt"));
HashMap<String, Integer> map = new HashMap<>();
		
		while(true) {
			String line = br1.readLine(); //�� ���� �о����
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
		//���� for ���
		for(String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));// key�� ���� values ����
			
			sum+=map.get(key); //map�� value�� ����
			System.out.println("�����հ�"+sum);
		}
		
		int avg =0;
		avg=sum / map.size();
		System.out.println("���"+avg);
		
		
		
		//txt���� �о���̴� ���� ��� String, ����� ���ؼ��� int �ڷ������� ��ȯ�� �ʿ�
		//Integer.parseInt(); String -> int�� ��ȯ
		BufferedReader br2 = new BufferedReader(new FileReader("test.txt"));
		HashMap<String, Integer> map2 = new HashMap<>();
		
		while(true) {
			String line = br2.readLine();
			if(line == null) {
				break;
			}
			//null�� �ƴ϶�� ...
			//subString(����, ������)
			String name = line.substring(0,line.indexOf(""));
			int score = Integer.parseInt(line.substring(line.indexOf("")));
			sum+=score;
			map2.put(name, score);
	}
		System.out.println(map2);
		System.out.println("�հ�"+sum+" / ���"+(double)sum/map2.size());
		for(String key : map2.keySet()) {
			System.out.println(key+" : "+map2.get(key));
		}
		System.out.println("�հ�"+sum+"/ ���"+(double)sum/map2.size());
		
		
		//br2 ����
		if(br2 != null) { //��ü�� �����Ǿ��ٸ� ����
		br2.close();
		}
		
		

	}

}
