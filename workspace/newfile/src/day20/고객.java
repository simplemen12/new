package day20;

public class 绊按 {
	
	private String name;
	private int old;
	private int money;
	
	public 绊按() {}
	
	public 绊按(String name, int old, int money) {
		this.name=name;
		this.old=old;
		this.money=money;
	}

	@Override
	public String toString() {
		return "绊按 [name=" + name + ", old=" + old + ", money=" + money + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
