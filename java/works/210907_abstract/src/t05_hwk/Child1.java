package t05_hwk;

public class Child1 extends LunchMenu {

	@Override
	public int getTotal() {
		System.out.println(theMenu[5] + ": " + price[5] + "원");
		total = 2500 + price[5];
		return total;
	}

}
