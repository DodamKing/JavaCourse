package t3_final;

public class Test1 {
	static final String NATION = "kor";
	final String jumin;
	String name;
	
	Test1(String nation, String jumin, String name){
//		this.nation = nation;
		this.jumin = jumin;
		this.name = name;
		
	}
	
	void change(String nation, String jumin, String name) {
//		this.nation = nation;
//		this.jumin = jumin;
		this.name = name;
		
		System.out.println("국적: " + NATION);
		System.out.println("주민번호: " + this.jumin);
		System.out.println("성명: " + this.name);

	}
	
}
