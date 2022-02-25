package domain;

import util.CatUtil;

public class Cat implements CatUtil{

	private final int age;
	private final String name;
	
	private Cat(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public static Cat newCat(int age, String name) {
		return new Cat(age,name);
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Cat [age=" + age + ", name=" + name + "]";
	}

	@Override
	public String catRun() {
		return "This cat runs at speed of " + (age-2) * 1.5 + " km/h";
	}
	
}
