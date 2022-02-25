package main;

import domain.Cat;

public class Main {

	public static void main(String[] args) {
		
		
		Cat cat = Cat.newCat(5, "Ciki");
		System.out.println(cat.catRun());

	}

}
