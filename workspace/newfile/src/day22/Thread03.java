package day22;

class JoinTest extends Thread{
	int start;
	int end;
	int total;
	
	public JoinTest(int start,int end) {
		this.start = start;
		this.end = end;
	
	}
	public void run1() {
		for(int i=start; i<=end; i++) {
			total+=i;
		}
	}
	
	
	public int run(int a,int b) {
		int sum=0;
	for(int i=a; i<=b; i++) {
		System.out.println("+");
		sum += i;
		
		
	}
	return sum ;
	}
	

}


//Runnable�� �����ϴ� ���
class MyThread3 implements Runnable{
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0; i<=50; i++) {
			System.out.println(i+"��° Thread"+Thread.currentThread().getName());
			sum+=i;
			
		}
		System.out.println(sum); 
		
	}
	
}

class MyThread4 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=51; i<=100; i++) {
			System.out.println(i+"��° Thread"+Thread.currentThread().getName());
			sum+=i;
		}
		System.out.println(sum); 
	}
	
}







public class Thread03 {

	public static void main(String[] args) {
		// 1-50, 51-100������ ���� ���ϴ� �ΰ��� Thread�� ����
		// �� ����� Ȯ��  
		
		//�ΰ��� Thread�� ����ǰ� �� �� 
		//thread1 1-50������ �հ� ���
		//thread2 51-100������ �հ� ���
		//thread2 + thread2�� �հ� ���
		
System.out.println("main start");
		
		MyThread3 mth = new MyThread3();
		Thread th  = new Thread(mth);
		th.start();
		
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//join() : ���ÿ� �ΰ� �̻��� �����尡 �߻������� �ٸ� �������� ����� �����Ͽ�  
		//����Ǿ�� �ϴ� ��� join() �޼��� ���
		
		MyThread4 mth1 = new MyThread4();
		Thread th2  = new Thread(mth1);
		th2.start();
		
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("main end");
		
		JoinTest mth3 = new JoinTest(1, 50);
		
		System.out.println("+++++++++++");
		int a = mth3.run(1,50);
		System.out.println(a);
		System.out.println(a);
		
		JoinTest st1 = new JoinTest(1, 50);
		JoinTest st2 = new JoinTest(51,100);
		
		st1.start();
		st2.start();
		

		try {
			st1.join();
			Thread.sleep(500);
			st2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int lastTotal = st1.total + st2.total;
		System.out.println("�հ�"+lastTotal);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
