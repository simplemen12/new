package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx02 {

	public static void main(String[] args) {
		/*
		 * �ܾ���
		 * �ܾ� 5���� �Է¹޾� �ֿܼ� ����ϴ� ��� 
		 * 
		 * ---�ܾ���---
		 * hello : �ȳ�
		 * apple : ���
		 * orange : ������
		 * map�� ���� �� ���
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		 String a = "";
	     String b = "";
        HashMap<String, String> map1 = new HashMap<>();
        
        System.out.println("�޸����Է�");
        
        System.out.println("��� �Է����ּ���.");
        a=scan.next(); 
        
        System.out.println("�ѱ��� �Է����ּ���");
        b=scan.next();    
   
		

        printMap(a,b,map1);


        scan.close();
        
        
        //������ �� 
        HashMap<String, String> map0 = new HashMap<>();
        
        //Scanner scan = new Scanner(System.in);

        int size = 3;
        while(map0.size()< size) {
        	System.out.println("�ܾ�");
        	String word = scan.next();
        	
        	System.out.println("�ǹ�");
        	String mean = scan.next();
        	map0.put(word, mean);
        }
        
        Iterator<String> it = map0.keySet().iterator();
        while(it.hasNext()) {
        	String word = it.next();
        	String mean = it.next();
        	System.out.println(word+" "+mean);
        }

	}
	
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

}
