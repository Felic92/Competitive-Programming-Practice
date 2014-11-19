
# Problem: Let Us Construct Palindrome (PRPALN)
# Author: Michael Feliciano

# Goal: Print Yes if we can make the input string s a palindrome 
# by deleting only one character. 

# Approach: The problem seemed naturally recursive to me.
# At each step I will check if the first and last letters are
# equal as they should be in a palindrome. If so reduce the problem
# by making another recursive call on only the inner substring. If
# the letters are not equal conduct two palindrome tests one excluding
# only the first letting and the other excluding only the last letter. 

# If neither result in palindromes we know the answer is NO. Repeat
# until we reach either a No state or a string of length 1. 


# Additional Notes: I got AC but it looks like I get NZEC errors on larger
# cases I think this is because my recursion may be going to deep for the
# large cases. I will try to implement some conditions to catch some special
# cases if this doesn't work I may have to re think my strategy. 

#Difficulty: Easy
#Tags: Greedy
#Problem Link: http://www.codechef.com/NOV14/problems/PRPALN


def main():
	
	cases = int(raw_input())

	for i in range(cases):
		s = raw_input()
		result = solve2(s)
		print result


def solve(s):

	#String of length one can't be reduced and is a palindrome
	if(len(s) == 1 or len(s) == 0):
		return "YES"
	
	#If first and last letters match perform recursive call on sub problem
	if(s[0] == s[-1]):
		return solve(s[1:-1])
	else:
		# See if we get a palindrome when excluding first letter
		excludeFirst = s[1:]
		if(isPalindrome(excludeFirst)):
			return "YES"

		# See if we get a palindrome when excluding last letter
		excludeLast = s[:-1]
		if(isPalindrome(excludeLast)):
			return "YES"

	#First and last didn't match and sub strings arent palindromes
	return "NO"

# If recursion depth is the problem an iterative approach might be the answer
# I am getting tried....something in here may very well be incorrect.

#Ha! it did work
def solve2(s):

	result = "NO"

	while(len(s) > 1):
		if(s[0] == s[-1]):
			s = s[1:-1]
		else:
			excludeFirst = s[1:]
			if(isPalindrome(excludeFirst)):
				result = "YES"
				break

			excludeLast = s[:-1]
			if(isPalindrome(excludeLast)):
				result = "YES"
				break
			
			result = "NO"
			break
			
	if(len(s) <= 1):
		result = "YES"

	return result
		

def isPalindrome(s):
	return s == s[::-1]


main()
