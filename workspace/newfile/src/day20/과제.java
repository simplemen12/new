package day20;

import java.util.ArrayList;
import java.util.Arrays;

public class ���� {

	public static void main(String[] args) {
		/*
		 * ��Ʈ������ ���
		 * 
		 * ����� ��ǰ�� �ֽ��ϴ�.
		 * ���� ����� 15�� �̻��� 100����, �� �̸��� 50�������� ���
		 * �� 3���� ��Ű�� ������ �����ٰ� ���� ���
		 * 1. ����� => ��� 2. ����� �˻� => ���
		 * 
		 * 
		 * �� Ŭ������ �����ϰ�, ArrayList�� ������
		 * 
		 * ���� ������ -> �����
		 * �̸� �̼��� ���� 40 ��� 100
		 * �̸� �Ż��Ӵ� ���� 35 ��� 100
		 * �̸� ȫ��� ���� 10 ��� 50
		 * �� ���� ��� 250 
		 * 
		 * 
		 * 
		 * a- 20�� �̻� ����� �̸������� ����
		 * 
		 * �̸� �Ż��Ӵ� ���� 35 ��� 100
		 * �̸� �̼��� ���� 40 ��� 100 
		 * 
		 * 
		 * 
		 */
		
	    Customer lee = new Customer ("�̼���",40);
	    Customer sin = new Customer( "�Ż��Ӵ�",35);
	   
	    ArrayList<Customer> list67 = new ArrayList<>();
	    
	    list67.add(lee);
	    list67.add(sin);
	    
	    int sum = 0;
	    System.out.println("�����");
	    for(Customer tmp : list67) {
	    	String name = tmp.getName();
	    	int age = tmp.getAge();
	    	int price = tmp.getPrice();
	    	sum+=price;
	    	System.out.println(name+age+price);
	    	
	    	}
	    System.out.println("�����Һ�� "+sum);
	    
	    //Collerction.sort(list);
	    System.out.println("20�� �̻� ���");
	    for(Customer tmp : list67) {
	    	if(tmp.getAge()>=20) {
	    		System.out.println(tmp);
	    	}
	    }
	    
	    
	    System.out.println("��Ʈ���� �̿��� ��� ");
	    list67.stream().forEach(s->System.out.println(s));
	    
	    //���ϴ� ��Ҹ� ��� 
	    System.out.println("���� ���");
	    list67.stream()
	    .map(m-> m.getName())
	    .forEach(n->System.out.println(n));
	    
	    
	    //�Ѻ��
	   int tot = list67.stream()
			   .mapToInt(n->n.getPrice())
			   .sum();
	   System.out.println("�����ұݾ�"+tot);
	   
	   /*
	   //���̰� 20�� �̻��� �����͸� ����
	   list67.stream()
	   .filter(c->cgetAge()>=20)
	   .sorted(new Comparator<Customer>() {
	   }
	   
	   public int compareTO(Customer o) {
		   retrun.this
	   }
	   */
	   //���� Ŭ���� ��ü���� ������ �����Ǿ� ���� ���� ��� comparato
	   //���� Ŭ���� ��ü���� ������ �����Ǿ� �ִٸ� �ٷ� sorted���
		   
	   
	    
	
		
		ArrayList<��> list = new ArrayList<>();
		
		int arr1[] = new int [list.size()];  //������Ʈ�� ���̸� �迭�� �޴´�.
		String arr4[] = new String [list.size()]; // 15�� �̻� ���̸� ��� �迭 string
		String arr3[] = new String [list.size()]; 
		String arr2[] = new String [list.size()];
		
		
		//���̸��� �迭�� �޴´�.
		
		list.add(new ��("ȫ�浿",24,99));
		list.add(new ��("�����",54,909));
		list.add(new ��("������",54,449));
		list.add(new ��("����Ŵ",84,929));
		list.add(new ��("��Ƹ���",14,12));
		list.add(new ��("�ϳ�",23,49));
		list.add(new ��("��ѵ�",34,19));
		list.add(new ��("������",27,107));
		list.add(new ��("���̸�Ŵ",13,19));
		

		
		list.stream().forEach(n->{
			String name = n.getName();
			int old = n.getOld();
			System.out.println(name+" "+old);
			
			

		});
		
		�� n1 = new ��();
		//����
		ArrayList<Integer> old1 = new ArrayList<>();
		
		
		
		
        for(int i =0; i<list.size(); i ++) {
        	int old = n1.getOld();
        	arr1[i] = list.get(i).getOld();
        	
        	///
            arr4[i] = list.get(i).getName();
        	
        	System.out.println(arr4[i]);
        	///
        	
        	
        }
		
        System.out.println("15�� �̻� ������Ʈ [100����]");
        Arrays.stream(arr1).filter(a->a>=15).distinct().sorted().forEach(n-> System.out.println(n+" "));
		
        
        
        
        
        
        //�� �̸� ������ ����
        ArrayList<String> name1 = new ArrayList<>();
		
		
		
        for(int i =0; i<list.size(); i ++) {
        	String name = n1.getName();
        	arr2[i] = list.get(i).getName();
        	
        }
		
        Arrays.stream(arr2).distinct().sorted().forEach(n-> System.out.println(n+" "));
		
		//�͸� comparato
        
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
