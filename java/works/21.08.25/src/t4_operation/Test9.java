package t4_operation;

public class Test9 {
	public static void main(String[] args) {
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 100;
		
		
		boolean res1 = su1 == su2;
		boolean res2 = (su1 == su2);
		
		boolean res3 = su1 == su3;
		boolean res4 = (su1 == su3);
		
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println();
		
		
		boolean res5 = ((su1 == su2) || (su1 == su3));
		boolean res6 = ((su1 == su2) && (su1 == su3));
		boolean res7 = (!(su1 == su2) && (su1 == su3));
		
		System.out.println("(su1 == su2) || (su1 == su3) -> " + res5);
		System.out.println("(su1 == su2) && (su1 == su3) -> " + res6);
		System.out.println("!(su1 == su2) && (su1 == su3) -> " + res7);
		
		
		
	}
}
