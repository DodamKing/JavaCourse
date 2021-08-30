package t2_array;

public class Test10 {
	public static void main(String[] args) {
		int[] tab = {7, 10, 6, 8 , 5, 9};
		int temp;
		
		// 정렬 전의 자료
		System.out.println("정렬전");
		for (int i=0; i<tab.length; i++) System.out.print(tab[i] + "/ ");
		System.out.println();
		System.out.println();
		
		// 선택 정렬
		for (int i=0; i<tab.length-1; i++) { //숫자 맞추기 귀찮으니까 첨부터 끝까지 다 돌리자
			for (int j=i+1; j<tab.length; j++) { // 내부 반복문에서 배열에 첫번재는 고정이고 그다음 나머지들과 비교, 그 다음이므로 i+1, 끝까지 비교할꺼(길이)
				if (tab[i] > tab[j]) {
					temp = tab[i];
					tab[i] = tab[j];
					tab[j] = temp;
					
				}
			}
		}
		
		// 정렬 후의 자료
		System.out.println("정렬 후");
		for (int i=0; i<tab.length; i++) System.out.print(tab[i]+ "/ ");
		System.out.println();
		System.out.println();
		System.out.println("거꾸로 출력");
		for (int i=tab.length-1; i>=0; i--) System.out.print(tab[i] + "/ "); // reverse 사용하려면 숫자를 다 문자열로 바꿔야 함 
	}
}
