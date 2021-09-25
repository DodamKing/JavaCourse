package user;

import java.util.regex.Pattern;

public class Check {
	public int check(User user) {
		if (user.getName() != null) {
			user.setName(user.getName().replaceAll("[^a-zA-Z가-힣]", ""));
		}
		if (user.getAddress() != null) {
			user.setAddress(user.getAddress().replaceAll("[^0-9a-zA-Z가-힣 ]", ""));
		}
		
		if (user.getMid() != null) {
			if (!Pattern.matches("^[0-9a-zA-Z]*$", user.getMid())) {
				return -2; // 잘못된 아이디
			}
		}
		
		if (user.getPassword() != null) {
			if (!Pattern.matches("^[0-9a-zA-Z]*$", user.getPassword())) {
				return -3; // 잘못된 비밀번호
			}
		}
		
		return -1; // 유효
	}
}
