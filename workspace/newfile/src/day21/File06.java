package day21;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File06 {

	public static void main(String[] args) {
		/*
		 * ������ ������ �ִ� ���� ���
		 */
		File f = new File("C:\\Users\\coldh\\neDrive\\���� ȭ��\\����\\workspace\\newfile\\write.txt");
		
		String name =f.getName();
		System.out.println(name);
		System.out.println(f.getPath()); //��� + �̸�
		System.out.println(f.getParent());//��θ� 
		System.out.println(File.separator);//���� ������
	
		
		String f2 = f.toString();
		System.out.println(f2);
		
		//f2�� �������� ���ϸ� ���� seperator�̿� test.txt 
		System.out.println(File.separator);//���� ������
		String fileName = f2.substring(f2.lastIndexOf(File.separator));
		System.out.println(fileName);
		
		/*
		
		public void filePrint() throw new IOException() {
			
			FileWriter fs =  new FileWriter("Wrod.txt");
			BufferedWriter bw = new BufferedWriter(fs);
			
			StringBuffer sb = new StringBuffer();
			
			String data = null;
			sb.append("�ܾ���");
			sb.append("\r\n");
			
			int cnt = 0;
			while(cnt < map.size()) {
				for(String key : map.keySet()) {
					sb.append(key+":"+map.get(key));
					sb.append("\r\n");
					cnt++;
				}
				data = sb.toString();
				
				
			}
			*/
			
		}
		

	}


