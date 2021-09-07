package t03_interface;

public class SpecRun {
	public static void main(String[] args) {
		Phone a = new ACompany();
		Phone b = new BCompany();
		Phone c = new CCompany();
		Phone d = new DCompany();
		Phone[] phones = {a, b, c, d};
		String[] name = {"ACompany", "BCompany", "CCompany", "DCompany"};
		
		System.out.println("스마트폰의 스팩");
		System.out.println("이름\t\t전화 송/수신\t통신상태\ttv리코콘 기능");
		System.out.println("========================================================");
		for (int i=0; i<phones.length; i++) {
			System.out.printf("%s\t%s\t\t%s\t%s\n", name[i], phones[i].status(), phones[i].communite(), phones[i].function() );
		}
	}
}
