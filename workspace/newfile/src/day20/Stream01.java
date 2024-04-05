package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Stream(��Ʈ��)
		 *  - �����Է� / ����� ǥ���� �������� �̻�ȭ�� �帧
		 *  - ��Ʈ���� �ڷῡ ���� ��Ʈ���� �����Ͽ� ����
		 *  - �� ������ �� �����ϸ� ��Ʈ���� �Ҹ��.
		 *  - ��Ʈ�� ������ ���� �ڷῡ ������ �������� ����.
		 *  - ��Ʈ���� ���� �ڷḦ �����Ͽ� ���纻�� ���꿡 ���
		 *  - �߰������ ������������ ���е�.
		 *  - �߰������� �޼��带 �̾ ����� �� ����.
		 *     distinct(): �ߺ�����, filter():���ǿ� �´� ���� ���� ��Ʈ������ �ѱ�,
		 *     limit(), skip(): ��Ʈ���� �Ϻθ� �ǳʶ�, peak(): �۾�����, sorted():����...
		 *  - ���������� ���������� ����
		 *     forEach(), count(), sum(), allMatch():�ϳ��� ��ġ�ϴ���, anyMatch(), toArray():�迭�� ��ȯ,
		 *     collect(): ��Ʈ��
		 *  
		 *  
		 * 
		 */
		
		int[] arr = {1,2,3,4,5,6,7,8};
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("��Ʈ���� �̿��� �հ�");
		int total = Arrays.stream(arr).sum();
		System.out.println(total);
		
		System.out.println("��Ʈ�� count()");
		long cnt = Arrays.stream(arr).count();
		System.out.println(cnt);
		
		System.out.println("---��Ʈ�� average()--");
		OptionalDouble a = Arrays.stream(arr).average();
		System.out.println(a);
		
		
		int sS = Arrays.stream(arr).filter(n-> n>=5).sum();
		
		System.out.println(sS);
		
		//���� �迭�� ������ �� 70�� �̻�(filter)�� �հ�, ���
		//���� ���� ���� ���
		
		int[] arr1 = {71,52,63,64,55,46,57,38};
		
		int sS1 = Arrays.stream(arr1).filter(n-> n>=70).sum();
		
		OptionalDouble sS2 = Arrays.stream(arr1).filter(n-> n>=70).average();
		OptionalInt sS3 = Arrays.stream(arr1).filter(n-> n>=70).max();
		System.out.println(sS1+" "+ sS2+" "+sS3);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(7);
		list.add(8);
		
		System.out.println("list");
		list.stream().forEach(n->System.out.println(n+" "));
		System.out.println("distinct() : �ߺ�����");
		System.out.println();
		
		list.stream().distinct().forEach(n->System.out.println(n+" "));
		System.out.println();
		
		System.out.println("--sorted(): ����");
		list.stream().sorted().forEach(n->System.out.println(n+" "));
		
		System.out.println("--��Ʈ�� ��ü����--");
		Stream<Integer> s1 = Stream.of(10,20,30); 
		System.out.println("�հ�");
		//map : ��Ʈ�� ��ȯ�� ����ϴ� �߰�����
		int s = s1.mapToInt(n-> n.intValue()).sum(); //s�� map(int)�� ��ȯ
		System.out.println(s);
		//s1.forEach(n->System.out.println(n+" ")); //�ѹ� ��Ʈ���� ���⶧���� �ٽ� ����ϸ� error�߻�
		//�ѹ� �Ҹ�� ��Ʈ���� �ٽ� ����� �� ����.
		
		
	
		

	}

}
