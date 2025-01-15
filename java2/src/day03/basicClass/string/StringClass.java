package day03.basicClass.string;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
//		문자열 클래스에 존재하는 여러 메서드
//		1. 특정 인덱스에 존재하는 문자 추출하기
//		.charAt(int)
		String str1 = "Hello World";
//		char exportChar = str1.charAt(6);
//		System.out.println(exportChar);
//		2. 해당 문자열의 총 길이를 반환한다.
//		.length()
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i) + " ");
		}
		
//		문자열의 모든 문자를 char[]로 추출할 수 있다.
//		str1.chars();
		char[] chars = new char[str1.length()];
		for (int i = 0; i < str1.length(); i++) {
			chars[i] = str1.charAt(i);
		}
		
//		3. 두 문자열의 사전순 비교
//		.compareTo(String)
		String str2 = "apple";
		String str3 = "banana"; 
		System.out.println(str2.compareTo(str3));// -1
		// 첫번째 문자열의 첫글자(char)에서 두번째 문자열의 첫글자를
		// 뺀 값을 확인하여 0이라면 두번째 글자를 비교하고
		// 다르다면 그 값을 반환하는 것이다.
		// 첫번째 문자열이 알파벳순서상 먼저 나오는 알파벳이라면
		// 아스키코드 상에서 더 작은 숫자이므로
		// 음수가 나온다.
		
//		4. 문자열 연결
//		.concat(String)
//		첫번째 문자열과 두번째 문자열을 연결하여
//		새로운 문자열을 생성하는 함수
		
//		5. 찾는 문자가 처음으로 등장하는 인덱스 반환
//		.indexOf(char|String)
//		전달받은 문자 혹은 문자열이 첫번째 문자열에서
//		처음으로 발견되는 인덱스를 반환한다.
		System.out.println("Hello to Hell".indexOf("Hell"));
		System.out.println("Hello to Hell".indexOf(" Hell"));
		String text = "happy together";
		String result = slice(text, "to", 11);
		System.out.println(result);
		
//		6. 문자열의 앞뒤 공백문자(줄바꿈, 탭문자 포함)를 제거
//		trim() java 8 이하 버전(legacy)
//		호환성을 위해서 알아만 두자.
//		20번째 아스키코드까지의 공백문자를 제거한다.
		String asciiStr = "\0\1\2\t\3\21\22\31\13\32Hello \4World\5\6\7\n";
		System.out.println(asciiStr);
		System.out.println(asciiStr.trim());
		
//		strip() java 11이상
//		20번까지 외에도 존재하는 공백문자를 모두 제거할 수 있는
//		최신형 함수다.
		
//		7. 문자열을 모두 대문자 혹은 소문자로 바꾸는 기능
//		.toLowerCase() -> 모두 소문자로
//		.toUpperCase() -> 모두 대문자로
		String caseStr = "HELLO world\n";
		System.out.println(".toLowerCase() => "+caseStr.toLowerCase());
		System.out.println(".toUpperCase() => "+caseStr.toUpperCase());
		
//		8. 문자열을 전달한 정수만큼 반복하는 기능
//		.repeat(int)
		System.out.println(caseStr.repeat(3));
		
	}
	
	public static String slice(String text, String target, int end) {
		String result = "";
//		====================
//		target이 등장한 인덱스부터 end까지 추출
//		1. target이 처음으로 등장하는 인덱스를 추출
		int start = text.indexOf(target);
		
//		문자열의 문자를 배열로 추출할 배열 선언
		char[] textChar = exportChars(text);
		
//		문자 배열에서 start(to가 처음 등장한 인덱스)부터
//		마지막 요소(end 문자열 마지막 인덱스)까지 추출
		char[] exportChar = Arrays.copyOfRange(textChar, start, end);
//		추출한 문자들을 하나의 문자열로 담기 위해 변수 선언
		for (char c : exportChar) {
			result += c;
		}
		
//		target이 처음 등장한 순간부터 end-1번째 문자열까지를 추출한 값
//		System.out.println(exportText);
		
//		====================
		return result;
	}
	
	
	// 문자열을 전달하면 문자 배열로 반환하는 함수
	public static char[] exportChars(String text) {
		char[] result = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			// 추출한 문자를 배열에 담는 부분
			result[i] = text.charAt(i);
		}
		return result;
	}
	
	
	

}
