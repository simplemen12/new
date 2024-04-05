package day16;

public class Exception06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메서드에서 생성된 배열출력  
		int start = -1, count= 5, size=-1;
		int arr[] = null;
		Exception06 c = new Exception06();
		//c.printarr(randomArray1(0,0,-10));
		
		System.out.println("------------");
		c.printarr(randomArray1(11,50,55));
		
		
		
		
		
		
	
		

	}
	
	/*
	 * 메서드 생성 1
	 * 기능 : size를 매개변수로 입력받아  size만큼의 길이를 가지는 배열을 생성하여 
	 * 랜덤값을 채워 배열을 리턴
	 * 랜덤값의 범위는 매개변수로 입력을 받음 start(시작값), count(개수)
	 * 
	 * - size가 0보다 작다면 예외발생
	 * - count개수가  0보다 작다면 예외발생  
	 * 
	 * 
	 * 
	 * 메서드 생성 2 
	 * 기능 : 매개변수로 배열을 받아서 랜덤값을 채우는 메서드
	 * 랜덤값의 범위는 매개변수로 입력을 받음 start(시작값), count(개수)
	 * 
	 * - 배열이 null이면 예외발생 시킨다
	 * - 배열의 길이가 0보다 작으면 예외발생
	 * 
	 * 
	 * 
	 */
	
	
	
	/*
	 * 메서드 생성 1
	 * 기능 : size를 매개변수로 입력받아  size만큼의 길이를 가지는 배열을 생성하여 
	 * 랜덤값을 채워 배열을 리턴
	 * 랜덤값의 범위는 매개변수로 입력을 받음 start(시작값), count(개수)
	 * 
	 * - size가 0보다 작다면 예외발생
	 * - count개수가  0보다 작다면 예외발생  
	 */
	public void printarr(int arr3[]) {
		
		
		try {
		for(int i=0; i<arr3.length-1; i++) {
			//arr3[i] = (int) (Math.random() * count) + start; //start ~ count사이의 랜덤값범위
			System.out.print(arr3[i]+" ");
		}
		 }catch (ArithmeticException e) {
				System.out.println("size가 0입니다.");
		 }catch (NullPointerException e) {
				System.out.println("count가 0입니다.");
		// } catch(Exception e) {
				//e.printStackTrace();
			}
	}
	

	
	 public static int[] randomArray1(int size, int start, int count) {
		 
		 
		 if(size==0) {
				throw new RuntimeException("size가 0입니다.");
			}
		 if(count<0) {
				throw new RuntimeException("count가 0보다 작습니다.");
			}
		 
		 
		 int arr3[] = new int[size]; //사이즈의 크기만큼의 배열생성
		 try {
			
			
			 int i=0;
			
			
			
			
			for(i=0; i<arr3.length-1; i++) {
				arr3[i] = (int) (Math.random() * count) + start; //start ~ count사이의 랜덤값범위
				System.out.println(arr3[i]);
			}
		 
		 
		 
		 }catch (ArithmeticException e) {
				System.out.println("size가 0입니다.");
		 }catch (NullPointerException e) {
				System.out.println("count가 0입니다.");
		// } catch(Exception e) {
				//e.printStackTrace();
			}
			return arr3;
		 
	
		}
	 
	 
	 /*
	 * 메서드 생성 2 
	 * 기능 : 매개변수로 배열을 받아서 랜덤값을 채우는 메서드
	 * 랜덤값의 범위는 매개변수로 입력을 받음 start(시작값), count(개수)
	 * 
	 * - 배열이 null이면 예외발생 시킨다
	 * - 배열의 길이가 0보다 작으면 예외발생
	 * 
	 */
	 
	 public static int[] randomArray2(int size, int start, int count) {
		 
		
		 if(count<0) {
				throw new RuntimeException("배열의 길이가 0보다 작습니다.");
			}
		 
		 
		 
		 int arr3[] = new int[size]; //사이즈의 크기만큼의 배열생성
		 
		 if(arr3 == null) {
				throw new RuntimeException("배열의 길이가 0보다 작습니다.");
			}
		
		
		 
		 
		 
		 try {
			//사이즈의 크기만큼의 배열생성
			int i=0;
			
			
			
			//int arr3[] = new int[size]; //사이즈의 크기만큼의 배열생성
			for(i=0; i<arr3.length-1; i++) {
				arr3[i] = (int) (Math.random() * count) + start; //start ~ count사이의 랜덤값범위
				System.out.println(arr3[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다.");
		 }catch (NullPointerException e) {
				System.out.println("배열의 길이가 null입니다.");
		 } catch(Exception e) {
				e.printStackTrace();
			}
			
			return arr3;
	
		
		}
	 
	 public int[] createArr(int start, int count, int size) {
		 if(size <=0) {
			 throw new RuntimeException("배열의 길이가 0보다 작습니다.");
		 }
		 if(count <=0) {
			 throw new RuntimeException("random 범위가 0보다 작다");
		 }
		 int arr[] = new int [size];
		 for (int i =0; i<arr.length; i++) {
			 arr[i] = (int)(Math.random()*count)+start;
		 }
		return arr;

	 }
	
		

}
