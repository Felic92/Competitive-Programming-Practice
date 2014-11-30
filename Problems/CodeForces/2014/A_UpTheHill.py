# Problem: A Up The Hill
# Author: Michael Feliciano
# Goal: Given 2 integers A (up) and B (down) create a sequence using integers
# [1,(a+b)+1] such that the sequence has A increasing transitions between values
# and B decreasing transitions between values. Additionally, all values should 
# be distinct

# Approach: While I imagine their are many feasible approaches to consistently 
# generating a sequence which meet the requirements I will only outline the one
# that came to me first. I start by generating all numbers [1,(a+b+1)]. I then
# store the first [0:up] values in another list and delete them from the 
# original. I then reverse the remaining values in the original list. Finally
# I append the first [0:up] values I removed to the new list. This as far as 
# I can tell always generate a valid sequence. 

# Difficulty: Easy
# Tags: Implementation
# Problem Link http://codeforces.com/problemset/problem/491/A

def main():

	upDays = int(raw_input())
	downDays = int(raw_input())

	print solve(upDays,downDays)


def solve(up,down):
	
	heights = range(1,up+down+2)

	increasing = heights[0:up+1]

	del heights[0:up+1]

	decreasing = heights[::-1]

	return " ".join(map(str,decreasing + increasing))
	
main()


