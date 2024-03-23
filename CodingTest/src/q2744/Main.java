package q2744;

import java.util.Scanner;

//	BOJ 2744번 문제
//	https://www.acmicpc.net/problem/2744

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputMessage = sc.next();
		answer01(inputMessage);
		System.out.println();
		answer02(inputMessage);
		answer03(inputMessage);
	}
	
	//	ASCII Table을 이용해, 특정 문자가 어떤 숫자(십진수)로 표현되는지를 이용한다.
	//	(예 : 'A' = 65, 'Z' = 90 ...)
	//	('Z' = 'A') = 25
	
	public static void answer01(String str) {		
		//	1. 반복문을 돌려 대소문자 판별하기
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			//	2. 대문자면 'A'와의 수차이를 계산해서 'a'에 더하기
			if(ch >= 'A' && ch <= 'Z') {
				System.out.print((char)('a' + ch - 'A'));
			}
			else {
				//	3. 소문자면 'a'와의 수차이를 계산해서 'A'에 더하기
				System.out.print((char)('A' + ch - 'a'));
			}
		}
	}
	
	//	빈 문자열을 만들어 하나씩 추가하기
	//	단, 계속해서 새로운 인스턴스를 만드는 방식이라. 비효율적일 수 있음.
	public static void answer02(String str) {
		String answer = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				answer += (char)('a' + ch - 'A');
			}
			else {
				answer += (char)('A' + ch - 'a');
			}
		}
		System.out.println(answer);
	}
	
	// 문자열을 문자 배열로 바꿔 처리하기 "WrongAnswer" => ['W', 'o', 'r', 'n', ...]
	public static void answer03(String str) {
		char[] answer = str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				answer[i] = (char)('a' + ch - 'A');
			}
			else {
				answer[i] = (char)('A' + ch - 'a');
			}
		}
		System.out.println(answer);
	}
	
}

