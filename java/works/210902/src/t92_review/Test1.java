package t92_review;

// 생성자와 메소드를 이용하여 숫자맞추기 게임을 만드세요.
// 객체를 생성할 때  1~99까지의 난수를 발생, 실행 클래스에서 숫자를 맞춘다.
public class Test1 {
	int answer; 
	static int cnt=0;
	
	Test1(int answer){
		this.answer = (int) (Math.random()*99) + 1; 
	}
	
	boolean game(int guess) {
		cnt++;
		if (cnt < 5) {
			if (answer == guess) {
				System.out.printf("입력한 수: %d, 시도횟수: %d\n", guess, cnt);
				System.out.println("정답입니다.");
				System.out.println();
				return false;
			}
			else if (answer > guess) {
				System.out.printf("입력한 수: %d, 시도횟수: %d\n", guess, cnt);
				System.out.println("더 큰수 입니다.");
				System.out.println();
				return true;
			}
			else if (answer < guess) {
				System.out.printf("입력한 수: %d, 시도횟수: %d\n", guess, cnt);
				System.out.println("더 작은 수입니다.");
				System.out.println();
				return true;
			}
			else {
				System.out.println("잘못된 입력값 입니다.");
				System.out.println();
				cnt--;
				return true;
			}
		}
		else if (cnt == 5) {
			if (answer == guess) {
				System.out.printf("입력한 수: %d, 시도횟수: %d\n", guess, cnt);
				System.out.println("정답입니다.");
				System.out.println();
				return false;
			}
			else {
				System.out.printf("입력한 수: %d, 시도횟수: %d\n", guess, cnt);
				System.out.println("틀렸습니다.");
				System.out.println("시도횟수를 초과하였습니다.");
				return false;
			}
		}
		else {
			return false;
		}
	}
}
