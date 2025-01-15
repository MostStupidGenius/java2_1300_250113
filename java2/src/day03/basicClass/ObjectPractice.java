package day03.basicClass;

public class ObjectPractice {

//	Object 클래스로부터 상속받은 메서드들
//	1. .equals()
//	전달받은 객체와 현재 객체가 같은 주소값을 가졌는지를 반환하는 함수
//	"같은 주소값" == "같은 객체" == "같은 객체를 참조하고 있다"
//	String 자료형에 담긴 문자열의 내용이 같은지 확인할 때
//	사용해왔다
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

//	변경 불가능한 값에 대해 그 고유한 값을 hashCode라고 한다.
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public String toString() {
//		return super.toString();
		return "" + this.hashCode();
	}

	public static void main(String[] args) {
//		모든 클래스는 명시적으로 다른 클래스를 상속받는 게 아니라면
//		최상위 클래스인 Object를 자동으로 상속받는다.
//		이러한 최상위 클래스 Object에는 모든 클래스가
//		사용할 수 있는 메서드가 몇 가지 존재한다.
		ObjectPractice o = new ObjectPractice();
//		String과 new
//		String 타입의 값은 new를 쓰면 새로운 주소값을 생성한다.
//		하지만 new 없이 큰따옴표""만으로 값을 만들어 사용하면
//		같은 방식으로 만든 문자열은 같은 문자열 주소를 가리키게 된다.
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");

//		str1과 2를 비교해본다.
//		== 비교
		System.out.println(str1 == str2); // true
//		.equals()로 비교
		System.out.println(str1.equals(str2)); // true

//		str1과 3를 비교해본다.
//		== 비교
		System.out.println(str1 == str3); // false
//		.equals()로 비교
		System.out.println(str1.equals(str3)); // true

//		이를 통해 알 수 있는 것
//		== -> 참조변수에 대해서는 
//			같은 주소값을 가지고 있는지 확인하는 것
//		.equals() -> 그 문자열 값이 같은지 확인한다.
		System.out.println("hashcode: " + str1.hashCode());
		System.out.println("toSting(): " + o);
	}

}
