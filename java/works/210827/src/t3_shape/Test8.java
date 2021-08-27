package t3_shape;

//    * 
//   ** 
//  *** 
// ****
//*****

public class Test8 {
	public static void main(String[] args) {

		for (int i=1; i<6; i++) {
			for (int j=1; j<=5-i; j++) {
				System.out.print(" ");				
			}
			for (int k=1; k<=i; k++) {
				System.out.print("*");
				}
			
			System.out.println();
		}
		
	}
}
