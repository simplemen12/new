package day19;

public class Sale<K,V> {
	
	//������� menu / price
	private K menu;
	private V price;
	
	public Sale() {}
	public Sale(K menu, V price) {
		this.menu = menu;
		this.price = price; //���� ���� int�� �� int�� �޴´� String�̸� String���� �� �޴´�
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
