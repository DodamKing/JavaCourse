package t03_interface;

public interface LunchMenu {
	int rice = 500;
	int bulgogi = 2000;
	int dubu = 1000;
	int guk = 1000;
	int yoplait = 800;
	int banana = 500;
	int milk = 500;
	int almond = 700;
	int[] price = {500, 2000, 1000, 1000, 800, 500, 500, 700};
	
	void howmuch(int price, String menu);
}
