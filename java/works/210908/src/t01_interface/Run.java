package t01_interface;

public class Run {
	public static void main(String[] args) {
		Audio audio = new Audio();
		System.out.println("최대 볼륨: " + audio.MAX_VOLUME);
		System.out.println("최소 볼륨: " + audio.MIN_VOLUME);
		
		audio.swichOn("선풍기");
		audio.swichOff();
	}
}
