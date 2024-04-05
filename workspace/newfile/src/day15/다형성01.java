package day15;

/*
 * ��ü�������α׷��ֿ����� 4���� Ư¡
 *  - ���α׷��� ������ ������ ��ü���� ��Ƽ� ó���ϴ� ����.
 *  - ������ ��ü�� �޽����� �ְ� �����鼭 �����͸� ó�� 
 *  - �߻�ȭ, ĸ��ȭ �������� ��� ������
 *  
 *   1.�߻�ȭ - �ٽ����� �ڵ常 �����ֱ�
 *   - ������ �κа� �������� ���� �κ��� �и��Ѵ�
 *   - ���ʿ��� �κ��� �����.
 *   
 *   2.ĸ��ȭ -�����ͺ�ȣ ��������
 *   - �������[�ʵ�]�� �����, �޼���� ����
 *   - ��������� �޼��带 �ϳ��� ��� ó�� 
 *   - ����ȭ ��ü�� ������ ������ ���� �ܺη� �巯���� �ʰ� �ϴ� �� 
 *   �ܺο��� �����Ϳ� ���� �����ϴ� ���� ����  
 *   
 *   3.��� (Inheritance) - �ڵ� ����(Ȯ��)
 *   Ŭ������ ��ӹ޾� �����Ͽ� ����ϸ� �ߺ� �ڵ带 ���ϼ� �ִ�.
 *   ���������� ���ϴ�.
 *   
 *   4.������(Polymorphism) - ��ü ����ȯ ����
 *   - �ϳ��� �ڵ尡 ���� �ڷ�(��ü)������ �����Ǿ� ����Ǵ� ��
 *   - �ڵ�� ������ ������ ��ü�� ���� �ٸ� �������� ���� �� �ִ�.
 *   - �������� �� Ȱ���ϸ� �����ϰ�, Ȯ���� �ִ� ���������� ���� ���α׷��� ����� ���� . 
 */
class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{  //source -> override/implment

	@Override
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
		
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
	
}

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("ȣ���̴� �׹߷� ��� �Ÿ��ϴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
	
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ƴٴմϴ�.");
	}
	public void Fiying() {
		System.out.println("�������� ����� �մϴ�.");
	}
	
}

class Dog{
	public void move() {
		System.out.println("�������� ������� �Ƚ��ϴ�.");
	}
}
















public class ������01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Humen, tiger eagle ��ü ����
		
		Human h = new Human(); //��ü����
		h.move();
		h.readBook();
		
		
		Tiger t = new Tiger();
		t.move();
		t.hunting();
		
		Eagle e = new Eagle();
		e.move();
		e.Fiying();
		
		System.out.println("������ ��ü�� �ڽ� ��ü ����");
		
		Animal hAnimal = new Human(); //������ Ŭ������ �ڽ��� ��ü �������� !�ڽ��� ������ �Ұ���
		hAnimal .move(); //Animal���� ȣ��
		
		Animal tAnimal = new Tiger(); //������ Ŭ������ �ڽ��� ��ü �������� !�ڽ��� ������ �Ұ���
		tAnimal .move(); //Animal���� ȣ��
		System.out.println();
		
		
		System.out.println("������ �޼��� ����");
		������01 ex1 = new ������01();
//		ex1.moveAnimal1(h);
//		ex1.moveAnimal2(t);
//		ex1.moveAnimal3(e);
		ex1.moveAnimal(hAnimal);
		ex1.moveAnimal(tAnimal); //��ü�� ����ȯ�� �ż� ��밡��
		Dog d = new Dog();
		d.move();
		//ex1.moveAnimal(d);  animalŬ������ ��ӹް� ���� �ʱ� ������ �Ұ��� 
		System.out.println("Animal �迭 ��������");
		
		Animal[] aniList = new Animal[5];
		int cnt = 0 ;
		aniList[cnt] = hAnimal;
		cnt++;
		aniList[cnt] = tAnimal;
		cnt++;
		
		for(int i=0; i<cnt; i++) {
			aniList[i].move();
		}
		
		System.out.println();
		System.out.println("�ٿ�ĳ���� ����");
		
		//Human human = hAnimal;  //����ȯ ����
		Human human = (Human)hAnimal; //�ٿ�ĳ����    �޸��� �� ������ �̾� �ڷ����� ��ü��  = �ִϸ��� ��ӹ��� �޸� Ŭ���� ��ü��  
		human.readBook();
		
		//Human human1 = (Human)tAnimal; //�ڵ�� ������ ������ 
	//	human1.readBook(); //Ŭ���� ĳ���� exception error ������ ��쿡 ���� !  
		
		//instanceof : ��ü�� �ش� Ŭ������ ���� �´��� üũ�ϴ°�
		System.out.println(tAnimal instanceof Human);
		System.out.println(tAnimal instanceof Tiger);
		
		
		Animal downCastingTest = tAnimal;
		if(downCastingTest instanceof Human) {
			Human testHuman = (Human)downCastingTest;
			testHuman.readBook();
		}else if(downCastingTest instanceof Tiger) {
			Tiger testTiger = (Tiger)downCastingTest;
			testTiger.hunting();
		}else{
			System.out.println("error");
		}
		
		//�α����� ��ü�� ���ǰ�ü�� ������ �� ���ǰ�ü���� �����ö� ��������� �νĵż� ����ȯ [�ٿ�ĳ����]�Ͽ� ���
	
		
		

	

	}
	
	//�� ��ü�� move�� �������ִ� �޼��� ���� 
	/*
	public void moveAnimal1(Human human) {
		human.move();
	}
	public void moveAnimal2(Tiger tiger) {
		tiger.move();
	}
	public void moveAnimal3(Eagle eagle) {
		eagle.move();
	}
	*/
	
	
	//�������� ����(��ĳ���� : �ڵ� ����ȯ ����)
	public void moveAnimal(Animal animal) {
		animal.move(); //animal�� ��ӹް� �ִ� ��� ��ü ��밡��
	}
	
	

}
