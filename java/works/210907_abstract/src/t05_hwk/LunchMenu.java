package t05_hwk;

public abstract class LunchMenu {
	int total;
	public String[] theMenu = {"쌀밥", "불고기", "두부조림", "미역국", "요플레", "바나나", "우유", "아몬드"};
	public int[] price = {500, 2000, 1000, 1000, 800, 500, 500, 700};
	
	public void _default() {
		System.out.println(theMenu[0] + ": " + price[0] + "원");
		System.out.println(theMenu[1] + ": " + price[1] + "원");
	}
	
	public abstract int getTotal();
}
