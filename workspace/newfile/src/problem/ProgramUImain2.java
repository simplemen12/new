package problem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class ProgramUImain2 {

	

		//�÷��� ����� ������ ���� 1�� 1���� �ظ� �ڱ� �� ���� ���輺�� �ΰ� �� ����

		public static void main(String[] args) throws IOException {
			Scanner scan = new Scanner(System.in);
			//��ü�� �����ϴ� ���� �׻� �̸� �س��� �޼��� ȣ��
			//manager�� ȣ���ϱ����� ��ü
			//StudentManger sm = new StudenManager();
		    
			ArrayList<PgManager2> p = new ArrayList<>();
			
			PgManager2 sm = new PgManager2(); //�޼��带 �ޱ����� ��ü����
			
			
			int menu = 0;

			do {
				System.out.println("1. ox������� 2. �����ܿ���� 3. ��ϰ˻�(�������,�ܿ����)/�� �޸���");
				System.out.println("4. ����Ǯ�� 5. ����Ǯ�̰������ 6. ����Ǯ�̺м�");
				System.out.println("7. ox�������� 8.ox��������2 9.����� ���� ���");
				System.out.println("10. ����");
				
				menu = scan.nextInt();
				
				//�޴��� ���� �б� ����
				switch(menu) {
				case 1: sm.WorkbookRegister(scan); break;
				case 2: sm.SubjectRegister(scan); break;
				case 3: sm.Search(scan); break;
				case 4: sm.SolvingPb(scan); break;
				case 5: sm.Resert(scan); break;
				case 6: sm.ResertAnalysis(scan); break;
				case 7: sm.WorkbookModify(scan); break;
				case 8: sm.WorkbookModify2(scan); break;
				case 9: sm.ui(); break;
				
				default:
					System.out.println("�߸��� �޴��Դϴ�.");
				}
			}while(menu != 10);
			
			System.out.println("����");
			
			scan.close();

		

	}
	}
