package t8_hwk;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire(); //SnowTire 호출
		Tire tire = snowTire; 
		
		snowTire.run(); // SnowTire의 run 메소드
		tire.run(); 
	}
}
