package day06.MVC.model;


// MVC 패턴 중 model은 다루고자 하는 데이터를
// 자바의 클래스로 구현해놓은 것을 의미한다.
public class Student {
	private String name;
	private int age;
	private int studentId;
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
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	// getter, setter를 이용해서만
	// 멤버 변수에 접근할 수 있도록 설정한다.
	// alt + shift +s => 게터 세터 자동으로 만들기
}
