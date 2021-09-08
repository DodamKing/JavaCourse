package t05_interface_exam;

public class Actor implements FireMan, Chef, PoliceMan {

	@Override
	public void catching() {
		System.out.println("범인을 잡습니다.");
	}

	@Override
	public void searching() {
		System.out.println("찾습니다.");
	}

	@Override
	public void cooking() {
		System.out.println("요리를 합니다.");
	}

	@Override
	public void makingFood() {
		System.out.println("음식을 조리 합니다.");
	}

	@Override
	public void fire() {
		System.out.println("불을 끕니다.");
	}

	@Override
	public void rescue() {
		System.out.println("구조를 합니다.");
	}

}
