//package day17;
//
//public class ���������Exception {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		/*
//		 * passwordException
//		 * - ��й�ȣ�� null�ϼ� ���� .
//		 * - ��й�ȣ�� ���̴� 5���� �̻� .
//		 * - ��й�ȣ�� ���ڷθ� �̷������ �ȵȴ� .(���� + ���� + Ư������) 
//		 *
//		 */
//		PasswordTest pt = new  PasswordTest();
//		String password = null;
//		try {
//			pt.setPassword(password);
//			System.out.println(pt.getPassword());
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//}
//
//class PasswoardTest{
//	private String password;
//	
//	
//	
//	
//	//exceptionó��
//	if(password == null) {
//		throw new PasswordException("��й�ȣ�� null�ϼ� �����ϴ�.");
//	}else if(password.length() < 5) {
//		throw new PasswordException("��й�ȣ�� 5�� �̻��̿��� �մϴ�.");
//	}else if(password.matchs("[a-zA-Z")) {
//		throw new PasswordException("��й�ȣ�� ���ڳ� Ư�����ڸ� �����ؾ� �մϴ�.");
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
//}
