package t03_interface;

public class Child implements LunchMenu {
	public static int sickdanIndex;
	int price, total;
	String name;
	String[] sickdan = new String[6];
	int[] sickdanPrice = new int[6];
	
	@Override
	public void howmuch(int price, String menu) {
		sickdan[sickdanIndex] = menu;
		sickdanPrice[sickdanIndex] = price;
		sickdanIndex++;
	}
	
	public int getTotal() {
		for (int i=0; i<sickdanIndex; i++) {
			total += sickdanPrice[i];
		}
		return total;
	}
	
}
