package q1157;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		
		int[] countStr = getAlphabetCount(str);
		
		int maxCount = -1;
		char maxAlphabet = '?';
		for(int i=0; i<26; i++) {
			if(countStr[i] > maxCount) {
				maxCount = countStr[i];
				maxAlphabet = (char)('A' + i);
			}
			else if(countStr[i] == maxCount) {
				maxAlphabet = '?';
			}
		}

		System.out.println((char)(maxAlphabet));
	}

	public static int[] getAlphabetCount(String str) {
		int[] count = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i) - 'A']++;
		}
		
		return count;
	}
}