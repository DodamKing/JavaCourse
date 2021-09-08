package t04_hwk_re;

public abstract class LunchMenu {
	String child;
	int res;
	int menuCnt;
	
	String[] menuTitle = {"밥", "불고기", "두부조림", "미역국", "요플레", "바나나", "우유", "아몬드"};
	int[] menuPrice = {500, 2000, 1000, 1000, 800, 500, 500, 700};
	int [] order = new int [menuTitle.length];
	
	public abstract void calculation();
	public abstract void prn();
	
	public void run() {
		calculation();
		prn();
	}
}
