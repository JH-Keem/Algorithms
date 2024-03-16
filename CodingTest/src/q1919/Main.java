package q1919;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		// 카운트 배열 !
		int[] countA = getAlphabetCount(a);
		int[] countB = getAlphabetCount(b);

		int ans = 0;
		
		for(int i=0; i<26; i++)
		ans += Math.abs(countA[i] - countB[i]);
/*		{
			if(countA[i] > countB[i]) {
				ans += countA[i] - countB[i];
			}else if(countB[i] > countA[i]) {
				ans += countB[i] - countA[i];
			}
		}
*/
		System.out.println(ans);
	}
	
	public static int[] getAlphabetCount(String str) {
		int[] count = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i) - 'a']++;
		}
		
		return count;
	}
}
