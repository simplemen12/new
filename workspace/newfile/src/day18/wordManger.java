package day18;

import java.util.HashMap;
import java.util.Scanner;

public class wordManger {
	
	
	Scanner scan = new Scanner(System.in);
	
	private HashMap<String,String> map  = new HashMap<>(); //�̷��� �����ϸ� get set �� �ʿ䰡 ���� ���ϱ�
	
	public void addword() {
		map.put("����", "apple");
	}
	
	public void insertword(Scanner scan) {
		System.out.println("�ܾ�");
		String word = scan.next();
		
		System.out.println("��");
		String mean = scan.next();
		
		map.put(word, mean);
	}
	
	public void searchword(Scanner scan) {
		System.out.println("�˻��� �ܾ�");
		String word = scan.next();
		if(map.containsKey(word)) {
			System.out.println(word+" "+map.get(word));
			return;
		}
	}
	
	public void modifyword(Scanner scan) {
		System.out.println("������ �ܾ�");
		String word = scan.next();
		if(map.containsKey(word)) {
			System.out.println("�ǹ�");
			String mean = scan.next();
			map.remove(word);
			map.put(word, mean);
			return;
		}
		System.out.println("������ �ܾ �����ϴ�.");
	}
	
	
	
	
	//�޸��� �޼��� 
	//������� map���� 
	public static HashMap<String, String> printMap(String a, String b, HashMap<String, String> map1) {
		//HashMap<String, Integer> map1 = new HashMap<>();
		

		map1.put(a, b);
		
		System.out.println(map1);
		
	
		
		int sum=0;
		//���� for ���
		for(String key : map1.keySet()) {
			System.out.println(key+":"+map1.get(key));// key�� ���� values ����
			
			//sum+=map1.get(key); //map�� value�� ����
			System.out.println(sum);
		}
		
	
		 return map1;
	}
	
	//����� �ܾ���� �޼���
	public void printMap1(HashMap<String,String>map2) {
		int sum=0;
		int cnt=0;
		for(String key : map2.keySet()) {
			cnt++;
			System.out.println(cnt+"��"+key+":"+map2.get(key));// key�� ���� values ����
			
			//sum+=map2.get(key); //map�� value�� ����
			System.out.println();
		}
	}
	
	//���� �޼���
	public void remove(HashMap<String,String>map2) {
		/*
		int sum=0;
		System.out.println("�˻� �� �ܾ �����ּ���.");
		a="";
		a=scan.next(); //��Ʈ������ �Է� ���� ���� �־���
		
	
		map1.remove(a);
	}
	*/
	}
	
	
}
