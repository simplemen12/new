package day16;

public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Exception : ����ó�� 
		 * �����ڰ� �ڵ� ������ �߻��� �� �ִ� ���ܸ� ó���ϴ� ����  
		 * ���ܰ� �߻��ϸ� ���� �߻� �������� �ڵ�� ���� => ���ܹ��� ��� 
		 * ����ó�� => ���ܰ� �߻��� �� �ִ� ������ ����, �������� ����ó���� ������Ű�� ��� 
		 *���ܿ� ������ �ٸ� ���  //trows parse Exception
		 *������ �ý��� �󿡼� �߻��ϴ� ���
		 *try ~ catch ~ finally
		 *try : ���ܰ� �߻��� ���ɼ��� �̾� ���� �ۼ� 
		 *catch : try�������� �߻��� ���ܸ� ó���ϴ� ����
		 *finally : try ������ �ݵ�� ����Ǿ�� �ϴ� ���� �ۼ� (������ ��� x)
		 */
		
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(1/0); //exception �߻�����
			System.out.println(3);
			System.out.println(4);
		}catch(Exception e) { //�߻��� ���ܸ� ó���� ��ü e
			e.printStackTrace(); //���� ���� ������ �ݼֿ� ���  
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
		//���� �߻��ص� ó����
		System.out.println(5);
		System.out.println(6);

	}

}
