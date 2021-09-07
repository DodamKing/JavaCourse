package t03_interface;

public class ACompany extends Phone {
	
	@Override
	public String status() {
		return status;
	}

	@Override
	public String communite() {
		communite = "3G";
		return communite;
	}

	@Override
	public String function() {
		remote = "기본 미탑제";
		return remote;
	}

}
