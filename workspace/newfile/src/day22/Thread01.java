package day22;

class MyTread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();  //source - implements - run() 
		//0-200�� �ݺ��Ͽ� �����ϴ� ���� ����
		for(int i=0; i<=200; i++) {
			System.out.println(i+"��° Thread"+getName());
		}
		
	}
	//�ݵ�� run()��� �޼��带 �����ؾ� ��.
	
}

public class Thread01 {

	public static void main(String[] args) {
		/*
		 * Thread(������)
		 * - �������� ���α׷��� OS���� �޸𸮸� �Ҵ� �޾� process ���°� ��.
		 * - �ϳ��� process�� �ϳ� �̻��� thread�� ������ �ǰ�, 
		 * - thread�� ���� �۾��� �����ϴ� ����
		 * 
		 * Thread�� ���� CPU�� �۾��� ó���ϴ� ����  
		 * - multi-thread : �������� thread�� ���ÿ� ����Ǵ� ���α׷� 
		 * - CPU�� �ð��� �߰� �ɰ��� thread�� ������ �����ϸ鼭 
		 * - ����ڵ��� ���ÿ� ó���Ǵ� ���� ȿ���� ������ ��.
		 * - thread�� ���� �ڽŸ��� �۾������� ���� (context)
		 * - �� thread���� �����ϴ� �ڿ��� ���� �� ����. (�ڹٴ� static)
		 * - ���� thread�� �����ϴ� �ڿ� �� ������ �߻��ϴ� �κ��� (critical section �Ӱ迵��)
		 * - critical section�� ���� ����ȭ(������ ����)�� �����Ͽ� ������ ����.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Thread�� �����ϴ� 2���� ���
		 * 
		 * 1. Thread Ŭ������ ����Ͽ� �����
		 * 2. Runnable �������̽��� �����Ͽ� �����
		 * 
		 *  �ڹٴ� ���߻���� ������� �ʱ� ������, (������ �������̽��� �������� ����) �ٸ� Ŭ������ ������� ���� 2������ ����  
		 *  
		 *
		 */
		
		System.out.println(Thread.currentThread().getName()); //����������� ������.�̸�
		
		MyTread th = new MyTread();
		th.start();
		
		MyTread th2 = new MyTread();
		th2.start();
		
		
		
		

	}

}
