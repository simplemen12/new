package day18;

import java.util.HashMap;

public class MapEx01 {

	public static void main(String[] args) {
		/*
		 * map�� �̿��Ͽ� ��ǰ�� ������ �߰��Ͽ� �հ踦 ���Ͻÿ�.
		 * 
		 * ��ǰ�� map�� �߰��ϴ� �۾��� �޼��带 Ȱ��
		 * 1. map�� main�� ������ ����, �Ű������� �޾� map�� �����͸� ä��� �޼���
		 * 2. map�� �޼��� ���ο��� �����Ͽ�, main���� �����ϴ� �޼���  
		 * 
		 * ���� 2500 map.�ؼ� �Է� 
		 * ũ���Ľ� 4000
		 * ���� 5000
		 * �հ� ? 
		 */
		HashMap<String, Integer> map1 = new HashMap<>();
		
		printMap("Ǯ",500, map1);
		printMap("����",1500,map1);
		printMap("��ȭ��",1000,map1);
		printMap("�۷��",2500,map1);
		printMap("ī��",500,map1);
		
		HashMap<String, Integer> map0 = new HashMap<>();
		
		
		MapEx01 m = new MapEx01();
		//m.makeMap(map0);
		int sum0 = 0;
		
		for(String s : map0.keySet()) {
			sum0+= map0.get(s);
			System.out.println();
		}
		
		
		HashMap<String, Integer> map = m.MakeMap2(); //�޼��忡�� ���� map�� �޾��ִ� map
		System.out.println(map);
		
	
		
		

	}
	//map�� �Ű������� �޴� ���̽�
	public static HashMap<String, Integer> printMap(String a, int b, HashMap<String, Integer> map1) {
		//HashMap<String, Integer> map1 = new HashMap<>();
		
	
	
		map1.put(a, b);
		
		System.out.println(map1);
		
		int sum=0;
		//���� for ���
		for(String key : map1.keySet()) {
			System.out.println(key+":"+map1.get(key));// key�� ���� values ����
			
			sum+=map1.get(key); //map�� value�� ����
			System.out.println(sum);
		}
		
	
		 return map1;
	}
	
	//map�� ���ο��� �����Ͽ� �����ϴ� ���̽�
	public static HashMap<String, Integer> printMap1(String a, int b, HashMap<String, Integer> map1) {
		HashMap<String, Integer> map2 = new HashMap<>();
		
		
		
		map2.put(a,b);// �ܺ� �����
	
	
		map1.put(a, b); //�ֺο��� �Է� ���� map1
		
		System.out.println(map1);
		
		int sum=0;
		//���� for ���
		for(String key : map2.keySet()) {
			System.out.println(key+":"+map2.get(key));// key�� ���� values ����
			
			sum+=map2.get(key); //map�� value�� ����
			System.out.println(sum);
		}
		
	
		 return map2;
	}
	
	
	
	//1 map�� �Ű������� �޴� ���̽�
	public HashMap<String, Integer> makeMap(HashMap<String,Integer>map,String a) {  
		map.put(a,1);
		
		return map;
	}
	
	
	//2map�� ���ο��� �����Ͽ� ����
	public HashMap<String,Integer> MakeMap2(){
		HashMap<String, Integer>map = new HashMap();
		
		map.put("Ǯ", 13);
		map.put("����", 14);
	
		return map;
	}
	
	
	//map�� �޾Ƽ� ����ϴ� �޼���
	public void printMap(HashMap<String,Integer>map2) {
		int sum=0;
		for(String key : map2.keySet()) {
			System.out.println(key+":"+map2.get(key));// key�� ���� values ����
			
			sum+=map2.get(key); //map�� value�� ����
			System.out.println(sum);
		}
	}

}
