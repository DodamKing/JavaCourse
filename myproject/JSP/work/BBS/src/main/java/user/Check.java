package user;

import java.util.regex.Pattern;

public class Check {
	public int check(User user) {
		user.setName(user.getName().replaceAll("[^a-zA-Z가-힣]", ""));
		user.setAddress(user.getAddress().replaceAll("[^0-9a-zA-Z가-힣 ]", ""));
		
		if (!Pattern.matches("^[0-9a-zA-Z]*$", user.getMid())) {
			return -2; // 잘못된 아이디
		}
		
		else if (!Pattern.matches("^[0-9a-zA-Z]*$", user.getPassword())) {
			return -3; // 잘못된 비밀번호
		}
		
		return -1; // 유효
	}
}
