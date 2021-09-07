package t01_abstract;

public class Run2 {
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
		System.out.println();
		
		Animal animalDog = new Dog();
		animalDog.sound();
		animalDog.move("강아지");
		System.out.println();
		
		Animal animalCat = new Cat();
		animalCat.no = 500;
		animalCat.sound();
		animalCat.move("고양이");
		System.out.println();
		
	}
}
