package day16;

public class Exception06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�޼��忡�� ������ �迭���  
		int start = -1, count= 5, size=-1;
		int arr[] = null;
		Exception06 c = new Exception06();
		//c.printarr(randomArray1(0,0,-10));
		
		System.out.println("------------");
		c.printarr(randomArray1(11,50,55));
		
		
		
		
		
		
	
		

	}
	
	/*
	 * �޼��� ���� 1
	 * ��� : size�� �Ű������� �Է¹޾�  size��ŭ�� ���̸� ������ �迭�� �����Ͽ� 
	 * �������� ä�� �迭�� ����
	 * �������� ������ �Ű������� �Է��� ���� start(���۰�), count(����)
	 * 
	 * - size�� 0���� �۴ٸ� ���ܹ߻�
	 * - count������  0���� �۴ٸ� ���ܹ߻�  
	 * 
	 * 
	 * 
	 * �޼��� ���� 2 
	 * ��� : �Ű������� �迭�� �޾Ƽ� �������� ä��� �޼���
	 * �������� ������ �Ű������� �Է��� ���� start(���۰�), count(����)
	 * 
	 * - �迭�� null�̸� ���ܹ߻� ��Ų��
	 * - �迭�� ���̰� 0���� ������ ���ܹ߻�
	 * 
	 * 
	 * 
	 */
	
	
	
	/*
	 * �޼��� ���� 1
	 * ��� : size�� �Ű������� �Է¹޾�  size��ŭ�� ���̸� ������ �迭�� �����Ͽ� 
	 * �������� ä�� �迭�� ����
	 * �������� ������ �Ű������� �Է��� ���� start(���۰�), count(����)
	 * 
	 * - size�� 0���� �۴ٸ� ���ܹ߻�
	 * - count������  0���� �۴ٸ� ���ܹ߻�  
	 */
	public void printarr(int arr3[]) {
		
		
		try {
		for(int i=0; i<arr3.length-1; i++) {
			//arr3[i] = (int) (Math.random() * count) + start; //start ~ count������ ����������
			System.out.print(arr3[i]+" ");
		}
		 }catch (ArithmeticException e) {
				System.out.println("size�� 0�Դϴ�.");
		 }catch (NullPointerException e) {
				System.out.println("count�� 0�Դϴ�.");
		// } catch(Exception e) {
				//e.printStackTrace();
			}
	}
	

	
	 public static int[] randomArray1(int size, int start, int count) {
		 
		 
		 if(size==0) {
				throw new RuntimeException("size�� 0�Դϴ�.");
			}
		 if(count<0) {
				throw new RuntimeException("count�� 0���� �۽��ϴ�.");
			}
		 
		 
		 int arr3[] = new int[size]; //�������� ũ�⸸ŭ�� �迭����
		 try {
			
			
			 int i=0;
			
			
			
			
			for(i=0; i<arr3.length-1; i++) {
				arr3[i] = (int) (Math.random() * count) + start; //start ~ count������ ����������
				System.out.println(arr3[i]);
			}
		 
		 
		 
		 }catch (ArithmeticException e) {
				System.out.println("size�� 0�Դϴ�.");
		 }catch (NullPointerException e) {
				System.out.println("count�� 0�Դϴ�.");
		// } catch(Exception e) {
				//e.printStackTrace();
			}
			return arr3;
		 
	
		}
	 
	 
	 /*
	 * �޼��� ���� 2 
	 * ��� : �Ű������� �迭�� �޾Ƽ� �������� ä��� �޼���
	 * �������� ������ �Ű������� �Է��� ���� start(���۰�), count(����)
	 * 
	 * - �迭�� null�̸� ���ܹ߻� ��Ų��
	 * - �迭�� ���̰� 0���� ������ ���ܹ߻�
	 * 
	 */
	 
	 public static int[] randomArray2(int size, int start, int count) {
		 
		
		 if(count<0) {
				throw new RuntimeException("�迭�� ���̰� 0���� �۽��ϴ�.");
			}
		 
		 
		 
		 int arr3[] = new int[size]; //�������� ũ�⸸ŭ�� �迭����
		 
		 if(arr3 == null) {
				throw new RuntimeException("�迭�� ���̰� 0���� �۽��ϴ�.");
			}
		
		
		 
		 
		 
		 try {
			//�������� ũ�⸸ŭ�� �迭����
			int i=0;
			
			
			
			//int arr3[] = new int[size]; //�������� ũ�⸸ŭ�� �迭����
			for(i=0; i<arr3.length-1; i++) {
				arr3[i] = (int) (Math.random() * count) + start; //start ~ count������ ����������
				System.out.println(arr3[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ������ ������ϴ�.");
		 }catch (NullPointerException e) {
				System.out.println("�迭�� ���̰� null�Դϴ�.");
		 } catch(Exception e) {
				e.printStackTrace();
			}
			
			return arr3;
	
		
		}
	 
	 public int[] createArr(int start, int count, int size) {
		 if(size <=0) {
			 throw new RuntimeException("�迭�� ���̰� 0���� �۽��ϴ�.");
		 }
		 if(count <=0) {
			 throw new RuntimeException("random ������ 0���� �۴�");
		 }
		 int arr[] = new int [size];
		 for (int i =0; i<arr.length; i++) {
			 arr[i] = (int)(Math.random()*count)+start;
		 }
		return arr;

	 }
	
		

}
