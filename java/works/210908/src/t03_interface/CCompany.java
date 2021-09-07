package t03_interface;

public class CCompany extends Phone {
	@Override
	public String status() {
		return status;
	}

	@Override
	public String communite() {
		communite = "LTE";
		return communite;
	}

	@Override
	public String function() {
		remote = "기본 탑제";
		return remote;
	}

}
