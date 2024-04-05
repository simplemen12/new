package test1;

public class Card2 {
	
	private int num;
	private char shape;
	
	//������
	public Card2() {
		this.num=1;
		this.shape='��';
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
	
	//�ܺ��� ��(�Ű�����)���� ���� ����(�������)�� ������ �� ����ϴ� �޼���
	public void setNum(int num) {
		//1~13������ �� ����, �� �ܴ� 1�� ����
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
		//��,��,��,�� �ƴ� ���� ����� ��Ʈ
		switch(shape) {
		case '��': case '��': case '��': case '��': 
			this.shape = shape;
			break;
			default:
				this.shape = '��';
		}
	}

}
