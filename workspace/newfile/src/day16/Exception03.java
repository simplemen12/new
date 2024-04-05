package day16;

import java.util.ArrayList;
import java.util.Scanner;

public class Exception03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 자주 발생하는 예외 코드들 4가지
		 * 1.ArithmeticException : 0 으로 나누었을 떄 발생하는 Exception 
		 * 2.ArrayIndexOutofBoundsException : 배열의 범위가 index범위를 벗어났을 때
		 * 3.nullPOINTexception : 배열이 빈 공간일때
		 * 4.classcastexception : 다운캐스팅이 잘못되었습니다 형 변환 오류 
		
		int arr[] = new int[5];    
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int arr2[] = null;
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr[i]);
		}
		 */
		/*
		 public void WorkbookRegister2(Scanner scan) {
			    System.out.println("문제ID를 입력해주세요 .");
	            String Id = scan.nextLine();
	            
	            System.out.println("문제를 입력해주세요 .");
	            String pb = scan.nextLine();
	            
	            System.out.println("해설를 입력해주세요 .");
	            String ex = scan.nextLine();
	            
	            System.out.println("ox를 입력해주세요 .");
	            String as = "";
	            while (!(as.equals("O") || as.equals("X"))) {
	                System.out.println("답을 입력하세요: (O/X)");
	                as = scan.nextLine().toUpperCase();
	                if (!(as.equals("O") || as.equals("X"))) {
	                    System.out.println("답변은 'O' 또는 'X'로 입력해주세요.");
	                }
	            }
	            
	            
	            
			   problems.put(Id, pb);
	           problemAnswers.put(Id, as);
	           problemExplain.put(Id, ex);
		       
		    }
		    */

	}

}
