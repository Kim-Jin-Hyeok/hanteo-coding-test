package com.hanteo.coin_combination;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		
//		int[] coins = {1,2,3};
//		int sum = 4;
		int[] coins = {2,5,3,6};
		int sum = 10;
		
		int answer = solution.solution(coins, sum);
		
		System.out.println(answer);

	}

}
