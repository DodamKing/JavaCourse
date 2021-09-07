package t05_hwk;

public class MenuRun {
	public static void main(String[] args) {
		LunchMenu ch1 = new Child1();
		LunchMenu ch2 = new Child2();
		LunchMenu[] children = {ch1, ch2};
		
		
		for (int i=0; i<children.length; i++) {
			System.out.println("원아" + (i+1) + " 식단표");
			children[i]._default();
			System.out.println("총합: " + children[i].getTotal() + "원");
			System.out.println();
		}
		
	}
}
