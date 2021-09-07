package t03_interface;

// 다양한 스마트폰의 원하는 스팩을 출력하시오.
// 이름(name)	전화 송/수신(status) 		통신상태(communite)	 	tv리모콘기능(function)
// ACompany 		가능						3G						기본 미탑재
// BCompany 		가능						4G						기본 탑재
// CCompany 		가능						LTE						기본 탑재
// DCompany 		가능						5G						기본 미탑재

public abstract class Phone {
	String status = "가능", communite, remote;
	
	public abstract String status();
	public abstract String communite();
	public abstract String function();
}
