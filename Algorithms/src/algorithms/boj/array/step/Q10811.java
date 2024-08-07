package algorithms.boj.array.step;

import java.util.Scanner;

public class Q10811 {
	//	도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다.
	//	바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다. 
	//
	//	도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다.
	//	도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
	//
	//	바구니의 순서를 어떻게 바꿀지 주어졌을 때,
	//	M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.
	
	//	input =
	//	5 4		1 2 3 4 5
	//	1 2		2 1 3 4 5
	//	3 4		2 1 4 3 5
	//	1 4		3 4 1 2 5
	//	2 2		3 4 1 2 5
	//	output = 3 4 1 2 5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] inputCase = sc.nextLine().split(" ");
		int[] buckets = new int[Integer.parseInt(inputCase[0])];
		int round = Integer.parseInt(inputCase[1]);
		
		for(int i=1; i<=buckets.length; i++) {
			buckets[i-1] = i;
		}
		
		for(int i=0; i<round; i++) {
			String[] inputCondition = sc.nextLine().split(" ");
			int startBucket = Integer.parseInt(inputCondition[0]) - 1;
			int endBucket = Integer.parseInt(inputCondition[1]) - 1;
			
			while(startBucket < endBucket) {
				int temp = buckets[startBucket];
				buckets[startBucket++] = buckets[endBucket];
				buckets[endBucket--] = temp;
			}
		}
		
		
		
		
		for(int i=0; i<buckets.length; i++) {
			System.out.print(buckets[i] + " ");
		}
	}
}
