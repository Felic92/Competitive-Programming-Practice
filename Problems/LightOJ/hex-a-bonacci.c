// Problem:  Hex-a-bonacci
// Author: Michael Feliciano
// Goal: "Optimize" some given C code to give correct results for inputs

// Approach: I started generating values for the sequence by hand to verify that
// each consecutive element is just the sum of its 6 predecessors this was correct.
// The real trouble with this problem is that it is that with each call it is making
// 6 more recursive calls. This isn't so bad if the n is small but if n is large
// (1<= n <= 10000) your number of calls can grow very large very fast 6^n on even
// small numbers isn't pretty. The trick is to avoid repetitive recalculation
// by storing previously computed values this is what we use our memo table for.
// Given an N we compute and store value by value until we reach the desired location
// computing each individual number now becomes a near constrant time operation and overall
// complexity scales with N. Another things that got me is that dispite what I initally believed
// about the first 6 values from input being small aparently they are not. I only got AC after
// changing my code to mod these input values by 10000007 as I was reading them in. 

// Difficulty: Easy
// Tags: Basic Dynamic Programming, Modular Arithmatic
// Problem Link: http://www.lightoj.com/volume_showproblem.php?problem=1006

#include <stdio.h>

#define MOD 10000007
#define TABLESIZE 10005

int main(void){
	
	int n, cases, caseNum = 0;

	long long memo[TABLESIZE];

	scanf("%d", &cases);

	while(cases--){

		for(int i = 0; i < 6; i++){
			scanf("%lld", &memo[i]);
			memo[i] = memo[i] % MOD;
		}

		scanf("%d", &n);

		for(int j = 6; j <= n; j++){
			memo[j] = (memo[j-1] + memo[j-2] + memo[j-3] + memo[j-4] + memo[j-5] + memo[j-6]) % MOD;
		}

        printf("Case %d: %lld\n", ++caseNum, memo[n]);
	}
}



