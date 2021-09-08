package t06_interface_exam;

// 연령별 장난감에 대한 각각의 기능을 알아보는 프로그램
// 마징가, 비행기 4세 이상만 사용가능/ 곰돌이 모두 사용 가능
// 장난감		미사일발사기능		불빛발사기능		팔다리움직임기능
// 곰돌이			X				X				O
// 마징가			O				X				O
// 비행기			O				O				X
public class ToyRun {
	public static void main(String[] args) {
		Bear bear = new Bear();
		System.out.println("장난감\t미사일발사기능\t불빛발사기능\t팔다리움직임기능");
		System.out.printf("%s\t\t%c\t\t%c\t\t%c", bear.name, bear.misaile(), bear.light(), bear.misaile());
	}
}
