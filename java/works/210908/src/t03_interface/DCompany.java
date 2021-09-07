package t03_interface;

public class DCompany extends Phone {
	@Override
	public String status() {
		return status;
	}

	@Override
	public String communite() {
		communite = "5G";
		return communite;
	}

	@Override
	public String function() {
		remote = "기본 미탑제";
		return remote;
	}

}
