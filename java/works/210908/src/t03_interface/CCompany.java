package t03_interface;

public class CCompany implements Phone {
	String status, communite, remote;
	@Override
	public void status() {
		status = "가능";
	}

	@Override
	public void communite() {
		communite = "LTE";
	}

	@Override
	public void function() {
		remote = "기본 탑제";
	}

}
