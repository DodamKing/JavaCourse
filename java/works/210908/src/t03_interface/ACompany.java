package t03_interface;

public class ACompany implements Phone {
	String status, communite, remote;
	@Override
	public void status() {
		status = "가능";
	}

	@Override
	public void communite() {
		communite = "3G";
	}

	@Override
	public void function() {
		remote = "기본 미탑제";
	}

}
