package t2_array;

public class Test11 {
	public static void main(String[] args) {
		int[] tab = {7, 10, 6, 8 , 5, 9};
		int temp;

		System.out.println("정렬전");
		for (int t : tab) System.out.print(t + ", ");
		
		// bubble sort
		for (int i=0; i<tab.length-1; i++) { // 총 길이 -1 회전
			for (int j=0; j<tab.length-1; j++) { // 1 회전당 길이 -1 수행
				if (tab[j] > tab[j+1]) { // 인접한 두 원소를 바꿈 j번째와 그 다음(j+1) 번째
					temp = tab[j];
					tab[j] = tab[j+1];
					tab[j+1] = temp;
				}
				
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("정렬후");
		for (int t : tab) System.out.print(t + ", ");
	}
}
