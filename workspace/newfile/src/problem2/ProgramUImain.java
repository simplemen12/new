
package problem2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ProgramUImain {

    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner scan = new Scanner(System.in);
        ArrayList<PgManager> p = new ArrayList<>();
        PgManager sm = new PgManager();
        boolean isRunning = true;

       // sm.해사영어국제협약(); //해사영어
     //   sm.해사영어항해운용(); 
        sm.해사영어smcp(); 
        sm.일일복습(); 

        int menu = 0;

        System.out.println("\r\n"
                + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                + "⠀⠀⠀⠀⠀⣠⡤⢤⣄⠀⢠⡄⠀⢠⡄⠠⡄⢠⢤⡤⣤⡄⠀⠀⠀⠀⠀⠀\r\n"
                + "⠀⠀⠀⠀⢰⡏⠀⠀⢹⡇⢸⡇⠀⢸⡇⢘⡇⠀⠀⣴⠏⠀⠀⠀⠀⠀⠀⠀\r\n"
                + "⠀⠀⠀⠀⠘⢷⣀⣀⣾⠃⠸⣇⣀⣼⠃⢨⡗⢀⣾⣁⣀⡀⠀⠀⠀⠀⠀⠀\r\n"
                + "⠀⠀  ⠀⠀⠉⠉⠙⠂⠀⠈⠉⠁⠀⠀⠁⠈⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀\r\n"
                + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                + "");

        while (isRunning) {
            sm.signUp(scan);
            sm.signIn(scan);

            System.out.println("   ╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜╮\r\n"
                    + "       ʟᴏᴀᴅɪɴɢ ... 잠시만 기다려주세요! \r\n"
                    + "   ╰ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜◞ ╯\r\n\r\n");
            System.out.println("         ʟᴏᴀᴅɪɴɢ : ▮▯▯▯▯▯▯▯▯");
            System.out.println("         ʟᴏᴀᴅɪɴɢ : ▮▮▮▯▯▯▯▯▯");
            System.out.println("         ʟᴏᴀᴅɪɴɢ : ▮▮▮▮▮▯▯▯▯");
            System.out.println("         ʟᴏᴀᴅɪɴɢ : ▮▮▮▮▮▮▮▯▯");
            System.out.println("         ʟᴏᴀᴅɪɴɢ : ▮▮▮▮▮▮▮▮▮");
            System.out.println("");

            do {
                System.out.println("\r\n");
                System.out.println("───────────────── MENU ─────────────────");
                System.out.println("                              [－][口][×]");
                System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                System.out.println("      ① 문제등록 ② 일일복습 ③ 일일복습2 ④ 채점 ");
                System.out.println("  ⑤ 기관술 ⑥ 해양경찰학 ⑦ 해사법규 ⑧ 해사영어 9 종료  ");
                System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                System.out.println("─────────────── MENU 선택 ───────────────");
            try {
                menu = scan.nextInt();
                if (sm.loggedInId != null) {
                    switch (menu) {
                        case 1:
                            sm.WorkbookRegister123(scan);
                            break;
                        case 2:
                            sm.일일복습m(scan);
                            break;
                        case 3:
                            sm.일일복습4m(scan);
                            break;
                        case 4:
                        	 sm.Resert1();
                           
                          
                            break;
                        case 5:
                            
                            break;
                        case 6:
                            
                            break;
                        case 7:
                        	
                        	                      

                                                                
                              
                            break;
                        case 8:
                        	sm.해사영어국제협약m(scan);
                        	sm.해사영어항해운용m(scan);
                        	sm.해사영어smcpm(scan);
                        	
                        	
                            break;
                        case 9:
                            sm.loggedInId = null;
                            System.out.println("로그아웃 되었습니다.");
                            isRunning = false;
                            break;
                        case 0:
                            System.out.println("종료되었습니다.");
                            isRunning = false;
                            break;
                        default:
                            System.out.println("잘못된 메뉴입니다.");
                    }
                } else {
                    switch (menu) {
                        case 1:
                            sm.signUp(scan);
                            break;
                        case 2:
                            sm.signIn(scan);
                            break;
                        case 3:
                            System.out.println("시스템을 종료합니다.");
                            break;
                    }
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("잘못된 입력 형식입니다. 숫자로 다시 입력해주세요.");
                scan.nextLine(); // 입력 버퍼를 비워줍니다.
            }
        } while (menu != 3 || (menu != 8 && sm.loggedInId != null));

        if (menu == 9) {
            isRunning = false;
        } else {
            isRunning = true;
        }
    }
    System.out.println("\r\n"
            + "⠀⠀    ⠀⢀⣤⣤⣤⣤⣤⣤⡀⢠⣠⣤⡀⢠⣤⣤⡀⠀⣠⣤⣤⣤⣤⣤⡀⠀⠀\r\n"
            + "⠀⠀    ⠀⠸⣿⣿⣿⣿⣿⣿⠂⢸⣿⣿⡇⢸⣿⣿⡇⢨⣿⣿⣿⡿⣿⣿⠃⠀⠀\r\n"
            + "⠀⠀⠀    ⠀⠀⢨⣿⣿⠅⠀⠀⢸⣿⣿⡂⣨⣿⣿⠆⢘⣿⣿⡇⡀⡀⡀⠀⠀  \r\n"
            + "⠀⠀⠀    ⠀⠀⢸⣿⣿⠁⠀⠀⢸⣿⣿⣿⣿⣿⣿⡅⢘⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀\r\n"
            + "⠀⠀⠀    ⠀⠀⣼⣿⣿⡁⠀⠀⢸⣿⣿⡇⠠⣿⣿⡆⠐⣿⣿⣆⣀⣠⣀⠀⠀⠀⠀\r\n"
            + "⠀⠀⠀    ⠀⠀⣿⣿⣿⠂⠀⠀⢸⣿⣿⡇⠠⣿⣿⡂⠀⢿⣿⣿⣿⣿⢿⠇⠀⠀⠀\r\n"
            + "⠀⠀⠀    ⠀⠀⡀⡀⡀⣀⢀⠀⠀⢀⢀⠀⠀⣀⣄⠀⠀⠀⡀⡀⡀⠀⠀⠀⠀⠀⠀⠀\r\n"
            + "⠀⠀    ⠀⢰⣿⣿⣿⣿⣿⣿⠀⣸⣿⣿⣷⠸⣿⣿⡆⢰⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀\r\n"

              + "");

      
      scan.close();

   
      
}
}