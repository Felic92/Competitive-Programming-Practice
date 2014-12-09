// Problem: Opposite Tasks 
// Author: Michael Feliciano
// Goal: Given two numbers divide them in to groups no greater than 10. 
// Any valid division will work

// Approach: Read in N check if it is <= 10 if so we are safe to print n 0
// if it is greater than 10 we are safe to print 10 n-10

// Difficulty: Beginner
// Tags: Basic Programming
// Problem Link: http://www.lightoj.com/volume_showproblem.php?problem=1001

#include <stdio.h>


int main(void){

	int numCases;
	scanf("%d", &numCases);

	for(int i = 0; i < numCases; i++){

		int N;
		scanf("%d", &N);

		if( N <= 10 ){
			printf("%d %d\n", N,0 );
		}else{
			printf("%d %d\n", 10, N-10 );
		}

	}	


}

