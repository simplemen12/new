package std2;

import java.util.Scanner;

public class StdMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		StdManager2 sm = new StdManager2(); 
		int menu =0;
		
		sm.add();
		
		do {
			menu = scan.nextInt();
			
			switch(menu) {
//			case 1: sm.addStd(scan); break;
//			case 2:sm.delSub(scan);break;
//			case 3: sm.addStd(scan);break;
//			case 4: sm.addStd(scan);break;
//			case 5:sm.addStd(scan); break;
//			case 6: sm.addStd(scan);break;
//			case 7: sm.addStd(scan);break;
			case 8: break;
			case 9: break;
			
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
			
			
			
			
			
			
			
		}while(menu != 9);
		System.out.println("종료");
		

	}

}
