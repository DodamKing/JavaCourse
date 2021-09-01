package t1_class;

public class Test5Imsi {
	int kor, eng, mat;
	String name = "관리자";
//	public Test5() {}
	
	Test5Imsi(int kor){
		this(kor, 0, 0);
	}
	
	Test5Imsi(int kor, int eng){
		this(kor, eng, 0);
	}
	
	Test5Imsi(int kor, int eng, int mat){
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	Test5Imsi(String name){
		this(0, 0, 0);
		this.name = name;
	}
}
