//package day17;
//
//
//interfacePower{
//	void turnOn();
//	void turnOff();
//	
//}
//
//
//class Tv implements Power{
//	
//}
//
//public class �͸�Ŭ���� {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		/*
//		 * �͸�Ŭ���� : �̸��� ���� Ŭ����
//		 * �������̽��� �̿��Ͽ� ��ü�� ���� �� Ŭ���� ���� ���� �ٷ�[�Ű�������] ����  
//		 * �͸�Ŭ������ ����ϴ� ����  
//		 * - �������̽��� ����� ����, �ش� ��ü�� �ϳ��� �ʿ��� ��� 
//		 * �޼����� �Ű������� �ַ� ���
//		 */
//		
//		/*
//		�͸�Ŭ���� ex = new �͸�Ŭ����();
//		Tv t = new Tv();
//		ex.product(t);
//		
//		*/
//		
//		
//		
//		//�͸�Ŭ������ �۾��ϴ� ��� .
//		ex.product(new Power(){
//			@Override
//			public void trunOn() {
//				System.out.println("������ �մϴ�.");
//			}
//			@Override
//			public void trunOff() {
//				System.out.println("������ ���ϴ�.");
//			}
//		});
//		
//		
//		
//		
//		
//
//	}
//
//	public void product(Power p) {
//		p.turnOn();
//		System.out.println("�����۵��� ...");
//		p.turnOff();
//		System.out.println("");
//	}
//
//
//	
//}
