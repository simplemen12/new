package day20;

import java.util.HashMap;

public class Lamda02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//map�� �����Ͽ� forEach�� ����Ͽ� ���
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("�浿", 2);
		map.put("����", 3);
		map.put("����", 4);
		map.put("���", 5);
		map.put("���", 6);
		
		map.forEach((x,y)->{
			System.out.println(x+y+" ");
		});
		
		/*
		ConcurrentHashMap<Integer> method = (n)->{
			system.out.print(n+" ");
		}
		*/
		System.out.println("consumer�� �̿��� ���");
		//map.forEach(method);
		
		
		
//		Number add = (a,b) -> {
//			return a+b;
//		};
//		
//		int hap = sum.add(50,60);
//		System.out.println(sum.add(100,200));
		
		Number max = (a,b)-> (a>=b)? a:b;//�Լ��� 
	
	}

}

//�Լ��� �������̽�
//�޼��尡 �ݵ�� 1�����߸� ��.
@FunctionalInterface //Fun + ��Ʈ�� + �����̽� �����
interface Number{
	int add(int a, int b);
	
}