package edu.saintjoe.cs.tcooper.dogbarktsc;

/*
 * class Dog
 * This is the Dog program from page 61 of the book
 * Programmed by Tyler Cooper March 16, 2016
 * This is straight from the book but I will be changing it
 */

public class Dog {
	
	//This value represents the dog's size as exhibited by it's weight
	private int weight;

	/*-------------------------------------------------*/
	public int getWeight() {
		return weight;
	}
	
	public void setSize (int s) {
		weight = s;
	}

void bark() {
	
	if (weight > 60) {
		System.out.println("Woof! Woof!");
	} else if (weight > 14) {
		System.out.println("Ruff! Ruff!");
	} else
		System.out.println("Yip! Yip!");
}
}

