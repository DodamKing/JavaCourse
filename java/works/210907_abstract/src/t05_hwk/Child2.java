package t05_hwk;

public class Child2 extends LunchMenu {

	@Override
	public int getTotal() {
		System.out.println(theMenu[6] + ": " + price[6] + "원");
		System.out.println(theMenu[7] + ": " + price[7] + "원");
		total = 2500 + price[6] + price[7];
		return total;
	}

}
