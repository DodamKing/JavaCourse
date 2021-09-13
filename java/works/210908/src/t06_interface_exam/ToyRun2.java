package t06_interface_exam;

import java.util.InputMismatchException;
import java.util.Scanner;

// 연령별 장난감에 대한 각각의 기능을 알아보는 프로그램
// 마징가, 비행기 4세 이상만 사용가능/ 곰돌이 모두 사용 가능
// 장난감		미사일발사기능		불빛발사기능		팔다리움직임기능
// 곰돌이			X				X				O
// 마징가			O				X				O
// 비행기			O				O				X
public class ToyRun2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int no, age, sb = 0;
		Bear bear = new Bear();
		Mazinga mazinga = new Mazinga();
		Plane plane = new Plane();
		
		while (sb == 0) {
			try {
				System.out.print("안녕하세요. 사용자의 정보를 입력 받습니다. 나이를 입력해 주세요> ");
				age = scanner.nextInt();
				while (true) {
					if (age < 0) System.out.println("나이 정보가 잘못 되었습니다. 다시 입력해주세요.\n");
					else if (age < 4) {
						System.out.println("======================================================");
						System.out.println("정보를 보고 싶은 장난감을 고르세요.");
						System.out.println("-------------------------------------------------------");
						System.out.println("1.곰돌이 | 9. 돌아가기 | 0.프로그램종료 |");
						System.out.printf("선택> ");
						no = scanner.nextInt();
						System.out.println("======================================================");
						
						if (no == 0) {
							sb = 1;
							break;
						}
						else if (no == 9) break;
						else if (no == 1) {
							System.out.println("장난감\t미사일발사기능\t불빛발사기능\t팔다리움직임기능");
							System.out.printf("%s\t     %c\t\t    %c\t\t    %c\n\n", bear.name, bear.misaile(), bear.light(), bear.move());
						}
						else System.out.println("번호를 잘못 입력하였습니다. 다시 입력하세요.");
					}
					else if (age >= 4 ) {
						System.out.println("===================================================================");
						System.out.println("정보를 보고 싶은 장난감을 고르세요.");
						System.out.println("-------------------------------------------------------------------");
						System.out.println("1.곰돌이 | 2.마징기 | 3.비행기 | 4.전품목 | 9. 돌아가기 | 0.프로그램종료");
						System.out.printf("선택> ");
						no = scanner.nextInt();
						System.out.println("====================================================================");
						
						if (no == 0) {
							sb = 1;
							break;
						}
						else if (no == 9) break;
						else if (no == 1) {
							System.out.println("장난감\t미사일발사기능\t불빛발사기능\t팔다리움직임기능");
							System.out.printf("%s\t     %c\t\t    %c\t\t    %c\n", bear.name, bear.misaile(), bear.light(), bear.move());
							System.out.println();
						}
						else if (no == 2) {
							System.out.println("장난감\t미사일발사기능\t불빛발사기능\t팔다리움직임기능");
							System.out.printf("%s\t     %c\t\t    %c\t\t    %c\n", mazinga.name, mazinga.misaile(), mazinga.light(), mazinga.move());
							System.out.println();
						}
						else if (no == 3) {
							System.out.println("장난감\t미사일발사기능\t불빛발사기능\t팔다리움직임기능");
							System.out.printf("%s\t     %c\t\t    %c\t\t    %c\n", plane.name, plane.misaile(), plane.light(), plane.move());
							System.out.println();
						}
						else if (no == 4) {
							System.out.println("장난감\t미사일발사기능\t불빛발사기능\t팔다리움직임기능");
							System.out.printf("%s\t     %c\t\t    %c\t\t    %c\n", bear.name, bear.misaile(), bear.light(), bear.move());
							System.out.printf("%s\t     %c\t\t    %c\t\t    %c\n", mazinga.name, mazinga.misaile(), mazinga.light(), mazinga.move());
							System.out.printf("%s\t     %c\t\t    %c\t\t    %c\n", plane.name, plane.misaile(), plane.light(), plane.move());
							System.out.println();
						}
						else System.out.println("번호를 잘못 입력하였습니다. 다시 입력하세요.");
					}
				}
			}
			catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다.");
				scanner = new Scanner(System.in);
			}
		}
			System.out.println("프로그램을 종료합니다.");
			scanner.close();
	}
}
