package sale;

public class Sale1<K,V> {

	//멤버변슈 menu / price 
	private K menu;
	private V price;
	
	public Sale1() {}
	public Sale1(K menu, V price){
		this.menu = menu;
		this.price = price; 
		//들어온 값이 int면 다 int로 받는다.
		
		//sale => menu Price
		//order Class => sale을 상속받아서 사용
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
