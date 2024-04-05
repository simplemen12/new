package sale;

public class Rec<K,V>  {
	
	
	private String day;
	private String menu1;
	private String tax;
	private String price1;
	
	public Rec(String day, String menu1, String price1, String tax) {
		this.day = day;
		this.menu1 = menu1;
		this.price1 = price1;
		this.tax = tax;
	}
	public Rec(String pp, int pp1) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Rec [day=" + day + ", menu1=" + menu1 + ", tax=" + tax + ", price1=" + price1 + "]";
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMenu1() {
		return menu1;
	}
	public void setMenu1(String menu1) {
		this.menu1 = menu1;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	public String getPrice1() {
		return price1;
	}
	public void setPrice1(String price1) {
		this.price1 = price1;
	}

}
