package day20;

import java.util.ArrayList;
import java.util.Arrays;

public class 과제 {

	public static void main(String[] args) {
		/*
		 * 스트림으로 출력
		 * 
		 * 여행사 상품이 있습니다.
		 * 여행 비용은 15세 이상은 100만원, 그 미만은 50만원으로 계산
		 * 고객 3명이 패키지 여행을 떠난다고 했을 경우
		 * 1. 비용계산 => 출력 2. 고객명단 검색 => 출력
		 * 
		 * 
		 * 고객 클래스를 생성하고, ArrayList로 고객관리
		 * 
		 * 예시 고객정보 -> 고객명단
		 * 이름 이순신 나이 40 비용 100
		 * 이름 신사임당 나이 35 비용 100
		 * 이름 홍기롱 나이 10 비용 50
		 * 총 여행 경비 250 
		 * 
		 * 
		 * 
		 * a- 20대 이상 고객명단 이름순으로 정렬
		 * 
		 * 이름 신사임당 나이 35 비용 100
		 * 이름 이순신 나이 40 비용 100 
		 * 
		 * 
		 * 
		 */
		
	    Customer lee = new Customer ("이순신",40);
	    Customer sin = new Customer( "신사임당",35);
	   
	    ArrayList<Customer> list67 = new ArrayList<>();
	    
	    list67.add(lee);
	    list67.add(sin);
	    
	    int sum = 0;
	    System.out.println("고객명단");
	    for(Customer tmp : list67) {
	    	String name = tmp.getName();
	    	int age = tmp.getAge();
	    	int price = tmp.getPrice();
	    	sum+=price;
	    	System.out.println(name+age+price);
	    	
	    	}
	    System.out.println("총지불비용 "+sum);
	    
	    //Collerction.sort(list);
	    System.out.println("20대 이상 명단");
	    for(Customer tmp : list67) {
	    	if(tmp.getAge()>=20) {
	    		System.out.println(tmp);
	    	}
	    }
	    
	    
	    System.out.println("스트림을 이용한 방법 ");
	    list67.stream().forEach(s->System.out.println(s));
	    
	    //원하는 요소만 출력 
	    System.out.println("고객명만 출력");
	    list67.stream()
	    .map(m-> m.getName())
	    .forEach(n->System.out.println(n));
	    
	    
	    //총비용
	   int tot = list67.stream()
			   .mapToInt(n->n.getPrice())
			   .sum();
	   System.out.println("총지불금액"+tot);
	   
	   /*
	   //나이가 20세 이상인 데이터만 추출
	   list67.stream()
	   .filter(c->cgetAge()>=20)
	   .sorted(new Comparator<Customer>() {
	   }
	   
	   public int compareTO(Customer o) {
		   retrun.this
	   }
	   */
	   //기존 클래스 자체에서 정렬이 구현되어 있지 않을 경우 comparato
	   //기존 클래스 자체에서 정렬이 구현되어 있다면 바로 sorted사용
		   
	   
	    
	
		
		ArrayList<고객> list = new ArrayList<>();
		
		int arr1[] = new int [list.size()];  //고객리스트를 나이만 배열로 받는다.
		String arr4[] = new String [list.size()]; // 15세 이상 고객이름 명단 배열 string
		String arr3[] = new String [list.size()]; 
		String arr2[] = new String [list.size()];
		
		
		//고객이름을 배열로 받는다.
		
		list.add(new 고객("홍길동",24,99));
		list.add(new 고객("김순자",54,909));
		list.add(new 고객("박팔종",54,449));
		list.add(new 고객("춘자킴",84,929));
		list.add(new 고객("김아르민",14,12));
		list.add(new 고객("하나",23,49));
		list.add(new 고객("김둘둘",34,19));
		list.add(new 고객("정찬솔",27,107));
		list.add(new 고객("라이먼킴",13,19));
		

		
		list.stream().forEach(n->{
			String name = n.getName();
			int old = n.getOld();
			System.out.println(name+" "+old);
			
			

		});
		
		고객 n1 = new 고객();
		//고객ㅇ
		ArrayList<Integer> old1 = new ArrayList<>();
		
		
		
		
        for(int i =0; i<list.size(); i ++) {
        	int old = n1.getOld();
        	arr1[i] = list.get(i).getOld();
        	
        	///
            arr4[i] = list.get(i).getName();
        	
        	System.out.println(arr4[i]);
        	///
        	
        	
        }
		
        System.out.println("15세 이상 고객리스트 [100만원]");
        Arrays.stream(arr1).filter(a->a>=15).distinct().sorted().forEach(n-> System.out.println(n+" "));
		
        
        
        
        
        
        //고객 이름 가나다 정렬
        ArrayList<String> name1 = new ArrayList<>();
		
		
		
        for(int i =0; i<list.size(); i ++) {
        	String name = n1.getName();
        	arr2[i] = list.get(i).getName();
        	
        }
		
        Arrays.stream(arr2).distinct().sorted().forEach(n-> System.out.println(n+" "));
		
		//익명 comparato
        
        System.out.println("==============");
        
        
        
        for(int i =0; i<list.size(); i ++) {
        	int old = n1.getOld();
        	String q="";
        	if(old>=15) {
        	arr4[i] = list.get(i).getName();
        	
        	System.out.println(arr4[i]);
        	}
       
        	
        }
       
	
		

		
	}

}
