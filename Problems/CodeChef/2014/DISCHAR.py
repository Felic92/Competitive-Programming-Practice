# Problem: Distinct Character Subsequence (DISCHAR)
# Author: Michael Feliciano
# Goal: Print the size of the largest distinct sub sequence 


#Difficulty: Easy
#Tags: Greedy
#Problem Link: http://www.codechef.com/NOV14/problems/DISCHAR/ 

#Good test case
# abbcddef    result : 6

# Adjusted Summary: It seems that the solution might just be the number of 
# distinct characters in the sequence to begin with. This might also be wrong
# but I haven't been able to find a counter example so I figure it's worth a
# a shot. Since N (expected sequence lenght) is so small (10^5) we can just
# toss all letters in a frequency counting dictionary and then print the length
# of the dictionary once we reach the end of each sequence  


# Playing code golf because why not :p
# It's not readable! It's not elegant!

for i in range(int(raw_input())):
	print(len(set(raw_input())))


#======================================#
# The code below yields Correct answer #
#======================================#

#import string

#numCases = int(raw_input())

#for i in range(numCases):
#	solution = 0
#	seq = raw_input()
#	for letter in string.ascii_lowercase:
#		if(letter in set(seq)):
#			solution+=1

#	print solution




#submission 1: WA 
# I should have read the question more closely I believe my mistake is that 
# I assumed we were looking for a contiguous subsequence but closer inspection
# of the definition of subsequene in the statement hints otherwise.

# Flawed Summary: Linearly traverse the sequence appending each distinct letter to
# a local list. When a repeat letter is found adjust maxDistinct if a larger
# number of distinct letters exist in the local list than we have previously
# seen. When the end of the sequence is reached to desired result will be the
# maximum of the length of the current local list and the value stored in the
# maxDistinct variable.     

#======================================#
#  The code below yields Wrong Answer  # 
#======================================#

#for i in range(numCases):
#
#	maxDistinct = 0
#	distinct = []
#	seq = raw_input()
#	for letter in seq:
#		if(letter not in distinct):
#			distinct.append(letter)
#		else:
#			if(len(distinct) > maxDistinct):
#				maxDistinct = len(distinct)
#			distinct = [letter]
#
#	print max(len(distinct),maxDistinct)






