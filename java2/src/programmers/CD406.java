package programmers;

public class CD406 {

	public static void main(String[] args) {
//		A씨는 게시판 프로그램을 작성하고 있다.
//https://codingdojang.com/scode/406?answer_mode=hide
//		A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 총 페이지수를 리턴하는 프로그램이 필요하다고 한다.
//
//		입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
//		출력 : 총페이지수
//
//		A씨가 필요한 프로그램을 작성하시오.
		System.out.println();
		
		
		
//		0	1	0
		System.out.println(getTitles(0, 1) == 0);
//		1	1	1
		System.out.println(getTitles(1, 1)==1);
//		2	1	2
		System.out.println(getTitles(2, 1)== 2);
//		1	10	1
		System.out.println(getTitles(1, 10) == 1);
//		10	10	1
		System.out.println(getTitles(10, 10) == 1);
//		11	10	2
		System.out.println(getTitles(11, 10) == 2);
		
		
	}
	
	static int getTitles(int m, int n) { // n >= 1
		int result = 0;
		result = m / n + (m % n > 0 ? 1 : 0);
		return result;
	}
	
	
	
	

}
