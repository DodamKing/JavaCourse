package t02_interface;

public class Audio implements RemoteControl {

	String name;
	int volume;
	
	@Override
	public void swichOn(String name) {
		this.name = name;
		System.out.println(name + " 전원을 켭니다.");
	}

	@Override
	public void swichOff() {
		System.out.println(name + " 전원을 끕니다.");
	}

	@Override
	public void setVoluem(int volume) {
		if (volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}
		else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재" + name + "의 볼륨은 " + this.volume + " 입니다.");
	}
	
}
