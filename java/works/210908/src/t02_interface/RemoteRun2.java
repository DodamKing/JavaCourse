package t02_interface;

public class RemoteRun2 {
	public static void main(String[] args) {
//		Audio audio = new Audio();
//		audio.swichOn("오디오");
//		audio.setVoluem(20);
//		audio.setVoluem(-5);
//		audio.setVoluem(7);
//		audio.swichOff();
//		System.out.println("===========================");
//		
//		Tv tv = new Tv();
//		tv.swichOn("티브이");
//		tv.setVoluem(30);
//		tv.setVoluem(-15);
//		tv.setVoluem(8);
//		tv.swichOff();
//		System.out.println("===========================");
//		
//		Radio radio = new Radio();
//		radio.swichOn("티브이");
//		radio.setVoluem(11);
//		radio.setVoluem(-11);
//		radio.setVoluem(9);
//		radio.swichOff();
//		System.out.println("===========================");
		
		RemoteControl adioRc = new Audio();
		RemoteControl tvRc = new Tv();
		RemoteControl radioRc = new Radio();
		
		String[] title = {"오디오", "티브이", "라이오"};
		RemoteControl[] rc = {adioRc, tvRc, radioRc};
		
		for (int i=0; i<rc.length; i++) {
			int volume = (int) (Math.random()*20) + 0;
			System.out.println("명칭: " + title[i]);
			rc[i].swichOn(title[i]);
			rc[i].setVoluem(volume);
			rc[i].swichOff();
			System.out.println("---------------------");
		}
		System.out.println("작업끝");
	}
}
