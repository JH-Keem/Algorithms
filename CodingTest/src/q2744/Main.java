package q2744;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		for(int i=0; i<inputString.length(); i++) {
			if('A'<=inputString.charAt(i) && inputString.charAt(i)<='Z') {
				System.out.print((char)('a' + inputString.charAt(i) - 'A'));
			}else {
				System.out.print((char)('A' + inputString.charAt(i) - 'a'));
			}
		}
	}
}

