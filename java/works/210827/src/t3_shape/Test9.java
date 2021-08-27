package t3_shape;

//*****
// ****
//  *** 
//   ** 
//    * 

public class Test9 {
	public static void main(String[] args) {

		for (int i=1; i<6; i++) {
			for (int j=1; j<=i-1; j++) {
				System.out.print(" ");				
			}
			for (int k=1; k<=6-i; k++) {
				System.out.print("*");
				}
			
			System.out.println();
		}
		
	}
}
