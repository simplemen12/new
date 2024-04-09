package dbboard;

public class BoardVO {


	private int bno;
	private String title ;
	private String writer ;
	private String text ;
	private String regdate;
	private String moddate ;
	
	//가정
	private int pno;
	private String pname;
	private int price;

	
	
	//생성자
	public BoardVO() {}
	
	//상품리스트 ->
		public BoardVO(int pno, String pname, int price) {
			this.pno = pno;
			this.pname = pname;
			this.price = price;
		}
		
	
	//게시등록 ->
	public BoardVO(String title, String writer, String text) {
		this.title = title;
		this.writer = writer;
		this.text = text;
	}
	
	//게시목록 ->
	public BoardVO(int bno, String title, String writer) {
		this.bno = bno;
		this.title = title;
		this.writer = writer;
	}
	
	//게시수정 ->
	public BoardVO(int bno, String title, String writer, String text) {
		this(title,writer,text);
		this.bno = bno;
		
	}
	
	
	//게시글 -> 전부 
	public BoardVO (int bno, String title, String writer, String text, String regdate, String madeby) {
		this(title,writer,text);
		this.moddate = moddate;
		this.regdate = regdate;
		
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", writer=" + writer + ", text=" + text + ", regdate="
				+ regdate + ", moddate=" + moddate + "]";
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getModdate() {
		return moddate;
	}

	public void setModdate(String moddate) {
		this.moddate = moddate;
	}


}
