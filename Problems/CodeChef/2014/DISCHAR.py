# Problem: Distinct Character Subsequence (DISCHAR)
# Author: Michael Feliciano
# Expected Completicty per case: O(N)
# Goal: Print the size of the largest distinct sub sequence 


#Good test case
# abbcddef    result : 6


# Playing code golf because why not :p

for i in range(int(raw_input())):
	print(len(set(raw_input())))


#import string

#numCases = int(raw_input())

#for i in range(numCases):
#	solution = 0
#	seq = raw_input()
#	for letter in string.ascii_lowercase:
#		if(letter in set(seq)):
#			solution+=1

#	print solution



