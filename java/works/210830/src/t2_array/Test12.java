package t2_array;

// 랭킹
public class Test12 {
	public static void main(String[] args) {
		int[] tab = {70, 100, 60, 80 , 50, 100};
		int[] rank = {1, 1, 1, 1, 1, 1};

		for (int i=0; i<tab.length; i++) { // 모두 다 비교 첫번째 원소랑
			for (int j=0; j<tab.length; j++) { // 모든 원소랑 비교 
				if (tab[i] < tab[j]) rank[i]++; // 작은 것의 랭킹을 +1
			}
		}
		System.out.println("원본자료: 순위");
		for (int i=0; i<tab.length; i++) System.out.print(tab[i] + ": " + rank[i]+ "등\n");
	}
}
