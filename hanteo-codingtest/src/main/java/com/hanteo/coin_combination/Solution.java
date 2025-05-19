package com.hanteo.coin_combination;

import java.util.Arrays;

public class Solution {
	
	public int solution(int coins[], int sum) {
		Arrays.sort(coins);
		
		return dfs(coins, 0 , sum);
	}
	
	public int dfs(int[] coins, int index, int target) {
		if(target == 0) {
			return 1;
		}
		
		int count = 0;
		for(int i = index; i < coins.length; i++) {
			if(coins[i] <= target) {
				count += dfs(coins, i, target - coins[i]);
			}
		}
		return count;
	}
	
}
