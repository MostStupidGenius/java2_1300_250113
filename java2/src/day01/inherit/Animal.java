package day01.inherit;

public class Animal {
//	이름, 나이, 성별
	String name;
	int age;
	String gender;
	
	public Animal() {;}
	
	public Animal(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void bark() {
		System.out.println("동물은 입으로 소리내어 웁니다.");
	}

}
