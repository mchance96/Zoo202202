package model;

//added by Max Chance
//confirm that your course comment appears here

public class Zebra {
	private String name;
	private int age;

	public Zebra() {
		super();
	}

	public Zebra(String name, String color, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Zebra [name=" + name + ", age=" + age + "]";
	}

	public String makeNoise() {
		return "Bark & Yip!"; // I had to look it up
	}

}
