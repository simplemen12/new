package sale;

public class Sale1<K,V> {

	//������� menu / price 
	private K menu;
	private V price;
	
	public Sale1() {}
	public Sale1(K menu, V price){
		this.menu = menu;
		this.price = price; 
		//���� ���� int�� �� int�� �޴´�.
		
		//sale => menu Price
		//order Class => sale�� ��ӹ޾Ƽ� ���
		//order => (menu price) count total
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
	@Override
	public String toString() {
		return "Sale1 [menu=" + menu + ", price=" + price + "]";
	}
	
	
	
	
}
