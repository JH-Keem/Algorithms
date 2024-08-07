package algorithms.boj.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q3003 {
	//	동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다.
	//	체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다.
	//	하지만, 검정색 피스는 모두 있었으나, 흰색 피스는 개수가 올바르지 않았다.
	//	체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
	//	동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
	
	//	킹, 퀸, 룩, 비숍, 나이트, 폰 갯수
	//	input = 0 1 2 2 2 7
	//	output = 1 0 0 0 0 1
	
	//	input = 2 1 2 1 2 1
	//	output = -1 0 0 1 0 7
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] need = {1, 1, 2, 2, 2, 8};
		int[] inputArr = new int[6];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");;
		for(int i=0; i<inputArr.length; i++) {
			inputArr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<inputArr.length; i++) {
			bw.write((need[i] - inputArr[i]) + " ");
			bw.flush();
		}
		br.close();
		bw.close();
	}
}
