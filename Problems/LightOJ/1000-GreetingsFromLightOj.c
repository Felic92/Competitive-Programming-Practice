// Problem: Greetings From LightOJ
// Author: Michael Feliciano
// Goal: Given two numbers....add them....

// Approach: Read in numbers and add them.

// Difficulty: Beginner
// Tags: Basic Programming
// Problem Link: http://www.lightoj.com/volume_showproblem.php?problem=1000 

#include<stdio.h>


int main(void){

	int numCases; 
	scanf("%d", &numCases);

	for(int i = 0; i < numCases; i++){

		int problemsA, problemsB; 
		scanf("%d %d", &problemsA, &problemsB);

		printf("Case %d: %d\n", (i+1), (problemsA+ problemsB));

	}

}

