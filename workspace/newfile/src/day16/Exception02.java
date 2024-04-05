package day16;



public class Exception02 {

	public static void main(String[] args) {
		// ArithmeticException : 0���� �������� �� �߻��ϴ� Exception
		//�ϴܿ��� ���� �޼��带 ����.
		//����ó��
		
		try {
			System.out.println(sum(1,1));
			System.out.println(div(1,1));
			System.out.println(mul(1,1));
			System.out.println(mod(1,1));
	
			
	
			System.out.println(1/0); //exception �߻�����
			
		}catch(Exception e) { //�߻��� ���ܸ� ó���� ��ü e
			e.printStackTrace(); //���� ���� ������ �ݼֿ� ���  
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
		
		//throw new RuntimeException();
		//���ܸ� �߻���Ű�� �޼��� ����� �� �κп� throws�� ����, �߻��� �� �ִ� ���ܸ� �ݵ�� �����־�� �Ѵ�.
		//throws�� RuntimeException�� ���������� ���� 
		

	}
	
	public static double calc(int num1,int num2, char op) throws RuntimeException{
		double res =0;
		//�����ڰ� / %�� ��� num2�� 0�̸� ���� �߻���Ű��  
		
		if((op=='/' || op == '%') && num2==0) {
			throw new RuntimeException("-");
		}
		
		switch(op) {
		case '+' : res = num1 + num2; break;
		case '-' : res = num1 - num2; break;
		case '*' : res = num1 * num2; break;
		

		case '/' : res = num1 / num2; break;
		
		
	
		case '%' : res = num1 % num2; break;


		
		}
		return res;
	}

	
	//��� : �� ���� �Է¹ް�, �����ڸ� �Է¹޾� 4Ģ������ ����� �����ϴ� �޼��� 
	//�ް����� : int num1 int num2 char op 
	//���� �߻���ŰŰ throw�̿��Ͽ� ���� �߻� ��ų�� ����.
	//throw�� ���� �� �ѱ��
	//�����ڰ� /�̰ų� %�� ��� num2�� 0�̸� ���� �ڻ���Ű��  
	
	
	public static int sum(int num1, int num2)throws RuntimeException {
		return num1 + num2;
		
	}
	public static int sub(int num1, int num2) {
		return num1 - num2;
		
	}
	public static int mul(int num1, int num2) {
		return num1 * num2;
		
	}
	public static int div(int num1, int num2) {
		return num1 / num2;
		
	}
	public static int mod(int num1, int num2) {
		return num1 % num2;
		
	}
}



	
	




