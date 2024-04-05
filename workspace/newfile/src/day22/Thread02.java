package day22;

//Runnable�� �����ϴ� ���
class MyThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0; i<=200; i++) {
			System.out.println(i+"��° Thread"+Thread.currentThread().getName());
		}
		
	}
	
}

public class Thread02 {

	public static void main(String[] args) {
		/*
		 * Runnable�� ������ ������ ��ü ����
		 * Thread ��ü�� �����Ͽ� Runnable ����ü�� �����ڷ� ����
		 * 
		 */
		
		System.out.println("main start");
		
		MyThread2 mth = new MyThread2();
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
		
		Thread th2  = new Thread(mth);
		th2.start();
		
		System.out.println("main end");
		
		

	}

}
