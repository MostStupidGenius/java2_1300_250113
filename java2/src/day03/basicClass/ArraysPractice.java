package day03.basicClass;

import java.util.Arrays;

public class ArraysPractice {

	public static void main(String[] args) {
//		배열을 다루기 위한 기본 클래스
//		Arrays
//		모든 메서드가 static 메서드이기 때문에
//		객체화없이 모든 메서드를 사용해야 한다.
		int[] arrInt = new int[] {3, 5, 7};
//		.copyOf(배열, 개수)
//		원본 배열의 0번째 요소부터 개수-1번째 요소까지
//		그 값을 복사하여 새로운 배열을 만들어 반환한다.
//		이때, 개수의 값이 원본 배열의 길이보다 크다면
//		차이가 발생한 인덱스의 요소 값은
//		기본 값으로 들어간다.
		int[] newArr = Arrays.copyOf(arrInt, 5);
		for (int i : newArr) {
			System.out.println(i); // 3 5 7 0 0
		}
		
//		.copyOfRange(배열, 시작인덱스, 끝인덱스)
//		.copyOf()함수와 같지만, copyOf는 0부터였다면
//		.copyOfRange는 시작인덱스도 고를 수 있다.
//		* 끝인덱스는 포함하지 않는다.
		
		int[] arrInt2 = new int[] {1, 2, 3, 4, 5, 6, 7};
//		2번째부터 "마지막 요소까지"로 새로 만든 배열을 출력하고자 한다.
//		원본배열.length를 끝인덱스로 전달하여 길이-1번째 요소까지 가져오는 방법으로
//		마지막 요소를 가져올 수 있다.
		int[] arrInt2New = Arrays.copyOfRange(arrInt2, 2, arrInt2.length);
		for (int i : arrInt2New) {
			System.out.println(i);
		}
		System.out.println("=======.fill()======");
//		.fill(원본배열, 초기화값)
//		원본배열의 모든 요소의 값을 두번째 인수로 전달한 값으로 채워넣는다.
		arrInt2 = new int[] {1, 2, 3, 4, 5, 6, 7};
//		두번째 인수로 10을 넣었기 때문에 
//		모든 요소가 10으로 채워진 배열로 바뀐다.
//		주의: 원본배열을 직접 수정한다.
//		(새로운 배열을 만들어내는 것이 아니다.)
		Arrays.fill(arrInt2, 10);
		for (int i : arrInt2) {
			System.out.println(i);
		}
		
		System.out.println("====sort()====");
//		.sort(원본배열)
//		전달한 원본배열을 오름차순으로 정렬한다.
//		주의: 원본배열을 직접 수정하는 것이기 때문에
//		주의가 필요하다.
		arrInt2 = new int[] {6, 1, 7, 3, 6, 2, 9};
//		정렬을 시행한다.
		Arrays.sort(arrInt2);
//		값을 확인한다.
		for (int i : arrInt2) {
			System.out.println(i); // 1, 2, 3, 6, 6, 7, 9
		}
		
//		Arrays.asList()
//		전달한 값들, 객체들을 요소로 하는 List 객체 반환 
	}

}
