 package t1_sample;

public class Test1 {
	public static void main(String[] args) {
		
		double a = Math.random();
		int b = (int) (a * 10);
		System.out.println(b);
		
		System.out.print("0~9 까지의 난수 : ");
		System.out.println((int) (Math.random() * 10));
		System.out.println();
		
		System.out.print("1~10 까지의 난수 : ");
		System.out.println((int) ((Math.random() * 10))+1);
		System.out.println("-------------------------------------");
		
		System.out.print("1~45 까지의 난수 : ");
		for (int i=0; i<6; i++) {
			
			System.out.print((int) ((Math.random() * 45))+1 + "/");
		}
		System.out.println();
		
	}
}
