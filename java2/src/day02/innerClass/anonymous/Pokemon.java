package day02.innerClass.anonymous;

public abstract class Pokemon {
	String name;
	int age;
	int IV; // 종족값
	public Pokemon(String name, int age, int IV) {
		this.name = name;
		this.age = age;
		this.IV = IV;
	}
	
	public abstract void getInfo();
}
