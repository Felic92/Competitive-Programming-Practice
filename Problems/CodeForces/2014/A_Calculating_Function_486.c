// Problem: A. Calculating Function - Codeforces Round 486
// Author: Michael Feliciano
// Goal: Given an input N determine the output of the function below
// f(n) = -1 + 2 + -3 + ... + ((-1)^n)*n

//Approach: My first thought was to brute force but a quick look at the values
// n can take on (1 <= n <= 10^15) and a time limit of 1 second hint that this
// is not a feasible solution. Recalling previous experience with problems
// involving sequences and series my next step was to plug in the values 1-10
// to see if there was an obvious pattern. Luckily there was and I derived simple
// rules to mathematically calculate the solution given  n.

// The pattern of resulting values showed that if n was even the result would
// be n/2. Additionally if n was negative the result would be ((n+1)/2) * -1.

// **Dos Equis Guy Voice**
// I don't always code in C, but when I do I make sure the problem is really easy :)

//Difficulty: Easy
//Tags: Math 
//Problem Link: http://codeforces.com/problemset/problem/486/A 

//Additional Note: I am no expert in C but I was originally reading in n
// using %lld because the value could go up to 10^15 but the judge wouldn't 
// let me submit this and recommened I change %lld to %I64d it appears to have worked  


#include <stdio.h>

int main(){

	long long n;

	scanf("%I64d",&n);

	if(n % 2 == 0){
		printf("%I64d\n",n/2);
	}else{
		printf("%I64d\n", -1 * ((n+1)/2) );
	}
		
	return 0;
}

