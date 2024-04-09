package dbboard;

import java.util.List;
import java.util.Scanner;

import jdbc.JDCVO;


public class BoardControllor {
	//controller <-> service <-> DAO <-> DB
	
	private Scanner scan;
	private Service svc; //아직 안만듦
	private boolean flag; //종료변수
	
	public BoardControllor() {
		scan = new Scanner(System.in);
		svc = new BoardServiceImpl(); //service 구현체
		flag = true;
		printMenu();
	
}
	
	private void printMenu() {
		while(flag) {
			System.out.println("---상품관리프로그램---");
			System.out.println("1.게시글등록 2. 게시글검색 3.게시글수정 ");
			System.out.println("4.게시글삭제 5. 게시글출력 6.종료 ");
			System.out.println("메뉴선택");
			int menu = scan.nextInt();
			switch(menu) {
			case 1: addBoard(); break;
			case 2: searchBoard(); break;
			case 3: modifyBoard(); break;
			case 4: removeBoard(); break;
			case 5: printBoard(); break;
			default:
				flag=false; break;
			}
		}	
	}

	private void printBoard() {
		// 상품 리스트 출력 select * from product;
				List<BoardVO> list = svc.getList();
				//출력
				for(BoardVO p : list) {
					System.out.println(p);
					
				}
		
	}

	private void removeBoard() {
		// 상품삭제 delete from product where pno=?
				System.out.println("삭제하려는 게시번호");
				
				int bno = scan.nextInt();
				
						System.out.println("게시제목");
						scan.nextLine();
						String title = scan.nextLine();
						
						System.out.println("게시자성명");
						
						String writer = scan.nextLine();
						
						System.out.println("게시글");
						scan.nextLine();
						String text = scan.nextLine();
						
						BoardVO p = new BoardVO(bno,title, writer, text);
						
						int isOK = svc.removeBoard(p);
						
						//잘되면 1 안되면 0
						System.out.println("상품수정 "+((isOK >0)?"성공":"실패"));
				
	}

	private void modifyBoard() {
		// 수정 update product set pname=?, price=?, madeby=?where pno=?
			
				System.out.println("수정하려는 게시번호");
				int bno = scan.nextInt();
				
						System.out.println("게시물제목");
						scan.nextLine();
						String title = scan.nextLine();
						
						System.out.println("게시물작성자");
						
						String writer = scan.nextLine();
						
						System.out.println("게시물내용");
						scan.nextLine();
						String text = scan.nextLine();
						
						BoardVO p = new BoardVO(bno,title, writer, text);
						
						int isOK = svc.modifyBoard(p);
						
						//잘되면 1 안되면 0
						System.out.println("상품수정 "+((isOK >0)?"성공":"실패"));
		
	}

	private void searchBoard() {
		// 검색 select * from product where pno = ?
		System.out.println("게시번호>");
		int bno =scan.nextInt();
		BoardVO p = svc.getSearch(bno);
		System.out.println(p);
	}

	private void addBoard() {
		// 게시등록
		/*
		 * public BoardVO(String title, String writer, String text) {
		this.title = title;
		this.writer = writer;
		this.text = text;*/
		System.out.println("게시물 제목을 입력해주세요.");
		scan.nextLine();
		String title = scan.nextLine();

		System.out.println("게시물 작성자명을 입력해주세요.");
			String writer = scan.nextLine();

		System.out.println("게시물 내용을 입력해주세요.");
		
		String text = scan.nextLine();
				
				
				BoardVO p = new BoardVO(title,writer,text);
				
				//service에게 등록을 요청하는 메서드 작성
				int isOK = svc.addBoard(p);
				System.out.println(isOK);
				//잘되면 1 안되면 0
				System.out.println("게시등록 "+((isOK >0)?"성공":"실패"));
		
	}
	
	
	
}

