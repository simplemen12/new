package day16;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Data01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Date 클래스 => Deprecated 비권장 
		 * 
		 * Calender 클래스 => 자체는 추상클래스  
		 * 추상클래스는 객체를 생성할 수 없다. 추상클래스를 구현한 객체를 이용하여 사용 
		 * new로 객체 생성 불가능. 
		 * getinstance() / static이다 근데 static메서드 => 클래스명, 메서드()
		 */
		Date d = new Date();  //
		d.getDate(); // 비권장
//		Calendar c = new Calendar();  //ctrl + implements로 추상클래스 확인
		
		Calendar c = Calendar.getInstance(); //오늘날짜 리턴
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		//월 0-11까지 +! 표현
		int month = c.get(Calendar.MONTH)+1; // 0부터 시작이라 +1
		int day = c.get(Calendar.DAY_OF_MONTH);
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int ampm = c.get(Calendar.AM_PM);
		
		String b= "-";
		switch(week) {
		case 1 : b = "일"; break;
		case 2 : b = "월"; break;
		case 3 : b = "화"; break;
		case 4 : b = "수"; break;
		case 5 : b = "목"; break;
		case 6 : b = "금"; break;
		case 7 : b = "토"; break;
		}
		
		String a="-";
		if(ampm==1) {
			a = "오후";
		}
		if(ampm!=1) {
			a = "오전";
		}
		
		System.out.println(year+"-"+month+"-"+day+"-"+"("+b+")"+a+" "+hour+":"+minute);
	
		
	
		 Scanner scanner = new Scanner(System.in);
		
		
		
		
		
		       

		        System.out.println("단원의 이름을 입력해주세요:");
		        String unitName = scanner.nextLine();

		        // 입력된 단원 이름으로 맵을 생성
		        HashMap<String, String> unitMap = new HashMap<>();
		        unitMap.put(unitName, "");

		        // 생성된 맵 출력
		        System.out.println("생성된 맵: " + unitMap);
		       // unitName.put("문제");
		    }
		

		/*
		// hour minute second am_pm
		//2024-1-26(금) 오후4:13
		
		import java.util.Scanner;
		import java.util.HashMap;

		public class Workbook {
		    HashMap<String, String> problems = new HashMap<>();
		    HashMap<String, String> problemAnswers = new HashMap<>();
		    HashMap<String, String> problemExplain = new HashMap<>();

		    public void chapter(Scanner scan) {
		        System.out.println("PESS ENTER KEY PLEASE .");
		        String enterKey = scan.nextLine();

		        System.out.println("과목의 수를 입력해주세요.");
		        int totalSubjects = Integer.parseInt(scan.nextLine());

		        // 과목 정보 입력
		        HashMap<String, HashMap<String, HashMap<String, String>>> subjects = new HashMap<>();
		        for (int i = 1; i <= totalSubjects; i++) {
		            System.out.println("과목 " + i + " 이름을 입력해주세요.");
		            String subjectName = scan.nextLine();

		            System.out.println("대단원의 수를 입력해주세요.");
		            int totalBigUnits = Integer.parseInt(scan.nextLine());
		            HashMap<String, HashMap<String, String>> bigUnits = new HashMap<>();

		            // 대단원 정보 입력
		            for (int j = 1; j <= totalBigUnits; j++) {
		                System.out.println("대단원 " + j + " 이름을 입력해주세요.");
		                String bigUnitName = scan.nextLine();

		                System.out.println("소단원의 수를 입력해주세요.");
		                int totalSubUnits = Integer.parseInt(scan.nextLine());
		                HashMap<String, String> subUnits = new HashMap<>();

		                // 소단원 정보 입력
		                for (int k = 1; k <= totalSubUnits; k++) {
		                    System.out.println("소단원 " + k + " 이름을 입력해주세요.");
		                    String subUnitName = scan.nextLine();
		                    subUnits.put(subUnitName, "");
		                    
		                    /*

		                    // ox문제 입력
		                    System.out.println("소단원 " + subUnitName + "의 ox문제를 입력해주세요.");
		                    String Id = scan.nextLine();
		                    System.out.println("소단원 " + subUnitName + " 문제를 입력해주세요.");
		                    String pb = scan.nextLine();
		                    System.out.println("소단원 " + subUnitName + " 해설을 입력해주세요.");
		                    String ex = scan.nextLine();

		                    String as = "";
		                    while (!(as.equals("O") || as.equals("X"))) {
		                        System.out.println("소단원 " + subUnitName + " (O/X)입력해주세요");
		                        as = scan.nextLine().toUpperCase();
		                        if (!(as.equals("O") || as.equals("X"))) {
		                            System.out.println("입력은 'O' 또는 'X'로 입력해주세요.");
		                        }
		                    }
		                

		                    problems.put(Id, pb);
		                    problemAnswers.put(Id, as);
		                    problemExplain.put(Id, ex);
		                    */
		                }

		 

		 
		
		


