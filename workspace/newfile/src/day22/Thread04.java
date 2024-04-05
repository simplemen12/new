package day22;

class Bank{
	private int money;
	//�Ա�
	public synchronized void saveMoney(int save) {
		int m = this.money;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.money = m + save;
	}
	
	
	//���
	public synchronized void minusMoney(int minus) {
		int m = this.money;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.money = m -minus;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}
	
}





class Hong extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("ȫ�浿�� �Ա� ���� ~!!");
		Thread04.myBank.saveMoney(10000);
		System.out.println("saveMoney(10000)"+Thread04.myBank.getMoney());
	}
	
	
}

class HongWife extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("ȫ�浿������ ��� ���� ~!!");
		Thread04.myBank.minusMoney(10000);
		System.out.println("minusMoney(10000)"+Thread04.myBank.getMoney());
	}
	
	
}



public class Thread04 {
	
	public static Bank myBank = new Bank(); //�������� (critical section)
	

	public static void main(String[] args) {
		/*
		 * critical section�� �� �� �̻��� Thread�� ���ÿ� ���� �Ҽ� �ִ� ���� (��������)
		 * ���ÿ� �������� thread�� �����ϰ� �Ǹ� ������ ����� ����.
		 * ��������(semaphore) ����� ����Ͽ� �� ������ �����ϳ��� Thread�� ��밡��
		 * ������� ���� �����常 ���� ���� �������� �����°� ��.
		 * 
		 * ����ȭ Ű���� : synchronized
		 * ����ȭ�� �ʿ��� �޼��� �տ� ���� 
		 * 
		 * 
		 * bank Ŭ���� ����  
		 * ���� 1�� ����(bank Ŭ������ ��ü�� �Ѱ� ����)
		 * 
		 */
		
		Hong mth = new Hong();
		Thread th  = new Thread(mth);
		th.start();
		
		HongWife mth1 = new HongWife();
		Thread th2  = new Thread(mth1);
		th2.start();
		
		

	}

}
