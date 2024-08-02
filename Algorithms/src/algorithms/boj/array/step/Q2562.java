package algorithms.boj.array.step;

import java.util.Scanner;

public class Q2562 {
	//	9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
	//	예를 들어, 서로 다른 9개의 자연수
	//	3, 29, 38, 12, 57, 74, 40, 85, 61
	//	이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
	
	//	input =
	//	3
	//	29
	//	38
	//	12
	//	57
	//	74
	//	40
	//	85
	//	61

	//	output =
	//	85
	//	8
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] inputArr = new int[9];
		int max = 0;
		int num = -1;
		for(int i=0; i<9; i++) {
			inputArr[i] = Integer.parseInt(sc.nextLine());
			if(inputArr[i] > max) {
				max = inputArr[i];
				num = i;
			}
		}
		
		System.out.println(max);
		System.out.println(num + 1);
	}
}
