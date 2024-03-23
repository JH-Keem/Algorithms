package q1919;

import java.util.Scanner;

//	BOJ 1919번 문제
//	https://www.acmicpc.net/problem/1919

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		answer01(a, b);
		answer02(a, b);
	}

	//	1. 카운트 배열을 만들어, 각 문자열에 어떤 알파벳이 몇개있는지 찾아 두 문자열의 차이 계산하기
	public static void answer01(String a, String b) {
		int[] countA = new int[26];
		int[] countB = new int[26];
		
		for(int i=0; i<a.length(); i++) {
			countA[a.charAt(i) - 'a']++;
		}
		for(int i=0; i<a.length(); i++) {
			countB[b.charAt(i) - 'a']++;
		}
		
		int answer = 0;
		for(int i=0; i<26; i++) {
			if(countA[i] > countB[i]) {
				answer += countA[i] - countB[i];
			}else if(countB[i] > countA[i]) {
				answer += countB[i] - countA[i];
			}
		}
		System.out.println(answer);
	}
	
	//	2. 카운트 배열 만드는 메서드를 만들어 재사용하고, 두 문자열의 차이는 절대값을 이용하기
	public static int[] getAlphabetCount(String str) {
		int[] count = new int[26];
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i) - 'a']++;
		}
		return count;
	}
	
	public static void answer02(String a, String b) {
		int[] countA = getAlphabetCount(a);
		int[] countB = getAlphabetCount(b);
		
		int answer = 0;
		for(int i=0; i<26; i++) {
			answer += Math.abs(countA[i] - countB[i]);
		}
		System.out.println(answer);
	}
	
	
}
