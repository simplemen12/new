package day16;

public class Exception04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ��Ƽ ĳġ ����, ���� ĳġ ���� 
		 * 
		 * try{
		 * 
		 * } catch(����Ŭ������1 ��ü){
		 * 
		 * 
		 * } catch(����Ŭ������2 ��ü){
		 * 
		 * Exception => ��� ������ �ְ����� (default)
		 * ���ܸ� ��ü������ ����ȭ �ؼ� ������ �� => ��Ƽ ĳġ
		 * � ���ܰ� �߻��ϴ� �� ĳġ (Exception) 
		 */
		
		double res = 0;
		try {
			res = 1/0;
			int arr[] = null;
			arr[1]=3;
			
			int arr1[] = new int [3];
			arr[5] =1;
		} catch (ArithmeticException e) {
			System.out.println("0���� ���������ϴ�.");
			// TODO: handle exception
		} catch (NullPointerException e) {
			System.out.println("��ü�� null�Դϴ�.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ������ ������ϴ�.");
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
