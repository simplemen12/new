package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class List02 {

	public static void main(String[] args) {
		/*
		 * 두 배열을 입력받아서 하나로 합치는 ArrayList 생성
		 * 
		 *  정렬하여 출력
		 * 
		 * 
		 * 
		 */
		
		String arr1[] = new String[] { "a","c","f","b"};
		String arr2[] = new String[] { "d","g","h","k"};
		
		ArrayList<String> list1 = new ArrayList<>();
		
		
		for(int i=0; i<4; i++) {
		//	list1.add(i, ""); //i번지에, 넣는다
			list1.add(arr1[i]);
			System.out.println(list1);
			//0에다가 i를  넣고 for문으로 돌려서 돌릴수 있다
		}
		for(int i=0; i<4; i++) {
			//	list1.add(i, ""); //i번지에, 넣는다
				list1.add(arr2[i]);
				System.out.println(list1);
				//0에다가 i를  넣고 for문으로 돌려서 돌릴수 있다
			}
		
		for(int i=0; i<8; i++) {
			list1.remove(0);
			
			
			}
		
		
		
		System.out.println("-----------------");
		
		list1.add(0,"a");
		list1.add(1,"b");
		list1.add(2,"c");
		list1.add(3,"d");
		list1.add(4,"e");
		list1.add(5,"f");
		list1.add(6,"g");
		list1.add(7,"h");
		list1.add(8,"k");
		System.out.println(list1);
		
		
		ArrayList<String> list = new ArrayList<>();
		
		int cnt = arr1.length + arr2.length;
		
		int i = 0, j=0;
		
		
		System.out.println("1111111111111111");
		while(cnt > list.size()) {
			if(i<arr1.length) {
				list.add(arr1[i]);
				i++;
			}
			if(j<arr2.length) {
				list.add(arr2[j]);
				j++;
			}
			System.out.println(list);
			Collections.sort(list);
			System.out.println("오름차순 정렬 후 ");
			System.out.println(list);
			
			list.sort(new Comparator<String>() {
				
				public int compare(String o1, String o2) {
					return o2.compareTo(o1);
				}
			});
			
		
	
	}
	}

}
