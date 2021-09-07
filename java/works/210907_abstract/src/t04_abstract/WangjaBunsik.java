package t04_abstract;

public class WangjaBunsik extends Bonsa {
	
	WangjaBunsik(String kimchi, String budae, String bibim, String sundae, String bab) {
		this.kimchi = kimchi;
		this.budae = budae;
		this.bibim = bibim;
		this.sundae = sundae;
		this.bab = bab;
	}
	
	@Override
	public void print() {
		System.out.println("주택가에 매장1호점");
		
	}
	
	@Override
	public void menu() {
		System.out.println("김치찌개 - " + kimchi);
		System.out.println("부대찌개 - " + budae);
		System.out.println("비빔밥 - " + bibim);
		System.out.println("순대국 - " + sundae);
		System.out.println("공기밥 - " + bab);
		System.out.println();
	}
}