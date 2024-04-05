package problem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PgManager2 {
	
	//멤버변수 Problem
	
	private String Answer; //멤버변수 ox문제를 저장
	


	private String Question; //멤버변수 주관식문제를 저장

	
	public PgManager2() {}
	public PgManager2(String Answer, String Question) {
		this.Answer = Answer;
		this.Question = Question;//
	}
	
	@Override
	public String toString() {
		return "PgManager2 [Answer=" + Answer + ", Question=" + Question ;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public ArrayList<PgManager2> getP() {
		return p;
	}
	public void setP(ArrayList<PgManager2> p) {
		this.p = p;
	}

	public Object getGetProblem() {
		return getProblem;
	}
	public void setGetProblem(Object getProblem) {
		this.getProblem = getProblem;
	}
	
	ArrayList<PgManager2> p = new ArrayList<>(); //객관식 저장 리스트
	
	private Object getProblem;

	
	//메서드
	
	
	//  4 문제풀기, 7. 문제 변형 0 : 정찬솔님
	
	//문제 이퀄스로 정답확인 빠르면 
	//4지선다 출력 및 정답 바로 확
	
	//ox문제 입력 메서드
	public void WorkbookRegister(Scanner scan) {
		// TODO Auto-generated method stub
		//ox문제 등록기준
		//1. 숫자 제거 블랭크
		//2. 텍스트 제거 블랭크
		//3. 텍스트 블랭크 입력 및 변형 입력 // map (?)
		
		//주관식문제 따로 객관식문제 따로 
		
		//변형하고 싶은 텍스트에는 ""표시한다
		//숫자는 해당없음
		//입력한 list를 새로생성
		
		
		
		System.out.println("입력할 ox문제를 기입해주세요 .");
		String A = scan.next();
		System.out.println("입력할 ox문제의 답을 입력해주세요.");
		String Q = scan.next();
	
		System.out.println("입력할 주관식문제를 기입해주세요 .");
		System.out.println("입력전 '입력 후 변형하고자 하는 문제의 부분은 ''사이에 기입 ");
		String A1 = scan.next();

		System.out.println("입력할 주관식문제의 답을 입력해주세요.");
		String Q1 = scan.next();
		
		this.p.add(new PgManager2(A,null));//문제 입력
		this.p.add(new PgManager2(A1,null));//문제 주관식 입력

		this.p.add(new PgManager2(null,Q));//답추가
		this.p.add(new PgManager2(null,Q1));//답추가
		
		System.out.println("현재입력된 문제/답" +p);
		System.out.println("+++++"+p.size());
	
		
		//여기서 부터는 메모장으로 출력 - 이 컴퓨터에는 지금 UTP-8이 아니다. 주의
		FileWriter fw = null;
		
		
		
		
	}
	
	
	//ox문제 단원입력 메서드
	public void SubjectRegister(Scanner scan) {
		//1.단원의 수 입력 2. 그 단원의 출제비율 입력
		//단원은 등록되는 만큼 그 단원의 문제출제 비중을 입력 
		//총 문제수에서 입력된 비중만큼 비율로 나누어서 출제
		System.out.println("입력할 ox문제의 단원을 기입해주세요 .");

		String oxsub = scan.next();
		
		//this.p.add(new PgManager2(Problem,null,null,null,null,null));//문제추가완료
		
			System.out.println("문자만 입력가능");
		
	}

	//ox문제 검색 메서드
	public void Search(Scanner scan) {
		//1. 입력된 문제 검색 및 출력
		//2. 풀이한 문제 검색 및 출력
		//3. 변형한 문제 검색 및 출력
		System.out.println("검색하고자 하는 list를 입력해주세요 ");
		String ox = scan.next();
		try {
			FileWriter fw3 = new FileWriter("writer.txt",true);
			for(int i=1; i<p.size(); i++) {
				String data = p.get(i).Answer+ " test \r\n";  // \n Enter \r 캐리지리턴
				fw3.write(data); //기록
				fw3.write("my project IO test \r\n");
				
			}
			fw3.close();
			} catch (IOException e) {
				
			}
		
		
		
	}
	public void  ui() throws IOException {
		System.out.println("검색하고자 하는 list를 입력해주세요 ");
		
		/*
			FileWriter fw3 = new FileWriter("writer.txt",true);
			for(int i=1; i<p.size(); i++) {
				String data = p.get(i).Problem+ " test \r\n";  // \n Enter \r 캐리지리턴
				fw3.write(data); //기록
				fw3.write("my project IO test \r\n");
				
			}
			fw3.close();
			*/
			System.out.println("+++");
			PrintWriter fw4 = new PrintWriter(new FileWriter("Print.txt59",true));
			for(int i=1; i<p.size(); i++) {
				String data = p.get(i).Answer+ " test \r\n";
				System.out.println("=====");// \n Enter \r 캐리지리턴
				fw4.print(data); //기록
				fw4.print("problem \r\n");
				
			}
			fw4.close();
			
		
	}
	
	//ox문제풀기 메서드
	public void SolvingPb(Scanner scan) {
		//1. 입력된 문제 + 변형된 문제에서 문제 생성
		//2. 생성된 문제를 단원의 수 만큼 입력 및 비율화
		//int a = (int)(Math.random()*p.size())+1;//랜덤변수
		
		//ox문제출력 및 답 리스트에 입력
		for(int i=1; i<p.size(); i++) {
			String Answer = p.get(i).Answer;//문제출력 문제가 저장된 p리스트만큼의 문제생성
			String Question  = p.get(i).Question; 
			System.out.println("ox문제 출력");// \n Enter \r 캐리지리턴
			//System.out.println(i+"번문제"+Answer);
			System.out.println(p.get(i).Answer+"-----답");
			this.p.add(new PgManager2(null,Question));
			//생성된 순번대로 바로 정답을 문제리스트에 저장
			
		
			
		}
	}
		
		
		//변형된 문제 출력 및 답 저장 변형된문제 p1 p1도 순번데로 저장해야한다.
		
		//주관식 문제출력 및 답 리스트에 입력
	
		        //변형 문제출력 및 답 리스트에 입력
			

	//ox문제 채점 메서드
	public void Resert(Scanner scan) {
		//1.문제풀이한 것을 채점
		//2.채점한 것을 저장 
		
	}
	
	

	//ox문제 채점분석 메서드
	public void ResertAnalysis(Scanner scan) {
		//1.Resert 메서드에서 저장된 채점한 결과를 분석
		//2. 분석해주는 것은   2-1.단원별 틀린문제 2-2. 취약한 단원 표시 및 비율화 
		//2-3 취약단원 솔루션 제공
		//
		
	}

	//ox문제 입력한것을 변형문제 생성 메서드
	public void WorkbookModify(Scanner scan) {
		
		//ox문제 유형 3가지
		
		String ox ="";
		int i=0;
		//1.입력된 문제를 숫자를 지워서 빈칸화
		try {
		System.out.println("변경할 ox문제를 검색해주세요.");
		String search = scan.next(); //입력된 ox문제중 찾을 택스트
		for(i=0; i<=p.size()/4; i++) { //리스트 p사이즈만큼 반복     두번째 입력된 문제는 정답을 찾지를 못함 .
			if(p.get(i).getAnswer().contains(search)){
				//p객체에 저장된 문제에 i번지에 입력된 search 값이 있다면
				System.out.println("검색결과."+p.get(i).getAnswer());
				ox=p.get(i).getAnswer(); //i번지에 있는 해당 검색을 입력 
			}
			//ox=p.get(i).getProblem().contains(search);
			
		}
		} catch (NullPointerException e) {
			System.out.println("객체가 null입니다.");
			return;
		}
		
		
		//String ox = "연안수역은 20해리";
		System.out.println("문제에서 지울 키워드를 입력해주세요");
		String ox1 = scan.next(); //입력된 ox문제에서 지울키워드
		 System.out.println("--------검색된 첫 글자 ---");
		    char a = ox1.charAt(0);
		    //System.out.println(a); //검색된 첫글자 입력
		    
		    char b23 = ox1.charAt(ox1.length()-1);
		    //System.out.println(b23); //검색된 마지막글차 출력
		    
		    //System.out.println(ox1.indexOf(a));
		    //System.out.println(ox1.indexOf(b23));
		    
		    int v = ox.indexOf(a); //검색할 텍스트에서 첫글자의 위치
		    int v1 = ox.indexOf(b23); //검색할 텍스트에서 마지막 글자의 위치
		    
		   //System.out.println(v+v1);
		    
		    //System.out.println(ox.substring(0,v)); //앞문장
		    //System.out.println(ox.substring(v1,ox.length())); //뒷문장
		    //System.out.println(ox.substring(0,v)+"   "+ox.substring(v1+1,ox.length()));
			
			//String r = ox.substring(0,v)+"   "+ox.substring(v1+1,ox.length());
			
			this.p.add(new PgManager2(ox.substring(0,v)+"   "+ox.substring(v1+1,ox.length()),null));
			//변형된 문제를 저장
			System.out.println("현재입력된 문제들은" +p);
			
		
		//2.입력된 문제를 숫자를 대체
		//3.텍스트를 입력 및 특정텍스트를 변환
		
		
		
	    }
	    //3.텍스트를 입력 및 특정텍스트를 변환
        public void WorkbookModify2(Scanner scan) {
		//여기서 답도 같이 저장해야 문제풀이가 쉽다
        	
        	
		//ox문제 유형 3가지
        //3.텍스트를 입력 및 특정텍스트를 변환
		String ox = null;
		//1.입력된 문제를 숫자를 지워서 빈칸화
		try {
		System.out.println("변경할 ox문제를 검색해주세요.");
		String search = scan.next(); //입력된 ox문제중 찾을 택스트
		for(int i=0; i<p.size(); i++) { //리스트 p사이즈만큼 반복
			if(p.get(i).getAnswer().contains(search)){
				//p객체에 저장된 문제에 i번지에 입력된 search 값이 있다면
				System.out.println("검색결과."+p.get(i).getAnswer());
				ox=p.get(i).getAnswer(); //i번지에 있는 해당 검색을 입력 
				break;
			}
			//ox=p.get(i).getProblem().contains(search);
			
		}
		} catch (NullPointerException e) {
			System.out.println("객체가 null입니다.");
			return;
		}
		
		//String ox = "연안수역은 20해리";
		System.out.println("문제에서 지울 키워드를 입력해주세요");
		String ox1 = scan.next(); //입력된 ox문제에서 지울키워드
		 System.out.println("--------검색된 첫 글자 ---");
		    char a = ox1.charAt(0);
		    //System.out.println(a); //검색된 첫글자 입력
		    
		    char b23 = ox1.charAt(ox1.length()-1);
		
		    
		    int v = ox.indexOf(a); //검색할 텍스트에서 첫글자의 위치
		    int v1 = ox.indexOf(b23); //검색할 텍스트에서 마지막 글자의 위치
		    
		
			
			this.p.add(new PgManager2(ox.substring(0,v)+"   "+ox.substring(v1+1,ox.length()),null));
			//변형된 문제를 저장
			
			System.out.println("문제에서 지운 키워드에 입력할 키워드를 입력해주세요.1.키워드");
			String key1 = scan.next(); //입력된 ox문제에서 지울키워드
			System.out.println("키워드번 답");
			String q1 = scan.next(); 
			
			
			System.out.println("문제에서 지운 키워드에 입력할 키워드를 입력해주세요.2.키워드");
			String key2 = scan.next(); //입력된 ox문제에서 지울키워드
		
			System.out.println("문제에서 지운 키워드에 입력할 키워드를 입력해주세요.3.키워드");
			String key3 = scan.next(); //입력된 ox문제에서 지울키워드
		
			
			
			
			//변형문제(키워드 저장)
			this.p.add(new PgManager2(ox.substring(0,v)+key1+ox.substring(v1+1,ox.length()),null));
			this.p.add(new PgManager2(ox.substring(0,v)+key2+ox.substring(v1+1,ox.length()),null));
			this.p.add(new PgManager2(ox.substring(0,v)+key3+ox.substring(v1+1,ox.length()),null));
			
			//변형된문제의 답
			this.p.add(new PgManager2(null,q1));
			
		
		
		
		
	}

	public void Print() {
		// TODO Auto-generated method stub
		System.out.println("현재입력된 객관식문제는"+p);
		System.out.println("------------------------");
		System.out.println("현재입력된 변형된 빈칸 객관식문제는"+p);
		System.out.println("------------------------");
		System.out.println("현재입력된 변형된 빈칸이 채워진 객관식문제는"+p);
	}

}
