package test1;

public class CardPack2 {

	public static void main(String[] args) {
		CardPack2 cp = new CardPack2(); //52장의 카드가 모두 생성됨.
		
		//char shape ='♥';
		int cnt = 0;
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
			cp.getPack()[cnt].print();
			cnt++;
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		Card2 player1 = cp.pick();
		Card2 player2 = cp.pick();
		System.out.println("player1 card open");
		player1.print();
		System.out.println("");
		System.out.println("player2 card open");
		player2.print();
		
		

	}
	
	
	
	
	//카드 52장이 들어갈수 있는 배열을 생성
	private Card2 pack[] = new Card2[52];
	private int cnt = 0;//카드 배열의 index위치를 체크하기 위한 변수
	
	public CardPack2() {
		char shape = '♥';
		for(int i=1; i<=4; i++) {
			switch(i) {
			case 1: shape = '♥'; break;
			case 2: shape = '◆'; break;
			case 3: shape = '♣'; break;
			case 4: shape = '♠'; break;
			}
			
			for(int j=1; j<=13; j++) {
				Card2 c = new Card2(); //새카드 1장을 생성
			    c.setShape(shape);
			    c.setNum(j);
			    pack[cnt]=c;
			    cnt++;
			}
		}
	}
	
	public Card2 pick() {
		if(cnt==0) {
			return null;
		}
		cnt--;
		return pack[cnt];
	}
	
	//초기화 하는기능
	public void init() {
		cnt = 52;
	}
	
	public Card2[] getPack() {
		return pack;
	}
	public void setPack(Card2[] pack) {
		this.pack = pack;
	}
	
	
	
	
	
}


