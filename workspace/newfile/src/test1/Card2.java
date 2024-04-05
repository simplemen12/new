package test1;

public class Card2 {
	
	private int num;
	private char shape;
	
	//생성자
	public Card2() {
		this.num=1;
		this.shape='♥';
	}
	
	//print
	public void print() {
		System.out.println(shape);
		
		switch(num) {
		case 11:
			System.out.print("J");
			break;
		case 12:
			System.out.print("Q");
			break;
		case 13:
			System.out.print("K");
			break;
		default:
			System.out.print(num+" ");
			break;
		}
	}
	
	public int getNum() {
		return num;
	}
	
	//외부의 값(매개변수)으로 내부 변수(멤버변수)를 변경할 때 사용하는 메서드
	public void setNum(int num) {
		//1~13까지만 내 숫자, 그 외는 1로 설정
		if(num < 1 || num > 13) {
			this.num = 1;
		}else {
			this.num = num;
		}
	}
	
	public char getshape() {
		return shape;
	}
	
	public void setShape(char shape) {
		//♥,◆,♣,♠ 아닌 남지 모양은 하트
		switch(shape) {
		case '♥': case '◆': case '♣': case '♠': 
			this.shape = shape;
			break;
			default:
				this.shape = '♥';
		}
	}

}
