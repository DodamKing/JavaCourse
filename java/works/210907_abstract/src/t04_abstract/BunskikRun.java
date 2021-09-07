package t04_abstract;

public class BunskikRun {
	public static void main(String[] args) {
		
		Bonsa WangB = new WangjaBunsik("4500원", "5000원", "6000원", "판매하지 않습니다.", "1000원");
		Bonsa SeoulB = new WangjaBunsik("5000원", "5000원", "5000원", "4000원", "무료 제공됩니다.");
		Bonsa WoojuB = new WangjaBunsik("6000원", "7000원", "7000원", "6000원", "1000원");
		
		Bonsa[] bunsik = {WangB, SeoulB, WoojuB};
		
		for (int i=0; i<bunsik.length; i++) {
			bunsik[i].print();
			bunsik[i].menu();
		}
	}
}
