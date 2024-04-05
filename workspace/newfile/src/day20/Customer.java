package day20;

public class Customer {
	//이름 나이 가격
	private String name;
	private int age;
	private int price;
	
	//생성자
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		this.price = (age >= 15)? 100: 50;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "고객명단 [name=" + name + ", age=" + age + ", price=" + price + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
