package t02_interface;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public abstract void swichOn(String name);
	void swichOff();
	void setVoluem(int volume);
}
