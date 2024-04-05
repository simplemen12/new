//package day17;
//
//public class 사용자정으Exception {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		/*
//		 * passwordException
//		 * - 비밀번호는 null일수 없다 .
//		 * - 비밀번호의 길이는 5글자 이상 .
//		 * - 비밀번호는 문자로만 이루어지면 안된다 .(문자 + 숫자 + 특수문자) 
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
//	//exception처리
//	if(password == null) {
//		throw new PasswordException("비밀번호는 null일수 없습니다.");
//	}else if(password.length() < 5) {
//		throw new PasswordException("비밀번호는 5장 이상이여야 합니다.");
//	}else if(password.matchs("[a-zA-Z")) {
//		throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
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
