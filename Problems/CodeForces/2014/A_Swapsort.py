# Problem: A_SwapSort
# Author: Michael Feliciano
# Goal: Sort an array of n integers in at most n swaps. Report consecutive swaps# that need to be made to reach a sorted state. 

# Approach: We are not trying to find the minimum number of swaps, which makes
# things easier. The approach I took was similar to selection sort. I used two
# nested loops so that the outer loop declared a current value and the inner
# loop checked values occuring after that current to find the minimum. Once the
# minimum was found it was swapped with the min with the current value and
# advanced by one.  

# Difficulty: Easy
# Tags: Implementation, Sorting
# Problem Link: http://codeforces.com/problemset/problem/489/A

def main():

	numElements = int(raw_input())
	elements = map(int,raw_input().split())
	
	swaps = solve(elements)

	print len(swaps)
	for i in range(len(swaps)):
		print swaps[i][0],swaps[i][1]

def solve(elements):

	swaps = []
	
	for i in range(len(elements)):
		minimum = elements[i]
		minIdx = i

		for j in range(i+1,len(elements)):

				if(minimum > elements[j]):
					minimum = elements[j]
					minIdx = j
	
		if(minIdx != i):
			elements[i],elements[minIdx] = elements[minIdx],elements[i]
			swaps.append([i,minIdx])

	return swaps


main()
