package edu.saintjoe.cs.tcooper.dogbarktsc;

public class DogTestDrive {

	public static void main(String[] args) {
		Dog one = new Dog();
		
		one.setWeight(70);

		Dog two = new Dog();
		
		two.setWeight(8);
		
		System.out.println("Dog one: " + one.getWeight());
		
		System.out.println("Dog two: " + two.getWeight());
		
		one.bark();
		
		two.bark();
	}

}
