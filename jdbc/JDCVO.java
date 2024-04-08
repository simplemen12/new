package jdbc;

public class JDCVO {
	/*
	 * 
	 * create table product(
pno int not null auto_increment,
pname varchar(50) not null,
price int not null default 0,
regdate datetime default now(),
madeby text, 
primary key(pno));*/
	
	
	private int pno;
	private String pname;
	private int price;
	private String regdate;
	private String madeby;
	
	
	//생성자
	public JDCVO() {}
	
	//상품등록 ->
	public JDCVO(String pname, int price, String madeby) {
		this.pname = pname;
		this.price = price;
		this.madeby = madeby;
	}
	
	//상품리스트 ->
	public JDCVO(int pno, String pname, int price) {
		this.pno = pno;
		this.pname = pname;
		this.price = price;
	}
	
	//상품수정 -> pno, pname, price, madeby
	public JDCVO(int pno, String pname, int price, String madeby) {
		this(pname,price,madeby);
		this.pno = pno;
		
	}
	
	
	//상품상세 -> 전부 
	public JDCVO (int pno, String pname, int price, String regdate, String madeby) {
		this(pname,price,madeby);
		this.regdate = regdate;
		
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getmadeby() {
		return madeby;
	}

	public void setMdaeby(String mdaeby) {
		this.madeby = mdaeby;
	}

	@Override
	public String toString() {
		return "JDCVO [pno=" + pno + ", pname=" + pname + ", price=" + price + ", regdate=" + regdate + ", mdaeby="
				+ madeby + "]";
	}
	

}
