package day16;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Data01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Date Ŭ���� => Deprecated ����� 
		 * 
		 * Calender Ŭ���� => ��ü�� �߻�Ŭ����  
		 * �߻�Ŭ������ ��ü�� ������ �� ����. �߻�Ŭ������ ������ ��ü�� �̿��Ͽ� ��� 
		 * new�� ��ü ���� �Ұ���. 
		 * getinstance() / static�̴� �ٵ� static�޼��� => Ŭ������, �޼���()
		 */
		Date d = new Date();  //
		d.getDate(); // �����
//		Calendar c = new Calendar();  //ctrl + implements�� �߻�Ŭ���� Ȯ��
		
		Calendar c = Calendar.getInstance(); //���ó�¥ ����
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		//�� 0-11���� +! ǥ��
		int month = c.get(Calendar.MONTH)+1; // 0���� �����̶� +1
		int day = c.get(Calendar.DAY_OF_MONTH);
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int ampm = c.get(Calendar.AM_PM);
		
		String b= "-";
		switch(week) {
		case 1 : b = "��"; break;
		case 2 : b = "��"; break;
		case 3 : b = "ȭ"; break;
		case 4 : b = "��"; break;
		case 5 : b = "��"; break;
		case 6 : b = "��"; break;
		case 7 : b = "��"; break;
		}
		
		String a="-";
		if(ampm==1) {
			a = "����";
		}
		if(ampm!=1) {
			a = "����";
		}
		
		System.out.println(year+"-"+month+"-"+day+"-"+"("+b+")"+a+" "+hour+":"+minute);
	
		
	
		 Scanner scanner = new Scanner(System.in);
		
		
		
		
		
		       

		        System.out.println("�ܿ��� �̸��� �Է����ּ���:");
		        String unitName = scanner.nextLine();

		        // �Էµ� �ܿ� �̸����� ���� ����
		        HashMap<String, String> unitMap = new HashMap<>();
		        unitMap.put(unitName, "");

		        // ������ �� ���
		        System.out.println("������ ��: " + unitMap);
		       // unitName.put("����");
		    }
		

		/*
		// hour minute second am_pm
		//2024-1-26(��) ����4:13
		
		import java.util.Scanner;
		import java.util.HashMap;

		public class Workbook {
		    HashMap<String, String> problems = new HashMap<>();
		    HashMap<String, String> problemAnswers = new HashMap<>();
		    HashMap<String, String> problemExplain = new HashMap<>();

		    public void chapter(Scanner scan) {
		        System.out.println("PESS ENTER KEY PLEASE .");
		        String enterKey = scan.nextLine();

		        System.out.println("������ ���� �Է����ּ���.");
		        int totalSubjects = Integer.parseInt(scan.nextLine());

		        // ���� ���� �Է�
		        HashMap<String, HashMap<String, HashMap<String, String>>> subjects = new HashMap<>();
		        for (int i = 1; i <= totalSubjects; i++) {
		            System.out.println("���� " + i + " �̸��� �Է����ּ���.");
		            String subjectName = scan.nextLine();

		            System.out.println("��ܿ��� ���� �Է����ּ���.");
		            int totalBigUnits = Integer.parseInt(scan.nextLine());
		            HashMap<String, HashMap<String, String>> bigUnits = new HashMap<>();

		            // ��ܿ� ���� �Է�
		            for (int j = 1; j <= totalBigUnits; j++) {
		                System.out.println("��ܿ� " + j + " �̸��� �Է����ּ���.");
		                String bigUnitName = scan.nextLine();

		                System.out.println("�Ҵܿ��� ���� �Է����ּ���.");
		                int totalSubUnits = Integer.parseInt(scan.nextLine());
		                HashMap<String, String> subUnits = new HashMap<>();

		                // �Ҵܿ� ���� �Է�
		                for (int k = 1; k <= totalSubUnits; k++) {
		                    System.out.println("�Ҵܿ� " + k + " �̸��� �Է����ּ���.");
		                    String subUnitName = scan.nextLine();
		                    subUnits.put(subUnitName, "");
		                    
		                    /*

		                    // ox���� �Է�
		                    System.out.println("�Ҵܿ� " + subUnitName + "�� ox������ �Է����ּ���.");
		                    String Id = scan.nextLine();
		                    System.out.println("�Ҵܿ� " + subUnitName + " ������ �Է����ּ���.");
		                    String pb = scan.nextLine();
		                    System.out.println("�Ҵܿ� " + subUnitName + " �ؼ��� �Է����ּ���.");
		                    String ex = scan.nextLine();

		                    String as = "";
		                    while (!(as.equals("O") || as.equals("X"))) {
		                        System.out.println("�Ҵܿ� " + subUnitName + " (O/X)�Է����ּ���");
		                        as = scan.nextLine().toUpperCase();
		                        if (!(as.equals("O") || as.equals("X"))) {
		                            System.out.println("�Է��� 'O' �Ǵ� 'X'�� �Է����ּ���.");
		                        }
		                    }
		                

		                    problems.put(Id, pb);
		                    problemAnswers.put(Id, as);
		                    problemExplain.put(Id, ex);
		                    */
		                }

		 

		 
		
		


