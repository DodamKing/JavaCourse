package t04_hwk_re;

public class Child extends LunchMenu {

	@Override
	public void calculation() {
		res =  menuPrice[0] + menuPrice[1];
		for (int i=2; i<menuCnt+2; i++) {
			res += menuPrice[order[i]];
		}
	}

	@Override
	public void prn() {
		System.out.println("\n *    주문내역    *");
		for (int i=0; i<2; i++) {
			System.out.println(menuTitle[i] + ": " + menuPrice[i]);
		}
		for (int i=2; i<menuCnt+2; i++) {
			System.out.println(menuTitle[order[i]] + ": " + menuPrice[order[i]]);
		}
		System.out.println();
		if (child.equals("1")) System.out.print("철수의 ");
		else System.out.print("영희의 ");
		System.out.println("총합계: " + res);
	}
}
