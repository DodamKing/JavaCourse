package t01_abstract;

public class Run {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.no = 100;
		dog.sound();
		dog.move("강아지");
		System.out.println();
		
		Cat cat = new Cat();
		cat.no = 200;
		cat.sound();
		cat.move("고양이");
	}
}
