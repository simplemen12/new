package day19;

public class Sale<K,V> {
	
	//멤버변수 menu / price
	private K menu;
	private V price;
	
	public Sale() {}
	public Sale(K menu, V price) {
		this.menu = menu;
		this.price = price; //들어온 값이 int면 다 int로 받는다 String이면 String으로 다 받는다
	}
	@Override
	public String toString() {
		return "Sale [menu=" + menu + ", price=" + price + "]";
	}
	public K getMenu() {
		return menu;
	}
	public void setMenu(K menu) {
		this.menu = menu;
	}
	public V getPrice() {
		return price;
	}
	public void setPrice(V price) {
		this.price = price;
	}
	

}
