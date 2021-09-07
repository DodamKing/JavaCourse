package t02_interface;

public class RemoteRun {
	public static void main(String[] args) {
		Audio audio = new Audio();
		audio.swichOn("오디오");
		audio.setVoluem(20);
		audio.setVoluem(-5);
		audio.setVoluem(7);
		audio.swichOff();
		System.out.println("===========================");
		
		Tv tv = new Tv();
		tv.swichOn("티브이");
		tv.setVoluem(30);
		tv.setVoluem(-15);
		tv.setVoluem(8);
		tv.swichOff();
		System.out.println("===========================");
		
		Radio radio = new Radio();
		radio.swichOn("티브이");
		radio.setVoluem(11);
		radio.setVoluem(-11);
		radio.setVoluem(9);
		radio.swichOff();
		System.out.println("===========================");
	}
}
