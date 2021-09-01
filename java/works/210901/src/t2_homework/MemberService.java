package t2_homework;

public class MemberService {
	String id, password;
	
	boolean login(String id, String password) {
		if (id.equals("hong")) {
			if (password.equals("12345")) return true;
			else return false;
		}
		else return false;
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
