# Problem: Brackets
# Author: Michael Feliciano
# Goal: Given a valid parentheses sequence A. Your task is to find another valid parentheses sequence B with the minimal possible length, such that the maximal balance over all prefixes of A is equal to the same characteristic of B.

# Difficulty: Very Easy
# Tags: Adhoc, Basic
# Problem Link: http://www.codechef.com/problems/BRACKETS

# Approach: Despite being quick to submit a WA after re-reading the statement
# I came to understand the problem. The code provided shows us that '(' 
# increases the balance counter by 1 while ')' decreases it by 1. Since we
# want to form a valid sequence with minimal length and maximal balance. The
# logical approach for me was to iterate through the seq and find the max 
# balance at any point once you have this the minimum sequence with this 
# balance is just that number of left parens followed by the same number of
# right parens.  

def main():
	
	cases =int(raw_input())

	for i in range(cases):
		seq = raw_input()
	
		numLeftParens = 0
		maxLeftParens = 0

		for paren in seq:
			if(paren == '('):
				numLeftParens+=1
			else:
				numLeftParens-=1	
			
			maxLeftParens = max(numLeftParens, maxLeftParens)


		print '(' * maxLeftParens + ')' * maxLeftParens

main()


#====================================#
# The code below yields Wrong Answer #
#====================================#

# I like to keep these here to remember my mistakes
# I was a little too quick skimming the statement
# and got the wrong idea entirely it cost me 1 wrong answer!

#def main():
	
#	cases =int(raw_input())
 
#	for i in range(cases):
#		seq = raw_input()
#		result = seq.count("()")
		
#		print "(" * result + ")" * result
		
#main()
