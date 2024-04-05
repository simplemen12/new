package day17;

import java.util.HashMap;
import java.util.Iterator;

public class Map {

	public static void main(String[] args) {
		/*
		 * Map
		 * - ���� 2�� ������ ����, key / value
		 * 
		 * - key : �ߺ� �Ұ�, value : �ߺ�����.
		 * 
		 * - HashMap�� ���帹�� ���
		 * 
		 * HashMap<Ŭ����,Ŭ����> map = new HashMap<Ŭ����,Ŭ����>();
		 * 
		 * map�� ���� 2���̱� ������ ���� for / iterator ��� �ȵ�.
		 * 
		 * map�� key => set���� ���� �� ��� 
		 * list, set => add(): �߰� 
		 * map => put() : �߰� 
		 * getkey(), getvalue() // ���� ����
		 */
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("apple", 2000);
		map.put("Banna", 1000);
		map.put("Orange", 1500);
		map.put("peach", 4000);
		map.put("kiwi", 3000);
		
		System.out.println(map);
		System.out.println(map.keySet()); //key�� ������ set ����  > apple banna orange
		System.out.println(map.values()); // value�� ������ ���� > 2000 1000 1500
		System.out.println(map.get("apple")); // values���� ����
		
		
		//remove ���� => key ���� �����ϸ鼭 value ���� ����
		System.out.println(map.remove("apple"));
		System.out.println(map.remove(map.remove("apple")));
		System.out.println(map.remove(map.remove("a"))); //null����
		System.out.println(map.remove(map.remove("apple",2000))); //true false
		System.out.println(map);
		
		System.out.println("-----------------------");
		int sum=0;
		//���� for ���
		for(String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));// key�� ���� values ����
			
			sum+=map.get(key); //map�� value�� ����
			System.out.println(sum);
		}
		System.out.println("-----------------------");
		//iterator ���
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
		System.out.println(key+":"+map.get(key));	
		}
	}

}
