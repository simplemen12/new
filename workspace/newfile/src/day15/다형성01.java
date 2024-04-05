package day15;

/*
 * 객체지향프로그래밍에서는 4가지 특징
 *  - 프로그램을 독립된 단위의 객체들을 모아서 처리하는 모임.
 *  - 각각의 객체는 메시지를 주고 받으면서 데이터를 처리 
 *  - 추상화, 캡슐화 정보은닉 상속 다형성
 *  
 *   1.추상화 - 핵심적인 코드만 보여주기
 *   - 구현된 부분과 구현되지 않은 부분은 분리한다
 *   - 불필요한 부분은 숨긴다.
 *   
 *   2.캡술화 -데이터보호 정보은닉
 *   - 멤버변수[필드]는 숨기고, 메서드로 접근
 *   - 멤버변수와 메서드를 하나로 묶어서 처리 
 *   - 은닉화 객체의 내부의 정보는 숨겨 외부로 드러나지 않게 하는 것 
 *   외부에서 데이터에 직접 전근하는 것을 방지  
 *   
 *   3.상속 (Inheritance) - 코드 재사용(확장)
 *   클래스를 상속받아 수정하여 사용하면 중복 코드를 줄일수 있다.
 *   유지보수가 편하다.
 *   
 *   4.다형성(Polymorphism) - 객체 형변환 용이
 *   - 하나의 코드가 여러 자료(객체)형으로 구현되어 실행되는 것
 *   - 코드는 같은데 들어오는 객체에 따라 다른 실행결과를 얻을 수 있다.
 *   - 다형성을 잘 활용하면 유연하고, 확정성 있는 유지보수가 편리한 프로그램을 만들수 있음 . 
 */
class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{  //source -> override/implment

	@Override
	public void move() {
		System.out.println("사람은 두발로 걷습니다.");
		
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이는 네발로 어슬렁 거립니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아다닙니다.");
	}
	public void Fiying() {
		System.out.println("독수리가 사냥을 합니다.");
	}
	
}

class Dog{
	public void move() {
		System.out.println("강아지가 아장아장 걷습니다.");
	}
}
















public class 다형성01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Humen, tiger eagle 객체 생성
		
		Human h = new Human(); //객체생성
		h.move();
		h.readBook();
		
		
		Tiger t = new Tiger();
		t.move();
		t.hunting();
		
		Eagle e = new Eagle();
		e.move();
		e.Fiying();
		
		System.out.println("조상의 객체로 자식 객체 생성");
		
		Animal hAnimal = new Human(); //조상의 클래스로 자식의 객체 생성가능 !자식이 조상은 불가능
		hAnimal .move(); //Animal에서 호출
		
		Animal tAnimal = new Tiger(); //조상의 클래스로 자식의 객체 생성가능 !자식이 조상은 불가능
		tAnimal .move(); //Animal에서 호출
		System.out.println();
		
		
		System.out.println("다형성 메서드 예시");
		다형성01 ex1 = new 다형성01();
//		ex1.moveAnimal1(h);
//		ex1.moveAnimal2(t);
//		ex1.moveAnimal3(e);
		ex1.moveAnimal(hAnimal);
		ex1.moveAnimal(tAnimal); //객체의 형변환이 돼서 사용가능
		Dog d = new Dog();
		d.move();
		//ex1.moveAnimal(d);  animal클래스를 상속받고 있지 않기 떄문에 불가능 
		System.out.println("Animal 배열 생성예시");
		
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
		System.out.println("다운캐스팅 예시");
		
		//Human human = hAnimal;  //형변환 오류
		Human human = (Human)hAnimal; //다운캐스팅    휴먼을 을 잗을수 이쓴 자료형의 객체에  = 애니멸을 상속받은 휴먼 클래스 객체를  
		human.readBook();
		
		//Human human1 = (Human)tAnimal; //코드상 문제가 없으나 
	//	human1.readBook(); //클래스 캐스팅 exception error 실행한 경우에 나옴 !  
		
		//instanceof : 객체가 해당 클래스의 형에 맞는지 체크하는것
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
		
		//로그인한 객체를 세션객체에 저장한 후 세션객체에서 가져올때 오브젝드로 인식돼서 형변환 [다운캐스팅]하여 사용
	
		
		

	

	}
	
	//각 객체의 move를 실행해주는 메서드 생성 
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
	
	
	//다형성의 예시(업캐스팅 : 자동 형변환 가능)
	public void moveAnimal(Animal animal) {
		animal.move(); //animal을 상속받고 있는 모든 객체 사용가능
	}
	
	

}
