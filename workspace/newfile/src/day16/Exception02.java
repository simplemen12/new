package day16;



public class Exception02 {

	public static void main(String[] args) {
		// ArithmeticException : 0으로 나누었을 때 발생하는 Exception
		//하단에서 만든 메서드를 실행.
		//예외처리
		
		try {
			System.out.println(sum(1,1));
			System.out.println(div(1,1));
			System.out.println(mul(1,1));
			System.out.println(mod(1,1));
	
			
	
			System.out.println(1/0); //exception 발생라인
			
		}catch(Exception e) { //발생한 예외를 처리할 객체 e
			e.printStackTrace(); //실제 예외 구문을 콜솔에 출력  
			System.out.println("예외가 발생했습니다.");
		}
		
		//throw new RuntimeException();
		//예외를 발생시키면 메서드 선언부 끝 부분에 throws를 적고, 발생할 수 있는 예외를 반드시 적어주어야 한다.
		//throws는 RuntimeException만 예외적으로 가능 
		

	}
	
	public static double calc(int num1,int num2, char op) throws RuntimeException{
		double res =0;
		//연산자가 / %인 경우 num2가 0이면 예외 발생시키기  
		
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

	
	//기능 : 두 수를 입력받고, 연산자를 입력받아 4칙연산의 결과를 리턴하는 메서드 
	//메개변수 : int num1 int num2 char op 
	//예외 발생시키키 throw이용하여 예외 발생 시킬수 있음.
	//throw는 예외 떠 넘기기
	//연산자가 /이거나 %인 경우 num2가 0이면 예외 박생시키기  
	
	
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



	
	




