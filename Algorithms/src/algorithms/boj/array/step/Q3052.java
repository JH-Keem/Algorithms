package algorithms.boj.array.step;

import java.util.Scanner;

public class Q3052 {
	//	두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
	//	수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] moduleNums = new boolean[42];
		
		for(int i=0; i<10; i++) {
			moduleNums[Integer.parseInt(sc.nextLine()) % 42] = true;
		}
		
		int answer = 0;
		for(int i=0; i<42; i++) {
			if(moduleNums[i]) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}
}
